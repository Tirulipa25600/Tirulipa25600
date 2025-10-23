package Form;

/* @author DAIANE_5049
 */
public final class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
        Desabilitar();
      
    }
void Desabilitar(){
 txt_n1.setEditable(false);
 txt_n2.setEditable(false);
 txt_res.setEditable(false);
 
 }
void Habilitar(){
 txt_n1.setEditable(true);
 txt_n2.setEditable(true);
 txt_res.setEditable(true);
 
 }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_soma = new javax.swing.JButton();
        txt_n1 = new javax.swing.JTextField();
        txt_n2 = new javax.swing.JTextField();
        txt_res = new javax.swing.JTextField();
        btn_subtracao = new javax.swing.JButton();
        btn_multiplicacao = new javax.swing.JButton();
        btn_divisao = new javax.swing.JButton();
        btn_retornar = new javax.swing.JButton();
        btn_novo = new javax.swing.JButton();
        btn_limpar = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        btn_comparacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("N1");

        jLabel2.setText("N2");

        jLabel3.setText("RES");

        btn_soma.setText("+");
        btn_soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_somaActionPerformed(evt);
            }
        });

        txt_n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_n1ActionPerformed(evt);
            }
        });

        txt_n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_n2ActionPerformed(evt);
            }
        });

        txt_res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_resActionPerformed(evt);
            }
        });

        btn_subtracao.setText("-");
        btn_subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subtracaoActionPerformed(evt);
            }
        });

        btn_multiplicacao.setText("*");
        btn_multiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicacaoActionPerformed(evt);
            }
        });

        btn_divisao.setText("/");
        btn_divisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisaoActionPerformed(evt);
            }
        });

        btn_retornar.setText("Retornar");
        btn_retornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retornarActionPerformed(evt);
            }
        });

        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_limpar.setText("Limpar");
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        btn_comparacao.setText("Comparação");
        btn_comparacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comparacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btn_novo)
                        .addGap(18, 18, 18)
                        .addComponent(btn_limpar)
                        .addGap(18, 18, 18)
                        .addComponent(sair)
                        .addGap(18, 18, 18)
                        .addComponent(btn_comparacao))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_n2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_n1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_soma)
                                .addGap(18, 18, 18)
                                .addComponent(btn_subtracao)
                                .addGap(18, 18, 18)
                                .addComponent(btn_multiplicacao)
                                .addGap(18, 18, 18)
                                .addComponent(btn_divisao)
                                .addGap(18, 18, 18)
                                .addComponent(btn_retornar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_res)
                                .addGap(109, 109, 109)))))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_n1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_n2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_soma)
                    .addComponent(btn_subtracao)
                    .addComponent(btn_multiplicacao)
                    .addComponent(btn_divisao)
                    .addComponent(btn_retornar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo)
                    .addComponent(btn_limpar)
                    .addComponent(sair)
                    .addComponent(btn_comparacao))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_resActionPerformed

    }//GEN-LAST:event_txt_resActionPerformed

    private void txt_n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_n2ActionPerformed

    }//GEN-LAST:event_txt_n2ActionPerformed

    private void txt_n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_n1ActionPerformed

    }//GEN-LAST:event_txt_n1ActionPerformed

    private void btn_subtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subtracaoActionPerformed
int x, y, z; 
 String r; 
 
 
 x = Integer.parseInt( txt_n1.getText()); 
 y = Integer.parseInt( txt_n2.getText());
 
 z= x - y;
 r = String.valueOf(z); 
 txt_res.setText(r);
    }//GEN-LAST:event_btn_subtracaoActionPerformed

    private void btn_retornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_retornarActionPerformed
         Calc frame1 = new Calc (); 
 
        frame1.setVisible(true);
        dispose();

    }//GEN-LAST:event_btn_retornarActionPerformed

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
txt_n1.setText("");
 txt_n2.setText("");
 txt_res.setText("");
    }//GEN-LAST:event_btn_limparActionPerformed

    private void btn_somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_somaActionPerformed

 int x, y, z; 
 String r; 
 
 
 x = Integer.parseInt( txt_n1.getText()); 
 y = Integer.parseInt( txt_n2.getText());
 
 z= x + y;
 r = String.valueOf(z); 
 txt_res.setText(r);
    }//GEN-LAST:event_btn_somaActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
System.exit(0);    }//GEN-LAST:event_sairActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
Habilitar();    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_multiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicacaoActionPerformed
int x, y, z; 
 String r; 
 
 
 x = Integer.parseInt( txt_n1.getText()); 
 y = Integer.parseInt( txt_n2.getText());
 
 z= x * y;
 r = String.valueOf(z); 
 txt_res.setText(r);    }//GEN-LAST:event_btn_multiplicacaoActionPerformed

    private void btn_divisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divisaoActionPerformed
int x, y, z; 
 String r; 
 
 
 x = Integer.parseInt( txt_n1.getText()); 
 y = Integer.parseInt( txt_n2.getText());
 
 z= x / y;
 r = String.valueOf(z); 
 txt_res.setText(r);    }//GEN-LAST:event_btn_divisaoActionPerformed

    private void btn_comparacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comparacaoActionPerformed

    }//GEN-LAST:event_btn_comparacaoActionPerformed

    
    public static void main(String args[]) {
        
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
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_comparacao;
    private javax.swing.JButton btn_divisao;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JButton btn_multiplicacao;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_retornar;
    private javax.swing.JButton btn_soma;
    private javax.swing.JButton btn_subtracao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton sair;
    private javax.swing.JTextField txt_n1;
    private javax.swing.JTextField txt_n2;
    private javax.swing.JTextField txt_res;
    // End of variables declaration//GEN-END:variables
}
