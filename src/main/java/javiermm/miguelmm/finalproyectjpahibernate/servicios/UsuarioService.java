package javiermm.miguelmm.finalproyectjpahibernate.servicios;

import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Artista;
import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Usuario;
import javiermm.miguelmm.finalproyectjpahibernate.repositorios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario insertar(Usuario u){
        return usuarioRepository.save(u);
    }

    public void borrar(Usuario u){usuarioRepository.delete(u);}

    public List<Usuario> findByUsuario(String usuario){return usuarioRepository.findByUsuario(usuario);}

}
