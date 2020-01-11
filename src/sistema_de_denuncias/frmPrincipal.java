/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_de_denuncias;
import javax.swing.SwingUtilities.*;
/**
 *
 * @author osiri
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        InicioSesion nueva_sesion = new InicioSesion();
        desktopPane.add(nueva_sesion);
        nueva_sesion.show();
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
        jToolBar1 = new javax.swing.JToolBar();
        menuBar = new javax.swing.JMenuBar();
        MenuDenuncias = new javax.swing.JMenu();
        buscarEditarDenunciaMenuItem = new javax.swing.JMenuItem();
        denunciasRealizadasMenuItem = new javax.swing.JMenuItem();
        nuevaDenunciaMenuItem = new javax.swing.JMenuItem();
        resultadosDeDenuncias = new javax.swing.JMenuItem();
        editarValoresMenuItem = new javax.swing.JMenuItem();
        MenuCuentaUsuario = new javax.swing.JMenu();
        administrarUsuariosMenuItem = new javax.swing.JMenuItem();
        administrarCuentaMenuItem = new javax.swing.JMenuItem();
        MenuSistema = new javax.swing.JMenu();
        cerrarSesionMenuItem = new javax.swing.JMenuItem();
        cerrarMenuItem = new javax.swing.JMenuItem();
        cerrarTodoMenuItem = new javax.swing.JMenuItem();
        MenuIniciarSesion = new javax.swing.JMenu();
        MenuAcercaDe = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        menuBar.setBackground(new java.awt.Color(0, 153, 204));
        menuBar.setEnabled(false);

        MenuDenuncias.setBackground(new java.awt.Color(0, 153, 204));
        MenuDenuncias.setText("Denuncias");
        MenuDenuncias.setEnabled(false);
        MenuDenuncias.setFocusable(false);
        MenuDenuncias.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        MenuDenuncias.setMargin(new java.awt.Insets(5, 5, 10, 10));

        buscarEditarDenunciaMenuItem.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        buscarEditarDenunciaMenuItem.setText("Buscar/Editar Denuncia");
        buscarEditarDenunciaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarEditarDenuncia_Click(evt);
            }
        });
        MenuDenuncias.add(buscarEditarDenunciaMenuItem);
        buscarEditarDenunciaMenuItem.getAccessibleContext().setAccessibleName("buscarEditarDenunciaMenuItem");

        denunciasRealizadasMenuItem.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        denunciasRealizadasMenuItem.setText("Denuncias Realizadas");
        denunciasRealizadasMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_denuncias_clic(evt);
            }
        });
        MenuDenuncias.add(denunciasRealizadasMenuItem);
        denunciasRealizadasMenuItem.getAccessibleContext().setAccessibleName("denunciaRealizadaMenuItem");

        nuevaDenunciaMenuItem.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        nuevaDenunciaMenuItem.setText("Nueva Denuncia");
        nuevaDenunciaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaDenunciaMenuItem_Click(evt);
            }
        });
        MenuDenuncias.add(nuevaDenunciaMenuItem);

        resultadosDeDenuncias.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        resultadosDeDenuncias.setText("Resultados de Denuncias");
        resultadosDeDenuncias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_resultados_denuncias_clic(evt);
            }
        });
        MenuDenuncias.add(resultadosDeDenuncias);

        editarValoresMenuItem.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        editarValoresMenuItem.setText("Editar Valores");
        editarValoresMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarValoresMenuItem_Click(evt);
            }
        });
        MenuDenuncias.add(editarValoresMenuItem);

        menuBar.add(MenuDenuncias);

        MenuCuentaUsuario.setBackground(new java.awt.Color(0, 153, 204));
        MenuCuentaUsuario.setText("Cuenta de Usuario");
        MenuCuentaUsuario.setEnabled(false);
        MenuCuentaUsuario.setFocusable(false);
        MenuCuentaUsuario.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        MenuCuentaUsuario.setMargin(new java.awt.Insets(5, 5, 10, 10));

        administrarUsuariosMenuItem.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        administrarUsuariosMenuItem.setText("Administrar Usuarios");
        MenuCuentaUsuario.add(administrarUsuariosMenuItem);
        administrarUsuariosMenuItem.getAccessibleContext().setAccessibleName("administrarUsuariosMenuItem");
        administrarUsuariosMenuItem.getAccessibleContext().setAccessibleDescription("");

        administrarCuentaMenuItem.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        administrarCuentaMenuItem.setText("Administrar Cuenta");
        administrarCuentaMenuItem.setToolTipText("");
        MenuCuentaUsuario.add(administrarCuentaMenuItem);
        administrarCuentaMenuItem.getAccessibleContext().setAccessibleName("administrarCuentaMenuItem");

        menuBar.add(MenuCuentaUsuario);

        MenuSistema.setBackground(new java.awt.Color(0, 153, 204));
        MenuSistema.setText("Sistema");
        MenuSistema.setEnabled(false);
        MenuSistema.setFocusable(false);
        MenuSistema.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        MenuSistema.setMargin(new java.awt.Insets(5, 5, 10, 10));

        cerrarSesionMenuItem.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cerrarSesionMenuItem.setText("Cerrar Sesion");
        cerrarSesionMenuItem.setToolTipText("");
        cerrarSesionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionMenuItem_Click(evt);
            }
        });
        MenuSistema.add(cerrarSesionMenuItem);
        cerrarSesionMenuItem.getAccessibleContext().setAccessibleName("cerrarSesionMenuItem");

        cerrarMenuItem.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cerrarMenuItem.setText("Cerrar");
        cerrarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_internal_frame_clic(evt);
            }
        });
        MenuSistema.add(cerrarMenuItem);
        cerrarMenuItem.getAccessibleContext().setAccessibleName("cerrarMenuItem");

        cerrarTodoMenuItem.setText("Cerrar Todo");
        cerrarTodoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarTodoMenuItem_Click(evt);
            }
        });
        MenuSistema.add(cerrarTodoMenuItem);
        cerrarTodoMenuItem.getAccessibleContext().setAccessibleName("cerrarTodoMenuItem");

        menuBar.add(MenuSistema);

        MenuIniciarSesion.setBackground(new java.awt.Color(0, 153, 204));
        MenuIniciarSesion.setText("Iniciar Sesion");
        MenuIniciarSesion.setFocusable(false);
        MenuIniciarSesion.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        MenuIniciarSesion.setMargin(new java.awt.Insets(5, 5, 10, 10));
        MenuIniciarSesion.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menuIniciarSesion_Click(evt);
            }
        });
        menuBar.add(MenuIniciarSesion);

        MenuAcercaDe.setBackground(new java.awt.Color(0, 153, 204));
        MenuAcercaDe.setText("Acerca de...");
        MenuAcercaDe.setFocusable(false);
        MenuAcercaDe.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        MenuAcercaDe.setMargin(new java.awt.Insets(5, 5, 10, 10));
        MenuAcercaDe.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                AcercaDeMenu_Click(evt);
            }
        });
        menuBar.add(MenuAcercaDe);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarEditarDenuncia_Click(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarEditarDenuncia_Click
        // TODO add your handling code here:
        Form_Denuncia buscar_editar_denuncia = new Form_Denuncia();
        desktopPane.add(buscar_editar_denuncia);
        buscar_editar_denuncia.show();
    }//GEN-LAST:event_buscarEditarDenuncia_Click

    private void cerrarSesionMenuItem_Click(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionMenuItem_Click
        // TODO add your handling code here:
        MenuCuentaUsuario.setEnabled(false);
        MenuDenuncias.setEnabled(false);
        MenuSistema.setEnabled(false);
    }//GEN-LAST:event_cerrarSesionMenuItem_Click

    private void cerrarTodoMenuItem_Click(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarTodoMenuItem_Click
        // TODO add your handling code here:
    }//GEN-LAST:event_cerrarTodoMenuItem_Click

    private void nuevaDenunciaMenuItem_Click(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaDenunciaMenuItem_Click
        // TODO add your handling code here:
        if(this.desktopPane.getComponentCount() == 0){
            Denuncia nueva_denuncia = new Denuncia();
            desktopPane.add(nueva_denuncia);
            nueva_denuncia.show();
        }
    }//GEN-LAST:event_nuevaDenunciaMenuItem_Click

    private void menuIniciarSesion_Click(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menuIniciarSesion_Click
        // TODO add your handling code here:
        if(this.desktopPane.getComponentCount() == 0){
            InicioSesion nueva_sesion = new InicioSesion();
            desktopPane.add(nueva_sesion);
            nueva_sesion.getParent().setEnabled(true);
            nueva_sesion.show();
        }
    }//GEN-LAST:event_menuIniciarSesion_Click

    private void AcercaDeMenu_Click(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_AcercaDeMenu_Click
        // TODO add your handling code here:
        if(this.desktopPane.getComponentCount() == 0){
            AcercaDe nuevo_acerca_de = new AcercaDe();
            desktopPane.add(nuevo_acerca_de);
            nuevo_acerca_de.show();
        }
    }//GEN-LAST:event_AcercaDeMenu_Click

    private void editarValoresMenuItem_Click(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarValoresMenuItem_Click
        // TODO add your handling code here:
        if(this.desktopPane.getComponentCount() == 0){
            Editar_Valores nuevo_editar = new Editar_Valores();
            desktopPane.add(nuevo_editar);
            nuevo_editar.show();
        }
    }//GEN-LAST:event_editarValoresMenuItem_Click

    private void abrir_denuncias_clic(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_denuncias_clic
        // TODO add your handling code here:
        if(this.desktopPane.getComponentCount() == 0){
            DenunciaRealizada nueva_denuncia_realizada = new DenunciaRealizada();
            desktopPane.add(nueva_denuncia_realizada);
            nueva_denuncia_realizada.show();
        }
    }//GEN-LAST:event_abrir_denuncias_clic

    private void abrir_resultados_denuncias_clic(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_resultados_denuncias_clic
        // TODO add your handling code here:
        if(this.desktopPane.getComponentCount() == 0){   
            ResultadoDenuncias nuevo_resultado = new ResultadoDenuncias();
            desktopPane.add(nuevo_resultado);
            nuevo_resultado.show();
        }
    }//GEN-LAST:event_abrir_resultados_denuncias_clic

    private void cerrar_internal_frame_clic(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_internal_frame_clic
        // TODO add your handling code here:
    }//GEN-LAST:event_cerrar_internal_frame_clic

    public void abrir_presunto_autor(){
        if(this.desktopPane.getComponentCount() == 0){
            frmDatosPresuntoAutor datos_autor = new frmDatosPresuntoAutor();
            desktopPane.add(datos_autor);
            datos_autor.show();  
        
        }       

    }
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuAcercaDe;
    public static javax.swing.JMenu MenuCuentaUsuario;
    public static javax.swing.JMenu MenuDenuncias;
    private javax.swing.JMenu MenuIniciarSesion;
    public static javax.swing.JMenu MenuSistema;
    private javax.swing.JMenuItem administrarCuentaMenuItem;
    private javax.swing.JMenuItem administrarUsuariosMenuItem;
    private javax.swing.JMenuItem buscarEditarDenunciaMenuItem;
    private javax.swing.JMenuItem cerrarMenuItem;
    private javax.swing.JMenuItem cerrarSesionMenuItem;
    private javax.swing.JMenuItem cerrarTodoMenuItem;
    private javax.swing.JMenuItem denunciasRealizadasMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem editarValoresMenuItem;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem nuevaDenunciaMenuItem;
    private javax.swing.JMenuItem resultadosDeDenuncias;
    // End of variables declaration//GEN-END:variables

}