/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.project;

/**
 *
 * @author robbin
 */
import  java.io.*;  
import  java.sql.*;
import  org.apache.poi.hssf.usermodel.HSSFSheet;  
import  org.apache.poi.hssf.usermodel.HSSFWorkbook; 
import  org.apache.poi.hssf.usermodel.HSSFRow;

public class excel extends javax.swing.JFrame {

    /**
     * Creates new form excel
     */
    public excel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Excel Sheet");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        btn1.setBackground(new java.awt.Color(204, 204, 204));
        btn1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(0, 51, 51));
        btn1.setText("Generate Excel Sheet");
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Enter Basic Amount in integer:");

        txt1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txt1.setText("0");
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Enter date (from-to) in format specified:");

        txt2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        txt3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("YYYY-MM-DD");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("YYYY-MM-DD");

        lbl1.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        lbl1.setForeground(new java.awt.Color(51, 0, 102));

        jButton2.setFont(new java.awt.Font("Vani", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 102));
        jButton2.setText("Back to Start");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Designed and Developed by:  Robbin Singh & Proneet Verma , Hall 2 IIT Kanpur");

        jLabel6.setText("Version 1.1 : Devashish Kumar Yadav, Y13   Hall 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(211, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed

while(1>0){        
String d1=txt2.getText();
String d2=txt3.getText();
int basic=0;
try{
basic=Integer.parseInt(txt1.getText());  
}
catch(Exception e){
    
lbl1.setText("Enter valid numbers in basic(only integer allowed");
break;
}
try{
Class.forName("java.sql.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test",
        "root","tiger");
int max=1;
Statement stmt8 =con.createStatement();
String query8 = "Select max(s_no) as max from dues;";
ResultSet rs8 = stmt8.executeQuery(query8);
while(rs8.next())
{ 
max = Integer.parseInt(rs8.getString("max"));
}

Statement stmt2 =con.createStatement();
String query2 = "Select * from dues;";
ResultSet rs2 = stmt2.executeQuery(query2);
int j=1;
while(rs2.next())
{  String roll = rs2.getString("roll");
   int advance = Integer.parseInt(rs2.getString("advance"));
   Statement stmt3 =con.createStatement();
   String table_name="s"+roll;
   String query3 = "Select sum(price) as 'price' from "+
   table_name+" where date>='"
   +d1+"' && date<='"+d2+" 23:59:59';";
   ResultSet rs3 = stmt3.executeQuery(query3);
   while(rs3.next()){
     int price;
   
  try{
   price = Integer.parseInt(rs3.getString("price"));
  }
  catch (Exception e){
      price=0;
  }
   int dues = price+basic;
   
   Statement stmt4 =con.createStatement();
   String query4 ="update dues set dues=dues+"+dues+" where roll='"
           +roll+"';";
   stmt4.executeUpdate(query4);
   Statement stmt5 =con.createStatement();
   String query5 ="update dues set extra="+price+" where roll='"
           +roll+"';";
   stmt5.executeUpdate(query5);
   int total=dues-advance;
   Statement stmt6 =con.createStatement();
   String query6 ="update dues set total="+total+" where roll='"
           +roll+"';";
   stmt6.executeUpdate(query6);
   }
  int result=(50*j)/max;
  lbl1.setText(""+result + " % completed ...");
  j++;
}
j=1;

String filename="e:/dues.xls" ;
HSSFWorkbook hwb=new HSSFWorkbook();
HSSFSheet sheet =  hwb.createSheet("new sheet");

HSSFRow rowhead=   sheet.createRow((short)0);
rowhead.createCell(0).setCellValue("SNo");
rowhead.createCell(1).setCellValue("Roll");
rowhead.createCell(2).setCellValue("Name");
rowhead.createCell(3).setCellValue("Basic");
rowhead.createCell(4).setCellValue("Extra");
rowhead.createCell(5).setCellValue("Dues");
rowhead.createCell(6).setCellValue("Advance");
rowhead.createCell(7).setCellValue("Total");
Statement stmt =con.createStatement();
String query = "Select * from dues;";
ResultSet rs = stmt.executeQuery(query);
int i=1;
while(rs.next()){
HSSFRow row=   sheet.createRow((short)i);
row.createCell(0).setCellValue(rs.getString("s_no"));
row.createCell(1).setCellValue(rs.getString("roll"));
row.createCell(2).setCellValue(rs.getString("name"));
row.createCell(3).setCellValue(basic);
row.createCell(4).setCellValue(rs.getString("extra"));
row.createCell(5).setCellValue(rs.getString("dues"));
row.createCell(6).setCellValue(rs.getString("advance"));
row.createCell(7).setCellValue(rs.getString("total"));
i++;
int result=((50*j)/max)+50;
lbl1.setText(""+result + " % completed ...");
  j++;
}
FileOutputStream fileOut =  new FileOutputStream(filename);
hwb.write(fileOut);
fileOut.close();
Statement stmt7 =con.createStatement();
String query7 ="update dues set dues=0,advance=0,total=0;";
   stmt7.executeUpdate(query7);

   //Generating egg consumption sheet.
j=1;


filename="e:/eggs.xls" ;
HSSFWorkbook egghwb = new HSSFWorkbook();
HSSFSheet eggsheet =  egghwb.createSheet("new sheet");

HSSFRow eggrowhead =   eggsheet.createRow((short)0);
eggrowhead =  eggsheet.createRow((short)0);
eggrowhead.createCell(0).setCellValue("SNo");
eggrowhead.createCell(1).setCellValue("Date");
eggrowhead.createCell(2).setCellValue("Quantity");
eggrowhead.createCell(3).setCellValue("Amount");
Statement stmt1 =con.createStatement();
String query1 = "Select * from eggs where date>='"+d1+"' && date<='"+d2+"';";
ResultSet rs1 = stmt1.executeQuery(query1);
i=1;
while(rs1.next()){
HSSFRow row=   eggsheet.createRow((short)i);
row.createCell(0).setCellValue(rs1.getString("s_no"));
row.createCell(1).setCellValue(rs1.getString("date"));
row.createCell(2).setCellValue(rs1.getString("quantity"));
row.createCell(3).setCellValue(rs1.getString("amount"));
i++;
int result=((50*j)/max)+50;
lbl1.setText(""+result + " % completed ...");
  j++;
}
FileOutputStream fileOut1 =  new FileOutputStream(filename);
egghwb.write(fileOut1);
fileOut1.close(); 
   
// Generating students excel sheet...
   
Statement stmt10 =con.createStatement();
String query10 = "Select * from dues;";
ResultSet rs10 = stmt10.executeQuery(query10);
while(rs10.next())
{  String roll = rs10.getString("roll");
   
   Statement stmt11 =con.createStatement();
   String table_name="s"+roll;
   String query11 = "Select * from "+
   table_name+" where date>='"
   +d1+"' && date<='"+d2+" 23:59:59';";
   ResultSet rs11 = stmt11.executeQuery(query11);
   
   String filestudent="e:/student/"+roll+".xls" ;
   HSSFWorkbook studentwb=new HSSFWorkbook();
   HSSFSheet studentsheet =  studentwb.createSheet("new sheet");
   
    HSSFRow studentrowhead=   studentsheet.createRow((short)0);
    studentrowhead.createCell(0).setCellValue("SNo");
    studentrowhead.createCell(1).setCellValue("Extra");
    studentrowhead.createCell(2).setCellValue("Date and Time");
    studentrowhead.createCell(3).setCellValue("Price");
    studentrowhead.createCell(4).setCellValue("Number");
   int t=1;
   while(rs11.next()){
       HSSFRow studentrow =   studentsheet.createRow((short)t);
       studentrow.createCell(0).setCellValue(rs11.getString("s_no"));
       studentrow.createCell(1).setCellValue(rs11.getString("extra"));
       studentrow.createCell(2).setCellValue(rs11.getString("date"));
       studentrow.createCell(3).setCellValue(rs11.getString("price"));
       studentrow.createCell(4).setCellValue(rs11.getString("number"));
       t++;
   }
   FileOutputStream studentfileOut =  new FileOutputStream(filestudent);
   studentwb.write(studentfileOut);
   studentfileOut.close();
   

}
   
lbl1.setText("Your excel file has been generated!");
btn1.setVisible(false);

} 
catch ( Exception e ) {
    
    lbl1.setText("Error in file generation or database connectivity");

}
break;
}
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        first second = new first();
        second.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

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
            java.util.logging.Logger.getLogger(excel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(excel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(excel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(excel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new excel().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbl1;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    // End of variables declaration//GEN-END:variables
}
