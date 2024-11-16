package exercise2Pack;

import java.util.Arrays;
import javax.swing.JComponent;
import javax.swing.JTextPane;
import javax.swing.text.JTextComponent;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;

public class UIExercise2 extends javax.swing.JFrame {

    public UIExercise2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InputPanel = new javax.swing.JPanel();
        Welcome1 = new javax.swing.JLabel();
        LbWeight = new javax.swing.JLabel();
        LbHeight = new javax.swing.JLabel();
        TxWeight = new javax.swing.JTextField();
        TxHeight = new javax.swing.JTextField();
        BtCalc = new javax.swing.JButton();
        TxName = new javax.swing.JTextField();
        LbWeight1 = new javax.swing.JLabel();
        BtClear = new javax.swing.JButton();
        OutPanel = new javax.swing.JPanel();
        LbResp = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IMC");
        setResizable(false);

        InputPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        InputPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Welcome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome1.setText("Bem vindo, informe os dados abaixo para conhecer sua dieta ideal");

        LbWeight.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LbWeight.setText("Peso:");

        LbHeight.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LbHeight.setText("Altura:");

        TxWeight.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxWeight.setToolTipText("Quilos");
        TxWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxWeightActionPerformed(evt);
            }
        });

        TxHeight.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxHeight.setToolTipText("Centímetros");
        TxHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxHeightActionPerformed(evt);
            }
        });

        BtCalc.setBackground(new java.awt.Color(51, 102, 255));
        BtCalc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtCalc.setText("Calcular");
        BtCalc.setToolTipText("");
        BtCalc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtCalc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCalcActionPerformed(evt);
            }
        });

        TxName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxName.setToolTipText("Quilos");
        TxName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxNameActionPerformed(evt);
            }
        });

        LbWeight1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LbWeight1.setText("Nome:");

        BtClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtClear.setText("Limpar");
        BtClear.setToolTipText("");
        BtClear.setActionCommand("Clear");
        BtClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtClear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InputPanelLayout = new javax.swing.GroupLayout(InputPanel);
        InputPanel.setLayout(InputPanelLayout);
        InputPanelLayout.setHorizontalGroup(
            InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Welcome1)
                    .addGroup(InputPanelLayout.createSequentialGroup()
                        .addComponent(LbWeight1)
                        .addGap(18, 18, 18)
                        .addComponent(TxName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LbHeight)
                            .addComponent(LbWeight))
                        .addGap(18, 18, 18)
                        .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxWeight)
                            .addComponent(TxHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtCalc)
                            .addComponent(BtClear))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        InputPanelLayout.setVerticalGroup(
            InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InputPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Welcome1)
                .addGap(38, 38, 38)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(InputPanelLayout.createSequentialGroup()
                        .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbWeight))
                        .addGap(18, 18, 18)
                        .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbHeight)
                            .addComponent(TxHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtClear)))
                    .addGroup(InputPanelLayout.createSequentialGroup()
                        .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbWeight1))
                        .addGap(44, 44, 44))
                    .addComponent(BtCalc, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        OutPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        javax.swing.GroupLayout OutPanelLayout = new javax.swing.GroupLayout(OutPanel);
        OutPanel.setLayout(OutPanelLayout);
        OutPanelLayout.setHorizontalGroup(
            OutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OutPanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(LbResp, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        OutPanelLayout.setVerticalGroup(
            OutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OutPanelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(LbResp, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(InputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(InputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(OutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TxHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxHeightActionPerformed

    private void TxWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxWeightActionPerformed

    private void BtCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCalcActionPerformed
        try {
            getUserName();
        } catch (NumberFormatException e) {
            LbResp.setText("Digite um número válido.");
        }
    }//GEN-LAST:event_BtCalcActionPerformed

    private void TxNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxNameActionPerformed

    private void BtClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtClearActionPerformed
        clear(TxHeight, TxWeight, TxName, LbResp);
    }//GEN-LAST:event_BtClearActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UIExercise2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIExercise2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIExercise2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIExercise2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //theme
        FlatMacDarkLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UIExercise2().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCalc;
    private javax.swing.JButton BtClear;
    private javax.swing.JPanel InputPanel;
    private javax.swing.JLabel LbHeight;
    private javax.swing.JTextPane LbResp;
    private javax.swing.JLabel LbWeight;
    private javax.swing.JLabel LbWeight1;
    private javax.swing.JPanel OutPanel;
    private javax.swing.JTextField TxHeight;
    private javax.swing.JTextField TxName;
    private javax.swing.JTextField TxWeight;
    private javax.swing.JLabel Welcome1;
    // End of variables declaration//GEN-END:variables

    private Double calcIMC() {
        Double imc;
        Double altura;
        Double peso;

        altura = Double.parseDouble(TxHeight.getText());
        peso = Double.parseDouble(TxWeight.getText());

        imc = peso / (altura / 100 * altura / 100);

        return imc;
    }

    private String messageIMC() {
        Double imc;
        String mensagem;

        imc = calcIMC();

        if (imc < 18.5) {
            mensagem = "Você está muito magro. Precisa de uma dieta para engordar.";
        } else if (imc < 24.9) {
            mensagem = "Você está com o peso ideal. Não precisa de dieta.";
        } else if (imc < 29.9) {
            mensagem = "Você está com sobrepeso. Precisa de uma dieta para emagrecer.";
        } else if (imc < 30) {
            mensagem = "Você está com obesidade. Precisa de uma dieta, exercícios e uma mudança de vida.";
        } else {
            mensagem = "Você está com obesidade grave. Precisa procurar um médico.";
        }

        return mensagem;
    }

    private void clear(JComponent... fields) {
        Arrays.stream(fields).forEach(f -> {
            if (f instanceof JTextComponent) {
                ((JTextComponent) f).setText("");
            } else if (f instanceof JTextPane) {
                ((JTextPane) f).setText("");
            }
        });
    }

    private void getUserName() {
        try {
            String name = TxName.getText();
            if (name.trim().isEmpty()) {
                throw new NullPointerException();
            }
            String mensagem = "Olá %s o seu IMC é %.2f\n%s"
                    .formatted(name, calcIMC(), messageIMC());
            LbResp.setText(mensagem);
        } catch (NullPointerException e) {
            LbResp.setText(messageIMC());
            return;
        }
    }
}
