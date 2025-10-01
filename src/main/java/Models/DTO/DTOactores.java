package Models.DTO;


import jakarta.annotation.Nullable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class DTOactores {

    private Long id;
    private String nombre;

    @Nullable
    private Date fechNacimiento;

    @Nullable
    private String nacionalidad;

    @Nullable
    private Number premiosOscar;

    @Nullable
    private String sitioWeb;
}
