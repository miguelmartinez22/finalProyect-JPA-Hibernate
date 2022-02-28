package javiermm.miguelmm.finalproyectjpahibernate.servicios;

import javiermm.miguelmm.finalproyectjpahibernate.Entidades.*;
import javiermm.miguelmm.finalproyectjpahibernate.repositorios.ArtistaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistaService {

    @Autowired
    ArtistaRepositorio artistaRepositorio;

    public Artista reducirSalario(Artista a, double reduccionPorcentual){
        Integer salarioViejo = a.getSalario();
        double reducción = salarioViejo * (reduccionPorcentual / 100);
        double salarioNuevo = salarioViejo - reducción;
        a.setSalario((int) salarioNuevo);
        return artistaRepositorio.save(a);
    }

    public List<Artista> findAll(){return artistaRepositorio.findAll();}

    public Artista insertar (Artista a){return artistaRepositorio.save(a);}

    public void borrar(Artista a){artistaRepositorio.delete(a);}

    public Artista editar(Artista a){return artistaRepositorio.save(a);}

    public Artista findByDni(String a){return artistaRepositorio.findByDni(a);}



}
