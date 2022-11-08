package ManagementSystem;
import ConnectionProvider.ConnectionProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class ListstudentResults extends javax.swing.JFrame
{
    public ListstudentResults()
    {
        initComponents();
    }
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        listsstudentresults = new javax.swing.JTable();
        cancel = new javax.swing.JButton();
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

        listsstudentresults.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] 
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] 
            {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(listsstudentresults);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 60, 500, 190));

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
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 340, 100, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/wp7701735-anime-school-aesthetic-wallpapers.png")));
        background.setText("jLabel1");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, -170, -1, -1));

        pack();
    }

    private void formComponentShown(java.awt.event.ComponentEvent evt) 
    {
        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs = st.executeQuery("SELECT *FROM result ORDER BY result.result DESC");
            listsstudentresults.setModel(DbUtils.resultSetToTableModel(rs));
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
                new ListstudentResults().setVisible(true);
            }
        });
    }
    private javax.swing.JLabel background;
    private javax.swing.JButton cancel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listsstudentresults;
}
