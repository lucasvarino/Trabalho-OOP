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
public class InterfaceUsuario extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceInicial
     */
    public InterfaceUsuario() {
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

        pesoPokemon = new javax.swing.JLabel();
        deletaPokemon = new javax.swing.JButton();
        nomePokemon = new javax.swing.JLabel();
        inputPesoPokemon = new javax.swing.JTextField();
        altura = new javax.swing.JLabel();
        inputAlturaPokemon = new javax.swing.JTextField();
        editaPokemon = new javax.swing.JButton();
        bulbasaur = new javax.swing.JLabel();
        pokedex = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pesoPokemon.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        pesoPokemon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pesoPokemon.setText("Peso:");
        getContentPane().add(pesoPokemon);
        pesoPokemon.setBounds(130, 290, 50, 23);

        deletaPokemon.setBackground(new java.awt.Color(255, 51, 51));
        deletaPokemon.setText("Deletar");
        deletaPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletaPokemonActionPerformed(evt);
            }
        });
        getContentPane().add(deletaPokemon);
        deletaPokemon.setBounds(290, 360, 70, 22);

        nomePokemon.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        nomePokemon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomePokemon.setText("#1 Bulbasaur");
        getContentPane().add(nomePokemon);
        nomePokemon.setBounds(170, 230, 160, 20);

        inputPesoPokemon.setText("45");
        inputPesoPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPesoPokemonActionPerformed(evt);
            }
        });
        getContentPane().add(inputPesoPokemon);
        inputPesoPokemon.setBounds(190, 290, 60, 22);

        altura.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        altura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        altura.setText("Altura:");
        getContentPane().add(altura);
        altura.setBounds(130, 260, 60, 23);

        inputAlturaPokemon.setText("1,25");
        inputAlturaPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAlturaPokemonActionPerformed(evt);
            }
        });
        getContentPane().add(inputAlturaPokemon);
        inputAlturaPokemon.setBounds(190, 260, 60, 22);

        editaPokemon.setBackground(new java.awt.Color(102, 204, 255));
        editaPokemon.setText("Editar");
        editaPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editaPokemonActionPerformed(evt);
            }
        });
        getContentPane().add(editaPokemon);
        editaPokemon.setBounds(140, 360, 70, 22);

        bulbasaur.setIcon(new javax.swing.ImageIcon("C:\\Users\\jpbba\\Documents\\Coding\\Ufjf\\OO\\trabalho-oo\\Trabalho-OOP\\PokedexOO\\img\\bulbasaur (1).png")); // NOI18N
        getContentPane().add(bulbasaur);
        bulbasaur.setBounds(190, 130, 190, 240);

        pokedex.setIcon(new javax.swing.ImageIcon("C:\\Users\\jpbba\\Documents\\Coding\\Ufjf\\OO\\trabalho-oo\\Trabalho-OOP\\PokedexOO\\img\\663-6639628_trending-pokedex-png-transparent-png.png")); // NOI18N
        getContentPane().add(pokedex);
        pokedex.setBounds(20, 15, 840, 639);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deletaPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletaPokemonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletaPokemonActionPerformed

    private void inputPesoPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPesoPokemonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPesoPokemonActionPerformed

    private void inputAlturaPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAlturaPokemonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputAlturaPokemonActionPerformed

    private void editaPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaPokemonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editaPokemonActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel altura;
    private javax.swing.JLabel bulbasaur;
    private javax.swing.JButton deletaPokemon;
    private javax.swing.JButton editaPokemon;
    private javax.swing.JTextField inputAlturaPokemon;
    private javax.swing.JTextField inputPesoPokemon;
    private javax.swing.JLabel nomePokemon;
    private javax.swing.JLabel pesoPokemon;
    private javax.swing.JLabel pokedex;
    // End of variables declaration//GEN-END:variables

    
    
}
