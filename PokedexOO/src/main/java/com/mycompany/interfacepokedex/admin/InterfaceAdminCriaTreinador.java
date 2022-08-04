/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.interfacepokedex.admin;

import com.mycompany.interfacepokedex.jogador.*;
import com.mycompany.interfacepokedex.InitComponents;
import com.mycompany.interfacepokedex.InterfaceInicial;
import com.mycompany.pokedexoo.users.Jogador;
import com.mycompany.pokedexoo.users.Treinador;
import excecoes.InputException;
import excecoes.NameException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.JPanel;

/**
 * autores:
 * João Pedro Banhato Pereira (202165506B)
 * Lucas de Oliveira Varino (202165090A)
 */
public class InterfaceAdminCriaTreinador extends javax.swing.JFrame implements InitComponents {

    /**
     * Creates new form InterfaceInicial
     */
    public InterfaceAdminCriaTreinador() {
        initComponents();
        this.setSize(1000, 800);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//
    public void initComponents() {

        senhaTreinador = new javax.swing.JLabel();
        criaTreinador = new javax.swing.JButton();
        criarTreinador = new javax.swing.JLabel();
        nomeTreinador = new javax.swing.JLabel();
        inputNomeTreinador = new javax.swing.JTextField();
        inputRegiaoTreinador = new javax.swing.JTextField();
        pokedex = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        senhaTreinador.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        senhaTreinador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        senhaTreinador.setText("Regiao:");
        getContentPane().add(senhaTreinador);
        senhaTreinador.setBounds(130, 310, 80, 23);

        criaTreinador.setBackground(new java.awt.Color(102, 204, 255));
        criaTreinador.setText("Confirmar");
        criaTreinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    criaTreinadorActionPerformed(evt);
                } catch (IOException ex) {
                    System.out.println("Nao foi possivel criar treinador.");
                } catch (InputException ex) {
                    Logger.getLogger(InterfaceAdminCriaTreinador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        getContentPane().add(criaTreinador);
        criaTreinador.setBounds(200, 350, 90, 24);

        criarTreinador.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        criarTreinador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        criarTreinador.setText("CRIAR TREINADOR");
        getContentPane().add(criarTreinador);
        criarTreinador.setBounds(170, 230, 160, 23);

        nomeTreinador.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        nomeTreinador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeTreinador.setText("Nome:");
        getContentPane().add(nomeTreinador);
        nomeTreinador.setBounds(140, 270, 60, 23);

        inputNomeTreinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //
            }
        });
        getContentPane().add(inputNomeTreinador);
        inputNomeTreinador.setBounds(220, 270, 140, 24);
        getContentPane().add(inputRegiaoTreinador);
        inputRegiaoTreinador.setBounds(220, 310, 140, 22);

        pokedex.setIcon(new javax.swing.ImageIcon("img/pokedex.png")); // NOI18N
        getContentPane().add(pokedex);
        pokedex.setBounds(20, 15, 840, 639);

        pack();
    }// </editor-fold>//

    private void criaTreinadorActionPerformed(java.awt.event.ActionEvent evt) throws IOException, InputException {//

        try {
            boolean podeCriar = Treinador.registrar(inputNomeTreinador.getText(), inputRegiaoTreinador.getText());
            
            if (!podeCriar) {
            JPanel painel = new JPanel();
            JOptionPane.showInternalMessageDialog(painel, "Nome já existe! Tente outro.", "Inválido", ERROR_MESSAGE);
            } else {
                InterfaceJogadorTreinador interfaceJogadorTreinador = new InterfaceJogadorTreinador();
                this.dispose();
                interfaceJogadorTreinador.setVisible(true);
            
            } 
        } catch(InputException ex) {
            JPanel painel = new JPanel();
            JOptionPane.showInternalMessageDialog(painel, "Valores em Branco, favor inserir", "Valores em Branco", ERROR_MESSAGE);
        } catch(NameException ex) {
            JPanel painel = new JPanel();
            JOptionPane.showInternalMessageDialog(painel, "Username já cadastrado! Tente outro", "Username em uso", ERROR_MESSAGE);
        }
        
        
    }//

    private void inputNomeJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeJogadorActionPerformed
        // creio que esse evento possa ser removido
    }//GEN-LAST:event_inputNomeJogadorActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceAdminCriaTreinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdminCriaTreinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdminCriaTreinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdminCriaTreinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceAdminCriaTreinador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//
    private javax.swing.JButton criaTreinador;
    private javax.swing.JLabel criarTreinador;
    private javax.swing.JTextField inputNomeTreinador;
    private javax.swing.JTextField inputRegiaoTreinador;
    private javax.swing.JLabel nomeTreinador;
    private javax.swing.JLabel pokedex;
    private javax.swing.JLabel senhaTreinador;
    // End of variables declaration//

    
    
}