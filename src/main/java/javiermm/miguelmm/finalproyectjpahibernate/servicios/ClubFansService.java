package javiermm.miguelmm.finalproyectjpahibernate.servicios;

import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Artista;
import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Cliente;
import javiermm.miguelmm.finalproyectjpahibernate.Entidades.ClubFans;
import javiermm.miguelmm.finalproyectjpahibernate.repositorios.ClubFansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class ClubFansService {

    @Autowired
    ClubFansRepository clubFansRepository;

    public ClubFans asignarCliente(Cliente c, ClubFans clubFans){
        clubFans.setClientes((Set<Cliente>) c);
        return clubFans;
    }

    public ClubFans insertar(ClubFans c){

        return clubFansRepository.save(c);
    }

    public void borrar(ClubFans c){clubFansRepository.delete(c);}

}
