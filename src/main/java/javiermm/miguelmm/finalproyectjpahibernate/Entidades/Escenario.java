package javiermm.miguelmm.finalproyectjpahibernate.Entidades;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Table(name = "escenario")
@Entity
@Data
public class Escenario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String hora;

    @Column(nullable = false)
    private Integer capacidad;

    @OneToMany(mappedBy="escenario", orphanRemoval = true)
    private Set<Cartel> carteles = new HashSet<Cartel>();

    @ManyToMany
    @JoinTable(name = "escenario_patrocinadores",
            joinColumns = @JoinColumn(name = "escenario_id"),
            inverseJoinColumns = @JoinColumn(name = "patrocinador_id"))
    private Set<Patrocinador> patrocinadores = new LinkedHashSet<>();

}
