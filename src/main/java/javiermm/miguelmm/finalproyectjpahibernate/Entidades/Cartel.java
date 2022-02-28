package javiermm.miguelmm.finalproyectjpahibernate.Entidades;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Table(name = "cartel")
@Entity
@Data
public class Cartel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String nombre;

    @Column(name="genero_musical", nullable = false)
    private String generoMusical;

    @Column(nullable = false)
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "festival_id", referencedColumnName = "id")
    private Festival festival;

    @ManyToOne
    @JoinColumn(name = "escenario_id", referencedColumnName = "id")
    private Escenario escenario;

    @OneToMany(mappedBy = "cartel", orphanRemoval = true)
    private Set<Artista> artistas = new LinkedHashSet<>();
}
