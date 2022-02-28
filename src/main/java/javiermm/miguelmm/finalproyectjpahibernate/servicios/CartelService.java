package javiermm.miguelmm.finalproyectjpahibernate.servicios;

import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Artista;
import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Cartel;
import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Escenario;
import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Festival;
import javiermm.miguelmm.finalproyectjpahibernate.repositorios.CartelRespositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CartelService {

    @Autowired
    CartelRespositorio cartelRespositorio;

    public Cartel aplazarCartel(Cartel c, Date nuevaFecha){
        c.setFecha(nuevaFecha);
        return cartelRespositorio.save(c);
    }

    public Cartel insertar(Cartel c){return cartelRespositorio.save(c);}

    public void borrar(Cartel c){cartelRespositorio.delete(c);}

    public Cartel findById(long id){return cartelRespositorio.findById(id);}

    public List<Cartel> findAll(){return cartelRespositorio.findAll();}
}
