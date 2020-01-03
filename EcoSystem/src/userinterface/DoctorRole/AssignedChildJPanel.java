/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.Child.Child;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.PharmacistOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorWorkRequest;
import javax.swing.JPanel;
import java.awt.CardLayout;
import userinterface.PharmacistRole.PharmacistWorkAreaJPanel;
import Business.Child.ChildDirectory;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.PharmacistWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nidhi
 */
public class AssignedChildJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PharmacistOrganization pharmacistOrganization;
    private DoctorOrganization doctororganization;
    private EcoSystem business;
    DoctorWorkRequest request;
    private ChildDirectory childdirectory;
    private Child child;
    private LabOrganization labOrganization;
    
    double temperature;
    double pulserate;
    double BP;
    double respirationrate;
        Network network;
    
    

    /**
     * Creates new form AssignedChildJPanel
     */
    

    


    

    public AssignedChildJPanel(JPanel userProcessContainer, DoctorWorkRequest request ,Child child, UserAccount userAccount, DoctorOrganization doctororganization, Enterprise enterprise, EcoSystem business, ChildDirectory directory) {
            
        initComponents();
        this.userProcessContainer= userProcessContainer;
      this.request = request;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.childdirectory=directory;
        this.child = child;
        this.doctororganization = doctororganization;
        this.business = business;
        
         for(Network net: business.getNetworkList()){
      for(Enterprise ent: net.getEnterpriseDirectory().getEnterpriseList()){
          if(ent.equals(enterprise)){
              network= net;
          }
      }
  }
        getChildDetails();
        populateRequestTable();
        populatePrescriptionTable();
        
       
        
        
        
    
    }
    
    public void populateRequestTable(){
        
        
        DefaultTableModel model = (DefaultTableModel) workRequestJTable1.getModel();
        
        model.setRowCount(0);
        for (WorkRequest labrequest : userAccount.getWorkQueue().getWorkRequestList()){
              if(labrequest instanceof DoctorWorkRequest || labrequest instanceof LabTestWorkRequest ){
                  if( labrequest.getChildId() == child.getChildId()){
            Object[] row = new Object[model.getColumnCount()];
            
            row[1] = labrequest.getChildId();
            row[2] = child.getChildname();
            row[0] = labrequest;
            row[3] = labrequest.getReceiver();
            row[4] = labrequest.getStatus();
            if(labrequest instanceof DoctorWorkRequest){
                 String result = ((DoctorWorkRequest) labrequest).getTestResult();
                  row[5] = result == null ? "Waiting" : result;
            }
            else if(labrequest instanceof LabTestWorkRequest){
                String result = ((LabTestWorkRequest) labrequest).getTestResult();
            row[5] = result == null ? "Waiting" : result;
            }
         model.addRow(row);
                  }
              }
        
            
        }
    }
    
    public void populatePrescriptionTable(){
        
        DefaultTableModel model = (DefaultTableModel) PrescriptionRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest pharrequest : userAccount.getWorkQueue().getWorkRequestList()){
            
            
            if(pharrequest instanceof DoctorWorkRequest || pharrequest instanceof PharmacistWorkRequest ){
             if( pharrequest.getChildId() == child.getChildId()){
                    
            Object[] row = new Object[model.getColumnCount()];
                
            row[0]= pharrequest;
            row[1] = request.getChildId();
            row[2]= child.getChildname();
            row[3] = pharrequest.getReceiver();
            row[4]= pharrequest.getStatus();
            
            
            if(pharrequest instanceof DoctorWorkRequest){
                 String result = ((DoctorWorkRequest) pharrequest).getTestResult();
                  row[5] = result == null ? "Prescribed Medicine" : result;
            }
            else if(pharrequest instanceof PharmacistWorkRequest){
                String result = ((PharmacistWorkRequest) pharrequest).getTestResult();
            row[5] = result == null ? "Waiting" : result;
            }
            
            if(pharrequest instanceof DoctorWorkRequest){
                 String medicalPrescription = ((DoctorWorkRequest) pharrequest).getMedicinePrescribed();
            row[6] = medicalPrescription == null ? "": medicalPrescription;
            }
            else if(pharrequest instanceof PharmacistWorkRequest){
               String medicalPrescription = ((PharmacistWorkRequest) pharrequest).getMedicinePrescribed();
            row[6] = medicalPrescription == null ? "": medicalPrescription;
            }
            
           model.addRow(row);
             }
        }
        
            
                  
       }       
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        imageLable = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ageComboBox = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        IdentificationMArkTextArea = new javax.swing.JTextArea();
        requestTestJButton = new javax.swing.JButton();
        btnPrescribeMedication = new javax.swing.JButton();
        childRegistrationDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel4 = new javax.swing.JLabel();
        maleRDB = new javax.swing.JRadioButton();
        femaleRDB = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BodyTempTxtField = new javax.swing.JTextField();
        RespirationRateTxtField = new javax.swing.JTextField();
        BloodPressureTxtField = new javax.swing.JTextField();
        PulseRateTxtField = new javax.swing.JTextField();
        vitalsignsbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PrescriptionRequestJTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        workRequestJTable1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Personal Info");

        jLabel2.setText("Name:");

        nameTextField.setEnabled(false);
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Age:");

        ageComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99" }));
        ageComboBox.setEnabled(false);

        jLabel11.setText("Registration Date:");

        jLabel12.setText("Identification mark");

        IdentificationMArkTextArea.setColumns(20);
        IdentificationMArkTextArea.setRows(5);
        IdentificationMArkTextArea.setEnabled(false);
        jScrollPane2.setViewportView(IdentificationMArkTextArea);

        requestTestJButton.setText("Request Test");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        btnPrescribeMedication.setText("Prescribe Medications");
        btnPrescribeMedication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrescribeMedicationActionPerformed(evt);
            }
        });

        childRegistrationDate.setEnabled(false);
        childRegistrationDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                childRegistrationDateActionPerformed(evt);
            }
        });

        jLabel4.setText("Gender:");

        genderButtonGroup.add(maleRDB);
        maleRDB.setText("Male");
        maleRDB.setEnabled(false);

        genderButtonGroup.add(femaleRDB);
        femaleRDB.setText("Female");
        femaleRDB.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Vital Signs ");

        jLabel7.setText("Pulse rate :");

        jLabel8.setText("Body temperature :");

        jLabel9.setText("Respiration rate :");

        jLabel10.setText("Blood pressure :");

        BodyTempTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BodyTempTxtFieldActionPerformed(evt);
            }
        });

        vitalsignsbtn.setText("Submit Vital Signs");
        vitalsignsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vitalsignsbtnActionPerformed(evt);
            }
        });

        PrescriptionRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Child Id", "Child Name", "Receiver", "Status", "Result", "Medicine Prescribed"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(PrescriptionRequestJTable);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Test Requested for child :");

        workRequestJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Child Id", "Child Name", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(workRequestJTable1);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Prescriptions given for child :");

        jButton1.setText("< Back");
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
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(imageLable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(153, 153, 153)
                                .addComponent(maleRDB)
                                .addGap(39, 39, 39)
                                .addComponent(femaleRDB))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nameTextField)
                                        .addComponent(ageComboBox, 0, 225, Short.MAX_VALUE)
                                        .addComponent(childRegistrationDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(RespirationRateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BloodPressureTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PulseRateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BodyTempTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(1051, 1051, 1051))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btnPrescribeMedication, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(vitalsignsbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(740, 740, 740)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(imageLable, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(jLabel12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BodyTempTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8))
                                        .addGap(19, 19, 19)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(PulseRateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(childRegistrationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(maleRDB)
                                    .addComponent(femaleRDB))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RespirationRateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BloodPressureTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(47, 47, 47)
                        .addComponent(vitalsignsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrescribeMedication, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestLabTestJPanel(userProcessContainer, userAccount, enterprise,child, childdirectory,request ,business));
        layout.next(userProcessContainer);
        
        
        

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void btnPrescribeMedicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrescribeMedicationActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("PrescribeMedicationJPanel", new PrescribeMedicationJPanel(userProcessContainer, userAccount,  enterprise ,child, childdirectory,request ,business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnPrescribeMedicationActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void childRegistrationDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_childRegistrationDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_childRegistrationDateActionPerformed

    private void vitalsignsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vitalsignsbtnActionPerformed
        // TODO add your handling code here:
       if(BloodPressureTxtField.getText().isEmpty() || PulseRateTxtField.getText().isEmpty() || BodyTempTxtField.getText().isEmpty() || RespirationRateTxtField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Vital Signs cannot be empty");
            return;
        }
       
//       else if( temperature < 0 || pulserate < 0 || BP < 0 || respirationrate < 0 )
//       {
//           JOptionPane.showMessageDialog(null,"Vital Signs cannot be negative");
//       }
//       
       else {
           try
            {  
                  temperature = Double.parseDouble(BodyTempTxtField.getText());
                 if (temperature <= 0.0)
                 {
                     JOptionPane.showMessageDialog(null,"Body Temperature should be a positive integer");
                     return;
                 }
            }
        catch(NumberFormatException e )
            {
                JOptionPane.showMessageDialog(null,"Please enter in number format for Temperature");
                return;
            }
        
        
        try
            {
                 pulserate = Double.parseDouble(PulseRateTxtField.getText());
                if( pulserate <= 0.0)
            {
              JOptionPane.showMessageDialog(null,"Pulse Rate should be a positive integer");
              return;
            }
            }
        catch(NumberFormatException e )
            {
                JOptionPane.showMessageDialog(null,"Please enter in number format for Pulse rate");
                return;
            }
        
        
        
        try
            {
                 BP = Double.parseDouble(BloodPressureTxtField.getText());
                if( BP <= 0.0)
                     {
                        JOptionPane.showMessageDialog(null,"Bloodpressure should be a positive integer");
                        return;
                     }
            }
        catch(NumberFormatException e )
            {
                JOptionPane.showMessageDialog(null,"Please enter in number format for Blood Pressure");
                
                return;
            }
        
        
        try
            {
                 respirationrate = Double.parseDouble(RespirationRateTxtField.getText());
                 if( respirationrate <= 0.0)
                    {
                        JOptionPane.showMessageDialog(null,"Respiration rate should be a positive integer");
                        return;
                    }
            }
        catch(NumberFormatException e )
            {
                JOptionPane.showMessageDialog(null,"Please enter in number format for Repirationrate");
                return;
            }
       }
        
        
        child.setBP(BP);
        child.setBodytemp(temperature);
        child.setPulseRate(pulserate);
        child.setRespirationRate(respirationrate);
        
        BodyTempTxtField.setEnabled(true);
        PulseRateTxtField.setEnabled(true);
        BloodPressureTxtField.setEnabled(true);
        RespirationRateTxtField.setEnabled(true);
        
        requestTestJButton.setEnabled(true);
        btnPrescribeMedication.setEnabled(true);
        
        
    }//GEN-LAST:event_vitalsignsbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorJPanel dwjp = (DoctorJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BodyTempTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BodyTempTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BodyTempTxtFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BloodPressureTxtField;
    private javax.swing.JTextField BodyTempTxtField;
    private javax.swing.JTextArea IdentificationMArkTextArea;
    private javax.swing.JTable PrescriptionRequestJTable;
    private javax.swing.JTextField PulseRateTxtField;
    private javax.swing.JTextField RespirationRateTxtField;
    private javax.swing.JComboBox ageComboBox;
    private javax.swing.JButton btnPrescribeMedication;
    private org.jdesktop.swingx.JXDatePicker childRegistrationDate;
    private javax.swing.JRadioButton femaleRDB;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel imageLable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton maleRDB;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JButton vitalsignsbtn;
    private javax.swing.JTable workRequestJTable1;
    // End of variables declaration//GEN-END:variables

    private void getChildDetails() {
       
        nameTextField.setText(child.getChildname());
        ageComboBox.setSelectedIndex(child.getChildAge());
        if(child.getChildGender().equalsIgnoreCase("male")){
            maleRDB.setSelected(true);
        }
        else
        {
            femaleRDB.setSelected(true);
        }
        childRegistrationDate.setDate(child.getRegistrationDate());
        IdentificationMArkTextArea.setText(child.getIdentificationMark());
        BodyTempTxtField.setText(String.valueOf(child.getBodytemp()));
        PulseRateTxtField.setText(String.valueOf(child.getPulseRate()));
        BloodPressureTxtField.setText(String.valueOf(child.getBP()));
        RespirationRateTxtField.setText(String.valueOf(child.getRespirationRate()));
        
         if( child.getBodytemp() == 0.0 || child.getBP() == 0.0 || child.getPulseRate() == 0.0 || child.getRespirationRate() == 0.0)
        {
            requestTestJButton.setEnabled(false);
            btnPrescribeMedication.setEnabled(false);
        }
         else{
             requestTestJButton.setEnabled(true);
            btnPrescribeMedication.setEnabled(true);
         }
        
        
        
        displayImage();
    }

     public void displayImage(){
        BufferedImage image = null; //Buffered image object
        String filename = child.getImageDetails(); //Getting the filepath and storing into the string
        
        
        try{
            image = ImageIO.read(new File(filename));  //Reading the filename and storing it in image
        }catch(Exception e){ //Generic exception if something goes wrong while reading the image
            JOptionPane.showMessageDialog(null, "File not found");
        }
       
  //Setting the image to the icon and then passing it ot he image JLabel    
  
ImageIcon icon = new ImageIcon(image);
   imageLable.setIcon(icon);
    
    }

    
  
}

