package javiermm.miguelmm.finalproyectjpahibernate.Entidades;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Table(name = "club_fans")
@Entity
@Data
public class ClubFans {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String nombre;

    @Column(name = "fecha_creacion", nullable = false)
    private Date fechaCreacion;

    @Column(nullable = false)
    private Integer recaudacion;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "artista_dni", referencedColumnName = "dni")
    private Artista artista;

    @ManyToMany
    @JoinTable(name = "club_fans_clientes",
            joinColumns = @JoinColumn(name = "club_fans_id"),
            inverseJoinColumns = @JoinColumn(name = "cliente_usuario"))
    private Set<Cliente> clientes = new LinkedHashSet<>();
}
