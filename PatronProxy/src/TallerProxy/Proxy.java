/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerProxy;

import patronProxyEjemplo.*;

/**
 *
 * @author JUan Camilo Posada
 */
class Proxy implements IMenu {

    Menu menu;
    User user;

    public Proxy(User user) {
        this.user = user;
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
}
