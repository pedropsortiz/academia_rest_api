package br.ufsm.csi.poow2.academia_java.Dao;

import br.ufsm.csi.poow2.academia_java.Model.Usuario;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UsuarioDao {

    public Usuario getUsuario(String login){
        if (login.equals("Pedro")){
            return new Usuario("pedro.ortiz@gmail.com", new BCryptPasswordEncoder().encode("123"), "user");
        } else if (login.equals("Jorge")) {
            return new Usuario("jorge@gmail.com", new BCryptPasswordEncoder().encode("123"), "user");
        } else {
            return null;
        }
    }

}
