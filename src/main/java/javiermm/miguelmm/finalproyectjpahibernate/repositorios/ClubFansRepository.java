package javiermm.miguelmm.finalproyectjpahibernate.repositorios;

import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Artista;
import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Cliente;
import javiermm.miguelmm.finalproyectjpahibernate.Entidades.ClubFans;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClubFansRepository extends JpaRepository<ClubFans, Long> {

    List<ClubFans> findByClientes (Cliente cliente);

    List<ClubFans> findByArtista (Artista artista);

}
