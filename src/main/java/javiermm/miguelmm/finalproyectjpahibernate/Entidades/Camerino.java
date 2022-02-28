package javiermm.miguelmm.finalproyectjpahibernate.Entidades;

import lombok.Data;

import javax.persistence.*;

@Table(name = "camerino")
@Entity
@Data
public class Camerino {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "fecha_hora")
    private String fechaHora;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String gama;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "artista_dni", referencedColumnName = "dni")
    private Artista artista;

}
