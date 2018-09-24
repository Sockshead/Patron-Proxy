/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerProxy;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author JUan Camilo Posada
 */
public class TallerProxy {

    private ArrayList<User> usuarios;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new TallerProxy();

    }

    public TallerProxy() {
        this.usuarios = new ArrayList();
        this.menu();
    }

    private void menu() {
        char opcion;
        do {
            String x = JOptionPane.showInputDialog("=======OPCIONES=========\n"
                    + "1. Crear Usuario \n"
                    + "2. Iniciar sesion \n"
                    + "0. SALIR "
            );
            opcion = x.charAt(0);
            switch (opcion) {
                case '1':
                    this.CrearU();
                    break;
                case '2':
                    if (!this.usuarios.isEmpty()) {
                        this.rFolder();
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe ningun usuario en el sistema", "Error", 0);
                    }
                    break;
                case '0':
                    JOptionPane.showMessageDialog(null, "CHAO PESCAO..!", "Despedida", 2);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ESE CASO NO EXISTE..!", "Error", 0);
                    break;
            }
        } while (opcion != '0');
    }

    private void rFolder() {
        String usuario = JOptionPane.showInputDialog("Ingrese su numero de cedula");
        String password = JOptionPane.showInputDialog("Ingrese su contraseña");
        User us;
        boolean encontrado = false;

        for (int i = 0; i < usuarios.size(); i++) {
            us = usuarios.get(i);
            if (us.getUserName().equalsIgnoreCase(usuario) && us.getPassword().equalsIgnoreCase(password)) {
                encontrado = true;
                Proxy proxy = new Proxy(us);
                proxy.performOperations();
            }
        }
        if (!encontrado) {
            System.out.println("Usuario no encontrado");
        }
    }

    private void CrearU() {
        String usuario = JOptionPane.showInputDialog("Ingrese su numero de cedula");
        String password = JOptionPane.showInputDialog("Ingrese su contraseña");

        char opcion;
        do {
            String x = JOptionPane.showInputDialog("=======SELECCIONE EL TIPO DE USUARIO=========\n"
                    + "1. Administrador \n"
                    + "2. Conductor \n"
                    + "3. Pasajero \n"
                    + "0. SALIR"
            );
            opcion = x.charAt(0);
            switch (opcion) {
                case '1':
                    User admin = new User(usuario, password, User.Tipo.ADMIN);
                    usuarios.add(admin);
                    System.out.println("Administrador creado exitosamente");
                    this.menu();
                    break;
                case '2':
                    User conductor = new User(usuario, password, User.Tipo.CONDUCTOR);
                    usuarios.add(conductor);
                    System.out.println("Conductor creado exitosamente");
                    this.menu();
                    break;
                case '3':
                    User pasajero = new User(usuario, password, User.Tipo.PASAJERO);
                    usuarios.add(pasajero);
                    System.out.println("Pasajero creado exitosamente");
                    this.menu();
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
