package javiermm.miguelmm.finalproyectjpahibernate.servicios;


import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Camerino;
import javiermm.miguelmm.finalproyectjpahibernate.repositorios.CamerinoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CamerinoService {

    @Autowired
    CamerinoRepositorio camerinoRepositorio;

    public Camerino aumentarGama(Camerino c){
        if (c.getGama().equals("Baja")){
            c.setGama("Media");
        } else if (c.getGama().equals("Media")){
            c.setGama("Alta");
        }
        return camerinoRepositorio.save(c);
    }

    public List<Camerino> findAll(){return camerinoRepositorio.findAll();}

    public Camerino insertar(Camerino c){
        return camerinoRepositorio.save(c);
    }

    public void borrar(Camerino c){camerinoRepositorio.delete(c);}

    public List<Camerino> findById(long id){return camerinoRepositorio.findById(id);}

}
