package javiermm.miguelmm.finalproyectjpahibernate.Entidades;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Table(name = "cliente")
@Entity
@Data
public class Cliente extends Usuario{

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private long id;

    @Column(unique = true, nullable = false)
    private String dni;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido1;

    private String apellido2;

    @Column(nullable = false)
    private String localidad;

    @Column(nullable = false)
    private float precio;

    @Column(name = "fecha_nacimiento", nullable = false)
    private Date fechaNacimiento;

    @Column(nullable = false)
    private String telefono;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "entrada_id", referencedColumnName = "id", nullable = false)
    private Entrada entrada;

    @ManyToMany
    @JoinTable(name = "club_fans_clientes",
            joinColumns = @JoinColumn(name = "cliente_usuario"),
            inverseJoinColumns = @JoinColumn(name = "club_fans_id"))
    private Set<ClubFans> clubFans = new LinkedHashSet<>();
}
