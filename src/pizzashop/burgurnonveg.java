/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vipul Rajput
 */
public class burgurnonveg extends javax.swing.JFrame {

    Connection con;
    Statement st;
    /**
     * Creates new form burgurnonveg
     */
    public burgurnonveg() {
        initComponents();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzashop","root","1234");
            st= con.createStatement();
            
        
        } catch (SQLException ex) {
              System.out.println("connectivity failed");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(burgurnonveg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        spicychickenroyale = new javax.swing.JRadioButton();
        grillchicken = new javax.swing.JRadioButton();
        crispychicken = new javax.swing.JRadioButton();
        chickenwhopper = new javax.swing.JRadioButton();
        chickenchilli = new javax.swing.JRadioButton();
        home = new javax.swing.JButton();
        minimize = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        veggielover = new javax.swing.JButton();
        tandooripaneer = new javax.swing.JButton();
        chickenchillicheese = new javax.swing.JButton();
        spicychickenroyal = new javax.swing.JButton();
        veggiesupreme5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 900));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        spicychickenroyale.setBorder(null);
        spicychickenroyale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        spicychickenroyale.setFocusPainted(false);
        spicychickenroyale.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        spicychickenroyale.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        spicychickenroyale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/9.png"))); // NOI18N
        spicychickenroyale.setOpaque(false);
        spicychickenroyale.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/green-tick.png"))); // NOI18N
        spicychickenroyale.setVerifyInputWhenFocusTarget(false);
        spicychickenroyale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spicychickenroyaleActionPerformed(evt);
            }
        });
        jPanel1.add(spicychickenroyale);
        spicychickenroyale.setBounds(650, 480, 380, 220);

        grillchicken.setBorder(null);
        grillchicken.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grillchicken.setFocusPainted(false);
        grillchicken.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        grillchicken.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        grillchicken.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/9.png"))); // NOI18N
        grillchicken.setOpaque(false);
        grillchicken.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/green-tick.png"))); // NOI18N
        grillchicken.setVerifyInputWhenFocusTarget(false);
        grillchicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grillchickenActionPerformed(evt);
            }
        });
        jPanel1.add(grillchicken);
        grillchicken.setBounds(60, 175, 330, 180);

        crispychicken.setBorder(null);
        crispychicken.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crispychicken.setFocusPainted(false);
        crispychicken.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        crispychicken.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        crispychicken.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/9.png"))); // NOI18N
        crispychicken.setOpaque(false);
        crispychicken.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/green-tick.png"))); // NOI18N
        crispychicken.setVerifyInputWhenFocusTarget(false);
        crispychicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crispychickenActionPerformed(evt);
            }
        });
        jPanel1.add(crispychicken);
        crispychicken.setBounds(440, 180, 330, 180);

        chickenwhopper.setBorder(null);
        chickenwhopper.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chickenwhopper.setFocusPainted(false);
        chickenwhopper.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chickenwhopper.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        chickenwhopper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/9.png"))); // NOI18N
        chickenwhopper.setOpaque(false);
        chickenwhopper.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/green-tick.png"))); // NOI18N
        chickenwhopper.setVerifyInputWhenFocusTarget(false);
        chickenwhopper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickenwhopperActionPerformed(evt);
            }
        });
        jPanel1.add(chickenwhopper);
        chickenwhopper.setBounds(820, 180, 330, 180);

        chickenchilli.setBorder(null);
        chickenchilli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chickenchilli.setFocusPainted(false);
        chickenchilli.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chickenchilli.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        chickenchilli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/9.png"))); // NOI18N
        chickenchilli.setOpaque(false);
        chickenchilli.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/green-tick.png"))); // NOI18N
        chickenchilli.setVerifyInputWhenFocusTarget(false);
        chickenchilli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickenchilliActionPerformed(evt);
            }
        });
        jPanel1.add(chickenchilli);
        chickenchilli.setBounds(220, 490, 330, 200);

        home.setBorder(null);
        home.setContentAreaFilled(false);
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jPanel1.add(home);
        home.setBounds(0, 0, 140, 170);

        minimize.setBorder(null);
        minimize.setBorderPainted(false);
        minimize.setContentAreaFilled(false);
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeActionPerformed(evt);
            }
        });
        jPanel1.add(minimize);
        minimize.setBounds(1045, 5, 50, 50);

        close.setBorder(null);
        close.setBorderPainted(false);
        close.setContentAreaFilled(false);
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jPanel1.add(close);
        close.setBounds(1120, 0, 50, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/LABEL.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 170);

        veggielover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/Crispy_Chicken.png"))); // NOI18N
        veggielover.setContentAreaFilled(false);
        veggielover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(veggielover);
        veggielover.setBounds(410, 170, 390, 220);

        tandooripaneer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/ChickenWhopper.png"))); // NOI18N
        tandooripaneer.setContentAreaFilled(false);
        tandooripaneer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(tandooripaneer);
        tandooripaneer.setBounds(790, 170, 390, 220);

        chickenchillicheese.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/ChickenChilli CheeseMelt.png"))); // NOI18N
        chickenchillicheese.setContentAreaFilled(false);
        chickenchillicheese.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(chickenchillicheese);
        chickenchillicheese.setBounds(190, 480, 390, 220);

        spicychickenroyal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/Spicy Chicken Royale.png"))); // NOI18N
        spicychickenroyal.setContentAreaFilled(false);
        spicychickenroyal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(spicychickenroyal);
        spicychickenroyal.setBounds(650, 490, 390, 220);

        veggiesupreme5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/BKGrillChicken.png"))); // NOI18N
        veggiesupreme5.setContentAreaFilled(false);
        veggiesupreme5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(veggiesupreme5);
        veggiesupreme5.setBounds(30, 170, 390, 220);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Chicken Whopper");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(860, 400, 250, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(" ₹ 189");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(930, 440, 110, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(" ₹ 149");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(310, 760, 110, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Chicken chilli cheese melt");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(250, 720, 270, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText(" ₹ 149");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(800, 760, 110, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Spicy chicken royal");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(730, 720, 250, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText(" ₹ 79");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(160, 430, 110, 30);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Grill Chicken");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(90, 390, 250, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText(" ₹ 119");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(530, 430, 110, 30);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Crispy Chicken");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(460, 390, 250, 30);

        jButton2.setFont(new java.awt.Font("Just In The Firestorm", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("bill Please!");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(0, 830, 360, 70);

        menu.setFont(new java.awt.Font("Just In The Firestorm", 1, 24)); // NOI18N
        menu.setForeground(new java.awt.Color(255, 0, 0));
        menu.setText("back to menu");
        menu.setBorder(null);
        menu.setBorderPainted(false);
        menu.setContentAreaFilled(false);
        menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        jPanel1.add(menu);
        menu.setBounds(840, 830, 360, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1200, 900);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        
        try {
            new start().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(burgurnonveg.class.getName()).log(Level.SEVERE, null, ex);
        }setVisible(false);
    }//GEN-LAST:event_homeActionPerformed

    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeActionPerformed
        this.setState(start.ICONIFIED);
    }//GEN-LAST:event_minimizeActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        
        try {
            new start().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(burgurnonveg.class.getName()).log(Level.SEVERE, null, ex);
        }setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void grillchickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grillchickenActionPerformed
        if(grillchicken.isSelected())
        {
            try {
                ResultSet res=st.executeQuery("select * from menu where id='bn01'");
                res.next();
                String id=res.getString(1);
                String na=res.getString(2);
                String ty=res.getString(3);
                int pr=Integer.parseInt(res.getString(4));
                st.executeUpdate("insert into bill values('"+id+"','"+na+"','"+ty+"',"+pr+")");
            } catch (SQLException ex) {
                Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {

            try {
                st.executeUpdate("delete from bill where id='bn01'");
            } catch (SQLException ex) {
                Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_grillchickenActionPerformed

    private void crispychickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crispychickenActionPerformed
        if(crispychicken.isSelected())
        {
            try {
                ResultSet res=st.executeQuery("select * from menu where id='bn02'");
                res.next();
                String id=res.getString(1);
                String na=res.getString(2);
                String ty=res.getString(3);
                int pr=Integer.parseInt(res.getString(4));
                st.executeUpdate("insert into bill values('"+id+"','"+na+"','"+ty+"',"+pr+")");
            } catch (SQLException ex) {
                Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {

            try {
                st.executeUpdate("delete from bill where id='bn02'");
            } catch (SQLException ex) {
                Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_crispychickenActionPerformed

    private void chickenwhopperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickenwhopperActionPerformed
        if(chickenwhopper.isSelected())
        {
            try {
                ResultSet res=st.executeQuery("select * from menu where id='bn03'");
                res.next();
                String id=res.getString(1);
                String na=res.getString(2);
                String ty=res.getString(3);
                int pr=Integer.parseInt(res.getString(4));
                st.executeUpdate("insert into bill values('"+id+"','"+na+"','"+ty+"',"+pr+")");
            } catch (SQLException ex) {
                Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {

            try {
                st.executeUpdate("delete from bill where id='bn03'");
            } catch (SQLException ex) {
                Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_chickenwhopperActionPerformed

    private void chickenchilliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickenchilliActionPerformed
        if(chickenchilli.isSelected())
        {
            try {
                ResultSet res=st.executeQuery("select * from menu where id='bn04'");
                res.next();
                String id=res.getString(1);
                String na=res.getString(2);
                String ty=res.getString(3);
                int pr=Integer.parseInt(res.getString(4));
                st.executeUpdate("insert into bill values('"+id+"','"+na+"','"+ty+"',"+pr+")");
            } catch (SQLException ex) {
                Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {

            try {
                st.executeUpdate("delete from bill where id='bn04'");
            } catch (SQLException ex) {
                Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_chickenchilliActionPerformed

    private void spicychickenroyaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spicychickenroyaleActionPerformed
        if(spicychickenroyale.isSelected())
        {
            try {
                ResultSet res=st.executeQuery("select * from menu where id='bn05'");
                res.next();
                String id=res.getString(1);
                String na=res.getString(2);
                String ty=res.getString(3);
                int pr=Integer.parseInt(res.getString(4));
                st.executeUpdate("insert into bill values('"+id+"','"+na+"','"+ty+"',"+pr+")");
            } catch (SQLException ex) {
                Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {

            try {
                st.executeUpdate("delete from bill where id='bn05'");
            } catch (SQLException ex) {
                Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_spicychickenroyaleActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            new info().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(desserts.class.getName()).log(Level.SEVERE, null, ex);
        }
        setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed

        new menu().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_menuActionPerformed

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
            java.util.logging.Logger.getLogger(burgurnonveg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(burgurnonveg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(burgurnonveg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(burgurnonveg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new burgurnonveg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton chickenchilli;
    private javax.swing.JButton chickenchillicheese;
    private javax.swing.JRadioButton chickenwhopper;
    private javax.swing.JButton close;
    private javax.swing.JRadioButton crispychicken;
    private javax.swing.JRadioButton grillchicken;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton menu;
    private javax.swing.JButton minimize;
    private javax.swing.JButton spicychickenroyal;
    private javax.swing.JRadioButton spicychickenroyale;
    private javax.swing.JButton tandooripaneer;
    private javax.swing.JButton veggielover;
    private javax.swing.JButton veggiesupreme5;
    // End of variables declaration//GEN-END:variables
}