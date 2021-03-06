/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Views;

import Filme.Filme;
import Filme.FilmeDAO;
import Negocios.ErroInternoException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ivson
 */
public class AtualizarFilme extends javax.swing.JFrame {

    /**
     * Creates new form AtualizarFilme
     */
    public AtualizarFilme() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CampoCodigo = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        CampoNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CampoGenero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CampoAno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CampoDiretor = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Atualizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Atualizar Filme");

        jLabel2.setText("Código");

        CampoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigoActionPerformed(evt);
            }
        });

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome");

        jLabel4.setText("Gênero");

        CampoGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoGeneroActionPerformed(evt);
            }
        });

        jLabel5.setText("Ano");

        CampoAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoAnoActionPerformed(evt);
            }
        });

        jLabel7.setText("Diretor");

        CampoDiretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDiretorActionPerformed(evt);
            }
        });

        jButton2.setText("Sair");

        jButton3.setText("Limpar");

        Atualizar.setText("Atualizar");
        Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarActionPerformed(evt);
            }
        });

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Gênero", "Ano", "Diretor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoAno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Atualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CampoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Buscar))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Buscar)
                    .addComponent(CampoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CampoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CampoAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(CampoDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(Atualizar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
       
        Filme filme = new Filme();
        FilmeDAO FilmeDAO = new FilmeDAO();
        List<Filme> ListaDeFilmes = FilmeDAO.ListarFilme();
        int codigoAtualizar = Integer.parseInt(CampoCodigo.getText());
        DefaultTableModel tabela = new DefaultTableModel();
        tabela = (DefaultTableModel) Tabela.getModel();
        tabela.setRowCount(0);
        for (int i = 0; i < ListaDeFilmes.size(); i++) {
            filme = ListaDeFilmes.get(i);
            if(ListaDeFilmes.get(i).getCodigo() == codigoAtualizar){

                Object[] objeto = {ListaDeFilmes.get(i).getCodigo(),
                    ListaDeFilmes.get(i).getNome(),
                    ListaDeFilmes.get(i).getGenero(),
                    ListaDeFilmes.get(i).getAno(),
                    ListaDeFilmes.get(i).getDiretor()};

                tabela.addRow(objeto);
            }
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void CampoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodigoActionPerformed

    private void AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarActionPerformed
        // TODO add your handling code here:
        
    /*    Filme filme = new Filme();
        FilmeDAO FD = new FilmeDAO();
        List<Filme> ListaDeFilmes = FD.ListarFilme();

        int codigoatualizar = Integer.parseInt(CampoCodigo.getText());
        int ano = Integer.parseInt(CampoAno.getText());

        for (int i = 0; i < ListaDeFilmes.size(); i++) {

            filme = ListaDeFilmes.get(i);
            if(ListaDeFilmes.get(i).getCodigo() == (codigoatualizar)){
                filme.setCodigo(codigoatualizar);

                try{
                    Filme temp = new Filme( CampoNome.getText(), CampoGenero.getText() , ano , CampoDiretor.getText() );
                    temp.setCodigo(codigoatualizar);
                    
                    FD.AtualizaFilme(temp);

                    JOptionPane.showMessageDialog(null, "Ator atualizado com sucesso!");

                } catch (ErroInternoException ex) {
                    Logger.getLogger(AtualizarFilme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        CampoCodigo.setText("");
        CampoNome.setText("");
        
        DefaultTableModel tabela = new DefaultTableModel();
        tabela = (DefaultTableModel) Tabela.getModel();
        tabela.setNumRows(0);*/
    }//GEN-LAST:event_AtualizarActionPerformed

    private void CampoGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoGeneroActionPerformed

    private void CampoAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoAnoActionPerformed

    private void CampoDiretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDiretorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDiretorActionPerformed

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
            java.util.logging.Logger.getLogger(AtualizarFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizarFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizarFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizarFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizarFilme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atualizar;
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField CampoAno;
    private javax.swing.JTextField CampoCodigo;
    private javax.swing.JTextField CampoDiretor;
    private javax.swing.JTextField CampoGenero;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JTable Tabela;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
