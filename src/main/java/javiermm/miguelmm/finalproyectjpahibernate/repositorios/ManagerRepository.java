package javiermm.miguelmm.finalproyectjpahibernate.repositorios;

import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Artista;
import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ManagerRepository extends JpaRepository<Manager, Long> {

    List<Manager> findByArtista(Artista artista);

    @Query("select m from Manager m where m.dni = ?1")
    public Manager findByDni(String managerDni);
}
