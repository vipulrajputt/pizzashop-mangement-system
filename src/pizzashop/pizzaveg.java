/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;


import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ARUN
 */
public class pizzaveg extends javax.swing.JFrame {

    
     Connection con;
    Statement st;
    /**
     * Creates new form pizzaveg
     */
    public pizzaveg() throws ClassNotFoundException {
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
        veggielover = new javax.swing.JRadioButton();
        paneervagorama = new javax.swing.JRadioButton();
        exotica = new javax.swing.JRadioButton();
        tandooripaneer = new javax.swing.JRadioButton();
        countryfest = new javax.swing.JRadioButton();
        veggiesupreme = new javax.swing.JRadioButton();
        veggieloverbutton = new javax.swing.JButton();
        tandooripaneerbutton = new javax.swing.JButton();
        paneervagoramabutton = new javax.swing.JButton();
        exoticabutton = new javax.swing.JButton();
        countryfestbutton = new javax.swing.JButton();
        veggiesupreme5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vegsuptxt = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        vegsuptxt1 = new javax.swing.JTextArea();
        nonvegpizza = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 900));
        setMinimumSize(new java.awt.Dimension(1200, 900));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 900));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        home.setContentAreaFilled(false);
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jPanel1.add(home);
        home.setBounds(0, 0, 140, 170);

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

        veggielover.setContentAreaFilled(false);
        veggielover.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        veggielover.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        veggielover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/9.png"))); // NOI18N
        veggielover.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/green-tick.png"))); // NOI18N
        veggielover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veggieloverActionPerformed(evt);
            }
        });
        jPanel1.add(veggielover);
        veggielover.setBounds(440, 180, 330, 180);

        paneervagorama.setContentAreaFilled(false);
        paneervagorama.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        paneervagorama.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        paneervagorama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/9.png"))); // NOI18N
        paneervagorama.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/green-tick.png"))); // NOI18N
        paneervagorama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paneervagoramaActionPerformed(evt);
            }
        });
        jPanel1.add(paneervagorama);
        paneervagorama.setBounds(50, 510, 330, 180);

        exotica.setContentAreaFilled(false);
        exotica.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        exotica.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        exotica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/9.png"))); // NOI18N
        exotica.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/green-tick.png"))); // NOI18N
        exotica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exoticaActionPerformed(evt);
            }
        });
        jPanel1.add(exotica);
        exotica.setBounds(430, 510, 330, 180);

        tandooripaneer.setContentAreaFilled(false);
        tandooripaneer.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tandooripaneer.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        tandooripaneer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/9.png"))); // NOI18N
        tandooripaneer.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/green-tick.png"))); // NOI18N
        tandooripaneer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tandooripaneerActionPerformed(evt);
            }
        });
        jPanel1.add(tandooripaneer);
        tandooripaneer.setBounds(820, 180, 330, 180);

        countryfest.setContentAreaFilled(false);
        countryfest.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        countryfest.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        countryfest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/9.png"))); // NOI18N
        countryfest.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/green-tick.png"))); // NOI18N
        countryfest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryfestActionPerformed(evt);
            }
        });
        jPanel1.add(countryfest);
        countryfest.setBounds(830, 510, 330, 180);

        veggiesupreme.setContentAreaFilled(false);
        veggiesupreme.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        veggiesupreme.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        veggiesupreme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/9.png"))); // NOI18N
        veggiesupreme.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/green-tick.png"))); // NOI18N
        veggiesupreme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veggiesupremeActionPerformed(evt);
            }
        });
        jPanel1.add(veggiesupreme);
        veggiesupreme.setBounds(60, 175, 330, 180);

        veggieloverbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/veggie lover.png"))); // NOI18N
        veggieloverbutton.setContentAreaFilled(false);
        veggieloverbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(veggieloverbutton);
        veggieloverbutton.setBounds(410, 170, 390, 195);

        tandooripaneerbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/tandoori paneer.png"))); // NOI18N
        tandooripaneerbutton.setContentAreaFilled(false);
        tandooripaneerbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(tandooripaneerbutton);
        tandooripaneerbutton.setBounds(790, 170, 390, 195);

        paneervagoramabutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/paneer vegorama.png"))); // NOI18N
        paneervagoramabutton.setContentAreaFilled(false);
        paneervagoramabutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(paneervagoramabutton);
        paneervagoramabutton.setBounds(10, 500, 390, 195);

        exoticabutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/exotica.png"))); // NOI18N
        exoticabutton.setContentAreaFilled(false);
        exoticabutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(exoticabutton);
        exoticabutton.setBounds(400, 500, 390, 195);

        countryfestbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/country fest.png"))); // NOI18N
        countryfestbutton.setContentAreaFilled(false);
        countryfestbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(countryfestbutton);
        countryfestbutton.setBounds(800, 500, 390, 195);

        veggiesupreme5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/veggiesupreme.png"))); // NOI18N
        veggiesupreme5.setContentAreaFilled(false);
        veggiesupreme5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        vegsuptxt.setText("\t\t Paneer Vegorama                                       Exotica\t\t\t\t\t     Country Feast\n\tOnion, Capsicum, Black Olives, Red \t\t  \tGreen Capsicum, Baby Corn, \t\t   Mushroom, Onion, Capsicum, Red \n\tPaprika, Black Olives, Paneer\t\t\t\t Black Olives,Red Capsicum\t\t\t     Paprika & Corn\n\t   Crust: Pan     Size: Medium\t\t\t\tCrust: Pan     Size: Medium\t\t    Crust: Pan     Size: Medium\n\t\t       ₹495\t\t\t\t\t\t   \t    ₹475\t\t\t\t\t\t  ₹425");
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
        vegsuptxt1.setText("\t\t Veggie Supreme                                     Veggie Lover\t\t\t\t\t   Tandoori Paneer\n\tOnion, Capsicum, Mushroom, Red \t\t  \tOnion, Capsicum, Mushroom, \t\t   Paneer, Onion, Capsicum, Red \n\tPaprika, Black Olives, Sweet Corn\t\t\t   Tomato,Red Paprika\t\t\t  \t  Paprika & Tomato\n\t   Crust: Pan     Size: Medium\t\t\t\tCrust: Pan     Size: Medium\t\t    Crust: Pan     Size: Medium\n\t\t\t₹480\t\t\t\t\t\t           ₹425\t\t\t\t\t\t  ₹490");
        vegsuptxt1.setWrapStyleWord(true);
        vegsuptxt1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        vegsuptxt1.setCaretColor(new java.awt.Color(255, 255, 255));
        vegsuptxt1.setFocusable(false);
        vegsuptxt1.setRequestFocusEnabled(false);
        vegsuptxt1.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(vegsuptxt1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(0, 360, 1200, 140);

        nonvegpizza.setFont(new java.awt.Font("Just In The Firestorm", 1, 24)); // NOI18N
        nonvegpizza.setForeground(new java.awt.Color(255, 0, 0));
        nonvegpizza.setText("for non-veg pizza");
        nonvegpizza.setBorderPainted(false);
        nonvegpizza.setContentAreaFilled(false);
        nonvegpizza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nonvegpizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonvegpizzaActionPerformed(evt);
            }
        });
        jPanel1.add(nonvegpizza);
        nonvegpizza.setBounds(820, 830, 380, 70);

        jButton2.setFont(new java.awt.Font("Just In The Firestorm", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("bill Please!");
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
        menu.setBorderPainted(false);
        menu.setContentAreaFilled(false);
        menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        jPanel1.add(menu);
        menu.setBounds(410, 830, 360, 70);

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
             Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
         }

    }//GEN-LAST:event_homeActionPerformed

    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeActionPerformed
        this.setState(start.ICONIFIED);
    }//GEN-LAST:event_minimizeActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
      
         try {
             new start().setVisible(true);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
         }
         setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void nonvegpizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonvegpizzaActionPerformed
        
         try {
             new pizzanonveg().setVisible(true);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
         }
                setVisible(false);
    }//GEN-LAST:event_nonvegpizzaActionPerformed

    private void veggiesupremeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veggiesupremeActionPerformed
            if(veggiesupreme.isSelected())
            {
                try {
                    ResultSet res=st.executeQuery("select * from menu where id='pv01'");
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
                    st.executeUpdate("delete from bill where id='pv01'");
                } catch (SQLException ex) {
                    Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
                }
            }    
    }//GEN-LAST:event_veggiesupremeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try {
            new info().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(desserts.class.getName()).log(Level.SEVERE, null, ex);
        }
        setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void veggieloverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veggieloverActionPerformed
 if(veggielover.isSelected())
            {
                try {
                    ResultSet res=st.executeQuery("select * from menu where id='pv02'");
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
                    st.executeUpdate("delete from bill where id='pv02'");
                } catch (SQLException ex) {
                    Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_veggieloverActionPerformed

    private void tandooripaneerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tandooripaneerActionPerformed
 if(tandooripaneer.isSelected())
            {
                try {
                    ResultSet res=st.executeQuery("select * from menu where id='pv03'");
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
                    st.executeUpdate("delete from bill where id='pv03'");
                } catch (SQLException ex) {
                    Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_tandooripaneerActionPerformed

    private void paneervagoramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paneervagoramaActionPerformed
if(paneervagorama.isSelected())
            {
                try {
                    ResultSet res=st.executeQuery("select * from menu where id='pv04'");
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
                    st.executeUpdate("delete from bill where id='pv04'");
                } catch (SQLException ex) {
                    Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
 
    }//GEN-LAST:event_paneervagoramaActionPerformed

    private void exoticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exoticaActionPerformed
if(exotica.isSelected())
            {
                try {
                    ResultSet res=st.executeQuery("select * from menu where id='pv05'");
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
                    st.executeUpdate("delete from bill where id='pv05'");
                } catch (SQLException ex) {
                    Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
 
    }//GEN-LAST:event_exoticaActionPerformed

    private void countryfestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryfestActionPerformed
if(countryfest.isSelected())
            {
                try {
                    ResultSet res=st.executeQuery("select * from menu where id='pv06'");
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
                    st.executeUpdate("delete from bill where id='pv06'");
                } catch (SQLException ex) {
                    Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
 
    }//GEN-LAST:event_countryfestActionPerformed

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
            java.util.logging.Logger.getLogger(pizzaveg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pizzaveg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pizzaveg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pizzaveg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new pizzaveg().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(pizzaveg.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JRadioButton countryfest;
    private javax.swing.JButton countryfestbutton;
    private javax.swing.JRadioButton exotica;
    private javax.swing.JButton exoticabutton;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton menu;
    private javax.swing.JButton minimize;
    private javax.swing.JButton nonvegpizza;
    private javax.swing.JRadioButton paneervagorama;
    private javax.swing.JButton paneervagoramabutton;
    private javax.swing.JRadioButton tandooripaneer;
    private javax.swing.JButton tandooripaneerbutton;
    private javax.swing.JRadioButton veggielover;
    private javax.swing.JButton veggieloverbutton;
    private javax.swing.JRadioButton veggiesupreme;
    private javax.swing.JButton veggiesupreme5;
    private javax.swing.JTextArea vegsuptxt;
    private javax.swing.JTextArea vegsuptxt1;
    // End of variables declaration//GEN-END:variables
 private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/pizzashop/img/icon.png")));
    }
}
