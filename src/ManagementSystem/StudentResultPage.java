package ManagementSystem;
import ConnectionProvider.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;

public class StudentResultPage extends javax.swing.JFrame
{

    public StudentResultPage()
    {
        initComponents();
    }
     public StudentResultPage(String rollNo)
     {
        initComponents();
        rollnoforstudent.setText(rollNo);
      }
    private void initComponents() 
    {
        rollno = new javax.swing.JLabel();
        rollnoforstudent = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        fathername = new javax.swing.JLabel();
        course = new javax.swing.JLabel();
        branch = new javax.swing.JLabel();
        nameofthestudent = new javax.swing.JTextField();
        genderofstudent = new javax.swing.JTextField();
        studentfathername = new javax.swing.JTextField();
        courseofstudent = new javax.swing.JTextField();
        branchofstudent = new javax.swing.JTextField();
        physics = new javax.swing.JLabel();
        maths = new javax.swing.JLabel();
        chemistry = new javax.swing.JLabel();
        electrical = new javax.swing.JLabel();
        biology = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        totalmarks = new javax.swing.JLabel();
        passingmarks = new javax.swing.JLabel();
        marksobtained = new javax.swing.JLabel();
        phytotal = new javax.swing.JLabel();
        mathstotal = new javax.swing.JLabel();
        chemistrytotal = new javax.swing.JLabel();
        electricaltotal = new javax.swing.JLabel();
        biologytotal = new javax.swing.JLabel();
        physicsforpass = new javax.swing.JLabel();
        mathsforpass = new javax.swing.JLabel();
        chemistryforpass = new javax.swing.JLabel();
        electricalforpass = new javax.swing.JLabel();
        biologyforpass = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        phymarks = new javax.swing.JTextField();
        mathsmarks = new javax.swing.JTextField();
        chemistrymarks = new javax.swing.JTextField();
        electricalmarks = new javax.swing.JTextField();
        biologymarks = new javax.swing.JTextField();
        studentgotmarks = new javax.swing.JTextField();
        passorfail = new javax.swing.JTextField();
        logout = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 560));
        addComponentListener(new java.awt.event.ComponentAdapter() 
        {
            public void componentShown(java.awt.event.ComponentEvent evt) 
            {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rollno.setFont(new java.awt.Font("Segoe UI", 1, 12));
        rollno.setText("Roll No");
        getContentPane().add(rollno, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 60, -1));
        getContentPane().add(rollnoforstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 120, 30));

        name.setFont(new java.awt.Font("Segoe UI", 1, 12));
        name.setText("Name");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 80, 20));

        gender.setFont(new java.awt.Font("Segoe UI", 1, 12));
        gender.setText("Gender");
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 80, 20));

        fathername.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        fathername.setText("FatherName");
        getContentPane().add(fathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 70, 20));

        course.setFont(new java.awt.Font("Segoe UI", 1, 12));
        course.setText("Course");
        getContentPane().add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 80, 20));

        branch.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        branch.setText("Branch");
        getContentPane().add(branch, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 70, 20));
        getContentPane().add(nameofthestudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 110, 30));
        getContentPane().add(genderofstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 110, 30));
        getContentPane().add(studentfathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 110, 30));
        getContentPane().add(courseofstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 120, 30));
        getContentPane().add(branchofstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 120, 30));

        physics.setFont(new java.awt.Font("Segoe UI", 1, 12));
        physics.setText("Physics ");
        getContentPane().add(physics, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 226, 80, 20));

        maths.setFont(new java.awt.Font("Segoe UI", 1, 12));
        maths.setText("Maths");
        getContentPane().add(maths, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 80, 20));

        chemistry.setFont(new java.awt.Font("Segoe UI", 1, 12));
        chemistry.setText("Chemistry");
        getContentPane().add(chemistry, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 316, 80, 20));

        electrical.setFont(new java.awt.Font("Segoe UI", 1, 12));
        electrical.setText("Electrical");
        getContentPane().add(electrical, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 366, 80, 20));

        biology.setFont(new java.awt.Font("Segoe UI", 1, 12));
        biology.setText("Biology");
        getContentPane().add(biology, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 416, 80, 20));

        total.setFont(new java.awt.Font("Segoe UI", 1, 14));
        total.setText("Total");
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 70, 20));

        totalmarks.setFont(new java.awt.Font("Segoe UI", 1, 12));
        totalmarks.setText("Total Marks");
        getContentPane().add(totalmarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        passingmarks.setFont(new java.awt.Font("Segoe UI", 1, 12));
        passingmarks.setText("Passing Marks");
        getContentPane().add(passingmarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        marksobtained.setFont(new java.awt.Font("Segoe UI", 1, 12));
        marksobtained.setText("Marks Obtained");
        getContentPane().add(marksobtained, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, -1));

        phytotal.setFont(new java.awt.Font("Segoe UI", 0, 14));
        phytotal.setText("100");
        getContentPane().add(phytotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        mathstotal.setFont(new java.awt.Font("Segoe UI", 0, 14));
        mathstotal.setText("100");
        getContentPane().add(mathstotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        chemistrytotal.setFont(new java.awt.Font("Segoe UI", 0, 14));
        chemistrytotal.setText("100");
        getContentPane().add(chemistrytotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        electricaltotal.setFont(new java.awt.Font("Segoe UI", 0, 14));
        electricaltotal.setText("100");
        getContentPane().add(electricaltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        biologytotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        biologytotal.setText("100");
        getContentPane().add(biologytotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, -1));

        physicsforpass.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        physicsforpass.setText("30");
        getContentPane().add(physicsforpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        mathsforpass.setFont(new java.awt.Font("Segoe UI", 0, 14));
        mathsforpass.setText("30");
        getContentPane().add(mathsforpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        chemistryforpass.setFont(new java.awt.Font("Segoe UI", 0, 14));
        chemistryforpass.setText("30");
        getContentPane().add(chemistryforpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));

        electricalforpass.setFont(new java.awt.Font("Segoe UI", 0, 14));
        electricalforpass.setText("30");
        getContentPane().add(electricalforpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        biologyforpass.setFont(new java.awt.Font("Segoe UI", 0, 14));
        biologyforpass.setText("30");
        getContentPane().add(biologyforpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel26.setText("Verdict");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 60, -1));
        getContentPane().add(phymarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 130, -1));
        getContentPane().add(mathsmarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 130, -1));
        getContentPane().add(chemistrymarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 130, -1));
        getContentPane().add(electricalmarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 130, -1));
        getContentPane().add(biologymarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 130, -1));
        getContentPane().add(studentgotmarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 110, -1));
        getContentPane().add(passorfail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 110, -1));

        logout.setFont(new java.awt.Font("Segoe UI", 1, 18));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/wp7701735-anime-school-aesthetic-wallpapers.png")));
        background.setText("jLabel27");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -70, -1, -1));

        pack();
    }

    private void formComponentShown(java.awt.event.ComponentEvent evt) 
    {
        String rollNo = rollnoforstudent.getText();
        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
              ResultSet rs= st.executeQuery("SELECT * FROM student INNER JOIN result WHERE student.rollNo='"+rollNo+"' AND result.rollNo='"+rollNo+"'");
               if(!rs.first())
               {
                JOptionPane.showMessageDialog(null, "Roll No doesn't exit");
               }
               else
               {
                   nameofthestudent.setText(rs.getString(2));
                   genderofstudent.setText(rs.getString(3));
                   studentfathername.setText(rs.getString(4));
                   courseofstudent.setText(rs.getString(5));
                   branchofstudent.setText(rs.getString(6));
                   
                   phymarks.setText(rs.getString(8));
                   mathsmarks.setText(rs.getString(9));
                   chemistrymarks.setText(rs.getString(10));
                   electricalmarks.setText(rs.getString(11));
                   biologymarks.setText(rs.getString(12));
                   
                   studentgotmarks.setText(rs.getString(13));
                   
                   int m1 =Integer.parseInt(rs.getString(8));
                   int m2 =Integer.parseInt(rs.getString(9));
                   int m3 =Integer.parseInt(rs.getString(10));
                   int m4 =Integer.parseInt(rs.getString(11));
                   int m5 =Integer.parseInt(rs.getString(12));
                   
                   if(m1<30 || m2<30 || m3<30 || m4<30 || m5<30)
                   {
                       passorfail.setText("Fail");
                   }
                   else
                   {
                        passorfail.setText("Pass");
                   }
                   rollnoforstudent.setEditable(false);
                   nameofthestudent.setEditable(false);
                   genderofstudent.setEditable(false);
                   studentfathername.setEditable(false);
                   courseofstudent.setEditable(false);
                   branchofstudent.setEditable(false);
                   phymarks.setEditable(false);
                   mathsmarks.setEditable(false);
                   chemistrymarks.setEditable(false);
                   electricalmarks.setEditable(false);
                   biologymarks.setEditable(false);
                   studentgotmarks.setEditable(false);
                   passorfail.setEditable(false);  
               }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) 
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
                new StudentResultPage().setVisible(true);
            }
        });
    }
    private javax.swing.JLabel background;
    private javax.swing.JLabel biology;
    private javax.swing.JLabel biologyforpass;
    private javax.swing.JTextField biologymarks;
    private javax.swing.JLabel biologytotal;
    private javax.swing.JLabel branch;
    private javax.swing.JTextField branchofstudent;
    private javax.swing.JLabel chemistry;
    private javax.swing.JLabel chemistryforpass;
    private javax.swing.JTextField chemistrymarks;
    private javax.swing.JLabel chemistrytotal;
    private javax.swing.JLabel course;
    private javax.swing.JTextField courseofstudent;
    private javax.swing.JLabel electrical;
    private javax.swing.JLabel electricalforpass;
    private javax.swing.JTextField electricalmarks;
    private javax.swing.JLabel electricaltotal;
    private javax.swing.JLabel fathername;
    private javax.swing.JLabel gender;
    private javax.swing.JTextField genderofstudent;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JButton logout;
    private javax.swing.JLabel marksobtained;
    private javax.swing.JLabel maths;
    private javax.swing.JLabel mathsforpass;
    private javax.swing.JTextField mathsmarks;
    private javax.swing.JLabel mathstotal;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameofthestudent;
    private javax.swing.JLabel passingmarks;
    private javax.swing.JTextField passorfail;
    private javax.swing.JTextField phymarks;
    private javax.swing.JLabel physics;
    private javax.swing.JLabel physicsforpass;
    private javax.swing.JLabel phytotal;
    private javax.swing.JLabel rollno;
    private javax.swing.JTextField rollnoforstudent;
    private javax.swing.JTextField studentfathername;
    private javax.swing.JTextField studentgotmarks;
    private javax.swing.JLabel total;
    private javax.swing.JLabel totalmarks;
}
