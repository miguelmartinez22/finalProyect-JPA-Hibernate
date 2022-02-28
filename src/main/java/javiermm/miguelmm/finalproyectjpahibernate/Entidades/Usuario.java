package javiermm.miguelmm.finalproyectjpahibernate.Entidades;

import lombok.Data;

import javax.persistence.*;

@Table(name = "usuario")
@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {

    @Id
    private String usuario;

    @Column(nullable = false)
    private String contrasena;

    @Column(nullable = false)
    private String tipo;

}
