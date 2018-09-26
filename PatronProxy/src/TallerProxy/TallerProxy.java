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
public class TallerProxy {

    Proxy prox;
    String usuario;
    String password;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new TallerProxy();

    }

    public TallerProxy() {
        prox=new Proxy();
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
                    usuario = JOptionPane.showInputDialog("Ingrese su numero de cedula");
                    password = JOptionPane.showInputDialog("Ingrese su contraseña");
                    this.CrearU();
                    break;
                case '2':
                    if (!prox.getUsuarios().isEmpty()) {
                        usuario = JOptionPane.showInputDialog("Ingrese su numero de cedula");
                        password = JOptionPane.showInputDialog("Ingrese su contraseña");
                        prox.validarUs(usuario, password);
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe ningun usuario en el sistema", "Error", 0);
                    }
                    break;
                case '0':
                    JOptionPane.showMessageDialog(null, "CHAO PESCAO..!", "Despedida", 2);
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ESE CASO NO EXISTE..!", "Error", 0);
                    break;
            }
        } while (opcion != '0');
    }

    private void CrearU() {
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
                    if (prox.addUs(admin)) {
                        System.out.println("Administrador creado exitosamente");
                        this.menu();
                    }
                    break;
                case '2':
                    User conductor = new User(usuario, password, User.Tipo.CONDUCTOR);
                    if (prox.addUs(conductor)) {
                        System.out.println("Conductor creado exitosamente");
                        this.menu();
                    }
                    break;
                case '3':
                    User pasajero = new User(usuario, password, User.Tipo.PASAJERO);
                    if (prox.addUs(pasajero)) {
                        System.out.println("Pasajero creado exitosamente");
                        this.menu();
                    }
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
