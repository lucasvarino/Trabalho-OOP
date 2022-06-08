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
public class InterfaceAdmin extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceInicial
     */
    public InterfaceAdmin() {
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

        pokemons = new javax.swing.JLabel();
        listaPokemons = new javax.swing.JComboBox<>();
        modificaAdmin = new javax.swing.JButton();
        admin = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        treinador = new javax.swing.JLabel();
        inputTreinadorUsuario = new javax.swing.JTextField();
        inputNomeUsuario = new javax.swing.JTextField();
        pokedex = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pokemons.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        pokemons.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pokemons.setText("Pokémons:");
        getContentPane().add(pokemons);
        pokemons.setBounds(140, 320, 90, 23);

        listaPokemons.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bulbasaur", "Lucas", "Pedro", "José" }));
        listaPokemons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaPokemonsActionPerformed(evt);
            }
        });
        getContentPane().add(listaPokemons);
        listaPokemons.setBounds(250, 320, 100, 22);

        modificaAdmin.setBackground(new java.awt.Color(51, 255, 51));
        modificaAdmin.setText("Confirmar");
        modificaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificaAdminActionPerformed(evt);
            }
        });
        getContentPane().add(modificaAdmin);
        modificaAdmin.setBounds(200, 360, 100, 22);

        admin.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin.setText("ADMIN");
        getContentPane().add(admin);
        admin.setBounds(200, 230, 90, 23);

        usuario.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuario.setText("Usuário:");
        getContentPane().add(usuario);
        usuario.setBounds(140, 260, 90, 23);

        treinador.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        treinador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        treinador.setText("Treinador:");
        getContentPane().add(treinador);
        treinador.setBounds(130, 290, 100, 23);

        inputTreinadorUsuario.setText("Ash");
        inputTreinadorUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTreinadorUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(inputTreinadorUsuario);
        inputTreinadorUsuario.setBounds(250, 290, 60, 22);

        inputNomeUsuario.setText("Joao");
        inputNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(inputNomeUsuario);
        inputNomeUsuario.setBounds(250, 260, 60, 22);

        pokedex.setIcon(new javax.swing.ImageIcon("C:\\Users\\jpbba\\Documents\\Coding\\Ufjf\\OO\\trabalho-oo\\Trabalho-OOP\\PokedexOO\\img\\663-6639628_trending-pokedex-png-transparent-png.png")); // NOI18N
        getContentPane().add(pokedex);
        pokedex.setBounds(20, 15, 840, 639);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaPokemonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaPokemonsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaPokemonsActionPerformed

    private void modificaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificaAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificaAdminActionPerformed

    private void inputTreinadorUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTreinadorUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTreinadorUsuarioActionPerformed

    private void inputNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin;
    private javax.swing.JTextField inputNomeUsuario;
    private javax.swing.JTextField inputTreinadorUsuario;
    private javax.swing.JComboBox<String> listaPokemons;
    private javax.swing.JButton modificaAdmin;
    private javax.swing.JLabel pokedex;
    private javax.swing.JLabel pokemons;
    private javax.swing.JLabel treinador;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables

    
    
}
