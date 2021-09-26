/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import Person.Person;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author nikit
 */
public class ViewJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJpanel1
     */
    Person Person;
    ImageIcon myImage;

    public ViewJpanel(Person Person) {
        initComponents();
        this.Person = Person;
        displayPerson();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblView = new javax.swing.JLabel();
        lblNamee = new javax.swing.JLabel();
        lblDBe = new javax.swing.JLabel();
        lblGeodatae = new javax.swing.JLabel();
        lblTelephonee = new javax.swing.JLabel();
        lblFaxnumbere = new javax.swing.JLabel();
        lblSSNe = new javax.swing.JLabel();
        lblMedRecNumbere = new javax.swing.JLabel();
        lblBankAccNumbere = new javax.swing.JLabel();
        lblLicensePlatee = new javax.swing.JLabel();
        lblSerialNoe = new javax.swing.JLabel();
        lblLinkdine = new javax.swing.JLabel();
        lblInternetProtocolAdde = new javax.swing.JLabel();
        lblBiometricIdentifiere = new javax.swing.JLabel();
        lblFacee = new javax.swing.JLabel();
        lblIdcodee = new javax.swing.JLabel();
        txtNamee = new javax.swing.JTextField();
        txtGeodatae = new javax.swing.JTextField();
        txtDBe = new javax.swing.JTextField();
        txtTelephonenumbere = new javax.swing.JTextField();
        txtFaxnumbere = new javax.swing.JTextField();
        txtSSNe = new javax.swing.JTextField();
        txtMedRecNumbere = new javax.swing.JTextField();
        txtBankAccNumbere = new javax.swing.JTextField();
        txtLicensePlatee = new javax.swing.JTextField();
        txtVehicleSerialNoe = new javax.swing.JTextField();
        txtLinkdIne = new javax.swing.JTextField();
        txtInternetProtocolAdde = new javax.swing.JTextField();
        txtBiometricIdentifiere = new javax.swing.JTextField();
        txtfacee = new javax.swing.JTextField();
        txtIdcodee = new javax.swing.JTextField();
        lblIdcodee2 = new javax.swing.JLabel();
        txtemaile = new javax.swing.JTextField();
        txtHealthPlanNoe = new javax.swing.JTextField();
        lblBankAccNumbere1 = new javax.swing.JLabel();
        lblLinkdine1 = new javax.swing.JLabel();
        txtDeviceNoe = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        lblView.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblView.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblView.setText("VIEW PERSON");
        lblView.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblNamee.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblNamee.setText("NAME");

        lblDBe.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblDBe.setText("DOB");

        lblGeodatae.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblGeodatae.setText("Geodata");

        lblTelephonee.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTelephonee.setText("Telepnumber");

        lblFaxnumbere.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblFaxnumbere.setText("FAX-NO");

        lblSSNe.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblSSNe.setText("SSN");

        lblMedRecNumbere.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblMedRecNumbere.setText("MedRecNumber");

        lblBankAccNumbere.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblBankAccNumbere.setText("BankAccNumber");

        lblLicensePlatee.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblLicensePlatee.setText("LicensePlate");

        lblSerialNoe.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblSerialNoe.setText("VehicleSerialNo");

        lblLinkdine.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblLinkdine.setText("LinkdIn");

        lblInternetProtocolAdde.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblInternetProtocolAdde.setText("InternetProtocolAdd");

        lblBiometricIdentifiere.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblBiometricIdentifiere.setText("BiometricIdentifier");

        lblFacee.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblFacee.setText("Image");

        lblIdcodee.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblIdcodee.setText("Idcode");

        txtNamee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameeActionPerformed(evt);
            }
        });

        txtGeodatae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeodataeActionPerformed(evt);
            }
        });

        txtVehicleSerialNoe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVehicleSerialNoeActionPerformed(evt);
            }
        });

        txtfacee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfaceeActionPerformed(evt);
            }
        });

        lblIdcodee2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblIdcodee2.setText("Email");

        lblBankAccNumbere1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblBankAccNumbere1.setText("HealthPlanNo");

        lblLinkdine1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblLinkdine1.setText("DeviceNo");

        txtDeviceNoe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeviceNoeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblIdcodee)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIdcodee, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblBiometricIdentifiere)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBiometricIdentifiere, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBankAccNumbere)
                            .addComponent(lblSSNe)
                            .addComponent(lblFaxnumbere)
                            .addComponent(lblTelephonee)
                            .addComponent(lblDBe)
                            .addComponent(lblGeodatae)
                            .addComponent(lblNamee)
                            .addComponent(lblIdcodee2)
                            .addComponent(lblMedRecNumbere)
                            .addComponent(lblBankAccNumbere1)
                            .addComponent(lblLicensePlatee)
                            .addComponent(lblSerialNoe)
                            .addComponent(lblLinkdine1)
                            .addComponent(lblLinkdine))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtSSNe, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFaxnumbere, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelephonenumbere, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDBe, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGeodatae, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNamee, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtemaile, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMedRecNumbere, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHealthPlanNoe, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBankAccNumbere, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLicensePlatee, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtVehicleSerialNoe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDeviceNoe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLinkdIne, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblInternetProtocolAdde)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtInternetProtocolAdde, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFacee)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtfacee, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblView, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamee)
                    .addComponent(txtNamee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGeodatae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGeodatae))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDBe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDBe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelephonenumbere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelephonee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFaxnumbere)
                    .addComponent(txtFaxnumbere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIdcodee2)
                    .addComponent(txtemaile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSSNe)
                    .addComponent(txtSSNe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMedRecNumbere)
                    .addComponent(txtMedRecNumbere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBankAccNumbere1)
                    .addComponent(txtHealthPlanNoe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBankAccNumbere)
                    .addComponent(txtBankAccNumbere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLicensePlatee)
                    .addComponent(txtLicensePlatee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSerialNoe)
                    .addComponent(txtVehicleSerialNoe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLinkdine1)
                    .addComponent(txtDeviceNoe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLinkdine)
                    .addComponent(txtLinkdIne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInternetProtocolAdde)
                    .addComponent(txtInternetProtocolAdde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBiometricIdentifiere)
                    .addComponent(txtBiometricIdentifiere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFacee)
                    .addComponent(txtfacee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdcodee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdcodee))
                .addContainerGap(320, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(746, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 251, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 252, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(831, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameeActionPerformed

    private void txtGeodataeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeodataeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeodataeActionPerformed

    private void txtVehicleSerialNoeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVehicleSerialNoeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVehicleSerialNoeActionPerformed

    private void txtfaceeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfaceeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfaceeActionPerformed

    private void txtDeviceNoeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeviceNoeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeviceNoeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBankAccNumbere;
    private javax.swing.JLabel lblBankAccNumbere1;
    private javax.swing.JLabel lblBiometricIdentifiere;
    private javax.swing.JLabel lblDBe;
    private javax.swing.JLabel lblFacee;
    private javax.swing.JLabel lblFaxnumbere;
    private javax.swing.JLabel lblGeodatae;
    private javax.swing.JLabel lblIdcodee;
    private javax.swing.JLabel lblIdcodee2;
    private javax.swing.JLabel lblInternetProtocolAdde;
    private javax.swing.JLabel lblLicensePlatee;
    private javax.swing.JLabel lblLinkdine;
    private javax.swing.JLabel lblLinkdine1;
    private javax.swing.JLabel lblMedRecNumbere;
    private javax.swing.JLabel lblNamee;
    private javax.swing.JLabel lblSSNe;
    private javax.swing.JLabel lblSerialNoe;
    private javax.swing.JLabel lblTelephonee;
    private javax.swing.JLabel lblView;
    private javax.swing.JTextField txtBankAccNumbere;
    private javax.swing.JTextField txtBiometricIdentifiere;
    private javax.swing.JTextField txtDBe;
    private javax.swing.JTextField txtDeviceNoe;
    private javax.swing.JTextField txtFaxnumbere;
    private javax.swing.JTextField txtGeodatae;
    private javax.swing.JTextField txtHealthPlanNoe;
    private javax.swing.JTextField txtIdcodee;
    private javax.swing.JTextField txtInternetProtocolAdde;
    private javax.swing.JTextField txtLicensePlatee;
    private javax.swing.JTextField txtLinkdIne;
    private javax.swing.JTextField txtMedRecNumbere;
    private javax.swing.JTextField txtNamee;
    private javax.swing.JTextField txtSSNe;
    private javax.swing.JTextField txtTelephonenumbere;
    private javax.swing.JTextField txtVehicleSerialNoe;
    private javax.swing.JTextField txtemaile;
    private javax.swing.JTextField txtfacee;
    // End of variables declaration//GEN-END:variables

    public ImageIcon setIcon(String m, byte[] image) {
        if (m != null) {
            myImage = new ImageIcon(m);
        } else {
            myImage = new ImageIcon(image);

        }
        Image img1 = myImage.getImage();
        Image img2 = img1.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        return i;

    }

    private void displayPerson() {
        txtNamee.setText(Person.getName());
        txtGeodatae.setText(Person.getGeoData());
        txtDBe.setText(Person.getDb());
        txtTelephonenumbere.setText(Person.getTelepNumber());
        txtFaxnumbere.setText(Person.getFaxNumber());
        txtemaile.setText(Person.getEmailid());
        txtSSNe.setText(Person.getSsn());
        txtMedRecNumbere.setText(Person.getMedRecNumber());
        txtHealthPlanNoe.setText(Person.getHealthPlanNo());
        txtBankAccNumbere.setText(Person.getBankAccNumber());
        txtLicensePlatee.setText(Person.getLicensePlate());
        txtVehicleSerialNoe.setText(Person.getVehicleSerialNo());
        txtDeviceNoe.setText(Person.getDeviceNo());
        txtLinkdIne.setText(Person.getLinkedIn());
        txtInternetProtocolAdde.setText(Person.getInternetProtocolAdd());
        txtBiometricIdentifiere.setText(Person.getBiomerticIdentifier());
        //txtfacee.setText(Person.getImage());
        txtIdcodee.setText(Person.getIdCode());
        jLabel1.setIcon(setIcon(Person.getImage(), null));

    }

}