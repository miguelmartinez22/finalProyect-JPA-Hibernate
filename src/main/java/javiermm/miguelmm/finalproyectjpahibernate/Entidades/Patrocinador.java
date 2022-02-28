package javiermm.miguelmm.finalproyectjpahibernate.Entidades;

import lombok.Data;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Table(name = "patrocinador")
@Entity
@Data
public class Patrocinador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String telefono;

    @Column(nullable = false)
    private Integer recaudacion;

    @ManyToMany
    @JoinTable(name = "escenario_patrocinadores",
            joinColumns = @JoinColumn(name = "patrocinador_id"),
            inverseJoinColumns = @JoinColumn(name = "escenario_id"))
    private Set<Escenario> escenarios = new LinkedHashSet<>();
}
