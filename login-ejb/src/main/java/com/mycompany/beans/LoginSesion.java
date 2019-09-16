/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beans;

import com.mycompany.dto.Usuario;
import com.mycompany.interfaces.ILoginSesion;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author lorena
 * @author alejandra
 */
@Stateful
public class LoginSesion implements ILoginSesion {

    private Usuario usuario1;
    private Usuario usuario2;
    private Usuario usuario3;
    private List<Usuario> listaUsuarios;

    public LoginSesion() {
        listaUsuarios = new ArrayList();
    }
    
    
    @Override
    public void agregarUsuarios(){
        usuario1 = new Usuario("Alejandra", "subdirector", "alele", "1070968347");
        usuario2 = new Usuario("Lorena", "Administrador", "lore", "12345678");
        usuario3 = new Usuario("Hugo", "Trabajador", "javier", "876543210");
        
        listaUsuarios.add(usuario1);
        listaUsuarios.add(usuario2);
        listaUsuarios.add(usuario3);
        System.out.println("Usuarios Agregados");
    }
    
    @Override
    public Usuario obtenerUsuario(String username, String password){
        for (Usuario usuario : listaUsuarios) {
            if(usuario.getUsername().equals(username) && usuario.getPassword().equals(password)){
                return usuario;
            }
        }
        return null;
    }
}
