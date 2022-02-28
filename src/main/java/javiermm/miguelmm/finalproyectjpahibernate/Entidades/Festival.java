package javiermm.miguelmm.finalproyectjpahibernate.Entidades;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Table(name = "festival")
@Entity
@Data
public class Festival {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private Date fecha;

    @OneToMany(mappedBy = "festival", orphanRemoval = true)
    private Set<Cartel> carteles = new LinkedHashSet<>();
}
