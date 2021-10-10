/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import Model.Vehicle;
import Model.VehicleList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author nikit
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    VehicleList vehicleList;

    public CreateJPanel(VehicleList vehicleList) {
        initComponents();
        this.vehicleList = vehicleList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblMake = new javax.swing.JLabel();
        lblModel = new javax.swing.JLabel();
        lblYearofMan = new javax.swing.JLabel();
        lblMaxseats = new javax.swing.JLabel();
        lblSerialNo = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblMaintainanceDate = new javax.swing.JLabel();
        txtMake = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        txtManufacturingYear = new javax.swing.JTextField();
        txtmaxSeats = new javax.swing.JTextField();
        txtSerialNo = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtMaintainanceDate = new javax.swing.JTextField();
        txtLicensePlate = new javax.swing.JTextField();
        lblAvalability = new javax.swing.JLabel();
        chkAvalability = new javax.swing.JCheckBox();
        lblLicensePlate = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Add Details of the Car");

        lblMake.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblMake.setText("Make");

        lblModel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblModel.setText("Model");

        lblYearofMan.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblYearofMan.setText("ManufacturingYear");

        lblMaxseats.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblMaxseats.setText("MaxSeats");

        lblSerialNo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblSerialNo.setText("SerialNo");

        lblCity.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblCity.setText("City");

        lblMaintainanceDate.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblMaintainanceDate.setText("MaintainanceDate");

        txtMake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMakeActionPerformed(evt);
            }
        });

        txtmaxSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmaxSeatsActionPerformed(evt);
            }
        });

        lblAvalability.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblAvalability.setText("Avalability");

        lblLicensePlate.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblLicensePlate.setText("LicensePlate");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setText("Add a Car");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMake)
                            .addComponent(lblModel)
                            .addComponent(lblYearofMan)
                            .addComponent(lblMaxseats)
                            .addComponent(lblCity)
                            .addComponent(lblMaintainanceDate)
                            .addComponent(lblAvalability)
                            .addComponent(lblLicensePlate)
                            .addComponent(lblSerialNo))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLicensePlate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(338, 338, 338)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkAvalability)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMake)
                                        .addComponent(txtModel)
                                        .addComponent(txtManufacturingYear)
                                        .addComponent(txtmaxSeats)
                                        .addComponent(txtSerialNo)
                                        .addComponent(txtCity)
                                        .addComponent(txtMaintainanceDate, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(jButton1)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTitle)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMake)
                    .addComponent(txtMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModel)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtManufacturingYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYearofMan, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaxseats, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSerialNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCity))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaintainanceDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaintainanceDate))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAvalability)
                        .addGap(18, 18, 18)
                        .addComponent(lblLicensePlate))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkAvalability)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(116, 116, 116))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean valid = validateData();

        if (true) {

            vehicleList.addVehicle(
                    txtMake.getText(),
                    txtModel.getText(),
                    Integer.parseInt(txtManufacturingYear.getText()),
                    Integer.parseInt(txtmaxSeats.getText()),
                    txtSerialNo.getText(),
                    txtCity.getText(),
                    txtMaintainanceDate.getText(),
                    chkAvalability.isSelected(),
                    txtLicensePlate.getText()
            );

            JOptionPane.showMessageDialog(this, "Information Saved!");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtMakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMakeActionPerformed

    private void txtmaxSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmaxSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmaxSeatsActionPerformed

    private void txtLicencePlateActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
    }

    private boolean validateData() {

        if (txtCity.getText().length() < 2 || !txtCity.getText().matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Enter proper City name.");
            return false;
        }

        if (txtMake.getText().length() < 2 || !txtMake.getText().matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Enter proper City name.");
            return false;
        }

        if (txtModel.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Enter proper Model name.");
            return false;
        }

        if (Integer.parseInt(txtmaxSeats.getText()) < 1 || Integer.parseInt(txtmaxSeats.getText()) > 10) {
            JOptionPane.showMessageDialog(this, "Not sure about the seats if that exists, please input a different max seat number.");
            return false;
        }

        if (!isValidDate(txtMaintainanceDate.getText())) {
            JOptionPane.showMessageDialog(this, "Enter proper date in mm/dd/yyyy format");
            return false;
        }

        if (!txtSerialNo.getText().matches("[0-9]+") || txtSerialNo.getText().length() != 10) {
            JOptionPane.showMessageDialog(this, "Enter proper 10 digit Serial Number");
            return false;
        }

        if (!txtManufacturingYear.getText().matches("[0-9]+") || txtManufacturingYear.getText().length() != 4 || Integer.parseInt(txtManufacturingYear.getText()) > 2021 || Integer.parseInt(txtManufacturingYear.getText()) < 2000) {
            JOptionPane.showMessageDialog(this, "Enter proper 4 digit Year of Manufacture");
            return false;
        }

        if (!chkAvalability.isSelected()) {
            JOptionPane.showMessageDialog(this, "Enter check the avaliblity bheck box");
            return false;
        }
        if (!chkAvalability.isSelected()) {
            JOptionPane.showMessageDialog(this, "Enter check the avaliblity bheck box");
            return false;
        }

        if (txtLicensePlate.getText().length() != 6) {

            JOptionPane.showMessageDialog(this, "Enter proper licence plate");
            return false;
        }

        for (Vehicle v : vehicleList.getVehicleList()) {
            if (v.getLicencePlate().matches(txtLicensePlate.getText())) {
                JOptionPane.showMessageDialog(this, "Enter unique licence plate");
                return false;
            }
        }


        return true;
    }

    public static boolean isValidDate(String strDate) {
        if (strDate.trim().equals("")) {
            return true;
        } else {

            SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
            sdfrmt.setLenient(false);

            try {
                Date javaDate = sdfrmt.parse(strDate);
            } catch (ParseException e) {
                return false;
            }
            return true;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkAvalability;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblAvalability;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblLicensePlate;
    private javax.swing.JLabel lblMaintainanceDate;
    private javax.swing.JLabel lblMake;
    private javax.swing.JLabel lblMaxseats;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblSerialNo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblYearofMan;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtLicensePlate;
    private javax.swing.JTextField txtMaintainanceDate;
    private javax.swing.JTextField txtMake;
    private javax.swing.JTextField txtManufacturingYear;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtSerialNo;
    private javax.swing.JTextField txtmaxSeats;
    // End of variables declaration//GEN-END:variables
}
