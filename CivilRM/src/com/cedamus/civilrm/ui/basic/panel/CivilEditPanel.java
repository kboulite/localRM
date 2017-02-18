/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cedamus.civilrm.ui.basic.panel;

import com.cedamus.civilrm.entity.AutorityAgent;
import com.cedamus.civilrm.ui.basic.element.FieldPanel;
import com.cedamus.civilrm.ui.liste;
import com.cedamus.civilrm.ui.basic.element.DateFieldPanel;
import com.cedamus.civilrm.entity.base.CivilBean;
import com.cedamus.civilrm.ui.basic.element.ReferenceFieldPanel;
import com.cedamus.civilrm.ui.utils.ConstantsUI;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author Khalid
 */
public class CivilEditPanel extends javax.swing.JPanel {

    /**
     * Creates new form CivilPanel
     */
    public CivilEditPanel() {
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        actionPanel = new javax.swing.JPanel();
        CentralPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ActionPanel = new javax.swing.JPanel();
        ValidateButton = new javax.swing.JButton();
        PrintButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        actionPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout actionPanelLayout = new javax.swing.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setAutoscrolls(true);
        setLayout(new java.awt.BorderLayout());

        CentralPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CentralPanel.setPreferredSize(new java.awt.Dimension(352, 352));
        CentralPanel.setLayout(new javax.swing.BoxLayout(CentralPanel, javax.swing.BoxLayout.Y_AXIS));
        add(CentralPanel, java.awt.BorderLayout.CENTER);

        jPanel2.setPreferredSize(new java.awt.Dimension(552, 10));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        add(jPanel2, java.awt.BorderLayout.PAGE_START);

        ActionPanel.setPreferredSize(new java.awt.Dimension(534, 50));

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Bundle"); // NOI18N
        ValidateButton.setText(bundle.getString("button.valide")); // NOI18N
        ValidateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidateButtonActionPerformed(evt);
            }
        });

        PrintButton.setText(bundle.getString("button.valide")); // NOI18N
        PrintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ActionPanelLayout = new javax.swing.GroupLayout(ActionPanel);
        ActionPanel.setLayout(ActionPanelLayout);
        ActionPanelLayout.setHorizontalGroup(
            ActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ActionPanelLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(ValidateButton)
                .addGap(33, 33, 33)
                .addComponent(PrintButton)
                .addContainerGap(312, Short.MAX_VALUE))
        );
        ActionPanelLayout.setVerticalGroup(
            ActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ActionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValidateButton)
                    .addComponent(PrintButton))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        add(ActionPanel, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
        );

        add(jPanel4, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
        );

        add(jPanel5, java.awt.BorderLayout.LINE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void ValidateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidateButtonActionPerformed
        // TODO add your handling code here:
        bean.save();
        mainForm.refresh();
        
       
    }//GEN-LAST:event_ValidateButtonActionPerformed

    private void PrintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintButtonActionPerformed
        try
        {
        bean.print();
        }catch( Exception er)
        {
            JOptionPane.showMessageDialog(null,er.getMessage(),"Error",1);
        }
            
    }//GEN-LAST:event_PrintButtonActionPerformed


    CivilBean bean ;
    liste mainForm;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    javax.swing.GroupLayout layout;
    java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Bundle"); // NOI18N
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ActionPanel;
    private javax.swing.JPanel CentralPanel;
    private javax.swing.JButton PrintButton;
    private javax.swing.JButton ValidateButton;
    private javax.swing.JPanel actionPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables

    public CivilBean getBean() {
        return bean;
    }

    public CivilEditPanel(CivilBean bean,liste mainForm) {
        this.bean = bean;
        this.mainForm=mainForm;
        init();
    }

    
    
    public void setBean(CivilBean bean) {
        this.bean = bean;
    }



    public JPanel setField(String fieldName, String fieldLabel, int column)
    {
       
      FieldPanel field = new FieldPanel(column);

      field.setLabelText(bundle.getString(fieldLabel));
      
      field.getField().setText(bean.getProperty(fieldName));

      field.getField().setColumns(column);
        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, field.getField(), org.jdesktop.beansbinding.ELProperty.create("${text}"), bean, org.jdesktop.beansbinding.BeanProperty.create(fieldName)); //NOI18N
        bindingGroup.addBinding(binding);
        CentralPanel.add(field);

    return field;
    }
    
    
        public JPanel setReferenceField(String fieldName, String fieldLabel, int column,Class clazz)
    {
       
        ReferenceFieldPanel field = new ReferenceFieldPanel(column,clazz);

      field.setLabelText(bundle.getString(fieldLabel));

     try
     {
           JOptionPane.showMessageDialog(null,bean.getProperty(fieldName));
         AutorityAgent agent  =new AutorityAgent(Long.valueOf(bean.getProperty(fieldName)));
         agent.load();
         
         JOptionPane.showMessageDialog(null,agent);
     int index =((DefaultComboBoxModel)field.getList().getModel()).getIndexOf(agent);
      field.getList().setSelectedIndex(index);
     }
     catch(Exception er)
     {
         
     }
      
        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, field.getList(), org.jdesktop.beansbinding.ELProperty.create("${selectedItem.id}"), bean, org.jdesktop.beansbinding.BeanProperty.create(fieldName)); //NOI18N
        
        
        
        bindingGroup.addBinding(binding);
        CentralPanel.add(field);

    return field;
    }
    
        public JPanel setDateField(String fieldName, String fieldLabel,int width)
    {
       
      DateFieldPanel field = new DateFieldPanel(width);

      field.setLabelText(bundle.getString(fieldLabel));
 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
  SimpleDateFormat srcformatter = new SimpleDateFormat("yyyy-MM-dd");
try
{
      field.getField().setText(formatter.format(srcformatter.parse(bean.getProperty(fieldName))));
}
catch(Exception er)
{
    
}
      field.getField().setColumns(width);
        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, field.getField(), org.jdesktop.beansbinding.ELProperty.create("${text}"), bean, org.jdesktop.beansbinding.BeanProperty.create(fieldName)); //NOI18N
       binding.setConverter(new Converter<String,java.util.Date>() {
          @Override
          public java.util.Date convertForward(String s) {
              SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
              try {
              if (s !=null)
              {
                  return formatter.parse(s);
              }
              else return null;
              } catch (Exception ex) {
                 
                    return null;
                }
          }

          @Override
          public String convertReverse(java.util.Date  t) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
              try {
              if (t !=null)
              {
                  System.out.println(formatter.format(t));
                  return formatter.format(t);
              }
              else return null;
              } catch (Exception ex) {
                 
                    return  null;
                }
          }
      });
        bindingGroup.addBinding(binding);
        CentralPanel.add(field);

    return field;
    }
    
        public JPanel setField2(String fieldName, String fieldLabel)
    {
       
        javax.swing.JLabel label = new javax.swing.JLabel();;
        javax.swing.JTextField field = new javax.swing.JTextField(10);

        label.setText(bundle.getString(fieldLabel));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, field, org.jdesktop.beansbinding.ELProperty.create("${text}"), bean, org.jdesktop.beansbinding.BeanProperty.create(fieldName)); //NOI18N
        bindingGroup.addBinding(binding);
      

        JPanel panel = new JPanel(new BorderLayout());

        label.setLabelFor(field);
        panel.add(label, BorderLayout.CENTER);
        panel.add(field, BorderLayout.WEST);
        CentralPanel.add(panel);

    return panel;
    }
    
    public void globalInit()
    {
                actionPanel = new javax.swing.JPanel();
        CentralPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ActionPanel = new javax.swing.JPanel();
        ValidateButton = new javax.swing.JButton();
        PrintButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        actionPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout actionPanelLayout = new javax.swing.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setLayout(new java.awt.BorderLayout());

       

      

             CentralPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CentralPanel.setLayout(new javax.swing.BoxLayout(CentralPanel, javax.swing.BoxLayout.Y_AXIS));
       

          add(CentralPanel, java.awt.BorderLayout.CENTER);
        
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        add(jPanel2, java.awt.BorderLayout.PAGE_START);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Bundle"); // NOI18N
        ValidateButton.setText(bundle.getString("button.valide")); // NOI18N
        ValidateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidateButtonActionPerformed(evt);
            }
        });

        PrintButton.setText(bundle.getString("button.valide")); // NOI18N
        PrintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ActionPanelLayout = new javax.swing.GroupLayout(ActionPanel);
        ActionPanel.setLayout(ActionPanelLayout);
        ActionPanelLayout.setHorizontalGroup(
            ActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ActionPanelLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(ValidateButton)
                .addGap(33, 33, 33)
                .addComponent(PrintButton)
                .addContainerGap(312, Short.MAX_VALUE))
        );
   ActionPanelLayout.setVerticalGroup(
            ActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ActionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValidateButton)
                    .addComponent(PrintButton))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        add(ActionPanel, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 199, Short.MAX_VALUE)
        );

        add(jPanel4, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 199, Short.MAX_VALUE)
        );

        add(jPanel5, java.awt.BorderLayout.LINE_START);
    }
    public void init()
    {
        globalInit();
       bindingGroup = new org.jdesktop.beansbinding.BindingGroup();
       
   





        setField("number",	 "number.nameconformity",ConstantsUI.NUMBER_FIELD_LENGTH	); //NOI18N
  setReferenceField("autorityAgentFk",	 "autorityAgentFk",ConstantsUI.LONG_STRING_FIELD_LENGTH,AutorityAgent.class		); //NOI18N
    setDateField("deliveryDate",	 "deliveryDate"	,ConstantsUI.SHORT_STRING_FIELD_LENGTH);
        setField("firstName",	 "firstName",ConstantsUI.STRING_FIELD_LENGTH		); //NOI18N
        setField("lastName",	 "lastName",ConstantsUI.STRING_FIELD_LENGTH	); //NOI18N
      


    setDateField("birthDate",	 "birthDate",ConstantsUI.LONG_STRING_FIELD_LENGTH	);
        setField("birthPlace",	 "birthPlace",ConstantsUI.LONG_STRING_FIELD_LENGTH		); //NOI18N
        setField("motherFullName",	 "motherFullName",ConstantsUI.STRING_FIELD_LENGTH		); //NOI18N
        setField("fatherFullName",	 "fatherFullName",ConstantsUI.STRING_FIELD_LENGTH		); //NOI18N
     setDateField("editionDate",	 "editionDate",ConstantsUI.LONG_STRING_FIELD_LENGTH	);

        setField("firstNameBis",	 "firstNameBis",ConstantsUI.STRING_FIELD_LENGTH		); //NOI18N
        setField("lastNameBis",	 "lastNameBis",ConstantsUI.STRING_FIELD_LENGTH		); //NOI18N
        setField("cin",	 "cin",ConstantsUI.SHORT_STRING_FIELD_LENGTH		); //NOI18N
        setField("birthActNumber",	 "birthActNumber",ConstantsUI.SHORT_STRING_FIELD_LENGTH		); //NOI18N
       

        
        
       /*      ValidateButton = new javax.swing.JButton();

        ValidateButton.setText(java.util.ResourceBundle.getBundle("Bundle").getString("button.valide"));
        ValidateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidateButtonActionPerformed(evt);
            }
        });
        this.add(ValidateButton);*/        
         bindingGroup.bind();
        
    }
    
}