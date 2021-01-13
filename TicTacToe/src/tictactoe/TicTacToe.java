
package tictactoe;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTacToe extends JFrame {
    private ImageIcon icon ;
    private String startGame = "X";
    private int XCount = 0;
    private int OCount = 0;
    public TicTacToe() {
        initComponents();
        setSize(851, 450);
        setLocationRelativeTo(null);
       icon = new ImageIcon("F:\\Java Programming Code\\Picture/Dog_48px.png");
        this.setIconImage(icon.getImage());

        
    }
    private void GameScore()
  {
      jbPlayerX.setText(String.valueOf(XCount));
      jbPlayerO.setText(String.valueOf(OCount));
  }
  private void chose_A_Player()
  {
      if(startGame.equalsIgnoreCase("X"))
      {
          startGame = "O";
      }
      else
      {
            startGame = "X";
      }   
  }
  private void WinnigGame()
  {
      String b1 = jButtonFirst.getText();
      String b2 = jButtonSecond.getText();
      String b3 = jButtonThird.getText();
      
      String b4 = jButtonFourth.getText();
      String b5 = jButtonFifth.getText();
      String b6 = jButtonSix.getText();
      
      String b7 = jButtonSeven.getText();
      String b8 = jButtonEight.getText();
      String b9 = jButtonNine.getText();
      if(b1 =="X" && b2 == "X" && b3 == "X" )
      {
          JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac ",
                  JOptionPane.INFORMATION_MESSAGE );
          XCount++;
          GameScore();
          jButtonFirst.setBackground(Color.yellow);
          jButtonSecond.setBackground(Color.yellow);
          jButtonThird.setBackground(Color.yellow);
      }
       if(b4 =="X" && b5 == "X" && b6 == "X" )
      {
          JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac ",
                  JOptionPane.INFORMATION_MESSAGE );
          XCount++;
          GameScore();
          jButtonFourth.setBackground(Color.cyan);
          jButtonFifth.setBackground(Color.cyan);
          jButtonSix.setBackground(Color.cyan);
      }
        if(b7 =="X" && b8 == "X" && b9 == "X" )
      {
          JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac ",
                  JOptionPane.INFORMATION_MESSAGE );
          XCount++;
          GameScore();
          jButtonSeven.setBackground(Color.darkGray);
          jButtonEight.setBackground(Color.darkGray);
          jButtonNine.setBackground(Color.darkGray);
      }
        if(b1 =="X" && b4 == "X" && b7 == "X" )
      {
          JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac ",
                  JOptionPane.INFORMATION_MESSAGE );
          XCount++;
          GameScore();
          jButtonFirst.setBackground(Color.red);
          jButtonFourth.setBackground(Color.red);
          jButtonSeven.setBackground(Color.red);
      }
         if(b1 =="X" && b5 == "X" && b9 == "X" )
      {
          JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac ",
                  JOptionPane.INFORMATION_MESSAGE );
          XCount++;
          GameScore();
          jButtonFirst.setBackground(Color.GREEN);
          jButtonFifth.setBackground(Color.GREEN);
          jButtonNine.setBackground(Color.GREEN);
      }
          if(b2 =="X" && b5 == "X" && b8 == "X" )
      {
          JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac ",
                  JOptionPane.INFORMATION_MESSAGE );
          XCount++;
          GameScore();
          jButtonSecond.setBackground(Color.yellow);
          jButtonFifth.setBackground(Color.yellow);
          jButtonEight.setBackground(Color.yellow);
      }
           if(b3 =="X" && b6 == "X" && b9 == "X" )
      {
          JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac ",
                  JOptionPane.INFORMATION_MESSAGE );
          XCount++;
          GameScore();
          jButtonThird.setBackground(Color.PINK);
          jButtonSix.setBackground(Color.PINK);
          jButtonNine.setBackground(Color.PINK);
          
      }
            if(b3 =="X" && b5 == "X" && b7 == "X" )
      {
          JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac ",
                  JOptionPane.INFORMATION_MESSAGE );
          XCount++;
          GameScore();
          jButtonThird.setBackground(Color.ORANGE);
          jButtonFifth.setBackground(Color.ORANGE);
          jButtonSeven.setBackground(Color.ORANGE);
          
      }
             if(b1 =="O" && b2 == "O" && b3 == "O" )
      {
          JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac ",
                  JOptionPane.INFORMATION_MESSAGE );
          OCount++;
          GameScore();
          jButtonFirst.setBackground(Color.yellow);
          jButtonSecond.setBackground(Color.yellow);
          jButtonThird.setBackground(Color.yellow);
      }
       if(b4 =="O" && b5 == "O" && b6 == "O" )
      {
          JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac ",
                  JOptionPane.INFORMATION_MESSAGE );
          OCount++;
          GameScore();
          jButtonFourth.setBackground(Color.cyan);
          jButtonFifth.setBackground(Color.cyan);
          jButtonSix.setBackground(Color.cyan);
      }
        if(b7 =="O" && b8 == "O" && b9 == "O" )
      {
          JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac ",
                  JOptionPane.INFORMATION_MESSAGE );
          OCount++;
          GameScore();
          jButtonSeven.setBackground(Color.darkGray);
          jButtonEight.setBackground(Color.darkGray);
          jButtonNine.setBackground(Color.darkGray);
      }
        if(b1 =="O" && b4 == "O" && b7 == "O" )
      {
          JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac ",
                  JOptionPane.INFORMATION_MESSAGE );
          OCount++;
          GameScore();
          jButtonFirst.setBackground(Color.red);
          jButtonFourth.setBackground(Color.red);
          jButtonSeven.setBackground(Color.red);
      }
         if(b1 =="O" && b5 == "O" && b9 == "O" )
      {
          JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac ",
                  JOptionPane.INFORMATION_MESSAGE );
          OCount++;
          GameScore();
          jButtonFirst.setBackground(Color.GREEN);
          jButtonFifth.setBackground(Color.GREEN);
          jButtonNine.setBackground(Color.GREEN);
      }
          if(b2 =="O" && b5 == "O" && b8 == "O" )
      {
          JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac ",
                  JOptionPane.INFORMATION_MESSAGE );
          OCount++;
          GameScore();
          jButtonSecond.setBackground(Color.yellow);
          jButtonFifth.setBackground(Color.yellow);
          jButtonEight.setBackground(Color.yellow);
      }
           if(b3 =="O" && b6 == "O" && b9 == "O" )
      {
          JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac ",
                  JOptionPane.INFORMATION_MESSAGE );
          OCount++;
          GameScore();
          jButtonThird.setBackground(Color.PINK);
          jButtonSix.setBackground(Color.PINK);
          jButtonNine.setBackground(Color.PINK);
          
      }
            if(b3 =="O" && b5 == "O" && b7 == "O" )
      {
          JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac ",
                  JOptionPane.INFORMATION_MESSAGE );
          OCount++;
          GameScore();
          jButtonThird.setBackground(Color.ORANGE);
          jButtonFifth.setBackground(Color.ORANGE);
          jButtonSeven.setBackground(Color.ORANGE);
          
      }
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButtonFirst = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButtonSecond = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButtonThird = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jbPlayerX = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButtonFourth = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButtonFifth = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButtonSix = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jbPlayerO = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButtonSeven = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButtonEight = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jButtonNine = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jbtnReset = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("YourGame");

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("GarrringManning");
        jPanel1.add(jLabel17, java.awt.BorderLayout.PAGE_START);
        jLabel17.getAccessibleContext().setAccessibleName("SimpleGame");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 4));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 1, 1));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51), 3));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButtonFirst.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFirstActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonFirst, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButtonSecond.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonSecond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSecondActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonSecond, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jButtonThird.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonThird.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThirdActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonThird, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        jPanel7.setLayout(new java.awt.BorderLayout(2, 2));

        jButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton.setForeground(new java.awt.Color(102, 102, 102));
        jButton.setText("PLAYER X Points :");
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });
        jPanel7.add(jButton, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 3));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jbPlayerX.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbPlayerX.setForeground(new java.awt.Color(0, 0, 255));
        jbPlayerX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPlayerXActionPerformed(evt);
            }
        });
        jPanel9.add(jbPlayerX, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButtonFourth.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonFourth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFourthActionPerformed(evt);
            }
        });
        jPanel10.add(jButtonFourth, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 3));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jButtonFifth.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonFifth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFifthActionPerformed(evt);
            }
        });
        jPanel11.add(jButtonFifth, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jButtonSix.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSixActionPerformed(evt);
            }
        });
        jPanel12.add(jButtonSix, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51), 3));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 51, 51));
        jButton9.setText("PLAYER O Points :");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jbPlayerO.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbPlayerO.setForeground(new java.awt.Color(0, 51, 51));
        jPanel8.add(jbPlayerO, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 4));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButtonSeven.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSevenActionPerformed(evt);
            }
        });
        jPanel14.add(jButtonSeven, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButtonEight.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEightActionPerformed(evt);
            }
        });
        jPanel15.add(jButtonEight, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51), 3));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jButtonNine.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButtonNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNineActionPerformed(evt);
            }
        });
        jPanel16.add(jButtonNine, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnReset.setForeground(new java.awt.Color(0, 102, 102));
        jbtnReset.setText("RESET");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel17.add(jbtnReset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 3));
        jPanel18.setLayout(new java.awt.BorderLayout());

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnExit.setForeground(new java.awt.Color(0, 204, 255));
        jbtnExit.setText("EXIT");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel18.add(jbtnExit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel18);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        
private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {                                         
  frame = new JFrame("Exit");
  if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Tic tac",
         JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
  {
      System.exit(0);
  }
  
    }                                        

    private void jbPlayerXActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {                                          
       jButtonFirst.setText(null);
       jButtonSecond.setText(null);
       jButtonThird.setText(null);
       
       jButtonFourth.setText(null);
       jButtonFifth.setText(null);
       jButtonSix.setText(null);
       
       jButtonSeven.setText(null);
       jButtonEight.setText(null);
       jButtonNine.setText(null);
       
       
       jButtonFirst.setBackground(Color.gray);
       jButtonSecond.setBackground(Color.gray);
       jButtonThird.setBackground(Color.gray);
       
       jButtonFourth.setBackground(Color.gray);
       jButtonFifth.setBackground(Color.gray);
       jButtonSix.setBackground(Color.gray);
       
       jButtonSeven.setBackground(Color.gray);
       jButtonEight.setBackground(Color.gray);
       jButtonNine.setBackground(Color.gray);
    }                                         

    private void jButtonFifthActionPerformed(java.awt.event.ActionEvent evt) {                                             
        jButtonFifth.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
           
           jButtonFifth.setForeground(Color.red);
      }
      else
      {
           jButtonFifth.setForeground(Color.blue);
      }
      chose_A_Player();
      WinnigGame();
    }                                            

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButtonSecondActionPerformed(java.awt.event.ActionEvent evt) {                                              
 jButtonSecond.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
           
           jButtonSecond.setForeground(Color.red);
      }
      else
      {
           jButtonSecond.setForeground(Color.blue);
      }
      chose_A_Player();
      WinnigGame();         
       
    }                                             

    private void jButtonFirstActionPerformed(java.awt.event.ActionEvent evt) {                                             
        jButtonFirst.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
           
           jButtonFirst.setForeground(Color.red);
      }
      else
      {
           jButtonFirst.setForeground(Color.blue);
      }
      chose_A_Player();
      WinnigGame();
    }                                            

                                                 
    
    
    private void jButtonThirdActionPerformed(java.awt.event.ActionEvent evt) {                                             
         jButtonThird.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
           
           jButtonThird.setForeground(Color.red);
      }
      else
      {
           jButtonThird.setForeground(Color.blue);
      }
      chose_A_Player();
      WinnigGame();
    }                                            

    
    private void jButtonFourthActionPerformed(java.awt.event.ActionEvent evt) {                                              
          jButtonFourth.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
           
           jButtonFourth.setForeground(Color.red);
      }
      else
      {
           jButtonFourth.setForeground(Color.blue);
      }
      chose_A_Player();
      WinnigGame();
    }                                             

    
    
    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {                                        
     
    }                                       

    private void jButtonSixActionPerformed(java.awt.event.ActionEvent evt) {                                           
         jButtonSix.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
           
           jButtonSix.setForeground(Color.red);
      }
      else
      {
           jButtonSix.setForeground(Color.blue);
      }
      chose_A_Player();
      WinnigGame();
    }                                          

    
    private void jButtonSevenActionPerformed(java.awt.event.ActionEvent evt) {                                             
         jButtonSeven.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
           
           jButtonSeven.setForeground(Color.red);
      }
      else
      {
           jButtonSeven.setForeground(Color.blue);
      }
      chose_A_Player();
      WinnigGame();
    }                                            

    
    private void jButtonEightActionPerformed(java.awt.event.ActionEvent evt) {                                             
         jButtonEight.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
           
           jButtonEight.setForeground(Color.red);
      }
      else
      {
           jButtonEight.setForeground(Color.blue);
      }
      chose_A_Player();
      WinnigGame();
    }                                            

    private void jButtonNineActionPerformed(java.awt.event.ActionEvent evt) {                                            
        jButtonNine.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
           
           jButtonNine.setForeground(Color.red);
      }
      else
      {
           jButtonNine.setForeground(Color.blue);
      }
      chose_A_Player();
      WinnigGame();
    }                                           

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonEight;
    private javax.swing.JButton jButtonFifth;
    private javax.swing.JButton jButtonFirst;
    private javax.swing.JButton jButtonFourth;
    private javax.swing.JButton jButtonNine;
    private javax.swing.JButton jButtonSecond;
    private javax.swing.JButton jButtonSeven;
    private javax.swing.JButton jButtonSix;
    private javax.swing.JButton jButtonThird;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbPlayerO;
    private javax.swing.JButton jbPlayerX;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    // End of variables declaration                   
}
