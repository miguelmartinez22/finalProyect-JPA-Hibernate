package javiermm.miguelmm.finalproyectjpahibernate.repositorios;

import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Cartel;
import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Festival;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FestivalRepository extends JpaRepository<Festival, Long> {

    Optional<Festival> findById (Long FestivalId);

    List<Festival> findByCarteles (Cartel cartel);

}
