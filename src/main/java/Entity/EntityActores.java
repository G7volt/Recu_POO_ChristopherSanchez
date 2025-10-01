package Entity;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.util.Date;

@Entity
@Table(name = "ACTORES")
@Getter @Setter
@ToString
@EqualsAndHashCode
public class EntityActores {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_actores_id")
    @SequenceGenerator(name = "seq_actores_id", sequenceName = "seq_actores_id", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "FECHANACIMIENTO")
    private Date FechaNacimiento;

    @Column(name = "NACIONALIDAD")
    private String Nacionalidad;

    @Column(name = "PREMIOS_OSCAR")
    private Number premiosOscar;

    @Column(name = "SITIO_WEB")
    private String sitioWeb;
}
