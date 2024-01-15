package calculadora;

import javax.swing.JOptionPane;

public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNum1 = new javax.swing.JLabel();
        lblNum2 = new javax.swing.JLabel();
        btnSoma = new javax.swing.JButton();
        txtNum1 = new javax.swing.JTextField();
        txtNum2 = new javax.swing.JTextField();
        btnMenos = new javax.swing.JButton();
        btnQuadrado = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        btnCubo = new javax.swing.JButton();
        btnMultiplicacao = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnFatorial = new javax.swing.JButton();
        lbl_resultado = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNum1.setText("Primeiro número:");

        lblNum2.setText("Segundo número:");

        btnSoma.setText("+");
        btnSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomaActionPerformed(evt);
            }
        });

        btnMenos.setText("-");
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });

        btnQuadrado.setText("X²");
        btnQuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuadradoActionPerformed(evt);
            }
        });

        btnRaiz.setText("²√");
        btnRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizActionPerformed(evt);
            }
        });

        btnCubo.setText("X³");
        btnCubo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuboActionPerformed(evt);
            }
        });

        btnMultiplicacao.setText("*");
        btnMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacaoActionPerformed(evt);
            }
        });

        btnDivisao.setText("/");
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });

        btnClear.setText("C");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnFatorial.setText("N!");
        btnFatorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFatorialActionPerformed(evt);
            }
        });

        lbl_resultado.setText("Resultado:");

        lblResultado.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_resultado, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNum2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNum1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNum2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNum1))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addComponent(btnQuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 3, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCubo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnRaiz))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnFatorial, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNum1)
                    .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNum2)
                    .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_resultado)
                    .addComponent(lblResultado))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSoma)
                    .addComponent(btnMenos)
                    .addComponent(btnDivisao)
                    .addComponent(btnFatorial))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMultiplicacao)
                    .addComponent(btnCubo)
                    .addComponent(btnQuadrado)
                    .addComponent(btnRaiz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomaActionPerformed
        double num1 = Double.parseDouble(txtNum1.getText());
        double num2 = Double.parseDouble(txtNum2.getText());
        
        lblResultado.setText(String.valueOf(num1 + num2));            
    }//GEN-LAST:event_btnSomaActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtNum1.setText("");
        txtNum2.setText("");
        lblResultado.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        double num1 = Double.parseDouble(txtNum1.getText());
        double num2 = Double.parseDouble(txtNum2.getText());
        
        lblResultado.setText(String.valueOf(num1 - num2));   
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        double num1 = Double.parseDouble(txtNum1.getText());
        double num2 = Double.parseDouble(txtNum2.getText());
        if (num2 != 0){
            lblResultado.setText(String.valueOf(num1 / num2));   
        } else{
            JOptionPane.showMessageDialog(
                    null, "Divisão por 0 não é permitida.",
                    "Entrada inválida", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void btnMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacaoActionPerformed
        double num1 = Double.parseDouble(txtNum1.getText());
        double num2 = Double.parseDouble(txtNum2.getText());
        lblResultado.setText(String.valueOf(num1 * num2));   
    }//GEN-LAST:event_btnMultiplicacaoActionPerformed

    private void btnRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizActionPerformed
        
        double num1 = Double.parseDouble(txtNum1.getText());
        
        txtNum2.setText("");
        lblResultado.setText(String.valueOf(Math.sqrt(num1)));   
    }//GEN-LAST:event_btnRaizActionPerformed

    private void btnQuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuadradoActionPerformed
        
        double num1 = Double.parseDouble(txtNum1.getText());
        
        txtNum2.setText("");
        lblResultado.setText(String.valueOf(Math.pow(num1,2)));
    }//GEN-LAST:event_btnQuadradoActionPerformed

    private void btnCuboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuboActionPerformed
        
        double num1 = Double.parseDouble(txtNum1.getText());
        
        txtNum2.setText("");
        lblResultado.setText(String.valueOf(Math.pow(num1,3)));
    }//GEN-LAST:event_btnCuboActionPerformed

    private void btnFatorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFatorialActionPerformed

        try{
            int num1 = Integer.parseInt(txtNum1.getText());
            
            int fat = 1;
            for ( int i = num1; i > 0; i-- ){
                fat *= i;
            }

            lblResultado.setText(String.valueOf( fat));
        }catch (Exception e) {
            txtNum1.setText("");
            txtNum2.setText("");
            lblResultado.setText("");
            JOptionPane.showMessageDialog(
                    null, "O valor informado não corresponde com o esperado."
                    + "\n utilize apenas valores inteiros positivos",
                    "Entrada inválida", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnFatorialActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCubo;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnFatorial;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMultiplicacao;
    private javax.swing.JButton btnQuadrado;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JButton btnSoma;
    private javax.swing.JLabel lblNum1;
    private javax.swing.JLabel lblNum2;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lbl_resultado;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    // End of variables declaration//GEN-END:variables
}
