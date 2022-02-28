package javiermm.miguelmm.finalproyectjpahibernate.servicios;

import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Cartel;
import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Escenario;
import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Patrocinador;
import javiermm.miguelmm.finalproyectjpahibernate.repositorios.EscenarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EscenarioService {

    @Autowired
    EscenarioRepository escenarioRepository;

    public Escenario insertar(Escenario e){
        return escenarioRepository.save(e);
    }

    public void borrar(Escenario e){escenarioRepository.delete(e);}

}
