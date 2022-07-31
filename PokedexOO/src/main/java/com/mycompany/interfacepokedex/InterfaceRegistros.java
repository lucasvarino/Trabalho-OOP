/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.interfacepokedex;

/**
 * autores:
 * João Pedro Banhato Pereira (202165506B)
 * Lucas de Oliveira Varino (202165090A)
 */
public class InterfaceRegistros extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceInicial
     */
    public InterfaceRegistros() {
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pokemons = new javax.swing.JLabel();
        listaPokemons = new javax.swing.JComboBox<>();
        registraPokemon = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        selecionaPokemon = new javax.swing.JButton();
        pokedex = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pokemons.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        pokemons.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pokemons.setText("POKÉMONS");
        getContentPane().add(pokemons);
        pokemons.setBounds(200, 230, 90, 23);

        listaPokemons.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bulbasaur", "Pikachu", "Charmander", "Squirtle" }));
        listaPokemons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaPokemonsActionPerformed(evt);
            }
        });
        getContentPane().add(listaPokemons);
        listaPokemons.setBounds(160, 270, 170, 26);

        registraPokemon.setBackground(new java.awt.Color(0, 0, 255));
        registraPokemon.setText("Adicionar Novo");
        registraPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registraPokemonActionPerformed(evt);
            }
        });
        getContentPane().add(registraPokemon);
        registraPokemon.setBounds(140, 350, 120, 24);

        sair.setBackground(new java.awt.Color(255, 0, 0));
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        getContentPane().add(sair);
        sair.setBounds(284, 350, 70, 24);

        selecionaPokemon.setBackground(new java.awt.Color(255, 153, 51));
        selecionaPokemon.setText("Selecionar");
        selecionaPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionaPokemonActionPerformed(evt);
            }
        });
        getContentPane().add(selecionaPokemon);
        selecionaPokemon.setBounds(190, 300, 110, 24);

        pokedex.setIcon(new javax.swing.ImageIcon("C:\\Users\\jpbba\\Documents\\Coding\\Ufjf\\OO\\trabalho-oo\\Trabalho-OOP\\PokedexOO\\img\\pokedex-png-transparent-png.png")); // NOI18N
        getContentPane().add(pokedex);
        pokedex.setBounds(20, 15, 840, 639);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registraPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registraPokemonActionPerformed
        // manda o jogador para a InterfaceRegistraPokemon
        InterfaceRegistraPokemon interfaceRegistraPokemon = new InterfaceRegistraPokemon();
        this.dispose();
        interfaceRegistraPokemon.setVisible(true);
    }//GEN-LAST:event_registraPokemonActionPerformed

    private void listaPokemonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaPokemonsActionPerformed
        // lista os pokemons do Treinador selecionado para o Jogador na combo-box
    }//GEN-LAST:event_listaPokemonsActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // volta para a InterfaceJogadorTreinador
        this.dispose();
        InterfaceJogadorTreinador interfaceJogadorTreinador = new InterfaceJogadorTreinador();
        interfaceJogadorTreinador.setVisible(true);
    }//GEN-LAST:event_sairActionPerformed

    private void selecionaPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionaPokemonActionPerformed
        // manda o jogador para a InterfaceUsuario com as informacoes do Pokemon
        // selecionado na combo-box
        this.dispose();
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        interfaceUsuario.setVisible(true);
    }//GEN-LAST:event_selecionaPokemonActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceRegistros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> listaPokemons;
    private javax.swing.JLabel pokedex;
    private javax.swing.JLabel pokemons;
    private javax.swing.JButton registraPokemon;
    private javax.swing.JButton sair;
    private javax.swing.JButton selecionaPokemon;
    // End of variables declaration//GEN-END:variables

    
    
}
