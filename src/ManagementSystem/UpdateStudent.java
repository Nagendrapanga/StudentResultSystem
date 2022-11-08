package ManagementSystem;
import ConnectionProvider.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;

public class UpdateStudent extends javax.swing.JFrame
{
      public UpdateStudent()
      {
        initComponents();
      }
    private void initComponents() 
    {
        rollno = new javax.swing.JLabel();
        rollnoofstudent = new javax.swing.JTextField();
        student = new javax.swing.JButton();
        physics = new javax.swing.JLabel();
        maths = new javax.swing.JLabel();
        chemistry = new javax.swing.JLabel();
        electrical = new javax.swing.JLabel();
        biology = new javax.swing.JLabel();
        enterphysicsmarks = new javax.swing.JTextField();
        entermathsmarks = new javax.swing.JTextField();
        enterchemistrymarks = new javax.swing.JTextField();
        enterelctricalmarks = new javax.swing.JTextField();
        enterbiologymarks = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rollno.setFont(new java.awt.Font("Segoe UI", 1, 12));
        rollno.setText("Roll No");
        getContentPane().add(rollno, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 80, 20));
        getContentPane().add(rollnoofstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 120, -1));

        student.setFont(new java.awt.Font("Segoe UI", 1, 12));
        student.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-search-30.png")));
        student.setText("Search");
        student.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                studentActionPerformed(evt);
            }
        });
        getContentPane().add(student, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 130, 30));

        physics.setFont(new java.awt.Font("Segoe UI", 1, 12));
        physics.setText("Physics-1");
        getContentPane().add(physics, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 90, 30));

        maths.setFont(new java.awt.Font("Segoe UI", 1, 12));
        maths.setText("Maths");
        getContentPane().add(maths, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 100, 30));

        chemistry.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        chemistry.setText("Chemitry");
        getContentPane().add(chemistry, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 90, 30));

        electrical.setFont(new java.awt.Font("Segoe UI", 1, 12));
        electrical.setText("Electrical");
        getContentPane().add(electrical, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 100, 30));

        biology.setFont(new java.awt.Font("Segoe UI", 1, 12));
        biology.setText("Biology");
        getContentPane().add(biology, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 100, 30));
        getContentPane().add(enterphysicsmarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 92, 130, 30));

        entermathsmarks.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                entermathsmarksActionPerformed(evt);
            }
        });
        getContentPane().add(entermathsmarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 152, 130, 30));
        getContentPane().add(enterchemistrymarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 202, 130, 30));
        getContentPane().add(enterelctricalmarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 262, 130, 30));
        getContentPane().add(enterbiologymarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 322, 130, 30));

        save.setFont(new java.awt.Font("Segoe UI", 1, 12));
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-submit-document-32.png")));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 100, -1));

        cancel.setFont(new java.awt.Font("Segoe UI", 1, 12));
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-cancel-24.png")));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, 40));

        pack();
    }
    private void saveActionPerformed(java.awt.event.ActionEvent evt)
    {
        String rollNo = enterbiologymarks.getText();
        int physicsMarks = Integer.parseInt(rollnoofstudent.getText());
        int mathsMarks = Integer.parseInt(enterphysicsmarks.getText());
        int chemistryMarks = Integer.parseInt(entermathsmarks.getText());
        int electricalMarks = Integer.parseInt(enterchemistrymarks.getText());
        int biologyMarks = Integer.parseInt(enterelctricalmarks.getText());
        int result=0;
        result=physicsMarks+mathsMarks+chemistryMarks+electricalMarks+biologyMarks;
        try
        {
            Connection con =ConnectionProvider.getCon();
            Statement st= con.createStatement();
            st.executeUpdate("UPDATE result SET physics="+physicsMarks+",maths="+mathsMarks+",chemical="+chemistryMarks+",electrical="+ electricalMarks+",biology="+biologyMarks+",result="+result+" WHERE rollNo='"+rollNo+"'");
            JOptionPane.showMessageDialog(null,"Successfully Updated");
             setVisible(false);
            UpdateStudent frame = new UpdateStudent();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    private void studentActionPerformed(java.awt.event.ActionEvent evt) 
    {
         String rollNo = rollnoofstudent.getText();
        try
        {
            Connection con = ConnectionProvider.getCon();
             Statement st= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
             ResultSet rs= st.executeQuery("SELECT * FROM result WHERE rollNo='"+rollNo+"'");
             if(!rs.first())
             {
                JOptionPane.showMessageDialog(null, "Roll No doesn't exit");
             }
             else
             {
                  enterphysicsmarks.setText(rs.getString(2));
                  entermathsmarks.setText(rs.getString(3));
                  enterchemistrymarks.setText(rs.getString(4));
                  enterelctricalmarks.setText(rs.getString(5));
                  enterbiologymarks.setText(rs.getString(6));
                  rollnoofstudent.setEditable(false);  
             } 
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) 
    {
         int flag = JOptionPane.showConfirmDialog(null,"Are You Sure Do You Want To Exit","Submit",JOptionPane.YES_NO_OPTION);
         if(flag==0)
         {
             setVisible(false);
         }
    }

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new UpdateStudent().setVisible(true);
            }
        });
    }
    private javax.swing.JLabel biology;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel chemistry;
    private javax.swing.JLabel electrical;
    private javax.swing.JTextField enterbiologymarks;
    private javax.swing.JTextField enterchemistrymarks;
    private javax.swing.JTextField enterelctricalmarks;
    private javax.swing.JTextField entermathsmarks;
    private javax.swing.JTextField enterphysicsmarks;
    private javax.swing.JLabel maths;
    private javax.swing.JLabel physics;
    private javax.swing.JLabel rollno;
    private javax.swing.JTextField rollnoofstudent;
    private javax.swing.JButton save;
    private javax.swing.JButton student;
}
