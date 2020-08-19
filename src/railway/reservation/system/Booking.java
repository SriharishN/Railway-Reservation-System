/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railway.reservation.system;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Booking extends javax.swing.JFrame {

    /**
     * Creates new form Booking
     */
    public Booking() {
        initComponents();
        this.setTitle("Booking Tickets");
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Railway Reservation System\\src\\images\\icons8-subway-96.png");
        this.setIconImage(icon);
        this.setLocationRelativeTo(null);
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
        userName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        trainName = new javax.swing.JTextField();
        journeyDate = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        people = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboClass = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Book a Ticket");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel3.setText("Train Name");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel4.setText("Date of Journey");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel5.setText("No. of Passengers");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel6.setText("Class");

        comboClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GEN", "AC", "SL" }));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        jButton1.setText("Cost");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Book");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(252, 252, 252)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(225, 225, 225)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userName)
                            .addComponent(trainName)
                            .addComponent(journeyDate, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(comboClass, 0, 79, Short.MAX_VALUE)
                            .addComponent(people)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(229, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(349, 349, 349))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(trainName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(journeyDate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(people, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboClass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        PanelScreen ps = new PanelScreen();
        ps.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String name = userName.getText();
        String train = trainName.getText();
        String date = null;
        String pass = people.getText();
        String stat = comboClass.getSelectedItem().toString();
        int cost = fare;
        int userID = 0;
        SimpleDateFormat sb = new SimpleDateFormat("yyyy-MM-dd");
        date = sb.format(journeyDate.getDate());
        PreparedStatement ps,ps1;
        ResultSet rs,rs1;
        String query  = "select * from reguser where u_uname = '"+UserLogin.name+"'";
        try {
            ps1 = ConnectDb.ConnectionDb().prepareStatement(query);
            rs1 = ps1.executeQuery();
            if(rs1.next()){
                userID = rs1.getInt("u_id");
                System.out.println(userID);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "insert into booking_details(b_id,b_name,train_name,b_date,tickets,class,cost) values('"+userID+"','"+name+"','"+train+"','"+date+"','"+pass+"','"+stat+"','"+cost+"')";
        String check = "select * from train_details where train_name = '"+train+"' and date = '"+date+"'";
        String spacer,booked;
        try{
            ps = ConnectDb.ConnectionDb().prepareStatement(check);
            rs = ps.executeQuery();
            if(rs.next()==false){
                JOptionPane.showMessageDialog(null, "No Trains Available");
            }else{
           try{ 
            ps1 = ConnectDb.ConnectionDb().prepareStatement(sql);
            if(jButton2.isEnabled()){
               // JOptionPane.showMessageDialog(null, "Booked Successfully");
                if(stat.equals("GEN")){
                   booked = "select * from train_details where date = '"+date+"'";
                    ps = ConnectDb.ConnectionDb().prepareStatement(booked);
                    rs = ps.executeQuery();
                    if(rs.next()){
                    int value = rs.getInt("nonsleeper");
                    int people = Integer.parseInt(pass);
                    if((value-people)<0){
                        JOptionPane.showMessageDialog(null, "No More");
                    }
                     else{
                        JOptionPane.showMessageDialog(null, "Booking Done");
                      ps1.executeUpdate();
                    spacer = "update train_details set space = space-'"+pass+"', nonsleeper = nonsleeper-'"+pass+"' where date = '"+date+"'";
                    ps = ConnectDb.ConnectionDb().prepareStatement(spacer);
                    ps.executeUpdate();
                    }
                    }
                }else if(stat.equals("AC")){
                     booked = "select * from train_details where date = '"+date+"'";
                    ps = ConnectDb.ConnectionDb().prepareStatement(booked);
                    rs = ps.executeQuery();
                    if(rs.next()){
                    int value = rs.getInt("ac");
                    int people = Integer.parseInt(pass);
                    if((value-people)<0){
                        JOptionPane.showMessageDialog(null, "No More");
                    }
                     else{
                        JOptionPane.showMessageDialog(null, "Booking Done");
                        ps1.executeUpdate();
                        spacer = "update train_details set space = space-'"+pass+"',  ac = ac-'"+pass+"' where date = '"+date+"'";
                    ps = ConnectDb.ConnectionDb().prepareStatement(spacer);
                    ps.executeUpdate();
                    } }
                }else if(stat.equals("SL")){
                     booked = "select * from train_details where date = '"+date+"'";
                    ps = ConnectDb.ConnectionDb().prepareStatement(booked);
                    rs = ps.executeQuery();
                    if(rs.next()){
                    int value = rs.getInt("sleeper");
                    int people = Integer.parseInt(pass);
                    if((value-people)<0){
                        JOptionPane.showMessageDialog(null, "No More");
                    }
                     else{
                        JOptionPane.showMessageDialog(null, "Booking Done");
                    ps1.executeUpdate();
                    spacer = "update train_details set space = space-'"+pass+"', sleeper = sleeper-'"+pass+"' where date = '"+date+"'";
                    ps = ConnectDb.ConnectionDb().prepareStatement(spacer);
                    ps.executeUpdate();
                    }
                    }
                }
            }    
            
            }catch(Exception e){
            System.out.println(e);
        }
            }  
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
     public static int fare;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String people = this.people.getText();
        String combo = this.comboClass.getSelectedItem().toString();
        fare = 250;
        if(combo.equals("GEN")){
            fare = 250* Integer.parseInt(people);
            jLabel8.setText(String.valueOf(fare));
            
        }else if(combo.equals("AC")){
             fare = 250* Integer.parseInt(people)+250;
            jLabel8.setText(String.valueOf(fare));
        }else if(combo.equals("SL")){
             fare = 250* Integer.parseInt(people)+50;
            jLabel8.setText(String.valueOf(fare));
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        userName.setText("");
        trainName.setText("");
        journeyDate.setDate(null);
        people.setText("");
        jLabel8.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboClass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private com.toedter.calendar.JDateChooser journeyDate;
    private javax.swing.JTextField people;
    private javax.swing.JTextField trainName;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}