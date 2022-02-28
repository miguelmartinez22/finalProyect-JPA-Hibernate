package javiermm.miguelmm.finalproyectjpahibernate.servicios;

import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Cartel;
import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Festival;
import javiermm.miguelmm.finalproyectjpahibernate.repositorios.FestivalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FestivalService {

    @Autowired
    FestivalRepository festivalRepository;

    public Festival insertar(Festival f){
        return festivalRepository.save(f);
    }

    public void borrar(Festival f){festivalRepository.delete(f);}


    public Optional<Festival> findById (Long FestivalId){return festivalRepository.findById(FestivalId);}
}
