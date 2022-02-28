package javiermm.miguelmm.finalproyectjpahibernate.controladores;

import javiermm.miguelmm.finalproyectjpahibernate.Entidades.*;
import javiermm.miguelmm.finalproyectjpahibernate.servicios.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Slf4j
@Controller
public class AdminController {

    @Autowired
    ArtistaService artistaService;

    @Autowired
    CamerinoService camerinoService;

    @Autowired
    ClubFansService clubFansService;

    @Autowired
    EscenarioService escenarioService;

    @Autowired
    ManagerService managerService;

    @Autowired
    CartelService cartelService;

    @Autowired
    PatrocinadorService patrocinadorService;


    @RequestMapping(value ="/newArtista/submit", method = RequestMethod.POST)
    public String nuevoArtistaSubmit(@ModelAttribute Artista artista) {
        try {
            //asignamos un mánager a partir del dni de manager rellenado en el formulario
            artista.setManager(managerService.findByDni(artista.getManager().getDni()));

            artistaService.insertar(artista);

            return "index";
        } catch (Exception ex){
            return "error";
        }
    }

    @RequestMapping(value ="/newCamerino/submit", method = RequestMethod.POST)
    public String nuevoCamerinoSubmit(@ModelAttribute Camerino camerino) {
        try {
            camerinoService.insertar(camerino);

            return "index";
        } catch (Exception ex){
            return "error";
        }
    }

    @RequestMapping(value ="/newCartel/submit", method = RequestMethod.POST)
    public String nuevoCartelSubmit(@ModelAttribute Cartel cartel) {
        try {
            // configuramos la fecha del cartel antes de insertarlo
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = cartel.getFestival().getNombre();
            cartel.setFestival(null);
            Date date = format.parse(fecha);
            cartel.setFecha(date);
            cartelService.insertar(cartel);

            return "index";
        } catch (Exception ex){
            return "error";
        }
    }

    @RequestMapping(value ="/newClub/submit", method = RequestMethod.POST)
    public String nuevoClubSubmit(@ModelAttribute ClubFans clubFans) {
        try {
            // configuramos la fecha del club de fans y le asignamos un artista a través de los datos del formulario. Después lo insertamos
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = clubFans.getArtista().getNombre();
            Date date = format.parse(fecha);
            clubFans.setArtista(artistaService.findByDni(clubFans.getArtista().getDni()));
            clubFans.setFechaCreacion(date);

            clubFansService.insertar(clubFans);

            return "index";
        } catch (Exception ex){
            return "error";
        }
    }

    @RequestMapping(value ="/newEscenario/submit", method = RequestMethod.POST)
    public String nuevoEscenarioSubmit(@ModelAttribute Escenario escenario) {
        try {
            escenarioService.insertar(escenario);

            return "index";
        } catch (Exception ex){
            return "error";
        }
    }

    @RequestMapping(value ="/newManager/submit", method = RequestMethod.POST)
    public String nuevoManagerSubmit(@ModelAttribute Manager manager) {
        try {
            managerService.insertar(manager);

            return "index";
        } catch (Exception ex){
            return "error";
        }
    }

    @RequestMapping(value ="/newPatrocinador/submit", method = RequestMethod.POST)
    public String nuevoPatrocinadorSubmit(@ModelAttribute Patrocinador patrocinador) {
        try {
            patrocinadorService.insertar(patrocinador);

            return "index";
        } catch (Exception ex){
            return "error";
        }
    }

    @RequestMapping(value ="/listadoCamerino/submit", method = RequestMethod.POST)
    public String listadoCamerinoSubmit(@RequestParam(value = "camerinId") long id) {
        try {
            // se ejecutará si se desea aumentar la gama del camerino
            List<Camerino> camerinos = camerinoService.findById(id);
            Camerino camerino = camerinos.get(0);
            camerinoService.aumentarGama(camerino);

            return "index";
        } catch (Exception ex){
            return "error";
        }
    }

    @RequestMapping(value ="/listadoArtista/submit", method = RequestMethod.POST)
    public String listadoArtistaSubmit(@RequestParam(value = "artistDni") String dni, @RequestParam(value = "artistSalario") double salario) {
        try {
            // se ejecutará si se desea reducir el salario de un artista
            Artista artista = artistaService.findByDni(dni);
            artistaService.reducirSalario(artista, salario);

            return "index";
        } catch (Exception ex){
            return "error";
        }
    }

    @RequestMapping(value ="/listadoCartel/submit", method = RequestMethod.POST)
    public String listadoCartelSubmit(@RequestParam(value = "cartelId") long id, @RequestParam(value = "cartFecha") String fecha) {
        try {
            // se ejecutará si se desea aplazar la fecha de un cartel
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Cartel cartel = cartelService.findById(id);
            Date date = format.parse(fecha);
            cartelService.aplazarCartel(cartel, date);

            return "index";
        } catch (Exception ex){
            return "error";
        }
    }
}
