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
public class InterfaceCriaUsuario extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceInicial
     */
    public InterfaceCriaUsuario() {
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

        nomeUsuario = new javax.swing.JLabel();
        criaUsuario1 = new javax.swing.JButton();
        usuario = new javax.swing.JLabel();
        inputNomeUsuario = new javax.swing.JTextField();
        nomeUsuario1 = new javax.swing.JLabel();
        inputNomeUsuario1 = new javax.swing.JTextField();
        pokedex = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        nomeUsuario.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        nomeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeUsuario.setText("Treinador:");
        getContentPane().add(nomeUsuario);
        nomeUsuario.setBounds(130, 310, 80, 23);

        criaUsuario1.setBackground(new java.awt.Color(102, 204, 255));
        criaUsuario1.setText("Confirmar");
        criaUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criaUsuario1ActionPerformed(evt);
            }
        });
        getContentPane().add(criaUsuario1);
        criaUsuario1.setBounds(200, 350, 90, 24);

        usuario.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuario.setText("CRIAR USUÁRIO");
        getContentPane().add(usuario);
        usuario.setBounds(170, 230, 160, 23);

        inputNomeUsuario.setText("Ash");
        inputNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(inputNomeUsuario);
        inputNomeUsuario.setBounds(210, 310, 140, 24);

        nomeUsuario1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        nomeUsuario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeUsuario1.setText("Nome:");
        getContentPane().add(nomeUsuario1);
        nomeUsuario1.setBounds(140, 270, 60, 23);

        inputNomeUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeUsuario1ActionPerformed(evt);
            }
        });
        getContentPane().add(inputNomeUsuario1);
        inputNomeUsuario1.setBounds(210, 270, 140, 24);

        pokedex.setIcon(new javax.swing.ImageIcon("C:\\Users\\jpbba\\Documents\\Coding\\Ufjf\\OO\\trabalho-oo\\Trabalho-OOP\\PokedexOO\\img\\pokedex-png-transparent-png.png")); // NOI18N
        getContentPane().add(pokedex);
        pokedex.setBounds(20, 15, 840, 639);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void criaUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criaUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_criaUsuario1ActionPerformed

    private void inputNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeUsuarioActionPerformed

    private void inputNomeUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeUsuario1ActionPerformed

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
    private javax.swing.JButton criaUsuario1;
    private javax.swing.JTextField inputNomeUsuario;
    private javax.swing.JTextField inputNomeUsuario1;
    private javax.swing.JLabel nomeUsuario;
    private javax.swing.JLabel nomeUsuario1;
    private javax.swing.JLabel pokedex;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables

    
    
}
