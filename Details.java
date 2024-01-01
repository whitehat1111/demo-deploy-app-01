package bloodbank; 
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import javax.swing.table.DefaultTableModel; 
public class details extends javax.swing.JFrame { 
public details() { 
initComponents(); 
setLocationRelativeTo(null); 
} 
void no() 
{ 
String r=t1.getText(); 
try 
Class.forName("com.mysql.jdbc.Driver"); 
Connection cn=DriverManager.getConnection("jdbc:mysql:///bloodbank","root","06547879"); 
DefaultTableModel d1=(DefaultTableModel)table1.getModel(); 
DefaultTableModel d2=(DefaultTableModel)table2.getModel(); 
String sn = null; 
String e=null; 
sn="select * from newdonorr where no="+r; 
e="select * from sell where no="+r; 
PreparedStatement smt=cn.prepareStatement(sn); 
ResultSet rs=smt.executeQuery(); 
while(rs.next()) 
{ 
String a1=rs.getString(1); 
String a2=rs.getString(2); 
String a3=rs.getString(3); 
String a4=rs.getString(4); 
String a5=rs.getString(5); 
String a6=rs.getString(6); 
String a7=rs.getString(7); 
String a8=rs.getString(8); 
String a9=rs.getString(9); 
Object pc1[]={a1,a2,a3,a4,a5,a6,a7,a8,a9}; 
d1.addRow(pc1); 
} 
smt=cn.prepareStatement(e); 
rs=smt.executeQuery(); 
while(rs.next()) 
{ 
System.out.println("hello"); 
String b1=rs.getString(1); 
String b2=rs.getString(2); 
String b3=rs.getString(3); 
String b4=rs.getString(4); 
String b5=rs.getString(5); 
Object pc2[]={b1,b2,b3,b4,b5}; 
d2.addRow(pc2); 
} 
} 
catch(Exception e) 
{ 
System.out.println(e); 
} 
}@SuppressWarnings("unchecked") 
// <editor-fold defaultstate="collapsed" desc="Generated Code"> 
private void initComponents() { 
jScrollPane1 = new javax.swing.JScrollPane(); 
table1 = new javax.swing.JTable(); 
jScrollPane2 = new javax.swing.JScrollPane(); 
table2 = new javax.swing.JTable(); 
jButton1 = new javax.swing.JButton(); 
jLabel1 = new javax.swing.JLabel(); 
t1 = new javax.swing.JTextField(); 
setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); 
table1.setModel(new javax.swing.table.DefaultTableModel( 
new Object [][] { 
}, 
new String [] { 
"no", "name", "sex", "age", "group", "date", "country", "city", "mobile" 
} 
)); 
jScrollPane1.setViewportView(table1); 
table2.setModel(new javax.swing.table.DefaultTableModel( 
new Object [][] {
}, 
new String [] { 
"No", "Name", "Address", "Mobile", "Date" 
} 
)); 
jScrollPane2.setViewportView(table2); 
jButton1.setText("Details"); 
jButton1.addActionListener(new java.awt.event.ActionListener() { 
public void actionPerformed(java.awt.event.ActionEvent evt) { 
jButton1ActionPerformed(evt); 
} 
}); 
jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N 
jLabel1.setText("Enter No"); 
javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane()); 
getContentPane().setLayout(layout); 
layout.setHorizontalGroup( 
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)