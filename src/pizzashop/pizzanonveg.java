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
public class pizzanonveg extends javax.swing.JFrame {

    Connection con;
    Statement st;
    public pizzanonveg() throws ClassNotFoundException {
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
        chickenitaliano = new javax.swing.JRadioButton();
        triplechickenfeast = new javax.swing.JRadioButton();
        doubletrouble = new javax.swing.JRadioButton();
        keememasala = new javax.swing.JRadioButton();
        bigpizzaclassicchicken = new javax.swing.JRadioButton();
        chickentikka = new javax.swing.JRadioButton();
        veggielover = new javax.swing.JButton();
        tandooripaneer = new javax.swing.JButton();
        paneervagorama = new javax.swing.JButton();
        exotica = new javax.swing.JButton();
        countryfest = new javax.swing.JButton();
        veggiesupreme5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vegsuptxt = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        vegsuptxt1 = new javax.swing.JTextArea();
        menu = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 900));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
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

        chickenitaliano.setBorder(null);
        chickenitaliano.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chickenitaliano.setFocusPainted(false);
        chickenitaliano.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chickenitaliano.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        chickenitaliano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/9.png"))); // NOI18N
        chickenitaliano.setOpaque(false);
        chickenitaliano.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/green-tick.png"))); // NOI18N
        chickenitaliano.setVerifyInputWhenFocusTarget(false);
        chickenitaliano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickenitalianoActionPerformed(evt);
            }
        });
        jPanel1.add(chickenitaliano);
        chickenitaliano.setBounds(820, 180, 330, 180);

        triplechickenfeast.setBorder(null);
        triplechickenfeast.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        triplechickenfeast.setFocusPainted(false);
        triplechickenfeast.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        triplechickenfeast.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        triplechickenfeast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/9.png"))); // NOI18N
        triplechickenfeast.setOpaque(false);
        triplechickenfeast.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/green-tick.png"))); // NOI18N
        triplechickenfeast.setVerifyInputWhenFocusTarget(false);
        triplechickenfeast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triplechickenfeastActionPerformed(evt);
            }
        });
        jPanel1.add(triplechickenfeast);
        triplechickenfeast.setBounds(60, 175, 330, 180);

        doubletrouble.setBorder(null);
        doubletrouble.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        doubletrouble.setFocusPainted(false);
        doubletrouble.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        doubletrouble.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        doubletrouble.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/9.png"))); // NOI18N
        doubletrouble.setOpaque(false);
        doubletrouble.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/green-tick.png"))); // NOI18N
        doubletrouble.setVerifyInputWhenFocusTarget(false);
        doubletrouble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doubletroubleActionPerformed(evt);
            }
        });
        jPanel1.add(doubletrouble);
        doubletrouble.setBounds(430, 510, 330, 180);

        keememasala.setBorder(null);
        keememasala.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        keememasala.setFocusPainted(false);
        keememasala.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        keememasala.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        keememasala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/9.png"))); // NOI18N
        keememasala.setOpaque(false);
        keememasala.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/green-tick.png"))); // NOI18N
        keememasala.setVerifyInputWhenFocusTarget(false);
        keememasala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keememasalaActionPerformed(evt);
            }
        });
        jPanel1.add(keememasala);
        keememasala.setBounds(440, 180, 330, 180);

        bigpizzaclassicchicken.setBorder(null);
        bigpizzaclassicchicken.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bigpizzaclassicchicken.setFocusPainted(false);
        bigpizzaclassicchicken.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bigpizzaclassicchicken.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bigpizzaclassicchicken.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/9.png"))); // NOI18N
        bigpizzaclassicchicken.setOpaque(false);
        bigpizzaclassicchicken.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/green-tick.png"))); // NOI18N
        bigpizzaclassicchicken.setVerifyInputWhenFocusTarget(false);
        bigpizzaclassicchicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bigpizzaclassicchickenActionPerformed(evt);
            }
        });
        jPanel1.add(bigpizzaclassicchicken);
        bigpizzaclassicchicken.setBounds(50, 510, 330, 180);

        chickentikka.setBorder(null);
        chickentikka.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chickentikka.setFocusPainted(false);
        chickentikka.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chickentikka.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        chickentikka.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/9.png"))); // NOI18N
        chickentikka.setOpaque(false);
        chickentikka.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/green-tick.png"))); // NOI18N
        chickentikka.setVerifyInputWhenFocusTarget(false);
        chickentikka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickentikkaActionPerformed(evt);
            }
        });
        jPanel1.add(chickentikka);
        chickentikka.setBounds(830, 510, 330, 180);

        veggielover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/keema masala.png"))); // NOI18N
        veggielover.setContentAreaFilled(false);
        veggielover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(veggielover);
        veggielover.setBounds(410, 170, 390, 195);

        tandooripaneer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/chicken italiano.png"))); // NOI18N
        tandooripaneer.setContentAreaFilled(false);
        tandooripaneer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(tandooripaneer);
        tandooripaneer.setBounds(790, 170, 390, 195);

        paneervagorama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/chicken classic.png"))); // NOI18N
        paneervagorama.setContentAreaFilled(false);
        paneervagorama.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(paneervagorama);
        paneervagorama.setBounds(10, 500, 390, 195);

        exotica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/double trouble.png"))); // NOI18N
        exotica.setContentAreaFilled(false);
        exotica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(exotica);
        exotica.setBounds(400, 500, 390, 195);

        countryfest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/chicken tikka.png"))); // NOI18N
        countryfest.setContentAreaFilled(false);
        countryfest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(countryfest);
        countryfest.setBounds(800, 500, 390, 195);

        veggiesupreme5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/triple chicken feast.png"))); // NOI18N
        veggiesupreme5.setContentAreaFilled(false);
        veggiesupreme5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(veggiesupreme5);
        veggiesupreme5.setBounds(30, 170, 390, 195);

        vegsuptxt.setEditable(false);
        vegsuptxt.setBackground(new java.awt.Color(0, 0, 0));
        vegsuptxt.setColumns(20);
        vegsuptxt.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        vegsuptxt.setForeground(new java.awt.Color(255, 255, 255));
        vegsuptxt.setLineWrap(true);
        vegsuptxt.setRows(3);
        vegsuptxt.setTabSize(4);
        vegsuptxt.setText("\t Big Pizza Classic Chicken                              Double Trouble\t\t\t\t      \t     Chicken Tikka\n\tChicken Keema, Chicken Hot \t\t  \tChicken Sausage, Chicken Tikka,\t          Chicken Tikka, Onion, Tomato\n\t  & Chilly, Onion, Tomato\t\t\t      Capsicum, Jalapeno, Red Paprika\t   \n\tCrust: Pan     Size: Large\t\t\t  Crust: Pan     Size: Large\t\t           Crust: Pan     Size: Large\n\t\t     ₹725\t\t\t\t\t\t      ₹849\t\t\t\t\t\t        ₹999");
        vegsuptxt.setWrapStyleWord(true);
        vegsuptxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        vegsuptxt.setCaretColor(new java.awt.Color(255, 255, 255));
        vegsuptxt.setFocusable(false);
        vegsuptxt.setRequestFocusEnabled(false);
        vegsuptxt.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(vegsuptxt);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 690, 1200, 140);

        vegsuptxt1.setEditable(false);
        vegsuptxt1.setBackground(new java.awt.Color(0, 0, 0));
        vegsuptxt1.setColumns(20);
        vegsuptxt1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        vegsuptxt1.setForeground(new java.awt.Color(255, 255, 255));
        vegsuptxt1.setLineWrap(true);
        vegsuptxt1.setRows(3);
        vegsuptxt1.setTabSize(4);
        vegsuptxt1.setText("\t\t Triple Chicken Feast                               Keema Masala\t\t\t\t\t   Chicken Italiano\n  Chicken Keema, Chicken Meatball, Chicken \t  Chicken Keema, Onion, Capsicum \t\t Chicken Pepperoni, Chicken Sausage,\n  Hot & Chilly, Capsicum, Onion, Sweet Corn\t\t\t   \t\t\t\t\t\t  Mushroom, Capsicum, Black Olives\n\t   Crust: Pan     Size: Medium\t\t\t\tCrust: Pan     Size: Medium\t\t    Crust: Pan     Size: Medium\n\t\t\t₹549\t\t\t\t\t\t   \t   ₹499\t\t\t\t\t\t₹599");
        vegsuptxt1.setWrapStyleWord(true);
        vegsuptxt1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        vegsuptxt1.setCaretColor(new java.awt.Color(255, 255, 255));
        vegsuptxt1.setFocusable(false);
        vegsuptxt1.setRequestFocusEnabled(false);
        vegsuptxt1.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(vegsuptxt1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(0, 360, 1200, 140);

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

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1200, 900);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        
        try {
            new start().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(pizzanonveg.class.getName()).log(Level.SEVERE, null, ex);
        }
        setVisible(false);
    }//GEN-LAST:event_homeActionPerformed

    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeActionPerformed
        this.setState(start.ICONIFIED);
    }//GEN-LAST:event_minimizeActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        
        try {
            new start().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(pizzanonveg.class.getName()).log(Level.SEVERE, null, ex);
        }
        setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        
        new menu().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_menuActionPerformed

    private void keememasalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keememasalaActionPerformed
      if(keememasala.isSelected())
            {
                try {
                    ResultSet res=st.executeQuery("select * from menu where id='pn02'");
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
                    st.executeUpdate("delete from bill where id='pn02'");
                } catch (SQLException ex) {
                    Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
 
    }//GEN-LAST:event_keememasalaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try {
            new info().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(desserts.class.getName()).log(Level.SEVERE, null, ex);
        }
        setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void triplechickenfeastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triplechickenfeastActionPerformed
        if(triplechickenfeast.isSelected())
            {
                try {
                    ResultSet res=st.executeQuery("select * from menu where id='pn01'");
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
                    st.executeUpdate("delete from bill where id='pn01'");
                } catch (SQLException ex) {
                    Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
 
    }//GEN-LAST:event_triplechickenfeastActionPerformed

    private void chickenitalianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickenitalianoActionPerformed
        if(chickenitaliano.isSelected())
            {
                try {
                    ResultSet res=st.executeQuery("select * from menu where id='pn03'");
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
                    st.executeUpdate("delete from bill where id='pn03'");
                } catch (SQLException ex) {
                    Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
 
    }//GEN-LAST:event_chickenitalianoActionPerformed

    private void bigpizzaclassicchickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bigpizzaclassicchickenActionPerformed
       if(bigpizzaclassicchicken.isSelected())
            {
                try {
                    ResultSet res=st.executeQuery("select * from menu where id='pn04'");
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
                    st.executeUpdate("delete from bill where id='pn04'");
                } catch (SQLException ex) {
                    Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
 
    }//GEN-LAST:event_bigpizzaclassicchickenActionPerformed

    private void doubletroubleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doubletroubleActionPerformed
        if(doubletrouble.isSelected())
            {
                try {
                    ResultSet res=st.executeQuery("select * from menu where id='pn05'");
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
                    st.executeUpdate("delete from bill where id='pn05'");
                } catch (SQLException ex) {
                    Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
 
    }//GEN-LAST:event_doubletroubleActionPerformed

    private void chickentikkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickentikkaActionPerformed
        if(chickentikka.isSelected())
            {
                try {
                    ResultSet res=st.executeQuery("select * from menu where id='pn06'");
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
                    st.executeUpdate("delete from bill where id='pn06'");
                } catch (SQLException ex) {
                    Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
 
    }//GEN-LAST:event_chickentikkaActionPerformed

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
            java.util.logging.Logger.getLogger(pizzanonveg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pizzanonveg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pizzanonveg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pizzanonveg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new pizzanonveg().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(pizzanonveg.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bigpizzaclassicchicken;
    private javax.swing.JRadioButton chickenitaliano;
    private javax.swing.JRadioButton chickentikka;
    private javax.swing.JButton close;
    private javax.swing.JButton countryfest;
    private javax.swing.JRadioButton doubletrouble;
    private javax.swing.JButton exotica;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton keememasala;
    private javax.swing.JButton menu;
    private javax.swing.JButton minimize;
    private javax.swing.JButton paneervagorama;
    private javax.swing.JButton tandooripaneer;
    private javax.swing.JRadioButton triplechickenfeast;
    private javax.swing.JButton veggielover;
    private javax.swing.JButton veggiesupreme5;
    private javax.swing.JTextArea vegsuptxt;
    private javax.swing.JTextArea vegsuptxt1;
    // End of variables declaration//GEN-END:variables
 private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/pizzashop/img/icon.png")));
    }
}