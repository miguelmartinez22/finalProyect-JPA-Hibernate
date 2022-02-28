package javiermm.miguelmm.finalproyectjpahibernate.Entidades;


import lombok.Data;

import javax.persistence.*;

@Table(name = "artista")
@Entity
@Data
public class Artista {

    @Id
    private String dni;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private Integer salario;

    @Column(name = "hora_entrada", nullable = false)
    private String horaEntrada;

    @Column(name = "hora_salida", nullable = false)
    private String horaSalida;

    @Column(name = "genero_musical", nullable = false)
    private String generoMusical;

    @Column(nullable = false)
    private String nacionalidad;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "club_fans_id", referencedColumnName = "id")
    private ClubFans clubFans;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "camerino_id", referencedColumnName = "id")
    private Camerino camerino;

    @ManyToOne
    @JoinColumn(name = "cartel_id", referencedColumnName = "id")
    private Cartel cartel;

    /*@ManyToOne
    @JoinColumn(name = "manager_dni")
    private Manager manager;*/

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "manager_dni", referencedColumnName = "dni")
    private Manager manager;

}
