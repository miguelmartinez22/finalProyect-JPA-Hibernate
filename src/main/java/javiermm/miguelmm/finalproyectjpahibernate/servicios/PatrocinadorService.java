package javiermm.miguelmm.finalproyectjpahibernate.servicios;

import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Escenario;
import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Patrocinador;
import javiermm.miguelmm.finalproyectjpahibernate.repositorios.PatrocinadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatrocinadorService {

    @Autowired
    PatrocinadorRepository patrocinadorRepository;

    public List<Patrocinador> findAll(){return patrocinadorRepository.findAll();};

    public Patrocinador insertar(Patrocinador p){
        return patrocinadorRepository.save(p);
    }

    public void borrar(Patrocinador p){patrocinadorRepository.delete(p);}

    public Optional<Patrocinador> findByOptionalId(long id) {return patrocinadorRepository.findById(id);}
}
