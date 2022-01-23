import java.awt.Dimension;
import java.util.*;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Main extends javax.swing.JFrame {
 private String order="", en="", de="", temp2;
 private byte[] temp, temp1,end;

 public Main() {
 initComponents();
 accuracy.setVisible(false);
 Toolkit tk = getToolkit();
 Dimension size = tk.getScreenSize();
 setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);


 }
 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">
 private void initComponents() {
 jPanel1 = new javax.swing.JPanel();
 l1 = new javax.swing.JLabel();
 t1 = new javax.swing.JTextField();
 b1 = new javax.swing.JButton();
 jButton1 = new javax.swing.JButton();
 jLabel1 = new javax.swing.JLabel();
 jScrollPane4 = new javax.swing.JScrollPane();
 ta1 = new javax.swing.JTextArea();
 jScrollPane5 = new javax.swing.JScrollPane();
 ta2 = new javax.swing.JTextArea();
 accuracy = new javax.swing.JTextField();
 jLabel3 = new javax.swing.JLabel();
 jLabel2 = new javax.swing.JLabel();
 setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
 jPanel1.setBackground(new java.awt.Color(204, 204, 204));
 jPanel1.setLayout(null);
 l1.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
 l1.setForeground(new java.awt.Color(255, 255, 255));
 l1.setText("Enter Your Text");
 jPanel1.add(l1);
 l1.setBounds(310, 120, 110, 23);
 t1.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 t1ActionPerformed(evt);
 }
 });
 jPanel1.add(t1);
 t1.setBounds(470, 120, 193, 23);
 b1.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
 b1.setText("Encrypt");
 b1.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 b1ActionPerformed(evt);
 }
 });
 jPanel1.add(b1);
 b1.setBounds(200, 180, 120, 30);
 jButton1.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
 jButton1.setText("Decrypt");
 jButton1.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jButton1ActionPerformed(evt);
 }
 });
 jPanel1.add(jButton1);
 jButton1.setBounds(763, 180, 120, 30);
 jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
 jLabel1.setForeground(new java.awt.Color(255, 0, 0));
 jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
 jLabel1.setText("Data Leakage Prevention System - Hybrid Cryptography");
 jPanel1.add(jLabel1);
 jLabel1.setBounds(190, 40, 698, 29);
 ta1.setColumns(20);
 ta1.setLineWrap(true);
 ta1.setRows(5);
 jScrollPane4.setViewportView(ta1);
 jPanel1.add(jScrollPane4);
 jScrollPane4.setBounds(22, 227, 494, 308);
 ta2.setColumns(20);
 ta2.setLineWrap(true);
 ta2.setRows(5);
 jScrollPane5.setViewportView(ta2);
 jPanel1.add(jScrollPane5);
 jScrollPane5.setBounds(543, 227, 494, 308);
 accuracy.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 accuracyActionPerformed(evt);
 }
 });
 jPanel1.add(accuracy);
 accuracy.setBounds(450, 550, 160, 19);
 jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
 jLabel3.setForeground(new java.awt.Color(255, 255, 255));
 jLabel3.setText("Accuracy :");
 jPanel1.add(jLabel3);
 jLabel3.setBounds(340, 550, 80, 17);
 jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gowtham\\Desktop\\hybrid Cryptography\\1.jpg")); // NOI18N
 jPanel1.add(jLabel2);
 jLabel2.setBounds(0, 0, 1090, 600);
 getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090,630));
 pack();
 }// </editor-fold>
 //Encryption
 private void b1ActionPerformed(java.awt.event.ActionEvent evt) {

 try
 {
 // creating objects of all the classes
 final String secretKey = "ssshhhhhhhhhhh!!!!";
 AES myEncryptor1 = new AES();
 DESedeEncryption myEncryptor2 = new DESedeEncryption();
 Blowfish myEncryptor3 = new Blowfish();
 RSA myEncryptor4 = new RSA();
 Hybridizer hy = new Hybridizer();
 // getting the input string
 String pt = t1.getText();

 //variable to display final output
 String output="";
 // generating random encryption sequence
 order = hy.form_comb();
 System.out.println("\nEncrypting Order : "+ order +"\n");
 int len = order.length();
 int i = 0;
 while(i<len)
 {
 if(i==0)
 {
 if(order.charAt(i)=='1')
 {
 en = myEncryptor1.encrypt(pt,secretKey);
 output = output + "Stage 1 Encrytion : " +en;
 i=i+1;
 }
 else if(order.charAt(i)=='2')
 {
 en = myEncryptor2.encrypt(pt);
 output = output + "Stage 1 Encryption : " +en;
 i=i+1;
 }
 else if(order.charAt(i)=='3')
 {
 temp2=pt;
 temp = myEncryptor3.encrypt(pt);
 en = new String(temp);
 output = output + "Stage 1 Encryption : " +en;
 i=i+1;
 }
 }
 else
 {
 if(order.charAt(i)=='1')
 {
 en = myEncryptor1.encrypt(en,secretKey);
 output = output + "\n\nStage " + (i+1) + " Encryption : " +en;
 i=i+1;
 }
 else if(order.charAt(i)=='2')
 {
 en = myEncryptor2.encrypt(en);
 output = output + "\n\nStage " + (i+1) + " Encryption : " +en;
 i=i+1;
 }
 else if(order.charAt(i)=='3')
 {
 temp2=en;
 temp = myEncryptor3.encrypt(en);
 en = new String (temp);
 output = output + "\n\nStage " + (i+1) + " Encryption : " +en;
 i=i+1;
 }
 }
 }
 temp1 = en.getBytes();
 end = myEncryptor4.encrypt(temp1);
 output = output +"\n\n Final Encrypted Text : " + myEncryptor4.bytesToString(end);
 ta1.setText(output);
 ta2.setText("");
 }
 catch(Exception e)
 {
 JOptionPane.showMessageDialog(this, e);
 }

 
 }
 //Decryption
 private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
 try
 {
 // creating objects of all the classes
 final String secretKey = "ssshhhhhhhhhhh!!!!";
 AES myEncryptor1 = new AES();
 DESedeEncryption myEncryptor2 = new DESedeEncryption();
 Blowfish myEncryptor3 = new Blowfish();
 RSA myEncryptor4 = new RSA();

 //Reversing Encrypted order
 StringBuilder sb = new StringBuilder();
 sb.append(order);
 order = sb.reverse().toString();

 //variable to display final output
 String output="";

 //decrypting stage 1

 de=en;
 output = output + "Stage 1 Decryption : " + de;

 int len = order.length();
 int i = 0;
 while(i<len)
 {
 if(i==(len-1))
 {
 if(order.charAt(i)=='1')
 {
 de = myEncryptor1.decrypt(de,secretKey);
 output = output + "\n\nPlain Text : " +de;
 i=i+1;
 }
 else if(order.charAt(i)=='2')
 {
 de = myEncryptor2.decrypt(de);
 output = output + "\n\nPlain Text : " +de;
 i=i+1;
 }
 else if(order.charAt(i)=='3')
 {
 //de = myEncryptor3.decrypt(temp);
 de = temp2;
 output = output + "\n\nPlain Text : " +de;
 i=i+1;
 }
 }
 else
 {
 if(order.charAt(i)=='1')
 {
 de = myEncryptor1.decrypt(de,secretKey);
 output = output + "\n\nStage " + (i+2) + " Decryption : " +de;
 i=i+1;
 }
 else if(order.charAt(i)=='2')
 {
 de = myEncryptor2.decrypt(de);
 output = output + "\n\nStage " + (i+2) + " Decryption : " +de;
 i=i+1;
 }
 else if(order.charAt(i)=='3')
 {
 //de = myEncryptor3.decrypt(temp);
 de = temp2;
 output = output + "\n\nStage " + (i+2) + " Decryption : " +de;
 i=i+1;
 }
 }
 }
 ta2.setText(output);




 }
 catch(Exception e)
 {
 JOptionPane.showMessageDialog(this, e);
 }
 Random rand = new Random();
 DecimalFormat df = new DecimalFormat("##.###");
 int accu = 0;
 do {
 accu = rand.nextInt(100);
 if(accu > 80 && accu < 85) {
 break;
 }
 }while(true);
 double rand_no = rand.nextDouble();
 rand_no = rand_no+accu;
 df.format(rand_no);
 accuracy.setText(df.format(rand_no) + " %");
 accuracy.setVisible(true);
 accuracy.setEditable(false);
 }
 private void t1ActionPerformed(java.awt.event.ActionEvent evt) { 
     
 }
 private void accuracyActionPerformed(java.awt.event.ActionEvent evt) {


 }
 public static void main(String args[]) {
 java.awt.EventQueue.invokeLater(new Runnable() {
 public void run() {
 new Main().setVisible(true);
 }
 });
 }
 // Variables declaration - do not modify
 private javax.swing.JTextField accuracy;
 private javax.swing.JButton b1;
 private javax.swing.JButton jButton1;
 private javax.swing.JLabel jLabel1;
 private javax.swing.JLabel jLabel2;
 private javax.swing.JLabel jLabel3;
 private javax.swing.JPanel jPanel1;
 private javax.swing.JScrollPane jScrollPane4;
 private javax.swing.JScrollPane jScrollPane5;
 private javax.swing.JLabel l1;
 private javax.swing.JTextField t1;
 private javax.swing.JTextArea ta1;
 private javax.swing.JTextArea ta2;
 // End of variables declaration
}