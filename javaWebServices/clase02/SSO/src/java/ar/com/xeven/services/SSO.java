/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.xeven.services;

import ar.com.xeven.entities.Usuario;
import javax.jws.WebService;

/**
 *
 * @author educacionit
 */

@WebService
public class SSO {
    
    public Usuario login(String mail,String password){

        Usuario usuario = new Usuario(mail,password);
        return usuario;        
    }
    
    public Usuario validateSession(String token){
        return new Usuario(token);
    }
    
    
    
}
