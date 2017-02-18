/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cedamus.civilrm.entity.base;


import com.cedamus.civilrm.utils.HibernateUtil;
import com.cedamus.civilrm.utils.JasperReportFill;
import com.cedamus.civilrm.utils.Tools;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author Khalid
 */
public abstract class CivilBean {
    
    
   public  abstract String getBeanName();
   public  abstract String getShownListField();
   
   public abstract long getId();

    
    public void save()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        if (getId()!=0) session.update(this);
        else         session.save(this);
        session.getTransaction().commit();
        
        
    }
    
    public void delete()
    {
    Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(this);
      
        session.getTransaction().commit();
}
    public Object load()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        System.out.print(getClass()+"     here");
        Object result = session.get(getClass(), getId());
        session.close();
        return result;
      
    }
    
    public void print() throws Exception
    {
        JasperReportFill.print(this, "nameConformity.jasper");
    }
    
    public List list() throws Exception
    {
         String hql ="from "+this.getClass().getName();
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query q = session.createQuery(hql);
          List resultList = q.list();
        session.getTransaction().commit();
        return resultList;
    
    }
    
    
    public String[] toRow() throws Exception
    {
        String[] fieldName = getVectorShownListField();
        String[] row = new String[fieldName.length];
        for(int ii=0;ii<fieldName.length;ii++)
        {

            Method getMethod = findGetter(this.getClass(), fieldName[ii]);

			if (getMethod != null)
			{
                            if (getMethod.invoke(this)!=null)
				row[ii]=getMethod.invoke(this).toString();
                            else 
                                row[ii]="[]";
				
			}
            
        }
        return row;
    }
   
    
    public String getProperty(String fieldName) 
    {
      
try
{
     Method getMethod = findGetter(this.getClass(), fieldName);
			if (getMethod != null)
			{
                            if (getMethod.invoke(this)!=null)
				return getMethod.invoke(this).toString();
                            else 
                               return "";
				
			}
}catch(Exception er)
{
    
}
                    return "";
    }
    
    
    public static Method findGetter(Class clazz, String name) throws IntrospectionException, NoSuchFieldException {
        BeanInfo info = Introspector.getBeanInfo(clazz);
   for ( PropertyDescriptor pd : info.getPropertyDescriptors() )
        if (name.equals(pd.getName())) return pd.getReadMethod();
    throw new NoSuchFieldException(clazz+" has no field "+name);
}
    
     public static        String fieldToGetter(String name)
{
    return "get" + name.substring(0, 1).toUpperCase() + name.substring(1);
}
  
     
     
     

    public String[] getVectorShownListFieldColumnsName() {
        
        List<String> list =Arrays.asList(getShownListField().split(";"));
        
        String[] result = new String[list.size()];
        int ii=0;
        for (String e :list)
        {
         result[ii]=Tools.getLabel(e);
         ii++;
        }
        
        return result;
    }
    
    
    public String[] getVectorShownListField() {
        
        List<String> list =Arrays.asList(getShownListField().split(";"));
      
        return  (String[])list.toArray() ;
    }

}
