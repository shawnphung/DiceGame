/*
 * Shawn Phung
 * October 12, 2018
 * The user guesses a number and the system generates a random number. The program that checks to see if the user guessed the same number and prvides a percentage of correct guesses.
 */

/**
 *
 * @author shphu0697
 */
public class DiceRollGame extends javax.swing.JFrame {

    /**
     * Creates new form DiceRollGame
     */
    public DiceRollGame() {
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

        jComboBox1 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        RollButton = new javax.swing.JButton();
        Instruction1 = new javax.swing.JLabel();
        Instruction2 = new javax.swing.JLabel();
        GuessIndicator = new javax.swing.JLabel();
        UserGuess = new javax.swing.JTextField();
        RollIndicator = new javax.swing.JLabel();
        DiceRoll = new javax.swing.JLabel();
        RollsIndicator = new javax.swing.JLabel();
        CorrectIndicator = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NumberGuess = new javax.swing.JLabel();
        CorrectGuess = new javax.swing.JLabel();
        IncorrectGuess = new javax.swing.JLabel();
        GuessPercentage = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));

        Title.setFont(new java.awt.Font("WebLetterer Pro BB", 0, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(102, 0, 204));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Guess the Dice");
        Title.setToolTipText("");
        Title.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Title.setName("Title"); // NOI18N

        RollButton.setBackground(new java.awt.Color(204, 204, 255));
        RollButton.setFont(new java.awt.Font("WebLetterer Pro BB", 0, 14)); // NOI18N
        RollButton.setForeground(new java.awt.Color(102, 0, 204));
        RollButton.setText("Roll Dice");
        RollButton.setToolTipText("");
        RollButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RollButtonActionPerformed(evt);
            }
        });

        Instruction1.setFont(new java.awt.Font("WebLetterer Pro BB", 0, 14)); // NOI18N
        Instruction1.setForeground(new java.awt.Color(102, 0, 204));
        Instruction1.setText("Choose a whole number between 1 and 6");

        Instruction2.setFont(new java.awt.Font("WebLetterer Pro BB", 0, 14)); // NOI18N
        Instruction2.setForeground(new java.awt.Color(102, 0, 204));
        Instruction2.setText("Then click \"Roll Dice\"");

        GuessIndicator.setFont(new java.awt.Font("WebLetterer Pro BB", 0, 12)); // NOI18N
        GuessIndicator.setForeground(new java.awt.Color(102, 0, 204));
        GuessIndicator.setText("Your GUess");

        UserGuess.setText("0");
        UserGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserGuessActionPerformed(evt);
            }
        });

        RollIndicator.setFont(new java.awt.Font("WebLetterer Pro BB", 0, 12)); // NOI18N
        RollIndicator.setForeground(new java.awt.Color(102, 0, 204));
        RollIndicator.setText("Dice Roll");

        DiceRoll.setFont(new java.awt.Font("WebLetterer Pro BB", 0, 12)); // NOI18N
        DiceRoll.setText("0");

        RollsIndicator.setFont(new java.awt.Font("WebLetterer Pro BB", 0, 12)); // NOI18N
        RollsIndicator.setForeground(new java.awt.Color(102, 0, 204));
        RollsIndicator.setText("Number of Rolls");

        CorrectIndicator.setFont(new java.awt.Font("WebLetterer Pro BB", 0, 12)); // NOI18N
        CorrectIndicator.setForeground(new java.awt.Color(102, 0, 204));
        CorrectIndicator.setText("Number of Correct Guesses");

        jLabel3.setFont(new java.awt.Font("WebLetterer Pro BB", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 204));
        jLabel3.setText("Number of Incorrect Guesses");

        jLabel4.setFont(new java.awt.Font("WebLetterer Pro BB", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 204));
        jLabel4.setText("Percentage of Correct Guesses");

        NumberGuess.setFont(new java.awt.Font("WebLetterer Pro BB", 0, 14)); // NOI18N
        NumberGuess.setText("0");

        CorrectGuess.setFont(new java.awt.Font("WebLetterer Pro BB", 0, 14)); // NOI18N
        CorrectGuess.setText("0");

        IncorrectGuess.setFont(new java.awt.Font("WebLetterer Pro BB", 0, 14)); // NOI18N
        IncorrectGuess.setText("0");

        GuessPercentage.setFont(new java.awt.Font("WebLetterer Pro BB", 0, 14)); // NOI18N
        GuessPercentage.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Instruction1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                            .addComponent(Instruction2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GuessIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(UserGuess, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(RollButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                            .addComponent(DiceRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RollIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(IncorrectGuess, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(GuessPercentage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(RollsIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CorrectIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CorrectGuess, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NumberGuess, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Instruction1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Instruction2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(GuessIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(UserGuess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RollButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RollIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NumberGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RollsIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CorrectIndicator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CorrectGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IncorrectGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GuessPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DiceRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Variable Declaration
    int rng = 0;
    int totalGuesses = 0;
    int totalCorrect = 0;
    int totalIncorrect = 0;
    int userGuess = 0;
    double percCorrect = 0;
    
    private void UserGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserGuessActionPerformed
        userGuess = Integer.parseInt (UserGuess.getText());
    }//GEN-LAST:event_UserGuessActionPerformed

    private void RollButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RollButtonActionPerformed
        totalGuesses = totalGuesses + 1;
        userGuess = Integer.parseInt (UserGuess.getText());
        rng = (int)Math.round(Math.random()*5+1);
        
        if (rng == userGuess){
            totalCorrect = totalCorrect + 1;
        }
        else {
            totalIncorrect = totalIncorrect + 1;
        }
        percCorrect = ((double) totalCorrect / (double) totalGuesses) *100;    
        percCorrect = percCorrect * 100;
        percCorrect = Math.round(percCorrect);
        percCorrect = percCorrect / 100;
 
        IncorrectGuess.setText(String.valueOf(totalIncorrect));        
        CorrectGuess.setText(String.valueOf(totalCorrect));
        DiceRoll.setText(String.valueOf(rng));
        NumberGuess.setText(String.valueOf(totalGuesses));
        
        GuessPercentage.setText(String.valueOf(percCorrect));
        
        
        
        
    }//GEN-LAST:event_RollButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DiceRollGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiceRollGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiceRollGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiceRollGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiceRollGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CorrectGuess;
    private javax.swing.JLabel CorrectIndicator;
    private javax.swing.JLabel DiceRoll;
    private javax.swing.JLabel GuessIndicator;
    private javax.swing.JLabel GuessPercentage;
    private javax.swing.JLabel IncorrectGuess;
    private javax.swing.JLabel Instruction1;
    private javax.swing.JLabel Instruction2;
    private javax.swing.JLabel NumberGuess;
    private javax.swing.JButton RollButton;
    private javax.swing.JLabel RollIndicator;
    private javax.swing.JLabel RollsIndicator;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField UserGuess;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
