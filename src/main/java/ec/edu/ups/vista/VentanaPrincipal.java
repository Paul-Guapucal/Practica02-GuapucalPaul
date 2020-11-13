/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;



import ec.edu.ups.controlador.ControladorTelefono;
import ec.edu.ups.controlador.ControladorUsuario;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author Juanc
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private VentanaIniciarSesion ventanaIniciarSesion;
    private RegistrarUsuario registrarUsuario;
    private GestionTelefono gestionTelefono;
    private ListarTelefonosUsuarios listarTlfUsuarios;
    private Listartelefonos listarTelefonos;



 private ControladorUsuario controladorUsuario;
 private ControladorTelefono controladorTelefono;
   

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        gestionMenu.setVisible(false);
        CerrarSesionMenu.setVisible(false);
         controladorUsuario = new ControladorUsuario();
         controladorTelefono = new ControladorTelefono();
      
      

        ventanaIniciarSesion = new VentanaIniciarSesion(controladorUsuario, this);
        registrarUsuario = new RegistrarUsuario(controladorUsuario);
     
        gestionTelefono = new GestionTelefono(controladorTelefono,controladorUsuario);
        listarTlfUsuarios = new ListarTelefonosUsuarios (controladorTelefono,controladorUsuario);
        listarTelefonos = new Listartelefonos ( controladorTelefono);

    }

    public JMenuItem getCerrarSesionMenu() {
        return CerrarSesionMenu;
    }

    public JMenuItem getIniciarSesionMenuItem() {
        return IniciarSesionMenuItem;
    }

    public JMenu getInicioMenu() {
        return InicioMenu;
    }

    public JMenuItem getRegistrarUsuarioMenuItem() {
        return RegistrarUsuarioMenuItem;
    }

    public JMenuItem getSalirMenuItem() {
        return SalirMenuItem;
    }

    public JMenu getGestionMenu() {
        return gestionMenu;
    }

   

    public JMenuItem getGestionTelefonoMenu() {
        return gestionTelefonoMenu;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        InicioMenu = new javax.swing.JMenu();
        IniciarSesionMenuItem = new javax.swing.JMenuItem();
        RegistrarUsuarioMenuItem = new javax.swing.JMenuItem();
        ListaTUsuarios = new javax.swing.JMenuItem();
        ListarTelefonosMenu = new javax.swing.JMenuItem();
        CerrarSesionMenu = new javax.swing.JMenuItem();
        SalirMenuItem = new javax.swing.JMenuItem();
        gestionMenu = new javax.swing.JMenu();
        gestionTelefonoMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);

        desktopPane.setBackground(new java.awt.Color(0, 153, 255));
        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);

        InicioMenu.setMnemonic('f');
        InicioMenu.setText("Inicio");

        IniciarSesionMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        IniciarSesionMenuItem.setMnemonic('o');
        IniciarSesionMenuItem.setText("Iniciar Sesion");
        IniciarSesionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesionMenuItemActionPerformed(evt);
            }
        });
        InicioMenu.add(IniciarSesionMenuItem);

        RegistrarUsuarioMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        RegistrarUsuarioMenuItem.setMnemonic('s');
        RegistrarUsuarioMenuItem.setText("Registrar Usuario");
        RegistrarUsuarioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarUsuarioMenuItemActionPerformed(evt);
            }
        });
        InicioMenu.add(RegistrarUsuarioMenuItem);

        ListaTUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        ListaTUsuarios.setText("Listar Telefonos por cedula");
        ListaTUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaTUsuariosActionPerformed(evt);
            }
        });
        InicioMenu.add(ListaTUsuarios);

        ListarTelefonosMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        ListarTelefonosMenu.setText("Listar Todos los telefonos");
        ListarTelefonosMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarTelefonosMenuActionPerformed(evt);
            }
        });
        InicioMenu.add(ListarTelefonosMenu);

        CerrarSesionMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        CerrarSesionMenu.setText("Cerrar Sesion");
        CerrarSesionMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionMenuActionPerformed(evt);
            }
        });
        InicioMenu.add(CerrarSesionMenu);

        SalirMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        SalirMenuItem.setMnemonic('x');
        SalirMenuItem.setText("Salir");
        SalirMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirMenuItemActionPerformed(evt);
            }
        });
        InicioMenu.add(SalirMenuItem);

        menuBar.add(InicioMenu);

        gestionMenu.setText("Gestion");

        gestionTelefonoMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        gestionTelefonoMenu.setText("GestionTelefono");
        gestionTelefonoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionTelefonoMenuActionPerformed(evt);
            }
        });
        gestionMenu.add(gestionTelefonoMenu);

        menuBar.add(gestionMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirMenuItemActionPerformed

    private void RegistrarUsuarioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarUsuarioMenuItemActionPerformed
        desktopPane.add(registrarUsuario);
        registrarUsuario.setVisible(true);
        IniciarSesionMenuItem.setVisible(true);
        SalirMenuItem.setVisible(true);
        gestionMenu.setVisible(false);
        CerrarSesionMenu.setVisible(false);
    }//GEN-LAST:event_RegistrarUsuarioMenuItemActionPerformed

    private void IniciarSesionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionMenuItemActionPerformed
        desktopPane.add(ventanaIniciarSesion);
        ventanaIniciarSesion.setVisible(true);

    }//GEN-LAST:event_IniciarSesionMenuItemActionPerformed

    private void CerrarSesionMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionMenuActionPerformed
        IniciarSesionMenuItem.setVisible(true);
        RegistrarUsuarioMenuItem.setVisible(true);
        gestionMenu.setVisible(false);
        SalirMenuItem.setVisible(true);
    }//GEN-LAST:event_CerrarSesionMenuActionPerformed

    private void gestionTelefonoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionTelefonoMenuActionPerformed
        desktopPane.add(gestionTelefono);
        gestionTelefono.setVisible(true);
    }//GEN-LAST:event_gestionTelefonoMenuActionPerformed

    private void ListaTUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaTUsuariosActionPerformed
        desktopPane.add(listarTlfUsuarios);
        listarTlfUsuarios.setVisible(true);
        CerrarSesionMenu.setVisible(false);
    }//GEN-LAST:event_ListaTUsuariosActionPerformed

    private void ListarTelefonosMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarTelefonosMenuActionPerformed
        desktopPane.add(listarTelefonos);
        listarTelefonos.setVisible(true);
        CerrarSesionMenu.setVisible(false);
    }//GEN-LAST:event_ListarTelefonosMenuActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CerrarSesionMenu;
    private javax.swing.JMenuItem IniciarSesionMenuItem;
    private javax.swing.JMenu InicioMenu;
    private javax.swing.JMenuItem ListaTUsuarios;
    private javax.swing.JMenuItem ListarTelefonosMenu;
    private javax.swing.JMenuItem RegistrarUsuarioMenuItem;
    private javax.swing.JMenuItem SalirMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu gestionMenu;
    private javax.swing.JMenuItem gestionTelefonoMenu;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}