package javiermm.miguelmm.finalproyectjpahibernate.servicios;

import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Cliente;
import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Entrada;
import javiermm.miguelmm.finalproyectjpahibernate.repositorios.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepositorio clienteRepositorio;

    @Transactional
    public Cliente insertar(Cliente c){
        Cliente nuevoCliente = null;
    try {
        nuevoCliente = clienteRepositorio.save(c);
    }catch (Exception e){
        throw new RuntimeException();
    }
        return nuevoCliente;
    }

    public void borrar (Cliente c, Entrada e){
        clienteRepositorio.delete(c);
        e.setCliente(null);
    }

    public List<Cliente> findAll(){return clienteRepositorio.findAll();}

    public Optional<Cliente> findByOptionalId(long id){return clienteRepositorio.findById(id);}

    public List<Cliente> findByUsuario(String usuario){return clienteRepositorio.findByUsuario(usuario);}

    public int findNumClientes(){return clienteRepositorio.findNumClientes();}

}
