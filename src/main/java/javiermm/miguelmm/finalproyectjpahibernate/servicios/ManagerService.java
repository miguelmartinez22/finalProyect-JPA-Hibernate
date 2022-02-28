package javiermm.miguelmm.finalproyectjpahibernate.servicios;

import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Artista;
import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Manager;
import javiermm.miguelmm.finalproyectjpahibernate.repositorios.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {

    @Autowired
    ManagerRepository managerRepository;

    public List<Manager> findAll() {return managerRepository.findAll();}

    public Manager insertar(Manager m){
        return managerRepository.save(m);
    }

    public void borrar(Manager m){managerRepository.delete(m);}

    public Manager findByDni(String managerDni){return managerRepository.findByDni(managerDni);}

}
