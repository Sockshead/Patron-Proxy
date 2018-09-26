/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerProxy;

import javax.swing.JOptionPane;

/**
 *
 * @author JUan Camilo Posada
 */
public class Menu {
    
    public void menuAdmin(){
        char opcion;
        do {
            String x = JOptionPane.showInputDialog("=======MENU ADMINISTRADOR=========\n"
                    + "1. Ingresar multa \n"
                    + "2. Cancelar cuenta \n"
                    + "0. SALIR "
            );
            opcion = x.charAt(0);
            switch (opcion) {
                case '1':
                    break;
                case '2':
                    break;
                case '0':
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ESE CASO NO EXISTE..!", "Error", 0);
                    break;
            }
        } while (opcion != '0');
    }
    
    public void menuConductor(){
        char opcion;
        do {
            String x = JOptionPane.showInputDialog("=======MENU CONDUCTOR=========\n"
                    + "1. Crear ruta \n"
                    + "2. Historial viajes \n"
                    + "0. SALIR "
            );
            opcion = x.charAt(0);
            switch (opcion) {
                case '1':
                    break;
                case '2':
                    break;
                case '0':
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ESE CASO NO EXISTE..!", "Error", 0);
                    break;
            }
        } while (opcion != '0');
    }
    
    public void menuPasajero(){
        char opcion;
        do {
            String x = JOptionPane.showInputDialog("=======MENU PASAJERO=========\n"
                    + "1. Buscar ruta \n"
                    + "2. Historial viajes \n"
                    + "0. SALIR "
            );
            opcion = x.charAt(0);
            switch (opcion) {
                case '1':
                    break;
                case '2':
                    break;
                case '0':
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ESE CASO NO EXISTE..!", "Error", 0);
                    break;
            }
        } while (opcion != '0');
    }
}
