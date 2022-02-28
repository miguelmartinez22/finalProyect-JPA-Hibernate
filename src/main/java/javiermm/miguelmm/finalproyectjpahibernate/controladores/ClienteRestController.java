package javiermm.miguelmm.finalproyectjpahibernate.controladores;

import javiermm.miguelmm.finalproyectjpahibernate.Entidades.Cliente;
import javiermm.miguelmm.finalproyectjpahibernate.servicios.ClienteService;
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
@RequestMapping("/api/cliente")
public class ClienteRestController {

    /*Clase para servicio Rest de la entidad Cliente*/

    @Autowired
    private ClienteService clienteService;

    @CrossOrigin
    @GetMapping(value = "/{id}")
    public ResponseEntity<Cliente> getById(@PathVariable("id") long id) {
        Optional<Cliente> cliente = clienteService.findByOptionalId(id);
        return cliente.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
    }

    @CrossOrigin
    @PostMapping
    public ResponseEntity<Map<String, Object>> add(@RequestBody Cliente cliente) {
        try {
            long id = clienteService.insertar(cliente).getId();
            return new ResponseEntity<>(Collections.singletonMap("id", id), HttpStatus.CREATED);
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return new ResponseEntity<>(Collections.singletonMap("error", ex.getMessage()),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

