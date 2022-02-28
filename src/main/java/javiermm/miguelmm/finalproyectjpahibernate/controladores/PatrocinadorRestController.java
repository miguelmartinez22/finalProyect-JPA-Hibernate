package javiermm.miguelmm.finalproyectjpahibernate.controladores;

import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Camerino;
import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Cliente;
import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Patrocinador;
import javiermm.miguelmm.finalproyectjpahibernate.servicios.CamerinoService;
import javiermm.miguelmm.finalproyectjpahibernate.servicios.ClienteService;
import javiermm.miguelmm.finalproyectjpahibernate.servicios.PatrocinadorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/api/patrocinador")
public class PatrocinadorRestController {
    /*Clase para servicio Rest de la entidad Camerino*/

    @Autowired
    private PatrocinadorService patrocinadorService;

    @CrossOrigin
    @GetMapping(value = "/{id}")
    public ResponseEntity<Patrocinador> getById(@PathVariable("id") long id) {
        Optional<Patrocinador> patrocinador = patrocinadorService.findByOptionalId(id);
        return patrocinador.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
    }

    @CrossOrigin
    @PostMapping
    public ResponseEntity<Map<String, Object>> add(@RequestBody Patrocinador patrocinador) {
        try {
            long id = patrocinadorService.insertar(patrocinador).getId();
            return new ResponseEntity<>(Collections.singletonMap("id", id), HttpStatus.CREATED);
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return new ResponseEntity<>(Collections.singletonMap("error", ex.getMessage()),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
