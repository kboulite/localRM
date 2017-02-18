/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cedamus.civilrm.ui;

import java.awt.ComponentOrientation;
import java.util.List;

import javax.swing.ImageIcon;

import com.cedamus.civilrm.entity.NameConformity;
import com.cedamus.civilrm.entity.base.CivilBean;
import com.cedamus.civilrm.ui.basic.panel.CivilEditPanel;
import com.cedamus.civilrm.ui.utils.NonEditableModel;

/**
 *
 * @author Btissam
 */
public class liste extends javax.swing.JFrame {

	/**
	 * Creates new form liste
	 */

	public void displayResult() throws Exception {

		com.cedamus.civilrm.entity.NameConformity bean = new NameConformity();
		List resultList = bean.list();

		String[][] tableData = new String[resultList
				.size()][(new NameConformity()).getVectorShownListFieldColumnsName().length];

		for (int ii = 0; ii < resultList.size(); ii++) {

			tableData[ii] = ((NameConformity) resultList.get(ii)).toRow();
		}
		CivilEntityTable
				.setModel(new NonEditableModel(tableData, (new NameConformity()).getVectorShownListFieldColumnsName()));

		CivilEntityTable.removeColumn(CivilEntityTable.getColumnModel().getColumn(0));

		jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

		CivilEntityTable.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
		CivilEntityTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

		CivilEntityTable.setGridColor(new java.awt.Color(255, 255, 255));
		CivilEntityTable.setSelectionBackground(new java.awt.Color(255, 0, 51));
		CivilEntityTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		jScrollPane1.setViewportView(CivilEntityTable);

		MainPanel.add(jScrollPane1, "card2");
		MainPanel.repaint();
		MainPanel.revalidate();
	}

	public liste() {
		initComponents();
		jToolBar1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

		try {
			displayResult();
		} catch (Exception er) {
			er.printStackTrace();
		}

		/*
		 * CivilEntityTable.setModel(new javax.swing.table.DefaultTableModel(
		 * new Object [][] { {"M", "04:45", "02/02/2001", "25/02/1987",
		 * "elkorchi", "rached", "123548", null, null, null}, {"M", "04:45",
		 * "25/02/1987", "25/02/1987", "boulite", "khalid", "365840", null,
		 * null, null}, {null, null, null, null, null, null, null, null, null,
		 * null}, {null, null, null, null, null, null, null, null, null, null},
		 * {null, null, null, null, null, null, null, null, null, null}, {null,
		 * null, null, null, null, null, null, null, null, null}, {null, null,
		 * null, null, null, null, null, null, null, null}, {null, null, null,
		 * null, null, null, null, null, null, null}, {null, null, null, null,
		 * null, null, null, null, null, null}, {null, null, null, null, null,
		 * null, null, null, null, null}, {null, null, null, null, null, null,
		 * null, null, null, null}, {null, null, null, null, null, null, null,
		 * null, null, null}, {null, null, null, null, null, null, null, null,
		 * null, null}, {null, null, null, null, null, null, null, null, null,
		 * null}, {null, null, null, null, null, null, null, null, null, null},
		 * {null, null, null, null, null, null, null, null, null, null}, {null,
		 * null, null, null, null, null, null, null, null, null}, {null, null,
		 * null, null, null, null, null, null, null, null}, {null, null, null,
		 * null, null, null, null, null, null, null}, {null, null, null, null,
		 * null, null, null, null, null, null}, {null, null, null, null, null,
		 * null, null, null, null, null}, {null, null, null, null, null, null,
		 * null, null, null, null}, {null, null, null, null, null, null, null,
		 * null, null, null}, {null, null, null, null, null, null, null, null,
		 * null, null}, {null, null, null, null, null, null, null, null, null,
		 * null}, {null, null, null, null, null, null, null, null, null, null},
		 * {null, null, null, null, null, null, null, null, null, null}, {null,
		 * null, null, null, null, null, null, null, null, null}, {null, null,
		 * null, null, null, null, null, null, null, null}, {null, null, null,
		 * null, null, null, null, null, null, null}, {null, null, null, null,
		 * null, null, null, null, null, null}, {null, null, null, null, null,
		 * null, null, null, null, null}, {null, null, null, null, null, null,
		 * null, null, null, null}, {null, null, null, null, null, null, null,
		 * null, null, null} }, new String [] { "الجنس", "على الساعة",
		 * "تاريخ الازدياد (الهجري)", "تاريخ الازدياد (ميلادي)", "الاسم الكامل",
		 * "الاسم الكامل", "  رقم الرسم", " رقم السجل", " مصادقة", "  معاينة" }
		 * ));
		 */
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jPanel3 = new javax.swing.JPanel();
		jButton9 = new javax.swing.JButton();
		jButton10 = new javax.swing.JButton();
		jButton11 = new javax.swing.JButton();
		jButton12 = new javax.swing.JButton();
		jButton13 = new javax.swing.JButton();
		jButton14 = new javax.swing.JButton();
		jButton15 = new javax.swing.JButton();
		jButton16 = new javax.swing.JButton();
		MainPanel = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		CivilEntityTable = new javax.swing.JTable();
		jToolBar1 = new javax.swing.JToolBar();
		AddButton = new javax.swing.JButton();
		EditButton = new javax.swing.JButton();
		DeleteButton = new javax.swing.JButton();
		RefreshButton = new javax.swing.JButton();
		OthersButton = new javax.swing.JButton();
		jMenuBar2 = new javax.swing.JMenuBar();
		jMenu3 = new javax.swing.JMenu();
		jMenu4 = new javax.swing.JMenu();
		jMenu1 = new javax.swing.JMenu();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("برنامج إدارة الحالة المدنية");
		setBackground(new java.awt.Color(255, 255, 255));
		setIconImages(getIconImages());
		setResizable(false);

		jPanel1.setBackground(new java.awt.Color(71, 95, 120));

		jPanel2.setBackground(new java.awt.Color(153, 153, 153));

		jPanel3.setBackground(new java.awt.Color(153, 153, 153));
		jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
		jPanel3.setPreferredSize(new java.awt.Dimension(3000, 4000));

		jButton9.setBackground(new java.awt.Color(212, 231, 255));
		jButton9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		jButton9.setText("الصفحة الرئيسية ");
		jButton9.setBorder(null);
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		jButton10.setBackground(new java.awt.Color(204, 204, 204));
		jButton10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		jButton10.setText("إدارة السجلات");
		jButton10.setBorder(null);
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed(evt);
			}
		});

		jButton11.setBackground(new java.awt.Color(204, 204, 204));
		jButton11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		jButton11.setText("إدارة المواليد");
		jButton11.setBorder(null);

		jButton12.setBackground(new java.awt.Color(204, 204, 204));
		jButton12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		jButton12.setText("إدارة الوفيات");
		jButton12.setBorder(null);

		jButton13.setBackground(new java.awt.Color(204, 204, 204));
		jButton13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		jButton13.setText("التصاريح");
		jButton13.setBorder(null);
		jButton13.setBorderPainted(false);

		jButton14.setBackground(new java.awt.Color(204, 204, 204));
		jButton14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		jButton14.setText("الأحكام");
		jButton14.setBorder(null);
		jButton14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton14ActionPerformed(evt);
			}
		});

		jButton15.setBackground(new java.awt.Color(204, 204, 204));
		jButton15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		jButton15.setText("الشواهد الإدارية");
		jButton15.setBorder(null);

		jButton16.setBackground(new java.awt.Color(204, 204, 204));
		jButton16.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		jButton16.setText("الإحصائيات");
		jButton16.setBorder(null);
		jButton16.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton16ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(jButton14, javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE));
		jPanel3Layout
				.setVerticalGroup(
						jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(1, 1, 1)
										.addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(1, 1, 1)
										.addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(1, 1, 1)
										.addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(1, 1, 1)
										.addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(1, 1, 1)
										.addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(1, 1, 1)
										.addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(297, Short.MAX_VALUE)));

		MainPanel.setBackground(new java.awt.Color(153, 153, 153));
		MainPanel.setLayout(new java.awt.CardLayout());

		/*
		 * jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(
		 * ""));
		 * 
		 * CivilEntityTable.setBorder(javax.swing.BorderFactory.
		 * createTitledBorder("")); CivilEntityTable.setFont(new
		 * java.awt.Font("Arial", 0, 12)); // NOI18N
		 * 
		 * CivilEntityTable.setGridColor(new java.awt.Color(255, 255, 255));
		 * CivilEntityTable.setSelectionBackground(new java.awt.Color(255, 0,
		 * 51));
		 * CivilEntityTable.setSelectionMode(javax.swing.ListSelectionModel.
		 * SINGLE_SELECTION); jScrollPane1.setViewportView(CivilEntityTable);
		 * 
		 * MainPanel.add(jScrollPane1, "card2");
		 */

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(18, 18, 18).addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 207,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(jPanel3,
										javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE))
								.addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));

		jToolBar1.setBackground(new java.awt.Color(65, 97, 128));
		jToolBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
		jToolBar1.setFloatable(false);
		jToolBar1.setBorderPainted(false);
		jToolBar1.setFocusable(false);

		AddButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/system-database-add-icon.png"))); // NOI18N
		AddButton.setText("إضافة");
		AddButton.setToolTipText("Supprimer");
		AddButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		AddButton.setFocusPainted(false);
		AddButton.setFocusable(false);
		AddButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		AddButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		AddButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				AddButtonActionPerformed(evt);
			}
		});
		jToolBar1.add(AddButton);

		EditButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		EditButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit-file-icon.png"))); // NOI18N
		EditButton.setText("تعديل");
		EditButton.setToolTipText("Modifier");
		EditButton.setFocusPainted(false);
		EditButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		EditButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		EditButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				EditButtonActionPerformed(evt);
			}
		});
		jToolBar1.add(EditButton);

		DeleteButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		DeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete-file-icon.png"))); // NOI18N
		DeleteButton.setText("حذف");
		DeleteButton.setToolTipText("Supprimer");
		DeleteButton.setFocusPainted(false);
		DeleteButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		DeleteButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		DeleteButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				DeleteButtonActionPerformed(evt);
			}
		});
		jToolBar1.add(DeleteButton);

		RefreshButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		RefreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Arrow-refresh-icon.png"))); // NOI18N
		RefreshButton.setText("تحديث");
		RefreshButton.setToolTipText("Supprimer");
		RefreshButton.setFocusPainted(false);
		RefreshButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		RefreshButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		RefreshButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				RefreshButtonActionPerformed(evt);
			}
		});
		jToolBar1.add(RefreshButton);

		OthersButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		OthersButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/directory-icon.png"))); // NOI18N
		OthersButton.setText("بيان هامشي");
		OthersButton.setToolTipText("Supprimer");
		OthersButton.setFocusPainted(false);
		OthersButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		OthersButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		OthersButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OthersButtonActionPerformed(evt);
			}
		});
		jToolBar1.add(OthersButton);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
								.addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jMenuBar2.setBackground(new java.awt.Color(153, 0, 0));
		jMenuBar2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

		jMenu3.setBackground(new java.awt.Color(0, 153, 204));
		jMenu3.setText("إدارة");
		jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		jMenu3.setHideActionText(true);
		jMenuBar2.add(jMenu3);

		jMenu4.setBackground(new java.awt.Color(0, 153, 204));
		jMenu4.setText("تغييرات");
		jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		jMenuBar2.add(jMenu4);

		jMenu1.setBackground(new java.awt.Color(0, 153, 204));
		jMenu1.setText("Outils");
		jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		jMenuBar2.add(jMenu1);

		setJMenuBar(jMenuBar2);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton14ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jButton14ActionPerformed

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton9ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jButton9ActionPerformed

	private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton16ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jButton16ActionPerformed

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton10ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jButton10ActionPerformed

	private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_AddButtonActionPerformed

		showInMainPanel("edit", "NameConformity");

	}// GEN-LAST:event_AddButtonActionPerformed

	public void showInMainPanel(String type, String BeanName) {

		MainPanel.removeAll();

		MainPanel.repaint();
		MainPanel.revalidate();
		if ("list".equalsIgnoreCase(type)) {
			try {
				displayResult();
			} catch (Exception er) {
				er.printStackTrace();
			}
			// MainPanel.add(cp);
		} else {
			CivilEditPanel cp = new CivilEditPanel(new com.cedamus.civilrm.entity.NameConformity(), this);
			MainPanel.add(cp);
		}

		MainPanel.repaint();
		MainPanel.revalidate();
	}

	private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_DeleteButtonActionPerformed
		CivilBean bean = new NameConformity(
				Long.parseLong((String) CivilEntityTable.getModel().getValueAt(CivilEntityTable.getSelectedRow(), 0)));
		bean.delete();
		try {
			displayResult();
		} catch (Exception er) {
			er.printStackTrace();
		}

	}// GEN-LAST:event_DeleteButtonActionPerformed

	private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_RefreshButtonActionPerformed
		try {
			displayResult();
		} catch (Exception er) {
			er.printStackTrace();
		}
	}// GEN-LAST:event_RefreshButtonActionPerformed

	private void OthersButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_OthersButtonActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_OthersButtonActionPerformed

	private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_EditButtonActionPerformed

		CivilBean bean = new NameConformity(
				Long.parseLong((String) CivilEntityTable.getModel().getValueAt(CivilEntityTable.getSelectedRow(), 0)));
		showInMainPanel(bean);

	}// GEN-LAST:event_EditButtonActionPerformed

	public void showInMainPanel(CivilBean bean) {

		MainPanel.removeAll();

		MainPanel.repaint();
		MainPanel.revalidate();

		bean = (CivilBean) bean.load();

		CivilEditPanel cp = new CivilEditPanel(bean, this);
		MainPanel.add(cp);

		MainPanel.repaint();
		MainPanel.revalidate();
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting
		// code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(liste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(liste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(liste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(liste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				liste a = new liste();
				ImageIcon img = new ImageIcon("./src/icone.PNG");
				a.setIconImage(img.getImage());
				a.setDefaultLookAndFeelDecorated(true);
				a.setExtendedState(a.MAXIMIZED_BOTH);
				a.setVisible(true);

			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton AddButton;
	private javax.swing.JTable CivilEntityTable;
	private javax.swing.JButton DeleteButton;
	private javax.swing.JButton EditButton;
	private javax.swing.JPanel MainPanel;
	private javax.swing.JButton OthersButton;
	private javax.swing.JButton RefreshButton;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton12;
	private javax.swing.JButton jButton13;
	private javax.swing.JButton jButton14;
	private javax.swing.JButton jButton15;
	private javax.swing.JButton jButton16;
	private javax.swing.JButton jButton9;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenuBar jMenuBar2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JToolBar jToolBar1;
	// End of variables declaration//GEN-END:variables

	public void refresh() {
		initComponents();
		jToolBar1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

		try {
			displayResult();
		} catch (Exception er) {
			er.printStackTrace();
		}
	}

}