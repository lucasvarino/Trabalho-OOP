/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.interfacepokedex;

import com.mycompany.pokedexoo.users.Jogador;

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
    private void initComponents() {

        pesoPokemon = new javax.swing.JLabel();
        nomePokemon = new javax.swing.JLabel();
        inputPesoPokemon = new javax.swing.JTextField();
        altura = new javax.swing.JLabel();
        inputAlturaPokemon = new javax.swing.JTextField();
        editaPokemon = new javax.swing.JButton();
        apelido = new javax.swing.JLabel();
        inputApelidoPokemon = new javax.swing.JTextField();
        bulbasaur = new javax.swing.JLabel();
        treinador1 = new javax.swing.JLabel();
        treinadorNome = new javax.swing.JLabel();
        regiao1 = new javax.swing.JLabel();
        regiaoNome = new javax.swing.JLabel();
        pokedex = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pesoPokemon.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        pesoPokemon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pesoPokemon.setText("Peso:");
        getContentPane().add(pesoPokemon);
        pesoPokemon.setBounds(130, 290, 50, 23);

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
        inputPesoPokemon.setBounds(200, 290, 60, 24);

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
        inputAlturaPokemon.setBounds(200, 260, 60, 24);

        editaPokemon.setBackground(new java.awt.Color(102, 204, 255));
        editaPokemon.setText("Editar");
        editaPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editaPokemonActionPerformed(evt);
            }
        });
        getContentPane().add(editaPokemon);
        editaPokemon.setBounds(210, 360, 70, 24);

        apelido.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        apelido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apelido.setText("Apelido:");
        getContentPane().add(apelido);
        apelido.setBounds(130, 320, 70, 23);

        inputApelidoPokemon.setText("cebolinha");
        inputApelidoPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputApelidoPokemonActionPerformed(evt);
            }
        });
        getContentPane().add(inputApelidoPokemon);
        inputApelidoPokemon.setBounds(200, 320, 60, 24);

        bulbasaur.setIcon(new javax.swing.ImageIcon("img/pokedex.png")); // NOI18N
        getContentPane().add(bulbasaur);
        bulbasaur.setBounds(190, 130, 190, 240);

        treinador1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        treinador1.setForeground(new java.awt.Color(255, 255, 255));
        treinador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        treinador1.setText("Treinador:");
        getContentPane().add(treinador1);
        treinador1.setBounds(530, 260, 120, 23);

        treinadorNome.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        treinadorNome.setForeground(new java.awt.Color(255, 255, 255));
        treinadorNome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        treinadorNome.setText(Jogador.getJogadorAtual());
        getContentPane().add(treinadorNome);
        treinadorNome.setBounds(650, 260, 120, 30);

        regiao1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        regiao1.setForeground(new java.awt.Color(255, 255, 255));
        regiao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regiao1.setText("Região:");
        getContentPane().add(regiao1);
        regiao1.setBounds(550, 290, 100, 23);

        regiaoNome.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        regiaoNome.setForeground(new java.awt.Color(255, 255, 255));
        regiaoNome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        regiaoNome.setText("Região1");
        getContentPane().add(regiaoNome);
        regiaoNome.setBounds(650, 290, 100, 30);

        pokedex.setIcon(new javax.swing.ImageIcon("img/pokedex.png")); // NOI18N
        getContentPane().add(pokedex);
        pokedex.setBounds(20, 15, 840, 639);

        pack();
    }// </editor-fold>                        

    private void inputPesoPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPesoPokemonActionPerformed
        // pega peso pokemon, ja exibindo o padrao
    }//GEN-LAST:event_inputPesoPokemonActionPerformed

    private void inputAlturaPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAlturaPokemonActionPerformed
        // pega altura pokemon, ja exibindo o padrao
    }//GEN-LAST:event_inputAlturaPokemonActionPerformed

    private void editaPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaPokemonActionPerformed
        // confirma a edicao do pokemon e o cria e volta para a InterfaceRegistros
        this.dispose();
        InterfaceRegistros interfaceRegistros = new InterfaceRegistros();
        interfaceRegistros.setVisible(true);
    }//GEN-LAST:event_editaPokemonActionPerformed

    private void inputApelidoPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputApelidoPokemonActionPerformed
        // pega apelido pokemon, ja exibindo o padrao
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
    private javax.swing.JLabel apelido;
    private javax.swing.JLabel bulbasaur;
    private javax.swing.JButton editaPokemon;
    private javax.swing.JTextField inputAlturaPokemon;
    private javax.swing.JTextField inputApelidoPokemon;
    private javax.swing.JTextField inputPesoPokemon;
    private javax.swing.JLabel nomePokemon;
    private javax.swing.JLabel pesoPokemon;
    private javax.swing.JLabel pokedex;
    private javax.swing.JLabel regiao1;
    private javax.swing.JLabel regiaoNome;
    private javax.swing.JLabel treinador1;
    private javax.swing.JLabel treinadorNome;
    // End of variables declaration//GEN-END:variables

    
    
}
