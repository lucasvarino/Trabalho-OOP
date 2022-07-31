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
public class InterfaceRegistraPokemon extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceInicial
     */
    public InterfaceRegistraPokemon() {
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

        confirmaPokemon = new javax.swing.JButton();
        registrarPokemon = new javax.swing.JLabel();
        nomePokemon = new javax.swing.JLabel();
        inputNomePokemon = new javax.swing.JTextField();
        apelido = new javax.swing.JLabel();
        inputApelidoPokemon = new javax.swing.JTextField();
        pokedex = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        confirmaPokemon.setBackground(new java.awt.Color(102, 204, 255));
        confirmaPokemon.setText("Registrar");
        confirmaPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaPokemonActionPerformed(evt);
            }
        });
        getContentPane().add(confirmaPokemon);
        confirmaPokemon.setBounds(200, 360, 90, 24);

        registrarPokemon.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        registrarPokemon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrarPokemon.setText("REGISTRAR POKEMON");
        getContentPane().add(registrarPokemon);
        registrarPokemon.setBounds(170, 230, 160, 23);

        nomePokemon.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        nomePokemon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomePokemon.setText("Nome:");
        getContentPane().add(nomePokemon);
        nomePokemon.setBounds(140, 310, 60, 23);

        inputNomePokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomePokemonActionPerformed(evt);
            }
        });
        getContentPane().add(inputNomePokemon);
        inputNomePokemon.setBounds(210, 310, 110, 24);

        apelido.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        apelido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apelido.setText("Apelido:");
        getContentPane().add(apelido);
        apelido.setBounds(130, 270, 70, 23);

        inputApelidoPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputApelidoPokemonActionPerformed(evt);
            }
        });
        getContentPane().add(inputApelidoPokemon);
        inputApelidoPokemon.setBounds(210, 270, 110, 24);

        pokedex.setIcon(new javax.swing.ImageIcon("C:\\Users\\jpbba\\Documents\\Coding\\Ufjf\\OO\\trabalho-oo\\Trabalho-OOP\\PokedexOO\\img\\pokedex-png-transparent-png.png")); // NOI18N
        getContentPane().add(pokedex);
        pokedex.setBounds(20, 15, 840, 639);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmaPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaPokemonActionPerformed
        // registra o novo pokemon com essas info e volta pra InterfaceRegistros
        InterfaceRegistros interfaceRegistros = new InterfaceRegistros();
        this.dispose();
        interfaceRegistros.setVisible(true);
    }//GEN-LAST:event_confirmaPokemonActionPerformed

    private void inputNomePokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomePokemonActionPerformed
        // pega nome pokemon
    }//GEN-LAST:event_inputNomePokemonActionPerformed

    private void inputApelidoPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputApelidoPokemonActionPerformed
        // pega apelido pokemon
    }//GEN-LAST:event_inputApelidoPokemonActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceRegistraPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceRegistraPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceRegistraPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceRegistraPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceRegistraPokemon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apelido;
    private javax.swing.JButton confirmaPokemon;
    private javax.swing.JTextField inputApelidoPokemon;
    private javax.swing.JTextField inputNomePokemon;
    private javax.swing.JLabel nomePokemon;
    private javax.swing.JLabel pokedex;
    private javax.swing.JLabel registrarPokemon;
    // End of variables declaration//GEN-END:variables

    
    
}
