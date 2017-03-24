/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.vista;

import com.sv.udb.controlador.CtrlMunicipios;
import com.sv.udb.controlador.DepartamentosCtrl;
import com.sv.udb.modelo.Departamentos;
import com.sv.udb.modelo.Municipios;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oscar
 */
public class frmMunicipios extends javax.swing.JFrame {

    /**
     * Creates new form frmMunicipios
     */
    public frmMunicipios() {
        initComponents();
        txtIdMuni.setVisible(false);
        btnEliMuni.setVisible(false);
        btnEditMuni.setVisible(false);
    }

    
    public void limpiar()
    {
        txtNombreMuni.setText("");
        btnEliMuni.setVisible(false);
        btnEditMuni.setVisible(false);
        btnGuarMuni.setVisible(true);
        
    }
    
    public void refreshTblMuni()
    {
         try {
            DefaultTableModel model = (DefaultTableModel)this.tblMuni.getModel();
            while(model.getRowCount()>0){model.removeRow(0);} //Limpiar modelo
            for(Municipios temp : new CtrlMunicipios().consTodo())
            {
                model.addRow(new Object[]{temp, new DepartamentosCtrl().consUno(temp.getIdDept())});
            }
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
     //metodo para llenar todos los combobox
    public void llenarComboDepa(){
        DefaultComboBoxModel<Departamentos> modEqui = new DefaultComboBoxModel<>();
        
        
        for(Departamentos temp : new DepartamentosCtrl().consTodo())
        {
            modEqui.addElement(temp);
          
        }
        this.cmbDepa.setModel((ComboBoxModel)modEqui);
      
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnGuarMuni = new javax.swing.JButton();
        txtNombreMuni = new javax.swing.JTextField();
        lblNombreDepa = new javax.swing.JLabel();
        btnEditMuni = new javax.swing.JButton();
        btnLimpiarMuni = new javax.swing.JButton();
        btnEliMuni = new javax.swing.JButton();
        txtIdMuni = new javax.swing.JTextField();
        lblNombreDepa1 = new javax.swing.JLabel();
        cmbDepa = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMuni = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        btnGuarMuni.setText("Guardar");
        btnGuarMuni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuarMuniActionPerformed(evt);
            }
        });

        txtNombreMuni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreMuniActionPerformed(evt);
            }
        });

        lblNombreDepa.setText("Nombre:");

        btnEditMuni.setText("Editar");
        btnEditMuni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditMuniActionPerformed(evt);
            }
        });

        btnLimpiarMuni.setText("Limpiar");

        btnEliMuni.setText("Eliminar");
        btnEliMuni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliMuniActionPerformed(evt);
            }
        });

        txtIdMuni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdMuniActionPerformed(evt);
            }
        });

        lblNombreDepa1.setText("Departamento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIdMuni, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreDepa)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuarMuni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(btnEditMuni))
                    .addComponent(txtNombreMuni)
                    .addComponent(btnLimpiarMuni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliMuni)
                    .addComponent(lblNombreDepa1)
                    .addComponent(cmbDepa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(txtIdMuni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombreDepa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreMuni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNombreDepa1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbDepa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnEliMuni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuarMuni)
                    .addComponent(btnEditMuni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnLimpiarMuni))
        );

        tblMuni.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Municipio", "Departamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMuni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMuniMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMuni);
        if (tblMuni.getColumnModel().getColumnCount() > 0) {
            tblMuni.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuarMuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuarMuniActionPerformed
        if (!(txtNombreMuni.getText().equals("")))
        {
            try
            {
                Departamentos objeDepa= (Departamentos)this.cmbDepa.getSelectedItem();
                int idDepa = objeDepa.getIdDepa();
                Municipios obje = new Municipios();
                obje.setIdDept(idDepa);
                obje.setMuni(this.txtNombreMuni.getText());
                if(new CtrlMunicipios().guarMuni(obje))
                {
                    JOptionPane.showMessageDialog(this, "Datos guardados");
                    this.limpiar();
                    this.refreshTblMuni();

                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Oops! algo malo pasó");
                }
            }
            catch (Exception ex)
            {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Ingrese todos los datos para poder ingresarlos");

        }
    }//GEN-LAST:event_btnGuarMuniActionPerformed

    private void txtNombreMuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreMuniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMuniActionPerformed

    private void btnEditMuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditMuniActionPerformed
        if(!(txtIdMuni.getText().equals("")))
        {
            try
            {
                Departamentos objeDepa= (Departamentos)this.cmbDepa.getSelectedItem();
                int idDepa = objeDepa.getIdDepa();
                Municipios obje = new Municipios();
                obje.setIdDept(idDepa);
                obje.setMuni(this.txtNombreMuni.getText());
                obje.setIdMuni(Integer.parseInt(txtIdMuni.getText()));

                if(new CtrlMunicipios().editarMuni(obje))
                {
                    JOptionPane.showMessageDialog(this, "El Departamento ha sido editado");
                    this.limpiar();
                    this.refreshTblMuni();

                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Oops! algo malo pasó al tratar de editar");
                }
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }

        }
        else
        {
            JOptionPane.showMessageDialog(this, "Seleccione un equipo para poder editarlo");
        }
    }//GEN-LAST:event_btnEditMuniActionPerformed

    private void btnEliMuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliMuniActionPerformed
        if(!(txtIdMuni.getText().equals("")))
        {
            if (JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar este Departamento?", "ADVERTENCIA",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            {
                try
                {
                    int id =Integer.parseInt(txtIdMuni.getText());

                    if(new CtrlMunicipios().eliminarMuni(id))
                    {
                        JOptionPane.showMessageDialog(this, "El departamento ha sido eliminado");
                        this.limpiar();
                        this.refreshTblMuni();

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Oops! algo malo pasó al tratar de eliminar");
                    }
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }
            }

        }
        else
        {
            JOptionPane.showMessageDialog(this, "Seleccione un equipo para poder eliminarlo");
        }
    }//GEN-LAST:event_btnEliMuniActionPerformed

    private void txtIdMuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdMuniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdMuniActionPerformed

    private void tblMuniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMuniMouseClicked
        int fila = this.tblMuni.getSelectedRow();
        if( fila >= 0)
        {
            Municipios obje = (Municipios)this.tblMuni.getValueAt(fila, 0);
            this.txtIdMuni.setText(String.valueOf(obje.getIdMuni()));
            this.txtNombreMuni.setText(obje.getMuni());
            this.cmbDepa.setEditable(true); 
            this.cmbDepa.setSelectedItem((Departamentos)new DepartamentosCtrl().consUno(obje.getIdDept()));
            this.cmbDepa.setEditable(false);

            btnEditMuni.setVisible(true);
            btnEliMuni.setVisible(true);
            btnGuarMuni.setVisible(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tblMuniMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMunicipios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMunicipios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMunicipios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMunicipios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMunicipios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditMuni;
    private javax.swing.JButton btnEliMuni;
    private javax.swing.JButton btnGuarMuni;
    private javax.swing.JButton btnLimpiarMuni;
    private javax.swing.JComboBox cmbDepa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombreDepa;
    private javax.swing.JLabel lblNombreDepa1;
    private javax.swing.JTable tblMuni;
    private javax.swing.JTextField txtIdMuni;
    private javax.swing.JTextField txtNombreMuni;
    // End of variables declaration//GEN-END:variables
}
