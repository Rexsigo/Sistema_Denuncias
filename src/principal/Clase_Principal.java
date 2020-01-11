/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JInternalFrame;
import sistema_de_denuncias.InicioSesion;
import sistema_de_denuncias.frmPrincipal;

/**
 *
 * @author osiri
 */
public class Clase_Principal extends JInternalFrame {
    
    public static void main(String args[]) {
        new frmPrincipal().setVisible(true);
    }
}
