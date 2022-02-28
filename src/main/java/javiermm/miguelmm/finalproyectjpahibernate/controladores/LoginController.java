package javiermm.miguelmm.finalproyectjpahibernate.controladores;

import javiermm.miguelmm.finalproyectjpahibernate.Entidades.*;
import javiermm.miguelmm.finalproyectjpahibernate.servicios.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Slf4j
@Controller
public class LoginController {

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    ArtistaService artistaService;

    @Autowired
    CartelService cartelService;

    @Autowired
    ClienteService clienteService;

    @Autowired
    CamerinoService camerinoService;

    @Autowired
    ManagerService managerService;

    @Autowired
    PatrocinadorService patrocinadorService;

    @GetMapping("/login")
    public String logearse(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "app/login";
    }

    @RequestMapping(value ="/login/submit", method = RequestMethod.POST)
    public String logearseSubmit(@ModelAttribute Usuario usuario, Model model) {

        String nombre = usuario.getUsuario(); // guardamos el usuario en una variable
        String passwd = usuario.getContrasena(); // guardamos la contraseña en una variable

        List<Usuario> usuarios = usuarioService.findByUsuario(nombre);
        Usuario usuario1 = usuarios.get(0); // buscamos el usuario en la bd a partir de los datos rellenados por el formulario

        if (usuario1 == null){ // si el usuario no se encuentra en la base de datos, se le conduce al login
            return "app/login";
        } else { // si el usuario está en la bd
            if (nombre.equals(usuario1.getUsuario()) && passwd.equals(usuario1.getContrasena())){ // si es otro usuario, se le conduce a ver sus datos de entrada

                if (usuario1.getTipo().equals("Administrador")) {

                    /*Crea cartera de administrador*/
                    List<Cliente> clientes = clienteService.findAll();
                    int cartera = 0;
                    for (int i = 0; i < clientes.size(); i++) {

                        Cliente cliente = clientes.get(i);
                        cartera += cliente.getPrecio();
                    }

                    model.addAttribute("cartera", cartera);

                    model.addAttribute("escenario", new Escenario());
                    model.addAttribute("clubFans", new ClubFans());
                    List<Cartel> carteles = cartelService.findAll();
                    model.addAttribute("carteles", carteles);
                    model.addAttribute("cartel", new Cartel());
                    List<Patrocinador> patrocinadors = patrocinadorService.findAll();
                    model.addAttribute("patrocinadors", patrocinadors);
                    model.addAttribute("patrocinador", new Patrocinador());
                    List<Artista> artistas = artistaService.findAll();
                    model.addAttribute("artistas", artistas);
                    model.addAttribute("artista", new Artista());
                    List<Manager> managers = managerService.findAll();
                    model.addAttribute("managers", managers);
                    model.addAttribute("manager", new Manager());
                    List<Camerino> camerinos = camerinoService.findAll();
                    model.addAttribute("camerinos", camerinos);
                    model.addAttribute("camerino", new Camerino());

                    return "admin/index";
                } else {
                    List<Cliente> clientes = clienteService.findByUsuario(nombre);
                    Cliente cliente = clientes.get(0);
                    model.addAttribute("cliente", cliente);
                    return "app/datos";
                }

            } else { // si el usuario y la contraseña no coinciden, se le conduce al login
                return "app/login";
            }
        }
    }

}
