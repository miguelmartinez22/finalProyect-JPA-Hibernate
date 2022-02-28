package javiermm.miguelmm.finalproyectjpahibernate.Entidades;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Table(name = "entrada")
@Entity
@Data
public class Entrada {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @CreatedDate
    @Column(name = "fecha_compra", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCompra;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "festival_id", referencedColumnName = "id")
    private Festival festival;

}
