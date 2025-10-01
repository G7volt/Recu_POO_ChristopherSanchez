package Service;

import Entity.EntityActores;
import Models.DTO.DTOactores;
import Repository.RepoActores;
import lombok.extern.slf4j.Slf4j;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class ServiceActores {

    @Autowired
    private RepoActores repo;

    public List<DTOactores> getAllActores(){

        List<EntityActores> actores = repo.findAll();
        return actores.stream()
                .map(this::convertirADTOactores)
                .collect(Collectors.toList());
    }

    public DTOactores insertActores(DTOactores dtOactores){
        try {
            EntityActores entityActores = converAEntityActores(dtOactores);
            EntityActores actorGuardado = repo.save(entityActores);
        }catch (Exception e){
            log.error("Error al registrar el Actor " + e.getMessage());
            throw new ExceptionActorNoEncontrado("Error al registrar el actor" + e.getMessage());
        }
    }

    private DTOactores convertirADTOactores(EntityActores actores) {
        DTOactores dto = new DTOactores();
        dto.setId(actores.getId());
        dto.setNombre(actores.getNombre());
        dto.setFechNacimiento(actores.getFechaNacimiento());
        dto.setNacionalidad(actores.getNacionalidad());
        dto.setPremiosOscar(actores.getPremiosOscar());
        dto.setSitioWeb(actores.getSitioWeb());

        return dto;
    }

    private EntityActores converAEntityActores(DTOactores dto){
        EntityActores actores = new EntityActores();
        actores.setNombre(dto.getNombre());
        actores.setNacionalidad(dto.getNacionalidad());
        actores.setFechaNacimiento(dto.getFechNacimiento());
        actores.setPremiosOscar(dto.getPremiosOscar());
        actores.setSitioWeb(dto.getSitioWeb());

        return actores;
    }

}
