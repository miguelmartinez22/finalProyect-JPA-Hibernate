package javiermm.miguelmm.finalproyectjpahibernate.repositorios;

import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Cliente;
import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Entrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ClienteRepositorio extends JpaRepository<Cliente, String> {

    @Query("select count(c) from Cliente c")
    public int findNumClientes();

    @Query("select c from Cliente c where c.usuario = ?1")
    public List<Cliente> findByUsuario(String usuario);

    Optional<Cliente> findById(long id);
}
