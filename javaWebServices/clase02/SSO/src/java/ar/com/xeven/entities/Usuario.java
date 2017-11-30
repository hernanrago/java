/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.xeven.entities;

import java.io.Serializable;

/**
 *
 * @author educacionit
 */

//Single Sign-On
//maneja estados, no comportamiento

public class Usuario implements Serializable{ //POJO
    private int id;
    private String nombre;
    private String password;
    private String mail;
    private String token;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String password, String mail) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.mail = mail;
    }

    public Usuario(String token) {
        if (1==2) {
            this.token = token;
        }
        else
            this.id=0;
        
    }

    public Usuario(String mail, String password) {
        this.password = password;
        this.mail = mail;
        
        //simula conexión con DB
        this.nombre=mail.substring(0, mail.indexOf("@"));
        this.id=01;
        this.token="asd123";
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
