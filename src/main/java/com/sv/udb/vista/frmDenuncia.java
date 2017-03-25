/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.vista;

import com.sv.udb.controlador.DenunciasCtrl;
import com.sv.udb.controlador.TemasCtrl;
import com.sv.udb.modelo.Denuncias;
import com.sv.udb.modelo.Temas;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Walter
 */
public class frmDenuncia extends javax.swing.JFrame {

    /**
     * Creates new form frmDenuncia
     */
    public frmDenuncia() {
        initComponents();
        fechaHora();
        llenarComboBox();
    }
    
    private void fechaHora() {
        DateTimeFormatter fecha = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        
        lblFechaHora.setText(fecha.format(now) + hora.format(now));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblFechaHora = new javax.swing.JLabel();
        lblVictima = new javax.swing.JLabel();
        txtVictima = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEdadVictima = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtInstitucion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbGenero = new javax.swing.JComboBox<>();
        cmbTipoDenuncia = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cmbAutoridad = new javax.swing.JComboBox<>();
        txtIdInst = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnGuardarRemitir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSoloArchivar = new javax.swing.JButton();
        btnTomarContacto = new javax.swing.JButton();
        btnRemitir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInstitucion = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblFechaHora.setText("Fecha/hora");

        lblVictima.setText("Nombre victima");

        jLabel2.setText("Edad victima");

        txtEdadVictima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadVictimaActionPerformed(evt);
            }
        });

        jLabel3.setText("Genero");

        txtInstitucion.setEnabled(false);

        jLabel4.setText("Denuncia a");

        jLabel5.setText("Denuncia por");

        jLabel6.setText("Numero de telefono");

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        cmbGenero.setSelectedIndex(-1);
        cmbGenero.setToolTipText("");

        jLabel8.setText("Remitir a ");
        jLabel8.setVisible(false);

        cmbAutoridad.setVisible(false);

        txtIdInst.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblFechaHora))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblVictima)))
                .addContainerGap(243, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtIdInst, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbTipoDenuncia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbAutoridad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbGenero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEdadVictima, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVictima, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFechaHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVictima)
                    .addComponent(txtVictima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdadVictima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTipoDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAutoridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnGuardarRemitir.setText("Guardar");
        btnGuardarRemitir.setVisible(false);
        btnGuardarRemitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRemitirActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setVisible(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSoloArchivar.setText("Solo Archivar");
        btnSoloArchivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoloArchivarActionPerformed(evt);
            }
        });

        btnTomarContacto.setText("Tomar contacto");
        btnTomarContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomarContactoActionPerformed(evt);
            }
        });

        btnRemitir.setText("Remitir Denuncia");
        btnRemitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemitirActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar campos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSoloArchivar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarRemitir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemitir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTomarContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnSoloArchivar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarRemitir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemitir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(btnTomarContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel7.setText("Buscar institución");

        tblInstitucion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Institución Educativa", "Ubicación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblInstitucion);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEdadVictimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadVictimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadVictimaActionPerformed

    private void btnRemitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemitirActionPerformed
        btnGuardarRemitir.setVisible(true);
        cmbAutoridad.setVisible(true);
        jLabel8.setVisible(true);
        btnCancelar.setVisible(true);
        btnLimpiar.setVisible(false);
        btnSoloArchivar.setEnabled(false);
        btnTomarContacto.setEnabled(false);
    }//GEN-LAST:event_btnRemitirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnGuardarRemitir.setVisible(false);
        cmbAutoridad.setVisible(false);
        jLabel8.setVisible(false);
        btnCancelar.setVisible(false);
        btnLimpiar.setVisible(true);
        btnSoloArchivar.setEnabled(true);
        btnTomarContacto.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    DateTimeFormatter fecha = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    
    private void btnGuardarRemitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRemitirActionPerformed
        int SN;  
        SN = JOptionPane.showConfirmDialog(null, "Esta seguro que quiere guardar el registro?", "Advertencia", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if (SN == 0) {
            if (!(txtVictima.getText().equals("")) && !(txtEdadVictima.getText().equals("")) && !(txtInstitucion.getText().equals("")) && !(txtTelefono.getText().equals("")) && !(cmbAutoridad.getSelectedItem().equals(-1)) && !(cmbGenero.getSelectedItem().equals(-1)) && !(cmbTipoDenuncia.getSelectedItem().equals(-1)))
            {
             try 
             {
                Temas objeTema = (Temas)this.cmbTipoDenuncia.getSelectedItem();
    //            Autoridad objeAuto = (Autoridad)this.cmbAutoridad.getSelectedItem();
                Denuncias obje = new Denuncias();
                String genero;
                if ("Masculino".equals(cmbGenero.getSelectedItem().toString())) genero = "M"; else  genero = "F";

                obje.setNombVict(txtVictima.getText());
                obje.setCodAuto(objeTema.getIdTema());
                obje.setCodInst(Integer.parseInt(txtIdInst.getText()));
                obje.setCodTema(objeTema.getIdTema());
                obje.setEdad(Integer.parseInt(txtEdadVictima.getText()));
                obje.setFecha(fecha.format(now)); 
                obje.setHora(hora.format(now));
                obje.setGenero(genero);
                obje.setNumTele(Integer.parseInt(txtTelefono.getText()));
                obje.setViable(1);

                if(new DenunciasCtrl().guarDenu(obje, "Remitir"))
                {
                   JOptionPane.showMessageDialog(this, "Datos guardados");
                   this.limpiar();                
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
        }
    }//GEN-LAST:event_btnGuardarRemitirActionPerformed

    private void btnSoloArchivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoloArchivarActionPerformed
        int SN;  
        SN = JOptionPane.showConfirmDialog(null, "Esta seguro que quiere guardar el registro?", "Advertencia", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if (SN == 0) {
            
        }
    }//GEN-LAST:event_btnSoloArchivarActionPerformed

    private void btnTomarContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomarContactoActionPerformed
        int SN;  
        SN = JOptionPane.showConfirmDialog(null, "Esta seguro que quiere guardar el registro?", "Advertencia", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if (SN == 0) {
            if (!(txtVictima.getText().equals("")) && !(txtEdadVictima.getText().equals("")) && !(txtInstitucion.getText().equals("")) && !(txtTelefono.getText().equals("")) && !(cmbGenero.getSelectedItem().equals(-1)) && !(cmbTipoDenuncia.getSelectedItem().equals(-1)))
            {
             try 
             {
                Temas objeTema = (Temas)this.cmbTipoDenuncia.getSelectedItem();
    //            Autoridad objeAuto = (Autoridad)this.cmbAutoridad.getSelectedItem();
                Denuncias obje = new Denuncias();
                String genero;
                if ("Masculino".equals(cmbGenero.getSelectedItem().toString())) genero = "M"; else  genero = "F";

                obje.setNombVict(txtVictima.getText());
                obje.setCodAuto(0);
                obje.setCodInst(Integer.parseInt(txtIdInst.getText()));
                obje.setCodTema(objeTema.getIdTema());
                obje.setEdad(Integer.parseInt(txtEdadVictima.getText()));
                obje.setFecha(fecha.format(now)); 
                obje.setHora(hora.format(now));
                obje.setGenero(genero);
                obje.setNumTele(Integer.parseInt(txtTelefono.getText()));
                obje.setViable(1);

                if(new DenunciasCtrl().guarDenu(obje, "Contactar"))
                {
                   JOptionPane.showMessageDialog(this, "Datos guardados");
                   this.limpiar();
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
        }
    }//GEN-LAST:event_btnTomarContactoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        int SN;  
        SN = JOptionPane.showConfirmDialog(null, "Seguro desea limpiar el formulario?", "Advertencia", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if (SN == 0) {
            txtBuscar.setText("");
            txtEdadVictima.setText("");
            txtIdInst.setText("");
            txtInstitucion.setText("");
            txtTelefono.setText("");
            txtVictima.setText("");
            cmbAutoridad.setSelectedIndex(-1);
            cmbGenero.setSelectedIndex(-1);
            cmbTipoDenuncia.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    
    private void limpiar() {
        txtBuscar.setText("");
        txtEdadVictima.setText("");
        txtIdInst.setText("");
        txtInstitucion.setText("");
        txtTelefono.setText("");
        txtVictima.setText("");
        cmbAutoridad.setSelectedIndex(-1);
        cmbGenero.setSelectedIndex(-1);
        cmbTipoDenuncia.setSelectedIndex(-1);
    }
    
    private void llenarComboBox() {        
        DefaultComboBoxModel<Temas> modeEqui = new DefaultComboBoxModel<>();
         for(Temas temp : new TemasCtrl().consTodo())
         {
             modeEqui.addElement(temp);
         }
         this.cmbTipoDenuncia.setModel((ComboBoxModel)modeEqui);
         cmbTipoDenuncia.setSelectedIndex(-1);
    }

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
            java.util.logging.Logger.getLogger(frmDenuncia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDenuncia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDenuncia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDenuncia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDenuncia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardarRemitir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRemitir;
    private javax.swing.JButton btnSoloArchivar;
    private javax.swing.JButton btnTomarContacto;
    private javax.swing.JComboBox<String> cmbAutoridad;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JComboBox<String> cmbTipoDenuncia;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFechaHora;
    private javax.swing.JLabel lblVictima;
    private javax.swing.JTable tblInstitucion;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtEdadVictima;
    private javax.swing.JTextField txtIdInst;
    private javax.swing.JTextField txtInstitucion;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtVictima;
    // End of variables declaration//GEN-END:variables
}
