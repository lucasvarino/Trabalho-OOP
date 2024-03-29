/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.interfacepokedex.jogador;

import com.mycompany.interfacepokedex.InitComponents;
import com.mycompany.interfacepokedex.InterfaceInicial;
import com.mycompany.pokedexoo.users.Jogador;
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
public class InterfaceCriaUsuario extends javax.swing.JFrame implements InitComponents {

    /**
     * Creates new form InterfaceInicial
     */
    public InterfaceCriaUsuario() {
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

        senhaJogador = new javax.swing.JLabel();
        criaJogador = new javax.swing.JButton();
        criarJogador = new javax.swing.JLabel();
        nomeJogador = new javax.swing.JLabel();
        inputNomeJogador = new javax.swing.JTextField();
        inputSenhaJogador = new javax.swing.JPasswordField();
        pokedex = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        senhaJogador.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        senhaJogador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        senhaJogador.setText("Senha:");
        getContentPane().add(senhaJogador);
        senhaJogador.setBounds(130, 310, 80, 23);

        criaJogador.setBackground(new java.awt.Color(102, 204, 255));
        criaJogador.setText("Confirmar");
        criaJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    criaJogadorActionPerformed(evt);
                } catch (IOException ex) {
                    System.out.println("Nao foi possivel criar jogador.");
                } catch (InputException ex) {
                    Logger.getLogger(InterfaceCriaUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        getContentPane().add(criaJogador);
        criaJogador.setBounds(200, 350, 90, 24);

        criarJogador.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        criarJogador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        criarJogador.setText("CRIAR JOGADOR");
        getContentPane().add(criarJogador);
        criarJogador.setBounds(170, 230, 160, 23);

        nomeJogador.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        nomeJogador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeJogador.setText("Nome:");
        getContentPane().add(nomeJogador);
        nomeJogador.setBounds(140, 270, 60, 23);

        inputNomeJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeJogadorActionPerformed(evt);
            }
        });
        getContentPane().add(inputNomeJogador);
        inputNomeJogador.setBounds(220, 270, 140, 24);
        getContentPane().add(inputSenhaJogador);
        inputSenhaJogador.setBounds(220, 310, 140, 22);

        pokedex.setIcon(new javax.swing.ImageIcon("img/pokedex.png")); // NOI18N
        getContentPane().add(pokedex);
        pokedex.setBounds(20, 15, 840, 639);

        pack();
    }// </editor-fold>//

    private void criaJogadorActionPerformed(java.awt.event.ActionEvent evt) throws IOException, InputException {//
//        Jogador jogador = new Jogador(inputNomeJogador.getText(), inputSenhaJogador.getPassword().toString());

        try {
            boolean podeCriar = Jogador.registrar(inputNomeJogador.getText(), String.valueOf(inputSenhaJogador.getPassword()));
            
            if (!podeCriar) {
            JPanel painel = new JPanel();
            JOptionPane.showInternalMessageDialog(painel, "Nome já existe! Tente outro.", "Inválido", ERROR_MESSAGE);
            } else {
                InterfaceInicial interfaceInicial = new InterfaceInicial();
                this.dispose();
                interfaceInicial.setVisible(true);
            
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
            java.util.logging.Logger.getLogger(InterfaceCriaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCriaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCriaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCriaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCriaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton criaJogador;
    private javax.swing.JLabel criarJogador;
    private javax.swing.JTextField inputNomeJogador;
    private javax.swing.JPasswordField inputSenhaJogador;
    private javax.swing.JLabel nomeJogador;
    private javax.swing.JLabel pokedex;
    private javax.swing.JLabel senhaJogador;
    // End of variables declaration//GEN-END:variables

    
    
}
