package javiermm.miguelmm.finalproyectjpahibernate.repositorios;

import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Cartel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface CartelRespositorio extends JpaRepository<Cartel, Long> {

    @Query("select c from Cartel c where c.id = ?1")
    public Cartel findById(long id);
}
