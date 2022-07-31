/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.interfacepokedex;

import com.mycompany.pokedexoo.users.Jogador;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * autores:
 * João Pedro Banhato Pereira (202165506B)
 * Lucas de Oliveira Varino (202165090A)
 */
public class InterfaceAdminTreinador extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceInicial
     */
    public InterfaceAdminTreinador() throws FileNotFoundException {
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() throws FileNotFoundException {

        modificaAdmin = new javax.swing.JButton();
        jogador = new javax.swing.JLabel();
        treinador = new javax.swing.JLabel();
        listaTreinadores = new javax.swing.JComboBox<>();
        sair = new javax.swing.JButton();
        pokedex = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        modificaAdmin.setBackground(new java.awt.Color(51, 255, 51));
        modificaAdmin.setText("Confirmar");
        modificaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificaAdminActionPerformed(evt);
            }
        });
        getContentPane().add(modificaAdmin);
        modificaAdmin.setBounds(140, 350, 110, 24);

        jogador.setBackground(new java.awt.Color(0, 153, 51));
        jogador.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jogador.setForeground(new java.awt.Color(0, 204, 51));
        jogador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jogador.setText(Jogador.getNomeAtual());
        getContentPane().add(jogador);
        jogador.setBounds(200, 230, 90, 23);

        treinador.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        treinador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        treinador.setText("Treinadores:");
        getContentPane().add(treinador);
        treinador.setBounds(130, 290, 120, 23);

        listaTreinadores.setModel(new javax.swing.DefaultComboBoxModel<>(Jogador.getJogadorAtual().getAllNomesTreinadores()));
        listaTreinadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaTreinadoresActionPerformed(evt);
            }
        });
        getContentPane().add(listaTreinadores);
        listaTreinadores.setBounds(250, 290, 110, 26);

        sair.setBackground(new java.awt.Color(255, 0, 0));
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        getContentPane().add(sair);
        sair.setBounds(260, 350, 100, 24);

        pokedex.setIcon(new javax.swing.ImageIcon("C:\\Users\\jpbba\\Documents\\Coding\\Ufjf\\OO\\trabalho-oo\\Trabalho-OOP\\PokedexOO\\img\\pokedex-png-transparent-png.png")); // NOI18N
        getContentPane().add(pokedex);
        pokedex.setBounds(20, 15, 840, 639);

        pack();
    }// </editor-fold>

    private void modificaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificaAdminActionPerformed
        // confirma a edicao dos treinadores e manda para InterfaceAdminPokemons
        this.dispose();
        InterfaceAdminPokemons interfaceAdminPokemons = new InterfaceAdminPokemons();
        interfaceAdminPokemons.setVisible(true);
    }//GEN-LAST:event_modificaAdminActionPerformed

    private void listaTreinadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaTreinadoresActionPerformed
        // lista de treinadores para serem selecionados pelo admin
    }//GEN-LAST:event_listaTreinadoresActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        try {
            // volta para a InterfaceAdmin
            this.dispose();
            InterfaceAdmin interfaceAdmin = new InterfaceAdmin();
            interfaceAdmin.setVisible(true);
        } catch (FileNotFoundException ex) {
            System.out.println("Nao foi possivel ler o arquivo.");
        }
    }//GEN-LAST:event_sairActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceAdminTreinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdminTreinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdminTreinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdminTreinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InterfaceAdminTreinador().setVisible(true);
                } catch (FileNotFoundException ex) {
                    System.out.println("Nao foi possivel encontrar o arquivo.");
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jogador;
    private javax.swing.JComboBox<String> listaTreinadores;
    private javax.swing.JButton modificaAdmin;
    private javax.swing.JLabel pokedex;
    private javax.swing.JButton sair;
    private javax.swing.JLabel treinador;
    // End of variables declaration//GEN-END:variables

    
    
}
