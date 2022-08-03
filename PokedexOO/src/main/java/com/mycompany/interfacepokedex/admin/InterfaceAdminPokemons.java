/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.interfacepokedex.admin;

import com.mycompany.pokedexoo.users.Jogador;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * autores:
 * João Pedro Banhato Pereira (202165506B)
 * Lucas de Oliveira Varino (202165090A)
 */
public class InterfaceAdminPokemons extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceInicial
     */
    public InterfaceAdminPokemons() {
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
    private void initComponents() {

        pokemons = new javax.swing.JLabel();
        listaPokemons = new javax.swing.JComboBox<>();
        modificaAdmin = new javax.swing.JButton();
        jogador = new javax.swing.JLabel();
        sair = new javax.swing.JButton();
        registraPokemon = new javax.swing.JButton();
        pokedex = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pokemons.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        pokemons.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pokemons.setText("Pokémons:");
        getContentPane().add(pokemons);
        pokemons.setBounds(140, 290, 100, 20);

        listaPokemons.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bulbasaur", "Lucas", "Pedro", "José" }));
        listaPokemons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaPokemonsActionPerformed(evt);
            }
        });
        getContentPane().add(listaPokemons);
        listaPokemons.setBounds(250, 290, 110, 26);

        modificaAdmin.setBackground(new java.awt.Color(51, 255, 51));
        modificaAdmin.setText("Confirmar");
        modificaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificaAdminActionPerformed(evt);
            }
        });
        getContentPane().add(modificaAdmin);
        modificaAdmin.setBounds(190, 320, 120, 24);

        jogador.setBackground(new java.awt.Color(0, 153, 51));
        jogador.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jogador.setForeground(new java.awt.Color(0, 204, 51));
        jogador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jogador.setText(Jogador.getNomeAtual());
        getContentPane().add(jogador);
        jogador.setBounds(200, 230, 90, 23);

        sair.setBackground(new java.awt.Color(255, 0, 0));
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        getContentPane().add(sair);
        sair.setBounds(270, 360, 100, 24);

        registraPokemon.setBackground(new java.awt.Color(0, 0, 255));
        registraPokemon.setText("Adicionar Novo");
        registraPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registraPokemonActionPerformed(evt);
            }
        });
        getContentPane().add(registraPokemon);
        registraPokemon.setBounds(130, 360, 130, 24);

        pokedex.setIcon(new javax.swing.ImageIcon("img/pokedex.png")); // NOI18N
        getContentPane().add(pokedex);
        pokedex.setBounds(20, 15, 840, 639);

        pack();
    }// </editor-fold>

    private void listaPokemonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaPokemonsActionPerformed
        // lista os pokemons para que o admin edite o que ele quiser pro jogador
    }//GEN-LAST:event_listaPokemonsActionPerformed

    private void modificaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificaAdminActionPerformed
        try {
            // manda pra InterfaceAdminPokemon do pokemon selecionado na combo-box
            this.dispose();
            InterfaceAdminPokemon interfaceAdminPokemon = new InterfaceAdminPokemon();
            interfaceAdminPokemon.setVisible(true);
        } catch (IOException ex) {
            System.out.println("Nao foi possivel encontrar a imagem.");
        }
    }//GEN-LAST:event_modificaAdminActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        try {
            // volta para a InterfaceAdminTreinador
            this.dispose();
            InterfaceAdminTreinador interfaceAdminTreinador = new InterfaceAdminTreinador();
            interfaceAdminTreinador.setVisible(true);
        } catch (FileNotFoundException ex) {
            System.out.println("Nao foi possivel encontrar o arquivo.");
        }
    }//GEN-LAST:event_sairActionPerformed

    private void registraPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registraPokemonActionPerformed
        // manda o jogador para a InterfaceRegistraPokemon
        InterfaceRegistraPokemonAdmin interfaceRegistraPokemonAdmin = new InterfaceRegistraPokemonAdmin();
        this.dispose();
        interfaceRegistraPokemonAdmin.setVisible(true);
    }//GEN-LAST:event_registraPokemonActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceAdminPokemons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdminPokemons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdminPokemons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdminPokemons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new InterfaceAdminPokemons().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jogador;
    private javax.swing.JComboBox<String> listaPokemons;
    private javax.swing.JButton modificaAdmin;
    private javax.swing.JLabel pokedex;
    private javax.swing.JLabel pokemons;
    private javax.swing.JButton registraPokemon;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables

    
    
}
