/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.project;

/**
 *
 * @author robbin
 */

import java.sql.*;
public class student3 extends javax.swing.JFrame {

    /**
     * Creates new form student
     */
    public student3() {
        initComponents();
   lbl2.setText(detail.name);
   lbl3.setText(detail.roll);
   lbl1.setIcon(new javax.swing.ImageIcon("/home/devashish/images/"+detail.roll+"_0.jpg"));
   lbl4.setText(""+other.item);
   lbl6.setText(""+other.item1);
   lbl7.setText(""+other.item2);
   lbl8.setText(""+other.item3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbl4 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        lbl6 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        lbl5 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt7 = new javax.swing.JTextField();
        txt8 = new javax.swing.JTextField();
        lbl7 = new javax.swing.JLabel();
        txt9 = new javax.swing.JTextField();
        lbl8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mess Student Name");
        setAutoRequestFocus(false);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Roll:");

        lbl2.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N

        lbl3.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 51));
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbl4.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N

        txt1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txt1.setText("0");
        txt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt1MouseClicked(evt);
            }
        });

        lbl6.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N

        txt2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txt2.setText("0");
        txt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt2MouseClicked(evt);
            }
        });

        lbl5.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N

        txt3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txt3.setText("0");
        txt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt3MouseClicked(evt);
            }
        });

        txt4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txt4.setText("0");
        txt4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt4MouseClicked(evt);
            }
        });
        txt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt4ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Evening Milk :(1= 9Rs)");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Morning Milk :(1= 9 Rs)");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Egg : (1 = 6 Rs)");

        txt5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txt5.setText("0");
        txt5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt5MouseClicked(evt);
            }
        });

        txt6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txt6.setText("0");
        txt6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Butter/Veg :(1= 5 Rs)");

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Designed and Developed by:  Robbin Singh & Proneet Verma , Hall 2 IIT Kanpur");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Paneer Bhurzi : (1 = 15 Rs)");

        txt7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txt7.setText("0");
        txt7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt7MouseClicked(evt);
            }
        });

        txt8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txt8.setText("0");
        txt8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt8MouseClicked(evt);
            }
        });

        lbl7.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N

        txt9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txt9.setText("0");
        txt9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt9MouseClicked(evt);
            }
        });

        lbl8.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N

        jLabel10.setText("Version 1.1 : Devashish Kumar Yadav, Y13   Hall 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56)
                        .addComponent(jButton2)
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel4, jLabel5, jLabel6, jLabel7, jLabel9});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lbl4, lbl6, lbl7, lbl8});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel2))))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(27, 27, 27)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(lbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(10, 10, 10)
                .addComponent(jLabel8))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txt1, txt4, txt5, txt6, txt7});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbl7, lbl8});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
int number = Integer.parseInt(txt3.getText());
int number1 = Integer.parseInt(txt2.getText());
int number2 = Integer.parseInt(txt8.getText());
int number3 = Integer.parseInt(txt9.getText());
int mmilk = Integer.parseInt(txt4.getText());
int nmilk = Integer.parseInt(txt1.getText());
int egg = Integer.parseInt(txt5.getText());
int butter = Integer.parseInt(txt6.getText());
int paneerbhurzi = Integer.parseInt(txt7.getText());
try {
      try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test",
            "root","tiger");
            Statement stmt =con.createStatement();
            String table_name = "s"+detail.roll;
            String table = "create table "+table_name+"(s_no int primary key auto_increment,extra varchar(50),date timestamp,price int,number int);";
            stmt.executeUpdate(table);
            if(number!=0){
            String excmd = "INSERT INTO "+table_name+"(extra,number,price) VALUES ('" + other.item + "','" + number + "','"+ other.price*number  +"')";
            stmt.executeUpdate(excmd);}
            if(number1!=0){
            String excmd11 = "INSERT INTO "+table_name+"(extra,number,price) VALUES ('" + other.item1 + "','" + number1 + "','"+ other.price1*number1  +"')";
            stmt.executeUpdate(excmd11);}
            if(number2!=0){
            String excmd12 = "INSERT INTO "+table_name+"(extra,number,price) VALUES ('" + other.item2 + "','" + number1 + "','"+ other.price1*number1  +"')";
            stmt.executeUpdate(excmd12);}
            if(number3!=0){
            String excmd1 = "INSERT INTO "+table_name+"(extra,number,price) VALUES ('" + other.item3 + "','" + number1 + "','"+ other.price1*number1  +"')";
            stmt.executeUpdate(excmd1);}
            if(mmilk!=0){
            String excmd2 = "INSERT INTO "+table_name+"(extra,number,price) VALUES ('Morning milk  ','" + mmilk + "','"+ price.mmilk*mmilk  +"')";
            stmt.executeUpdate(excmd2);}
            if(nmilk!=0){
            String excmd3 = "INSERT INTO "+table_name+"(extra,number,price) VALUES ('Night milk','" + nmilk + "','"+ price.nmilk*nmilk +"')";
            stmt.executeUpdate(excmd3);}
            if(egg!=0){
            String excmd4 = "INSERT INTO "+table_name+"(extra,number,price) VALUES ('Egg','" + egg + "','"+ price.egg*egg  +"')";
            stmt.executeUpdate(excmd4);}
            if(paneerbhurzi!=0){
            String excmd5 = "INSERT INTO "+table_name+"(extra,number,price) VALUES ('Paneerbhurzi','" + paneerbhurzi + "','"+ price.paneerbhurzi*paneerbhurzi  +"')";
            stmt.executeUpdate(excmd5);}
            if(butter!=0){
            String excmd6 = "INSERT INTO "+table_name+"(extra,number,price) VALUES ('ButterORveg','" + butter + "','"+ price.butter*butter +"')";
            stmt.executeUpdate(excmd6);}
            
            this.dispose();
            roll3 second = new roll3(); 
            second.setVisible(true);
           }

       catch (Exception e){
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test",
            "root","tiger");
            Statement stmt =con.createStatement();
            Statement stmt1 =con.createStatement();
            String table_name = "s"+detail.roll;
            if(number!=0){
            String excmd = "INSERT INTO "+table_name+"(extra,number,price) VALUES ('" + other.item + "','" + number + "','"+ other.price*number  +"')";
            stmt.executeUpdate(excmd);}
            if(number1!=0){
            String excmd1 = "INSERT INTO "+table_name+"(extra,number,price) VALUES ('" + other.item1 + "','" + number1 + "','"+ other.price1*number1  +"')";
            stmt.executeUpdate(excmd1);}
            if(number2!=0){
            String excmd12 = "INSERT INTO "+table_name+"(extra,number,price) VALUES ('" + other.item2 + "','" + number1 + "','"+ other.price1*number1  +"')";
            stmt.executeUpdate(excmd12);}
            if(number3!=0){
            String excmd1 = "INSERT INTO "+table_name+"(extra,number,price) VALUES ('" + other.item3 + "','" + number1 + "','"+ other.price1*number1  +"')";
            stmt.executeUpdate(excmd1);}
            if(mmilk!=0){
            String excmd2 = "INSERT INTO "+table_name+"(extra,number,price) VALUES ('Morning milk  ','" + mmilk + "','"+ price.mmilk*mmilk  +"')";
            stmt.executeUpdate(excmd2);}
            if(nmilk!=0){
            String excmd3 = "INSERT INTO "+table_name+"(extra,number,price) VALUES ('Night milk','" + nmilk + "','"+ price.nmilk*nmilk +"')";
            stmt.executeUpdate(excmd3);}
            if(egg!=0){
            String excmd4 = "INSERT INTO "+table_name+"(extra,number,price) VALUES ('Egg','" + egg + "','"+ price.egg*egg  +"')";
            stmt.executeUpdate(excmd4);}
            if(paneerbhurzi!=0){
            String excmd5 = "INSERT INTO "+table_name+"(extra,number,price) VALUES ('Paneerbhurzi','" + paneerbhurzi + "','"+ price.paneerbhurzi*paneerbhurzi  +"')";
            stmt.executeUpdate(excmd5);}
            if(butter!=0){
            String excmd6 = "INSERT INTO "+table_name+"(extra,number,price) VALUES ('ButterORveg','" + butter + "','"+ price.butter*butter +"')";
            stmt.executeUpdate(excmd6);}
            this.dispose();
            roll3 second = new roll3(); 
            second.setVisible(true);
            lbl5.setText("Error in database connectivity");
            }
    }
  
catch (Exception e){    
    lbl5.setText("Error in database connectivity");
}    }
catch (Exception e)
{
    lbl5.setText("Enter valid numbers");
}
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt1MouseClicked
     txt1.setText("");     // TODO add your handling code here:
    }//GEN-LAST:event_txt1MouseClicked

    private void txt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt2MouseClicked
txt2.setText("");          // TODO add your handling code here:
    }//GEN-LAST:event_txt2MouseClicked

    private void txt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt3MouseClicked
      txt3.setText("");    // TODO add your handling code here:
    }//GEN-LAST:event_txt3MouseClicked

    private void txt4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt4MouseClicked
        txt4.setText("");  // TODO add your handling code here:
    }//GEN-LAST:event_txt4MouseClicked

    private void txt5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt5MouseClicked
       txt5.setText("");   // TODO add your handling code here:
    }//GEN-LAST:event_txt5MouseClicked

    private void txt6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt6MouseClicked
        txt6.setText("");  // TODO add your handling code here:
    }//GEN-LAST:event_txt6MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.dispose();
            roll1 second = new roll1(); 
            second.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4ActionPerformed

    private void txt7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt7MouseClicked
         txt7.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_txt7MouseClicked

    private void txt8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt8MouseClicked
        txt8.setText(""); // TODO add your handling code here:
    }//GEN-LAST:event_txt8MouseClicked

    private void txt9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt9MouseClicked
        txt9.setText(""); // TODO add your handling code here:
    }//GEN-LAST:event_txt9MouseClicked

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
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student3().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    // End of variables declaration//GEN-END:variables
}
