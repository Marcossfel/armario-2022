/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.visao;

import br.edu.ifpr.paranavai.armarios.controle.LocalizacaoControle;
import br.edu.ifpr.paranavai.armarios.modelo.Localizacao;
import br.edu.ifpr.paranavai.armarios.visao.FormLocalizacaoUI;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ifpr
 */
public class EditorLocalizacaoUI extends javax.swing.JFrame {
    List<Localizacao> listaDeLocalizacoes;
    /**
     * Creates new form EditorLocalizacaoUI
     */
    public EditorLocalizacaoUI() {
        initComponents();
           
        this.setLocationRelativeTo(null);
        listaDeLocalizacoes = LocalizacaoControle.listarTodasLocalizacoes();
        populaTabela(listaDeLocalizacoes);
    }

    private void populaTabela(List<Localizacao> lista) {
        DefaultTableModel modeloDeColunasDaTabela = (DefaultTableModel) tblLocalizacao.getModel();
        //  Primeiro limpa a tabela
        while (modeloDeColunasDaTabela.getRowCount() != 0) {
            modeloDeColunasDaTabela.removeRow(0);
        }
        
        for (int i = 0; i < lista.size(); i++) {
            Localizacao mostraLocalizacao = lista.get(i);
            Object[] dadosLinha = new Object[2];
            dadosLinha[0] = mostraLocalizacao.getLocalizacaoId();
            dadosLinha[1] = mostraLocalizacao.getNome();
            modeloDeColunasDaTabela.addRow(dadosLinha);
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

        painelSuperior = new javax.swing.JPanel();
        panelBusca = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        panelNovo = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        painelInferior = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLocalizacao = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        painelSuperior.setLayout(new java.awt.BorderLayout());

        panelBusca.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 0, 10));
        panelBusca.setLayout(new javax.swing.BoxLayout(panelBusca, javax.swing.BoxLayout.LINE_AXIS));

        lblNome.setText("Nome: ");
        panelBusca.add(lblNome);

        txtNome.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        panelBusca.add(txtNome);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        panelBusca.add(btnBuscar);

        painelSuperior.add(panelBusca, java.awt.BorderLayout.PAGE_START);

        panelNovo.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelNovo.setLayout(new java.awt.GridLayout(1, 3, 10, 0));

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        panelNovo.add(btnNovo);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        panelNovo.add(btnEditar);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        panelNovo.add(btnExcluir);

        painelSuperior.add(panelNovo, java.awt.BorderLayout.CENTER);

        getContentPane().add(painelSuperior, java.awt.BorderLayout.PAGE_START);

        painelInferior.setLayout(new java.awt.BorderLayout());

        tblLocalizacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLocalizacao);

        painelInferior.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(painelInferior, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ArrayList<Localizacao> filtrado = new ArrayList<Localizacao>();
        
        for (Localizacao localizacao : listaDeLocalizacoes) {
            if(localizacao.getNome().toUpperCase().contains(txtNome.getText().toUpperCase()))
                filtrado.add(localizacao);
        }
        
        populaTabela(filtrado);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        FormLocalizacaoUI form = new FormLocalizacaoUI();
        this.setVisible(false);
        form.setLocationRelativeTo(this);
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tblLocalizacao.getSelectedRow() >= 0) {
            int dadosLinha = tblLocalizacao.getSelectedRow();
            int codigo = (int) tblLocalizacao.getModel().getValueAt(dadosLinha, 0);
            FormLocalizacaoUI form = new FormLocalizacaoUI(codigo);
            this.setVisible(false);            
            form.setLocationRelativeTo(this);
            form.setVisible(true);
            dispose();
        }else {
            JOptionPane.showMessageDialog(null, "Selecione uma Localização!");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tblLocalizacao.getSelectedRow() >= 0) {
            int resposta = JOptionPane.showConfirmDialog(null, "Confirma a exclusão da Localização?", "Excluir Localização!", JOptionPane.YES_NO_OPTION);

            if (resposta == 0) {
                int dadosLinha = tblLocalizacao.getSelectedRow();
                int codigo = (int) tblLocalizacao.getModel().getValueAt(dadosLinha, 0);

                for (Localizacao localizacao : this.listaDeLocalizacoes) {
                    if(localizacao.getLocalizacaoId() == codigo)
                        LocalizacaoControle.excluir(localizacao);
                }
                
                this.listaDeLocalizacoes = LocalizacaoControle.listarTodasLocalizacoes();
               
                populaTabela(this.listaDeLocalizacoes);

                JOptionPane.showMessageDialog(null, "Localização Removida!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma Localização!");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(EditorLocalizacaoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditorLocalizacaoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditorLocalizacaoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorLocalizacaoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorLocalizacaoUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel painelInferior;
    private javax.swing.JPanel painelSuperior;
    private javax.swing.JPanel panelBusca;
    private javax.swing.JPanel panelNovo;
    private javax.swing.JTable tblLocalizacao;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
