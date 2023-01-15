package mnplibraryreserve.system;

import com.sun.glass.events.KeyEvent;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import static javax.management.Query.value;
import static javax.management.Query.value;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class StudentsRegistration extends javax.swing.JFrame implements Serializable {

    DBconnection db = new DBconnection();

    public StudentsRegistration() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        load_course();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        course = new javax.swing.JTextField();
        NationaId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        courseCOMBO = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        Course = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        adm = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Yoc = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("National id:s");

        courseCOMBO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseCOMBOActionPerformed(evt);
            }
        });

        jLabel6.setText("Course:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText(" MNP LIBRARY RESERVE SYSTEM");

        jLabel2.setText("First Name:");

        jLabel3.setText("Last Name:");

        jLabel4.setText("Adm.No");

        fname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });

        adm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admActionPerformed(evt);
            }
        });

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Course");

        jLabel8.setText("Year of Completion");

        Yoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                YocKeyPressed(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(Yoc))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(64, 64, 64)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                .addComponent(adm, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(fname)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adm, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Yoc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jButton1)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(37, 37, 37))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void admActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        student_registration();
        load_course();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void load_course() {
        try {

            Connection connection = db.Connect();
            String sql = "select course from courses";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeQuery();

            ResultSet rs = preparedStatement.getResultSet();

            while (rs.next()) {
                jComboBox2.addItem((rs.getString("course")));

            }

        } catch (SQLException e) {
            System.out.println("Error " + e);
        }
        return;
    }
    private void courseCOMBOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseCOMBOActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_courseCOMBOActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Home lr = new Home();
        lr.setVisible(true);
        this.dispose();
        //lr.pack();
        //lr.setLocationRelativeTo(null);
        // lr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void YocKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_YocKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            PreparedStatement ps;
        ResultSet rs;
        String first_name = fname.getText();
        String last_name = lname.getText();
        String adm_no = adm.getText();
        String course = Course.getText();
        String Year = Yoc.getText();

        if (!(Pattern.matches("^[a-zA-Z]+$", first_name))) {
            JOptionPane.showMessageDialog(null, "Please enter a valid character on First Name", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } if (!(Pattern.matches("^[a-zA-Z]+$", last_name))) {
            JOptionPane.showMessageDialog(null, "Please enter a valid character on Last Name", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }  if (adm_no != "") {
            try {
                // Converts the string into a number
                int value = Integer.parseInt(adm_no);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid Integer on Adm No", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

        }  if (Year != "") {
            try {
                // Converts the string into a number
                int valuee = Integer.parseInt(Year);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid Integer on Year of completion", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        {
            String sql = "SELECT * FROM students WHERE adm_NO='" + adm_no + "'";
            try {
                ps = DBconnection.Connect().prepareStatement(sql);
                rs = ps.executeQuery();

                if (rs.next()) {

                    JOptionPane.showMessageDialog(null, "Student is already Registered!");

                } else {

                    sql = "Insert into students (`first_name`, `last_name`, `Course`, `adm_No`, `year_of_completion`)VAlues('" + first_name + "','" + last_name + "','" + course + "','" + adm_no + "','" + Year + "')";

                    try {

                        Connection connection = db.Connect();
                        PreparedStatement preparedStatement = connection.prepareStatement(sql);
                        preparedStatement.execute();
                        JOptionPane.showMessageDialog(this, "Successfully Registered");
                    } catch (Exception ex) {
                        // JOptionPane.showMessageDialog(this, ex);
                        System.out.println("db error" + ex);

                    }
                }
            } catch (SQLException ex) {

                Logger.getLogger(Login.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

        }}
    }//GEN-LAST:event_YocKeyPressed

    public void student_registration() {

        PreparedStatement ps;
        ResultSet rs;
        String first_name = fname.getText();
        String last_name = lname.getText();
        String adm_no = adm.getText();
        String course = Course.getText();
        String Year = Yoc.getText();

        if (!(Pattern.matches("^[a-zA-Z]+$", first_name))) {
            JOptionPane.showMessageDialog(null, "Please enter a valid character on First Name", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } if (!(Pattern.matches("^[a-zA-Z]+$", last_name))) {
            JOptionPane.showMessageDialog(null, "Please enter a valid character on Last Name", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }  if (adm_no != "") {
            try {
                // Converts the string into a number
                int value = Integer.parseInt(adm_no);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid Integer on Adm No", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

        }  if (Year != "") {
            try {
                // Converts the string into a number
                int valuee = Integer.parseInt(Year);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid Integer on Year of completion", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        {
            String sql = "SELECT * FROM students WHERE adm_NO='" + adm_no + "'";
            try {
                ps = DBconnection.Connect().prepareStatement(sql);
                rs = ps.executeQuery();

                if (rs.next()) {

                    JOptionPane.showMessageDialog(null, "Student is already Registered!");

                } else {

                    sql = "Insert into students (`first_name`, `last_name`, `Course`, `adm_No`, `year_of_completion`)VAlues('" + first_name + "','" + last_name + "','" + course + "','" + adm_no + "','" + Year + "')";

                    try {

                        Connection connection = db.Connect();
                        PreparedStatement preparedStatement = connection.prepareStatement(sql);
                        preparedStatement.execute();
                        JOptionPane.showMessageDialog(this, "Successfully Registered");
                    } catch (Exception ex) {
                        // JOptionPane.showMessageDialog(this, ex);
                        System.out.println("db error" + ex);

                    }
                }
            } catch (SQLException ex) {

                Logger.getLogger(Login.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

        }

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
            java.util.logging.Logger.getLogger(StudentsRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentsRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentsRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentsRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentsRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Course;
    private javax.swing.JTextField NationaId;
    private javax.swing.JTextField Yoc;
    private javax.swing.JTextField adm;
    private javax.swing.JTextField course;
    private javax.swing.JComboBox courseCOMBO;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lname;
    // End of variables declaration//GEN-END:variables
}
