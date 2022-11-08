package ManagementSystem;
import ConnectionProvider.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;

public class AddStudent extends javax.swing.JFrame
{
    public AddStudent() 
    {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        rollno = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        fathername = new javax.swing.JLabel();
        course = new javax.swing.JLabel();
        branch = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        nameofthestudent = new javax.swing.JTextField();
        rollnoforstudent = new javax.swing.JTextField();
        genderofstudent = new javax.swing.JComboBox<>();
        courseofstudent = new javax.swing.JComboBox<>();
        branchofstudent = new javax.swing.JComboBox<>();
        nameoffather = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        name.setText("Name");
        name.setMaximumSize(new java.awt.Dimension(180, 70));
        name.setMinimumSize(new java.awt.Dimension(180, 70));
        name.setPreferredSize(new java.awt.Dimension(180, 70));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 120, 40));

        rollno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rollno.setText("Roll No");
        rollno.setMaximumSize(new java.awt.Dimension(180, 70));
        rollno.setMinimumSize(new java.awt.Dimension(180, 70));
        rollno.setPreferredSize(new java.awt.Dimension(180, 70));
        getContentPane().add(rollno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 100, 40));

        gender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gender.setText("Gender");
        gender.setMaximumSize(new java.awt.Dimension(180, 70));
        gender.setMinimumSize(new java.awt.Dimension(180, 70));
        gender.setPreferredSize(new java.awt.Dimension(180, 70));
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 90, 40));

        fathername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fathername.setText("Father's Name");
        fathername.setMaximumSize(new java.awt.Dimension(180, 70));
        fathername.setMinimumSize(new java.awt.Dimension(180, 70));
        fathername.setPreferredSize(new java.awt.Dimension(180, 70));
        getContentPane().add(fathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 140, 30));

        course.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        course.setText("Course");
        course.setMaximumSize(new java.awt.Dimension(180, 70));
        course.setMinimumSize(new java.awt.Dimension(180, 70));
        course.setPreferredSize(new java.awt.Dimension(180, 70));
        getContentPane().add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 100, 30));

        branch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        branch.setText("Branch");
        branch.setMaximumSize(new java.awt.Dimension(180, 70));
        branch.setMinimumSize(new java.awt.Dimension(180, 70));
        branch.setPreferredSize(new java.awt.Dimension(180, 70));
        getContentPane().add(branch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 100, 30));

        submit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-submit-document-32.png"))); // NOI18N
        submit.setText("Submit");
        submit.setMaximumSize(new java.awt.Dimension(180, 70));
        submit.setMinimumSize(new java.awt.Dimension(180, 70));
        submit.setPreferredSize(new java.awt.Dimension(180, 70));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 120, 40));

        cancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-cancel-24.png"))); // NOI18N
        cancel.setText("Cancel");
        cancel.setMaximumSize(new java.awt.Dimension(180, 70));
        cancel.setMinimumSize(new java.awt.Dimension(180, 70));
        cancel.setPreferredSize(new java.awt.Dimension(180, 70));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 110, 30));

        clear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clear.setText("Clear");
        clear.setMaximumSize(new java.awt.Dimension(180, 70));
        clear.setMinimumSize(new java.awt.Dimension(180, 70));
        clear.setPreferredSize(new java.awt.Dimension(180, 70));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 90, 30));
        getContentPane().add(nameofthestudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 140, -1));
        getContentPane().add(rollnoforstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 150, -1));

        genderofstudent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(genderofstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 150, -1));

        courseofstudent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BTech" }));
        getContentPane().add(courseofstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 150, 20));

        branchofstudent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CS", "Civil", "Chemical", "Electrical", "Mechanical" }));
        getContentPane().add(branchofstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 150, 20));
        getContentPane().add(nameoffather, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 150, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/wp7701735-anime-school-aesthetic-wallpapers.png"))); // NOI18N
        background.setText("jLabel7");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, -80, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
         int flag = JOptionPane.showConfirmDialog(null,"Are You Sure Do You Want To Exit","Submit",JOptionPane.YES_NO_OPTION);
         if(flag==0)
         {
             setVisible(false);
         }
    }//GEN-LAST:event_cancelActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String name = nameofthestudent.getText();
        String rollNo = rollnoforstudent.getText();
        String gender = (String)genderofstudent.getSelectedItem();
        String fatherName = nameoffather.getText();
        String course = (String)courseofstudent.getSelectedItem();
        String branch = (String)branchofstudent.getSelectedItem();
        
        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st= con.createStatement();
            st.executeUpdate("INSERT INTO student VALUES('"+name+"','"+rollNo+"','"+gender+"','"+fatherName+"','"+course+"','"+branch+"')");
            JOptionPane.showMessageDialog(null,"Successfully added");
            setVisible(false);
            AddStudent frame = new AddStudent();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);           
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_submitActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
            setVisible(false);
            AddStudent frame = new AddStudent();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);  
    }//GEN-LAST:event_clearActionPerformed
        public static void main(String args[])
        {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel branch;
    private javax.swing.JComboBox<String> branchofstudent;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    private javax.swing.JLabel course;
    private javax.swing.JComboBox<String> courseofstudent;
    private javax.swing.JLabel fathername;
    private javax.swing.JLabel gender;
    private javax.swing.JComboBox<String> genderofstudent;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameoffather;
    private javax.swing.JTextField nameofthestudent;
    private javax.swing.JLabel rollno;
    private javax.swing.JTextField rollnoforstudent;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
