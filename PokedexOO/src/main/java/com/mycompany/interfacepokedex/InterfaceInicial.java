/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.interfacepokedex;

import com.mycompany.interfacepokedex.jogador.InterfaceCriaUsuario;
import com.mycompany.interfacepokedex.jogador.InterfaceJogadorTreinador;
import com.mycompany.interfacepokedex.admin.InterfaceAdmin;
import com.mycompany.pokedexoo.users.Jogador;
import java.io.FileNotFoundException;
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
public class InterfaceInicial extends javax.swing.JFrame implements InitComponents {

    /**
     * Creates new form InterfaceInicial
     */
    public InterfaceInicial() throws FileNotFoundException {
        initComponents();
        Jogador.atualizaJogadores();
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
    @Override
    public void initComponents() throws FileNotFoundException {

        admin = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        listaJogadores = new javax.swing.JComboBox<>();
        entraAdmin = new javax.swing.JButton();
        entraJogador = new javax.swing.JButton();
        senhaJogador = new javax.swing.JLabel();
        nomeJogador1 = new javax.swing.JLabel();
        criaJogador1 = new javax.swing.JButton();
        inputSenhaJogador = new javax.swing.JPasswordField();
        emailAdmin = new javax.swing.JLabel();
        senhaAdmin = new javax.swing.JLabel();
        inputSenhaAdmin = new javax.swing.JPasswordField();
        inputEmailAdmin = new javax.swing.JTextField();
        pokedex = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        admin.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        admin.setForeground(new java.awt.Color(102, 255, 102));
        admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin.setText("ADMIN");
        getContentPane().add(admin);
        admin.setBounds(600, 240, 110, 20);

        usuario.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuario.setText("JOGADOR");
        getContentPane().add(usuario);
        usuario.setBounds(200, 230, 90, 23);

        listaJogadores.setModel(new javax.swing.DefaultComboBoxModel<>(Jogador.getAllNomes()));
        listaJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaJogadoresActionPerformed(evt);
            }
        });
        getContentPane().add(listaJogadores);
        listaJogadores.setBounds(220, 270, 140, 26);

        entraAdmin.setBackground(new java.awt.Color(51, 255, 51));
        entraAdmin.setText("Entrar");
        entraAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entraAdminActionPerformed(evt);
            }
        });
        getContentPane().add(entraAdmin);
        entraAdmin.setBounds(620, 310, 75, 20);

        entraJogador.setBackground(new java.awt.Color(102, 204, 255));
        entraJogador.setText("Entrar");
        entraJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entraJogadorActionPerformed(evt);
            }
        });
        getContentPane().add(entraJogador);
        entraJogador.setBounds(140, 350, 100, 24);

        senhaJogador.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        senhaJogador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        senhaJogador.setText("Senha:");
        getContentPane().add(senhaJogador);
        senhaJogador.setBounds(140, 310, 60, 23);

        nomeJogador1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        nomeJogador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeJogador1.setText("Nome:");
        getContentPane().add(nomeJogador1);
        nomeJogador1.setBounds(140, 270, 60, 23);

        criaJogador1.setBackground(new java.awt.Color(255, 0, 0));
        criaJogador1.setText("Criar Novo");
        criaJogador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criaJogador1ActionPerformed(evt);
            }
        });
        getContentPane().add(criaJogador1);
        criaJogador1.setBounds(245, 350, 110, 24);
        getContentPane().add(inputSenhaJogador);
        inputSenhaJogador.setBounds(220, 310, 140, 22);

        emailAdmin.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        emailAdmin.setForeground(new java.awt.Color(255, 255, 255));
        emailAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailAdmin.setText("Email:");
        getContentPane().add(emailAdmin);
        emailAdmin.setBounds(560, 260, 50, 20);

        senhaAdmin.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        senhaAdmin.setForeground(new java.awt.Color(255, 255, 255));
        senhaAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        senhaAdmin.setText("Senha:");
        getContentPane().add(senhaAdmin);
        senhaAdmin.setBounds(560, 280, 50, 20);

        inputSenhaAdmin.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        getContentPane().add(inputSenhaAdmin);
        inputSenhaAdmin.setBounds(610, 280, 140, 20);

        inputEmailAdmin.setText("admin@admin.com");
        inputEmailAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEmailAdminActionPerformed(evt);
            }
        });
        getContentPane().add(inputEmailAdmin);
        inputEmailAdmin.setBounds(610, 260, 140, 20);

        pokedex.setIcon(new javax.swing.ImageIcon("img/pokedex.png")); // NOI18N
        getContentPane().add(pokedex);
        pokedex.setBounds(20, 15, 840, 639);

        pack();
    }// </editor-fold>//

    private void listaJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaJogadoresActionPerformed
        // lista os jogadores ja existentes
    }//GEN-LAST:event_listaJogadoresActionPerformed

    private void entraAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entraAdminActionPerformed
        try {
            // a partir do admin selecionado da combo-box verificar se a senha e nome batem,
            boolean credenciaisCorretasAdmin = true;
            // caso nao bater, informar por um JOP que as credenciais nao batem,
            if (!credenciaisCorretasAdmin) {
                JPanel painel = new JPanel();
                JOptionPane.showInternalMessageDialog(painel, "Credenciais incorretas!", "Login inváido", ERROR_MESSAGE);
            } else {
                // caso esteja correto, enviar o jogador para a InterfaceAdmin
                // onde ele terá acesso as funcionalidades de um admin
                this.dispose();
                InterfaceAdmin interfaceAdmin = new InterfaceAdmin();
                interfaceAdmin.setVisible(true);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Nao foi possivel encontrar o arquivo.");
        }
    }//GEN-LAST:event_entraAdminActionPerformed

    private void entraJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entraJogadorActionPerformed
        // a partir do jogador selecionado da combo-box verificar se a senha e nome batem, 
        Jogador.setJogadorAtualByName(listaJogadores.getSelectedItem().toString());
        Jogador j = Jogador.getJogadorAtual();
        boolean credenciaisCorretasJogador = j.logar(listaJogadores.getSelectedItem().toString(), String.valueOf(inputSenhaJogador.getPassword()));
//        System.out.println(inputSenhaJogador.getPassword().toString());
        // caso nao bater, informar por um JOP que as credenciais nao batem, 
        if (!credenciaisCorretasJogador) {
            JPanel painel = new JPanel();
            JOptionPane.showInternalMessageDialog(painel, "Credenciais incorretas!", "Login inváido", ERROR_MESSAGE);
        } else {
            try {
                // caso esteja correto, enviar o jogador para a InterfaceJogadorTreinador
                // onde ele terá acesso aos seus treinadores e depois aos seus respectivos pokemons
                Jogador.setJogadorAtualByName(listaJogadores.getSelectedItem().toString());
                this.dispose();
                InterfaceJogadorTreinador interfaceJogadorTreinador = new InterfaceJogadorTreinador();
                interfaceJogadorTreinador.setVisible(true);
            } catch (FileNotFoundException ex) {
                System.out.println("Nao foi possivel encontrar o arquivo.");
            }
        }
    }//GEN-LAST:event_entraJogadorActionPerformed

    private void criaJogador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criaJogador1ActionPerformed
        // manda para InterfaceCriaUsuario
        this.dispose();
        InterfaceCriaUsuario interfaceCriaUsuario = new InterfaceCriaUsuario();
//        System.out.println("Indo para tela de criar jogador");
    }//GEN-LAST:event_criaJogador1ActionPerformed

    private void inputEmailAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEmailAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmailAdminActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InterfaceInicial().setVisible(true);
                } catch (FileNotFoundException ex) {
                    System.out.println("Nao foi possivel encontrar o arquivo.");
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin;
    private javax.swing.JButton criaJogador1;
    private javax.swing.JLabel emailAdmin;
    private javax.swing.JButton entraAdmin;
    private javax.swing.JButton entraJogador;
    private javax.swing.JTextField inputEmailAdmin;
    private javax.swing.JPasswordField inputSenhaAdmin;
    private javax.swing.JPasswordField inputSenhaJogador;
    private javax.swing.JComboBox<String> listaJogadores;
    private javax.swing.JLabel nomeJogador1;
    private javax.swing.JLabel pokedex;
    private javax.swing.JLabel senhaAdmin;
    private javax.swing.JLabel senhaJogador;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables

    
    
}
