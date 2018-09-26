/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerProxy;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JUan Camilo Posada
 */
class Proxy implements IMenu {
    
    
    private static Proxy instanciaUnica = null;
    private ArrayList<User> usuarios;
    Menu menu;
    User user;

    public Proxy() {
        usuarios = new ArrayList();
    }
    public static Proxy rConstructora(){
        if(instanciaUnica==null){
            instanciaUnica=new Proxy();
        }
        return instanciaUnica;
    }
    public void performOperations() {
        if (user.getTipo().equals(User.Tipo.ADMIN)) {
            menu = new Menu();
            menu.menuAdmin();
        } else if (user.getTipo().equals(User.Tipo.CONDUCTOR)) {
            menu = new Menu();
            menu.menuConductor();
        } else if (user.getTipo().equals(User.Tipo.PASAJERO)) {
            menu = new Menu();
            menu.menuPasajero();
        } else {
            System.out.println("You don't have access to this folder");
        }
    }

    public void validarUs(String usuario, String password) {
        User us;
        boolean encontrado = false;

        for (int i = 0; i < usuarios.size(); i++) {
            us = usuarios.get(i);
            if (us.getUserName().equalsIgnoreCase(usuario) && us.getPassword().equalsIgnoreCase(password)) {
                encontrado = true;
                user = us;
                this.performOperations();
            }
        }
        if (!encontrado) {
            System.out.println("Usuario no encontrado");
        }
    }
    
    public boolean addUs(User us){
        boolean agregado = false;
        if(usuarios.add(us)){
            agregado = true;
        } else {
            System.out.println("Error agregando usuario");
        }
        return agregado;
    }

    public ArrayList<User> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<User> usuarios) {
        this.usuarios = usuarios;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
