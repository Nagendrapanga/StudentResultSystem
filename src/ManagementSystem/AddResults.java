package ManagementSystem;
import ConnectionProvider.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class AddResults extends javax.swing.JFrame
{
  public AddResults()
  {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RollNo = new javax.swing.JLabel();
        Search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        infotable = new javax.swing.JTable();
        Physics = new javax.swing.JLabel();
        Maths = new javax.swing.JLabel();
        Chemistry = new javax.swing.JLabel();
        Electrical = new javax.swing.JLabel();
        Biology = new javax.swing.JLabel();
        Physicsmarks = new javax.swing.JTextField();
        MathsMarks = new javax.swing.JTextField();
        Chemistrymarks = new javax.swing.JTextField();
        ElectricalMarks = new javax.swing.JTextField();
        BiologyMarks = new javax.swing.JTextField();
        enterNo = new javax.swing.JTextField();
        Sumbit = new javax.swing.JButton();
        Close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RollNo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RollNo.setText("Roll No");
        getContentPane().add(RollNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        Search.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-search-30.png"))); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 120, 30));

        infotable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "name", "rollNo", "gender", " fatherName", "course", "branch"
            }
        ));
        jScrollPane1.setViewportView(infotable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 530, 100));

        Physics.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Physics.setText("Physics-1");
        getContentPane().add(Physics, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 70, -1));

        Maths.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Maths.setText("Maths");
        getContentPane().add(Maths, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 70, 20));

        Chemistry.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Chemistry.setText("Chemistry");
        getContentPane().add(Chemistry, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 60, -1));

        Electrical.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Electrical.setText("Electrical");
        getContentPane().add(Electrical, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 60, -1));

        Biology.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Biology.setText("Biology");
        getContentPane().add(Biology, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 50, -1));
        getContentPane().add(Physicsmarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 130, 30));
        getContentPane().add(MathsMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 242, 130, 30));

        Chemistrymarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChemistrymarksActionPerformed(evt);
            }
        });
        getContentPane().add(Chemistrymarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 282, 130, 30));
        getContentPane().add(ElectricalMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 130, 30));
        getContentPane().add(BiologyMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 130, 30));
        getContentPane().add(enterNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 120, -1));

        Sumbit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Sumbit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-submit-document-32.png"))); // NOI18N
        Sumbit.setText("Submit");
        Sumbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumbitActionPerformed(evt);
            }
        });
        getContentPane().add(Sumbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 130, -1));

        Close.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-close-30.png"))); // NOI18N
        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChemistrymarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChemistrymarksActionPerformed

    }//GEN-LAST:event_ChemistrymarksActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
 
        String rollNo = enterNo.getText();
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs= st.executeQuery("SELECT * FROM student WHERE rollNo='"+rollNo+"'");
            infotable.setModel(DbUtils.resultSetToTableModel(rs));
            if(!rs.first())
            {
                JOptionPane.showMessageDialog(null, "Entered rollNo is Wrong");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void SumbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumbitActionPerformed

        String rollNo = enterNo.getText();
        int physicsMarks = Integer.parseInt(Physicsmarks.getText());
        int mathsMarks = Integer.parseInt(MathsMarks.getText());
        int chemistryMarks = Integer.parseInt(Chemistrymarks.getText());
        int electricalMarks = Integer.parseInt(ElectricalMarks.getText());
        int biologyMarks = Integer.parseInt(BiologyMarks.getText());
        int result=0;
        result=physicsMarks+mathsMarks+chemistryMarks+electricalMarks+biologyMarks;
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.execute("INSERT INTO result VALUES('"+rollNo+"','"+physicsMarks+"','"+mathsMarks+"','"+chemistryMarks+"','"+electricalMarks+"','"+biologyMarks+"','"+result+"')");
            JOptionPane.showMessageDialog(null,"Sucessfully Added");
            setVisible(false);
            AddResults frame = new AddResults();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);    
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
    }//GEN-LAST:event_SumbitActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
      
         int flag = JOptionPane.showConfirmDialog(null,"Are You Sure Do You Want To Exit","Submit",JOptionPane.YES_NO_OPTION);
         if(flag==0)
         {
             setVisible(false);
         }
    }//GEN-LAST:event_CloseActionPerformed
         public static void main(String args[])
         {
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                new AddResults().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Biology;
    private javax.swing.JTextField BiologyMarks;
    private javax.swing.JLabel Chemistry;
    private javax.swing.JTextField Chemistrymarks;
    private javax.swing.JButton Close;
    private javax.swing.JLabel Electrical;
    private javax.swing.JTextField ElectricalMarks;
    private javax.swing.JLabel Maths;
    private javax.swing.JTextField MathsMarks;
    private javax.swing.JLabel Physics;
    private javax.swing.JTextField Physicsmarks;
    private javax.swing.JLabel RollNo;
    private javax.swing.JButton Search;
    private javax.swing.JButton Sumbit;
    private javax.swing.JTextField enterNo;
    private javax.swing.JTable infotable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
