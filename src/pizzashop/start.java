package pizzashop;
import AppPackage.AnimationClass;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ARUN
 */
public class start extends javax.swing.JFrame {
    
    AnimationClass ac=new AnimationClass();
    /**
     * Creates new form start
     */Connection con;
    Statement st;
    int mousex,mousey;
    public start() throws ClassNotFoundException {
        initComponents();
        seticon();
        slideshow();
          try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzashop","root","1234");
            st= con.createStatement();
            st.executeUpdate("delete from bill");   
        
        } catch (SQLException ex) {
              System.out.println("connectivity failed");
        }
    }

    public void slideshow()
    {
        new Thread()
        {   
            int count;
            @Override
            public void run()
            {
                try
                {
                while(true)
                    {
                        switch(count)
                        {
                            case 0:
                                ImageIcon ii=new ImageIcon(getClass().getResource("/pizzashop/img/bg2.jpg"));
                                slide.setIcon(ii);
                                Thread.sleep(7000);
                                ac.jLabelXLeft(1200, -5, 20, 5, slide1);
                                ac.jLabelXLeft(0, -1200, 20, 5, slide);
                                
                                count=1;
                                break;
                            case 1:
                                ImageIcon ii1=new ImageIcon(getClass().getResource("/pizzashop/img/bg1.jpg"));
                                slide1.setIcon(ii1);
                                Thread.sleep(7000);
                                ac.jLabelXRight(-5, 1200, 20, 5, slide1);
                                ac.jLabelXRight(-1200,0, 20, 5, slide);
                                                                
                                count=2;
                                break;
                            case 2:
                                ImageIcon ii2=new ImageIcon(getClass().getResource("/pizzashop/img/bg3.jpg"));
                                slide.setIcon(ii2);
                                Thread.sleep(7000);
                                ac.jLabelXLeft(1200, -5, 20, 5, slide1);
                                ac.jLabelXLeft(0, -1200, 20, 5, slide);
                                
                                
                                count=3;
                                break;
                               case 3:
                                ImageIcon ii3=new ImageIcon(getClass().getResource("/pizzashop/img/bg4.jpg"));
                                slide1.setIcon(ii3);
                                Thread.sleep(7000);
                                ac.jLabelXRight(-5, 1200, 20, 5, slide1);
                                ac.jLabelXRight(-1200,0, 20, 5, slide);
                                
                                
                                count=4;
                                break;
                            case 4:
                                ImageIcon ii4=new ImageIcon(getClass().getResource("/pizzashop/img/bg5.jpg"));
                                slide.setIcon(ii4);
                                Thread.sleep(7000);
                                ac.jLabelXLeft(1200, -5, 20, 5, slide1);
                                ac.jLabelXLeft(0, -1200, 20, 5, slide);
                                
                                
                                count=5;
                               
                                break;
                               case 5:
                                 ImageIcon ii5=new ImageIcon(getClass().getResource("/pizzashop/img/bg10.jpg"));
                                slide1.setIcon(ii5);
                                Thread.sleep(7000);
                                ac.jLabelXRight(-5, 1200, 20, 5, slide1);
                                ac.jLabelXRight(-1200,0, 20, 5, slide);
                                
                                
                                count=6;
                                break;
                            case 6:
                                 ImageIcon ii6=new ImageIcon(getClass().getResource("/pizzashop/img/bg7.jpg"));
                                slide.setIcon(ii6);
                                Thread.sleep(7000);
                                ac.jLabelXLeft(1200, -5, 20, 5, slide1);
                                ac.jLabelXLeft(0, -1200, 20, 5, slide);
                                
                                
                                count=7;
                                 
                                break;
                               case 7:
                                ImageIcon ii7=new ImageIcon(getClass().getResource("/pizzashop/img/bg9.jpg"));
                                slide1.setIcon(ii7);
                                Thread.sleep(7000);
                                ac.jLabelXRight(-5, 1200, 20, 5, slide1);
                                ac.jLabelXRight(-1200,0, 20, 5, slide);
                                
                                
                                count=0;
                                break;
                             }
                    }
                }catch(Exception e){}
            }
        
        }.start();
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
        close = new javax.swing.JButton();
        minimize = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        contactus = new javax.swing.JButton();
        aboutus = new javax.swing.JButton();
        offer = new javax.swing.JButton();
        branches = new javax.swing.JButton();
        membership = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        order = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        slide = new javax.swing.JLabel();
        slide1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1195, 900));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/LABEL.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 170);

        contactus.setBackground(new java.awt.Color(255, 153, 0));
        contactus.setFont(new java.awt.Font("Death Hector", 2, 18)); // NOI18N
        contactus.setForeground(new java.awt.Color(255, 0, 0));
        contactus.setText("CONTACT US");
        contactus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 0), null, new java.awt.Color(255, 255, 153)));
        contactus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contactus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contactusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contactusMouseExited(evt);
            }
        });
        contactus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactusActionPerformed(evt);
            }
        });
        jPanel1.add(contactus);
        contactus.setBounds(850, 550, 340, 60);

        aboutus.setBackground(new java.awt.Color(255, 153, 0));
        aboutus.setFont(new java.awt.Font("Death Hector", 2, 18)); // NOI18N
        aboutus.setForeground(new java.awt.Color(255, 0, 0));
        aboutus.setText("ABOUT US");
        aboutus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 0), null, new java.awt.Color(255, 255, 153)));
        aboutus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aboutus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aboutusMouseExited(evt);
            }
        });
        aboutus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutusActionPerformed(evt);
            }
        });
        jPanel1.add(aboutus);
        aboutus.setBounds(0, 550, 280, 60);

        offer.setBackground(new java.awt.Color(255, 153, 0));
        offer.setFont(new java.awt.Font("Death Hector", 2, 18)); // NOI18N
        offer.setForeground(new java.awt.Color(255, 0, 0));
        offer.setText("OFFERS");
        offer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 0), null, new java.awt.Color(255, 255, 153)));
        offer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        offer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                offerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                offerMouseExited(evt);
            }
        });
        offer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offerActionPerformed(evt);
            }
        });
        jPanel1.add(offer);
        offer.setBounds(280, 550, 280, 60);

        branches.setBackground(new java.awt.Color(255, 153, 0));
        branches.setFont(new java.awt.Font("Death Hector", 2, 18)); // NOI18N
        branches.setForeground(new java.awt.Color(255, 0, 0));
        branches.setText("OUR BRANCHES");
        branches.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 0), null, new java.awt.Color(255, 255, 153)));
        branches.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        branches.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                branchesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                branchesMouseExited(evt);
            }
        });
        branches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchesActionPerformed(evt);
            }
        });
        jPanel1.add(branches);
        branches.setBounds(560, 550, 290, 60);

        membership.setBackground(new java.awt.Color(255, 153, 0));
        membership.setFont(new java.awt.Font("Death Hector", 2, 18)); // NOI18N
        membership.setForeground(new java.awt.Color(255, 0, 0));
        membership.setText("GET MEMBERSHIP");
        membership.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 0), null, new java.awt.Color(255, 255, 153)));
        membership.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        membership.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                membershipMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                membershipMouseExited(evt);
            }
        });
        membership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membershipActionPerformed(evt);
            }
        });
        jPanel1.add(membership);
        membership.setBounds(800, 710, 280, 60);

        jScrollPane1.setOpaque(false);

        text.setEditable(false);
        text.setBackground(new java.awt.Color(0, 0, 0));
        text.setColumns(20);
        text.setFont(new java.awt.Font("Comic Sans MS", 3, 20)); // NOI18N
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setLineWrap(true);
        text.setRows(5);
        text.setText("\t               WELCOME\n\t                   TO \n\t           WAKE AND BAKE.\n");
        text.setWrapStyleWord(true);
        text.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 51, 51), null, new java.awt.Color(255, 255, 153)));
        text.setCaretColor(new java.awt.Color(255, 255, 255));
        text.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(text);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 610, 670, 220);

        order.setBackground(new java.awt.Color(255, 153, 0));
        order.setFont(new java.awt.Font("Death Hector", 3, 36)); // NOI18N
        order.setForeground(new java.awt.Color(255, 0, 0));
        order.setText("PLACE YOUR ORDER");
        order.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 0), null, new java.awt.Color(255, 255, 153)));
        order.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                orderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                orderMouseExited(evt);
            }
        });
        order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderActionPerformed(evt);
            }
        });
        jPanel1.add(order);
        order.setBounds(0, 830, 1195, 70);
        order.getAccessibleContext().setAccessibleDescription("");

        jLabel2.setFont(new java.awt.Font("Death Hector", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("GET 10% DISCOUNT.");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(680, 660, 500, 50);

        jLabel3.setFont(new java.awt.Font("Death Hector", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BECOME OUR MEMBER AND  ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(690, 620, 500, 50);

        slide.setBackground(new java.awt.Color(0, 0, 0));
        slide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzashop/img/bg2.jpg"))); // NOI18N
        jPanel1.add(slide);
        slide.setBounds(0, 0, 1200, 830);
        slide.getAccessibleContext().setAccessibleDescription("");

        jPanel1.add(slide1);
        slide1.setBounds(1200, 0, 1200, 830);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1200, 900);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeActionPerformed
        this.setState(start.ICONIFIED);
    }//GEN-LAST:event_minimizeActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void aboutusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutusMouseEntered
        aboutus.setBackground(new Color(255,255,0));
    }//GEN-LAST:event_aboutusMouseEntered

    private void offerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offerMouseEntered
   offer.setBackground(new Color(255,255,0));        // TODO add your handling code here:
    }//GEN-LAST:event_offerMouseEntered

    private void branchesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_branchesMouseEntered
branches.setBackground(new Color(255,255,0));        // TODO add your handling code here:
    }//GEN-LAST:event_branchesMouseEntered

    private void contactusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactusMouseEntered
contactus.setBackground(new Color(255,255,0));        // TODO add your handling code here:
    }//GEN-LAST:event_contactusMouseEntered

    private void membershipMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_membershipMouseEntered
membership.setBackground(new Color(255,255,0));        // TODO add your handling code here:
    }//GEN-LAST:event_membershipMouseEntered

    private void orderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderMouseEntered
order.setBackground(new Color(255,255,0));        // TODO add your handling code here:
    }//GEN-LAST:event_orderMouseEntered

    private void aboutusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutusMouseExited
       aboutus.setBackground(new Color(255,153,0));        // TODO add your handling code here:
    }//GEN-LAST:event_aboutusMouseExited

    private void offerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offerMouseExited
offer.setBackground(new Color(255,153,0));        // TODO add your handling code here:
    }//GEN-LAST:event_offerMouseExited

    private void branchesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_branchesMouseExited
branches.setBackground(new Color(255,153,0));        // TODO add your handling code here:
    }//GEN-LAST:event_branchesMouseExited

    private void contactusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactusMouseExited
        contactus.setBackground(new Color(255,153,0));        // TODO add your handling code here:
    }//GEN-LAST:event_contactusMouseExited

    private void membershipMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_membershipMouseExited
       membership.setBackground(new Color(255,153,0));// TODO add your handling code here:
    }//GEN-LAST:event_membershipMouseExited

    private void orderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderMouseExited
order.setBackground(new Color(255,153,0));        // TODO add your handling code here:
    }//GEN-LAST:event_orderMouseExited

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-mousex, y-mousey);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        mousex=evt.getX();
        mousey=evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void aboutusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutusActionPerformed
        text.setText("WAKE and BAKE is an Indian restaurant chain and National franchise, known for its Italian-American cuisine menu including pizza and burger, as well as side dishes and desserts. The company has over 15 locations worldwide as of 2015, and is a subsidiary of AV group of companies, one of the india's largest restaurant companies. it is well knowed for late night deliveries,famous for its menu.");
    }//GEN-LAST:event_aboutusActionPerformed

    private void orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderActionPerformed
        
        new menu().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_orderActionPerformed

    private void contactusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactusActionPerformed
        text.setText("For More Queries : \n contact : 8800707098\n            7838814995.\n Fax:011-24444440(41,42).\n Email : wakenbake@gmail.com. ");
    }//GEN-LAST:event_contactusActionPerformed

    private void branchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchesActionPerformed
        
        text.setText("1. M 20, Outer Circle\n   Connaught Place\n  New Delhi - 110001 Opp Fire Station\n\n2. Shop No 58\n   Janpath\n   New Delhi - 110001 \n\n 3. Janak Plaza, Shop no. 81\n   District center ");
        text.setCaretPosition(0);
    }//GEN-LAST:event_branchesActionPerformed

    private void offerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offerActionPerformed
        text.setText("\n 1.FREE HOME DELIVERY UPTO 2KM RADIUS.\n2.BECOME OUR MEMBER AND GET 10% DISCOUNT.\n3.GET SUNDAE STRAWBERRY(WORTH RS.149) FREE ON MIN. ORDER OF Rs.999");
    }//GEN-LAST:event_offerActionPerformed

    private void membershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membershipActionPerformed
        
        try {
            new membership().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(start.class.getName()).log(Level.SEVERE, null, ex);
        }
        setVisible(false);
    }//GEN-LAST:event_membershipActionPerformed

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
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             
                try {
                    new start().setVisible(true);
                    
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(start.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutus;
    private javax.swing.JButton branches;
    private javax.swing.JButton close;
    private javax.swing.JButton contactus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton membership;
    private javax.swing.JButton minimize;
    private javax.swing.JButton offer;
    private javax.swing.JButton order;
    private javax.swing.JLabel slide;
    private javax.swing.JLabel slide1;
    private javax.swing.JTextArea text;
    // End of variables declaration//GEN-END:variables

    private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/pizzashop/img/icon.png")));
    }
}
