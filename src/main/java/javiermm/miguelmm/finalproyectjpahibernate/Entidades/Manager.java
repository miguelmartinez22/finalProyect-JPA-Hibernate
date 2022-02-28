package javiermm.miguelmm.finalproyectjpahibernate.Entidades;

import lombok.Data;

import javax.persistence.*;

@Table(name = "manager")
@Entity
@Data
public class Manager {

    @Id
    private String dni;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String telefono;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "artista_dni", referencedColumnName = "dni")
    private Artista artista;

}
