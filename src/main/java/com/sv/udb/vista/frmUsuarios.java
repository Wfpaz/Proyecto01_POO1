/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.vista;

import com.sv.udb.controlador.CtrlContras;
import com.sv.udb.controlador.CtrlTipoUsu;
import com.sv.udb.controlador.CtrlUsuarios;
import com.sv.udb.modelo.TipoUsuario;
import com.sv.udb.modelo.Usuarios;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oscar
 */
public class frmUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form frmUsuarios
     */
    public frmUsuarios() {
        initComponents();
        this.refreshTblUsu();
        this.llenarCombo();
        this.txtIdUsu.setVisible(false);
         this.btnGuardar.setVisible(true);
        this.btnEditar.setVisible(false);
        this.btnEli.setVisible(false);
    }
 public void limpiar(){
        this.txtIdUsu.setText("");
       this.txtUsuario.setText("");
       this.txtNombre.setText("");
       this.txtApellidos.setText("");
       this.txtContra.setText("");
       this.txtVeriContra.setText("");
       this.txtContra.setEnabled(true);
       this.txtVeriContra.setEnabled(true);
       
       this.btnEli.setVisible(false);
       this.btnEditar.setVisible(false);
       this.btnGuardar.setVisible(true);
    }
    
   //metodo para llenar todos los combobox
    public void llenarCombo(){
        DefaultComboBoxModel<TipoUsuario> mod = new DefaultComboBoxModel<>();
        
        
        for(TipoUsuario temp : new CtrlTipoUsu().consTodo())
        {
            mod.addElement(temp);
           
        }
        this.cmbTipoUsu.setModel((ComboBoxModel)mod);
       
        
    }
    
     public void refreshTblUsu()
    {
         try {
            DefaultTableModel model = (DefaultTableModel)this.tblUsua.getModel();
            while(model.getRowCount()>0){model.removeRow(0);} //Limpiar modelo
            for(Usuarios temp : new CtrlUsuarios().consTodo())
            {
                model.addRow(new Object[]{temp,temp.getNombres(),temp.getApellidos(), new CtrlTipoUsu().consUno(temp.getIdTipoUsu())});
            }
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEli = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        cmbTipoUsu = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtIdUsu = new javax.swing.JTextField();
        txtContra = new javax.swing.JPasswordField();
        txtVeriContra = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsua = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setText("Usuario");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Contraseña");

        jLabel5.setText("Confirmar Contraseña");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEli.setText("Eliminar");
        btnEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        cmbTipoUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoUsuActionPerformed(evt);
            }
        });

        jLabel6.setText("Tipo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEli)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar))
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(txtIdUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContra)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cmbTipoUsu, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btnGuardar)
                            .addGap(18, 18, 18)
                            .addComponent(btnEditar)))
                    .addComponent(txtVeriContra))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIdUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVeriContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addComponent(cmbTipoUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnEditar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEli)
                    .addComponent(btnLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblUsua.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Nombre", "Apellidos", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsua);
        if (tblUsua.getColumnModel().getColumnCount() > 0) {
            tblUsua.getColumnModel().getColumn(0).setResizable(false);
            tblUsua.getColumnModel().getColumn(1).setResizable(false);
            tblUsua.getColumnModel().getColumn(2).setResizable(false);
            tblUsua.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       if(!(txtUsuario.getText().equals("")) && !(txtNombre.getText().equals("")) 
          && !(txtApellidos.getText().equals("")) && !(txtContra.getText().equals("")) && !(txtVeriContra.getText().equals("")))
       {
           if(txtContra.getText().equals(txtVeriContra.getText()) )
           {
               try
            {
                TipoUsuario objeTipoUsu= (TipoUsuario)this.cmbTipoUsu.getSelectedItem();
                int idTipoUsu = objeTipoUsu.getIdTipoUsu();
                Usuarios obje = new Usuarios();
                obje.setIdTipoUsu(idTipoUsu);
                obje.setUsuario(this.txtUsuario.getText());
                obje.setNombres(this.txtNombre.getText());
                obje.setApellidos(this.txtApellidos.getText());
                obje.setContra(this.txtContra.getText());
                
                if(new CtrlUsuarios().guarUsu(obje))
                {
                    JOptionPane.showMessageDialog(this, "Datos guardados");
                    this.limpiar();
                    this.refreshTblUsu();

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
               JOptionPane.showMessageDialog(this, "Las contraseñas ingresadas no coinciden");
           }
       }
       else
       {
           JOptionPane.showMessageDialog(this, "Debe ingresar todos los datos para guardarlos");
       }
           
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmbTipoUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoUsuActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(!(txtIdUsu.getText().equals("")))
        {
             try
            {
                TipoUsuario objeTipoUsu= (TipoUsuario)this.cmbTipoUsu.getSelectedItem();
                int idTipoUsu = objeTipoUsu.getIdTipoUsu();
                Usuarios obje = new Usuarios();
                obje.setIdTipoUsu(idTipoUsu);
                obje.setIdUsuario(Integer.parseInt(this.txtIdUsu.getText()));
                obje.setUsuario(this.txtUsuario.getText());
                obje.setNombres(this.txtNombre.getText());
                obje.setApellidos(this.txtApellidos.getText());
                
                
                if(new CtrlUsuarios().editarUsu(obje))
                {
                    JOptionPane.showMessageDialog(this, "Datos guardados");
                    this.limpiar();
                    this.refreshTblUsu();

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
            JOptionPane.showMessageDialog(this, "Seleccione un equipo para poder editarlo");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tblUsuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuaMouseClicked
        int fila = this.tblUsua.getSelectedRow();
        CtrlContras objeContra = new CtrlContras();
        if( fila >= 0)
        {
            
            Usuarios obje = (Usuarios)this.tblUsua.getValueAt(fila, 0);
            this.txtIdUsu.setText(String.valueOf(obje.getIdUsuario()));
            this.txtUsuario.setText(obje.getUsuario());
            this.txtNombre.setText(obje.getNombres());
            this.txtApellidos.setText(obje.getApellidos());
            this.txtContra.setText(obje.getContra());
            this.txtVeriContra.setText(obje.getContra());
            this.txtContra.setEnabled(false);
             this.txtVeriContra.setEnabled(false);
            this.cmbTipoUsu.setEditable(true); 
            this.cmbTipoUsu.setSelectedItem((TipoUsuario)new CtrlTipoUsu().consUno(obje.getIdTipoUsu()));
            this.cmbTipoUsu.setEditable(false);

            btnEditar.setVisible(true);
            btnEli.setVisible(true);
            btnGuardar.setVisible(false);
        }
    }//GEN-LAST:event_tblUsuaMouseClicked

    private void btnEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliActionPerformed
        if(!(txtIdUsu.getText().equals("")))
        {
            if (JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar este Departamento?", "ADVERTENCIA",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            {
                try
                {
                    int id =Integer.parseInt(txtIdUsu.getText());

                    if(new CtrlUsuarios().eliminarUsu(id))
                    {
                        JOptionPane.showMessageDialog(this, "El usuario ha sido eliminado");
                        this.limpiar();
                        this.refreshTblUsu();

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
    }//GEN-LAST:event_btnEliActionPerformed

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
            java.util.logging.Logger.getLogger(frmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEli;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox cmbTipoUsu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsua;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtIdUsu;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JPasswordField txtVeriContra;
    // End of variables declaration//GEN-END:variables
}
