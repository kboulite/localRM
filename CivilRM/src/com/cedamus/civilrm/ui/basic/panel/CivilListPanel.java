/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cedamus.civilrm.ui.basic.panel;


import com.cedamus.civilrm.entity.NameConformity;
import com.cedamus.civilrm.entity.base.CivilBean;
import com.cedamus.civilrm.ui.MainForm;
import com.cedamus.civilrm.ui.liste;
import com.cedamus.civilrm.ui.utils.NonEditableModel;
import java.util.List;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Khalid
 */
public class CivilListPanel extends javax.swing.JPanel {

    /**
     * Creates new form CivilListPanel
     */
    
    liste mainForm;
    
    public CivilListPanel(liste mainForm) {
        this.mainForm=mainForm;
        init();
    }
    
        public CivilListPanel() {
        
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

        TablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CivilEntityTable = new javax.swing.JTable();

        TablePanel.setBackground(new java.awt.Color(204, 204, 0));
        TablePanel.setLayout(new java.awt.CardLayout());

        CivilEntityTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(CivilEntityTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CivilEntityTable;
    private javax.swing.JPanel TablePanel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


    public void init()
    {
        

        
        TablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CivilEntityTable = new javax.swing.JTable();

      



        TablePanel.setBackground(new java.awt.Color(204, 204, 0));


        jScrollPane1.setViewportView(CivilEntityTable);

        javax.swing.GroupLayout TablePanelLayout = new javax.swing.GroupLayout(TablePanel);
        TablePanel.setLayout(TablePanelLayout);
        TablePanelLayout.setHorizontalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
        );
        TablePanelLayout.setVerticalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
           
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        
       
        
        try
        {
         displayResult();
        }catch(Exception er)
        {
            er.printStackTrace();
        }

    }
    
    
    private void displayResult() throws Exception{
        
     
       com.cedamus.civilrm.entity.NameConformity bean = new NameConformity();
       List resultList=bean.list();
    
       String[][] tableData = new String[resultList.size()][(new NameConformity()).getVectorShownListFieldColumnsName().length];


    for(int ii=0;ii< resultList.size();ii++) {
       
        tableData[ii]=((NameConformity)resultList.get(ii)).toRow();
    }
    CivilEntityTable.setModel(new NonEditableModel(tableData, (new NameConformity()).getVectorShownListFieldColumnsName()));
  
    CivilEntityTable.removeColumn(CivilEntityTable.getColumnModel().getColumn(0));
}

}