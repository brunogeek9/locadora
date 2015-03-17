package GUI;

import GUI.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria
 */
public class Telaprincipal extends javax.swing.JFrame {

    /**
     * Creates new form Telaprincipal
     */
    public Telaprincipal() {
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

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jDesktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        gerenciar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuCadastroFilme = new javax.swing.JMenuItem();
        Usurario = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuCadastroUsuario = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuDevelopers = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Locadora");

        jDesktopPane.setBackground(new java.awt.Color(200, 255, 255));
        jDesktopPane.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/20528-rick-grimes-the-waking-dead-1920x1200-game-wallpaper.jpg"))); // NOI18N
        jLabel1.setText("Locadora Beta");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        jDesktopPane.add(jLabel1, "card2");

        gerenciar.setText("Gerenciar");

        jMenuItem1.setText("Emprestimo");
        gerenciar.add(jMenuItem1);

        jMenu1.setText("Filme");

        jMenuCadastroFilme.setText("Cadastrar/Excluir");
        jMenuCadastroFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroFilmeActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCadastroFilme);

        Usurario.setText("Listar");
        jMenu1.add(Usurario);

        gerenciar.add(jMenu1);

        jMenu3.setText("Usuario");

        jMenuCadastroUsuario.setText("Cadastrar/Excluir");
        jMenuCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroUsuarioActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuCadastroUsuario);

        jMenuItem4.setText("Listar");
        jMenu3.add(jMenuItem4);

        gerenciar.add(jMenu3);

        jMenuBar1.add(gerenciar);

        jMenu2.setText("Sobre");

        jMenuDevelopers.setText("Desenvovido por");
        jMenuDevelopers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDevelopersActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuDevelopers);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCadastroFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroFilmeActionPerformed
        GerenciarFilme a = new GerenciarFilme();
        jDesktopPane.add(a);
        a.setVisible(true);
        a.setBounds(50,50,200,200);
    }//GEN-LAST:event_jMenuCadastroFilmeActionPerformed

    private void jMenuCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroUsuarioActionPerformed
        GerenciarCliente a = new GerenciarCliente();
        jDesktopPane.add(a);
        a.setVisible(true);
        a.setBounds(50,50,200,200);
    }//GEN-LAST:event_jMenuCadastroUsuarioActionPerformed

    private void jMenuDevelopersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDevelopersActionPerformed
        Sobre a = new Sobre();
        jDesktopPane.add(a);
        a.setVisible(true);
        a.setBounds(50,50,200,200);
    }//GEN-LAST:event_jMenuDevelopersActionPerformed

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
            java.util.logging.Logger.getLogger(Telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telaprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Usurario;
    private javax.swing.JMenu gerenciar;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCadastroFilme;
    private javax.swing.JMenuItem jMenuCadastroUsuario;
    private javax.swing.JMenuItem jMenuDevelopers;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}
