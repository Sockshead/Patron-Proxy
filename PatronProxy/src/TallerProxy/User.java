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
public class User {
    enum Tipo {ADMIN, CONDUCTOR, PASAJERO};
    Tipo pTipo;
    String userName;
    String password;
    
    public User(String pUserName, String pPassword, Tipo pTipo){
        this.userName = pUserName;
        this.password = pPassword;
        this.pTipo = pTipo;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
    
    public Tipo getTipo(){
        return pTipo;
    }
}
