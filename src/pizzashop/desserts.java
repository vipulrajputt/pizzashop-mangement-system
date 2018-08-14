/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ARUN
 */
public class desserts extends javax.swing.JFrame {

    Connection con;
    Statement st;
    /**
     * Creates new form desserts
     */
    public desserts() throws ClassNotFoundException {
        initComponents();
        seticon();
         try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzashop","root","1234");
            st= con.createStatement();
            
        
        } catch (SQLException ex) {
              System.out.println("connectivity failed");
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
        home = new javax.swing.JButton();
        minimize = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        snickerpie = new javax.swing.JRadioButton();
        oreoshakevanilla = new javax.swing.JRadioButton();
        chocofudgesundae = new javax.swing.JRadioButton();
        oreochocoshake = new javax.swing.JRadioButton();
        chocotrufflecake = new javax.swing.JRadioButton();
        sundaestrawberry = new javax.swing.JRadioButton();
        veggielover = new javax.swing.JButton();
        tandooripaneer = new javax.swing.JButton();
        paneervagorama = new javax.swing.JButton();
        exotica = new javax.swing.JButton();
        countryfest = new javax.swing.JButton();
        veggiesupreme5 = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        bill = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 900));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(java.awt.Color.orange);
        jPanel1.setLayout(null);

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

        snickerpie.setBorder(null);
        snickerpie.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        snickerpie.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        snickerpie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/9.png"))); // NOI18N
        snickerpie.setOpaque(false);
        snickerpie.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/green-tick.png"))); // NOI18N
        snickerpie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snickerpieActionPerformed(evt);
            }
        });
        jPanel1.add(snickerpie);
        snickerpie.setBounds(440, 180, 330, 180);

        oreoshakevanilla.setBorder(null);
        oreoshakevanilla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        oreoshakevanilla.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        oreoshakevanilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/9.png"))); // NOI18N
        oreoshakevanilla.setOpaque(false);
        oreoshakevanilla.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/green-tick.png"))); // NOI18N
        oreoshakevanilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oreoshakevanillaActionPerformed(evt);
            }
        });
        jPanel1.add(oreoshakevanilla);
        oreoshakevanilla.setBounds(50, 510, 330, 180);

        chocofudgesundae.setBorder(null);
        chocofudgesundae.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chocofudgesundae.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        chocofudgesundae.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/9.png"))); // NOI18N
        chocofudgesundae.setOpaque(false);
        chocofudgesundae.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/green-tick.png"))); // NOI18N
        chocofudgesundae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocofudgesundaeActionPerformed(evt);
            }
        });
        jPanel1.add(chocofudgesundae);
        chocofudgesundae.setBounds(830, 510, 330, 180);

        oreochocoshake.setBorder(null);
        oreochocoshake.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        oreochocoshake.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        oreochocoshake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/9.png"))); // NOI18N
        oreochocoshake.setOpaque(false);
        oreochocoshake.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/green-tick.png"))); // NOI18N
        oreochocoshake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oreochocoshakeActionPerformed(evt);
            }
        });
        jPanel1.add(oreochocoshake);
        oreochocoshake.setBounds(820, 180, 330, 180);

        chocotrufflecake.setBorder(null);
        chocotrufflecake.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chocotrufflecake.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        chocotrufflecake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/9.png"))); // NOI18N
        chocotrufflecake.setOpaque(false);
        chocotrufflecake.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/green-tick.png"))); // NOI18N
        chocotrufflecake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocotrufflecakeActionPerformed(evt);
            }
        });
        jPanel1.add(chocotrufflecake);
        chocotrufflecake.setBounds(60, 175, 330, 180);

        sundaestrawberry.setBorder(null);
        sundaestrawberry.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sundaestrawberry.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        sundaestrawberry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/9.png"))); // NOI18N
        sundaestrawberry.setOpaque(false);
        sundaestrawberry.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/green-tick.png"))); // NOI18N
        sundaestrawberry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sundaestrawberryActionPerformed(evt);
            }
        });
        jPanel1.add(sundaestrawberry);
        sundaestrawberry.setBounds(430, 510, 330, 180);

        veggielover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/pie made with sneaker.jpg"))); // NOI18N
        veggielover.setBorderPainted(false);
        veggielover.setContentAreaFilled(false);
        veggielover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(veggielover);
        veggielover.setBounds(410, 110, 390, 290);

        tandooripaneer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/OREOCHOCSHAKE.jpg"))); // NOI18N
        tandooripaneer.setBorderPainted(false);
        tandooripaneer.setContentAreaFilled(false);
        tandooripaneer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(tandooripaneer);
        tandooripaneer.setBounds(790, 130, 390, 250);

        paneervagorama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/Oreo_Shake_vanilla.png"))); // NOI18N
        paneervagorama.setBorderPainted(false);
        paneervagorama.setContentAreaFilled(false);
        paneervagorama.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(paneervagorama);
        paneervagorama.setBounds(10, 480, 390, 250);

        exotica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/BK-SundaeStrawberry.png"))); // NOI18N
        exotica.setBorderPainted(false);
        exotica.setContentAreaFilled(false);
        exotica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(exotica);
        exotica.setBounds(410, 450, 390, 280);

        countryfest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/Chocolate_Fudge_Sundae.jpg"))); // NOI18N
        countryfest.setBorderPainted(false);
        countryfest.setContentAreaFilled(false);
        countryfest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(countryfest);
        countryfest.setBounds(800, 465, 390, 230);

        veggiesupreme5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/choco tuffle cake.png"))); // NOI18N
        veggiesupreme5.setBorderPainted(false);
        veggiesupreme5.setContentAreaFilled(false);
        veggiesupreme5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(veggiesupreme5);
        veggiesupreme5.setBounds(30, 170, 390, 195);

        menu.setFont(new java.awt.Font("Just In The Firestorm", 1, 24)); // NOI18N
        menu.setForeground(new java.awt.Color(0, 0, 255));
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
        menu.setBounds(840, 820, 360, 80);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel2.setForeground(java.awt.Color.orange);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Choco Fudge Sundae");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(820, 710, 350, 40);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel3.setForeground(java.awt.Color.orange);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("₹125");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(870, 750, 270, 40);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel4.setForeground(java.awt.Color.orange);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Snicker pie");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(490, 380, 270, 40);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel5.setForeground(java.awt.Color.orange);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Oreo Choco Shake");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(870, 380, 270, 40);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel6.setForeground(java.awt.Color.orange);
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Oreo Shake Vanilla");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(70, 710, 270, 40);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel7.setForeground(java.awt.Color.orange);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Sundae Strawberry");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(470, 720, 270, 40);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel8.setForeground(java.awt.Color.orange);
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Choco Truffle Cake");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(90, 380, 270, 40);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel9.setForeground(java.awt.Color.orange);
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("₹199");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(100, 420, 270, 40);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel10.setForeground(java.awt.Color.orange);
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("₹85");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(490, 420, 270, 40);

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel11.setForeground(java.awt.Color.orange);
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("₹125");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(870, 420, 270, 40);

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel12.setForeground(java.awt.Color.orange);
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("₹125");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(70, 750, 270, 40);

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel13.setForeground(java.awt.Color.orange);
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("₹149");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(470, 760, 270, 40);

        bill.setFont(new java.awt.Font("Just In The Firestorm", 1, 24)); // NOI18N
        bill.setForeground(new java.awt.Color(0, 0, 255));
        bill.setText("bill Please!");
        bill.setBorder(null);
        bill.setBorderPainted(false);
        bill.setContentAreaFilled(false);
        bill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billActionPerformed(evt);
            }
        });
        jPanel1.add(bill);
        bill.setBounds(0, 820, 360, 80);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1200, 900);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        setVisible(false);
        try {
            new start().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(desserts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_homeActionPerformed

    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeActionPerformed
        this.setState(start.ICONIFIED);
    }//GEN-LAST:event_minimizeActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        setVisible(false);
        try {
            new start().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(desserts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_closeActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        setVisible(false);
        new menu().setVisible(true);
    }//GEN-LAST:event_menuActionPerformed

    private void billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billActionPerformed
        try {
            new info().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(desserts.class.getName()).log(Level.SEVERE, null, ex);
        }
        setVisible(false);
 // TODO add your handling code here:
    }//GEN-LAST:event_billActionPerformed

    private void chocotrufflecakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocotrufflecakeActionPerformed
           if(chocotrufflecake.isSelected())
            {
                try {
                    ResultSet res=st.executeQuery("select * from menu where id='d01'");
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
                    st.executeUpdate("delete from bill where id='d01'");
                } catch (SQLException ex) {
                    Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
                }
            }// TODO add your handling code here:
    }//GEN-LAST:event_chocotrufflecakeActionPerformed

    private void snickerpieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snickerpieActionPerformed
         if(snickerpie.isSelected())
            {
                try {
                    ResultSet res=st.executeQuery("select * from menu where id='d02'");
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
                    st.executeUpdate("delete from bill where id='d02'");
                } catch (SQLException ex) {
                    Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  // TODO add your handling code here:
    }//GEN-LAST:event_snickerpieActionPerformed

    private void oreochocoshakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oreochocoshakeActionPerformed
          if(oreochocoshake.isSelected())
            {
                try {
                    ResultSet res=st.executeQuery("select * from menu where id='d03'");
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
                    st.executeUpdate("delete from bill where id='d03'");
                } catch (SQLException ex) {
                    Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
                }
            } // TODO add your handling code here:
    }//GEN-LAST:event_oreochocoshakeActionPerformed

    private void oreoshakevanillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oreoshakevanillaActionPerformed
          if(oreoshakevanilla.isSelected())
            {
                try {
                    ResultSet res=st.executeQuery("select * from menu where id='d04'");
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
                    st.executeUpdate("delete from bill where id='d04'");
                } catch (SQLException ex) {
                    Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
                }
            } // TODO add your handling code here:
    }//GEN-LAST:event_oreoshakevanillaActionPerformed

    private void sundaestrawberryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sundaestrawberryActionPerformed
          if(sundaestrawberry.isSelected())
            {
                try {
                    ResultSet res=st.executeQuery("select * from menu where id='d05'");
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
                    st.executeUpdate("delete from bill where id='d05'");
                } catch (SQLException ex) {
                    Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        // TODO add your handling code here:
    }//GEN-LAST:event_sundaestrawberryActionPerformed

    private void chocofudgesundaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocofudgesundaeActionPerformed
          if(chocofudgesundae.isSelected())
            {
                try {
                    ResultSet res=st.executeQuery("select * from menu where id='d06'");
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
                    st.executeUpdate("delete from bill where id='d06'");
                } catch (SQLException ex) {
                    Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
                }
            } // TODO add your handling code here:
    }//GEN-LAST:event_chocofudgesundaeActionPerformed

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
            java.util.logging.Logger.getLogger(desserts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(desserts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(desserts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(desserts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new desserts().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(desserts.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bill;
    private javax.swing.JRadioButton chocofudgesundae;
    private javax.swing.JRadioButton chocotrufflecake;
    private javax.swing.JButton close;
    private javax.swing.JButton countryfest;
    private javax.swing.JButton exotica;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton menu;
    private javax.swing.JButton minimize;
    private javax.swing.JRadioButton oreochocoshake;
    private javax.swing.JRadioButton oreoshakevanilla;
    private javax.swing.JButton paneervagorama;
    private javax.swing.JRadioButton snickerpie;
    private javax.swing.JRadioButton sundaestrawberry;
    private javax.swing.JButton tandooripaneer;
    private javax.swing.JButton veggielover;
    private javax.swing.JButton veggiesupreme5;
    // End of variables declaration//GEN-END:variables
 private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/pizzashop/img/icon.png")));
    }
}
