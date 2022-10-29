package br.ufsm.csi.poow2.academia_java.Security;

import br.ufsm.csi.poow2.academia_java.Dao.UsuarioDao;
import br.ufsm.csi.poow2.academia_java.Model.Usuario;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceCustomizado implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = new UsuarioDao().getUsuario(username);
        System.out.println("*******");
        if (usuario == null){
            throw new UsernameNotFoundException("Usuário ou senha inválidos");
        }else{
            UserDetails user = User.withUsername(usuario.getLogin())
                    .password(usuario.getSenha())
                    .authorities(usuario.getPermissao()).build();
            return user;
        }
    }
}
