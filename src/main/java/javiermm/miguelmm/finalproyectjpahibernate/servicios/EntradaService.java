package javiermm.miguelmm.finalproyectjpahibernate.servicios;

import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Cliente;
import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Entrada;
import javiermm.miguelmm.finalproyectjpahibernate.repositorios.EntradaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntradaService {

    @Autowired
    EntradaRepository entradaRepository;

    public Entrada insertar(Entrada e){
        return entradaRepository.save(e);
    }

    public void borrar(Entrada e){
        entradaRepository.delete(e);
    }

}
