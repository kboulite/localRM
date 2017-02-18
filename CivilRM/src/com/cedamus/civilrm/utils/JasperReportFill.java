package com.cedamus.civilrm.utils;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


//import com.cedamus.civilrm.entity.NameConformity;
//import net.sf.jasperreports.engine.JRException;
//import net.sf.jasperreports.engine.JasperExportManager;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
//


public class JasperReportFill {


static public String JASPER_FILE_DIRECTORIES =    "reports/jaspers/";
    
static public void print(Object bean,String sourceFileName)  throws IOException
{
//   // String sourceFileName = "d://reports/nameConformity.jasper";
//	      String printFileName = null;
//	      
//	      ArrayList<Object> dataList =new ArrayList<>();
//              dataList.add(bean);
//	      JRBeanCollectionDataSource beanColDataSource =
//	         new JRBeanCollectionDataSource(dataList);
//
//	      Map parameters = new HashMap();
//	      parameters.put("autorityAgentFk", "7414" );
//	      try {
//	         printFileName = JasperFillManager.fillReportToFile(JASPER_FILE_DIRECTORIES+sourceFileName,
//	            parameters, beanColDataSource);
//	         if (printFileName != null) {
//	            /**
//	             * 1- export to PDF
//	             */
//	         
//	            JasperExportManager.exportReportToPdfFile(printFileName,
//	               "D://reports/nameConformity.pdf");
//	            File pdfFile = new File("D://reports/nameConformity.pdf");
//	    		if (pdfFile.exists()) {
//
//	    			if (Desktop.isDesktopSupported()) {
//	    				
//	    				Desktop.getDesktop().open(pdfFile);
//	    			}
//	    		}
//	         
//	            
//	         }
//	      } catch (JRException e) {
//	         e.printStackTrace();
	//      }
}
//	   @SuppressWarnings("unchecked")
//	   public static void main(String[] args) throws IOException {
//	      String sourceFileName = "d://reports/nameConformity.jasper";
//	      String printFileName = null;
//	      
//	      ArrayList<NameConformity> dataList = new ArrayList<>();
//	      JRBeanCollectionDataSource beanColDataSource =
//	         new JRBeanCollectionDataSource(dataList);
//
//	      Map parameters = new HashMap();
//	      parameters.put("autorityAgentFk", "7414" );
//	      try {
//	         printFileName = JasperFillManager.fillReportToFile(sourceFileName,
//	            parameters, beanColDataSource);
//	         if (printFileName != null) {
//	            /**
//	             * 1- export to PDF
//	             */
//	         
//	            JasperExportManager.exportReportToPdfFile(printFileName,
//	               "D://reports/nameConformity.pdf");
//	            File pdfFile = new File("D://reports/nameConformity.pdf");
//	    		if (pdfFile.exists()) {
//
//	    			if (Desktop.isDesktopSupported()) {
//	    				
//	    				Desktop.getDesktop().open(pdfFile);
//	    			}
//	    		}
//	         
//	            
//	         }
//	      } catch (JRException e) {
//	         e.printStackTrace();
//	      }
//	   }
}
