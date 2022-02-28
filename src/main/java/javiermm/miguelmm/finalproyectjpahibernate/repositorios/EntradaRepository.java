package javiermm.miguelmm.finalproyectjpahibernate.repositorios;

import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Cliente;
import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Entrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EntradaRepository extends JpaRepository<Entrada, Long> {

    public List<Entrada> findByCliente(Cliente cliente);

    @Query("select e.id from Entrada e")
    public List<Long> obtenerIds();

    @Query("select e from Entrada e where e.cliente.dni = ?1")
    public List<Entrada> findByClienteDni(String clienteDni);

    @Query("select count(e) from Entrada e")
    public int findNumEntradas();
}
