package javiermm.miguelmm.finalproyectjpahibernate.repositorios;

import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Cartel;
import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Escenario;
import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Patrocinador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EscenarioRepository extends JpaRepository<Escenario, Long> {

    List<Escenario> findByCarteles (Cartel cartel);

    List<Escenario> findByPatrocinadores (Patrocinador patrocinador);


}
