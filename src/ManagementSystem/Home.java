package ManagementSystem;
public class Home extends javax.swing.JFrame
{
     public Home()
     {
        initComponents();
     }
    private void initComponents() 
    {
        student = new javax.swing.JButton();
        admin = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        student.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        student.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\OneDrive\\Desktop\\project\\StudentResultManagementSystem\\Icon\\icons8-schoolboy-at-a-desk-30.png"));
        student.setText("Student");
        student.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                studentActionPerformed(evt);
            }
        });
        getContentPane().add(student, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 120, 50));

        admin.setFont(new java.awt.Font("Segoe UI", 1, 14));
        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-admin-settings-male-30.png"))); 
        admin.setText("Admin");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        getContentPane().add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 120, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/wp7701735-anime-school-aesthetic-wallpapers.png")));
        background.setText("jLabel1");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, -90, -1, -1));

        pack();
    }

    private void adminActionPerformed(java.awt.event.ActionEvent evt) 
    {
        setVisible(false);
        AdminHomePage frame= new AdminHomePage();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    private void studentActionPerformed(java.awt.event.ActionEvent evt) 
    {
        setVisible(false);
        StudentHomePage frame= new StudentHomePage();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                Home frame = new Home();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
            }
        });
    }
    private javax.swing.JButton admin;
    private javax.swing.JLabel background;
    private javax.swing.JButton student;
}
