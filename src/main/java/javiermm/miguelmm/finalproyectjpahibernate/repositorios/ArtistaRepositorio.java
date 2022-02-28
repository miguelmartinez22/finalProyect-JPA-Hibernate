package javiermm.miguelmm.finalproyectjpahibernate.repositorios;

import javiermm.miguelmm.finalproyectjpahibernate.Entidades.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArtistaRepositorio extends JpaRepository<Artista, Long> {

    @Query("select a from Artista a where a.dni = ?1")
    public Artista findByDni(String a);

}
