package javiermm.miguelmm.finalproyectjpahibernate.repositorios;

import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Escenario;
import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Patrocinador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PatrocinadorRepository extends JpaRepository<Patrocinador, Long> {

    List<Patrocinador> findByEscenarios (Escenario escenario);

    @Query("select p from Patrocinador p where p.id = ?1")
    Optional<Patrocinador> findById (Long patrocinadorId);

}
