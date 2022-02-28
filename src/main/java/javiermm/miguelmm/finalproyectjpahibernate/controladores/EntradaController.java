package javiermm.miguelmm.finalproyectjpahibernate.controladores;


import javiermm.miguelmm.finalproyectjpahibernate.Entidades.*;
import javiermm.miguelmm.finalproyectjpahibernate.servicios.ClienteService;
import javiermm.miguelmm.finalproyectjpahibernate.servicios.EntradaService;
import javiermm.miguelmm.finalproyectjpahibernate.servicios.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Slf4j
@Controller
public class EntradaController {

    @Autowired
    EntradaService entradaService;

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    ClienteService clienteService;


    @GetMapping("/entradas")
    public String nuevaEntrada(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "app/entradas";
    }


    @RequestMapping(value ="/entradas/submit", method = RequestMethod.POST)
    public String nuevaEntradaSubmit(@ModelAttribute Cliente cliente) {
        try {
            //asignar id
            int numCLientes = clienteService.findNumClientes();
            cliente.setId(numCLientes);


            //creamos una entrada con los valores del formulario
            Entrada entrada = new Entrada();

            Date fechacompra = new Date();
            entrada.setFechaCompra(fechacompra);

            Date fechaNacimiento = new Date();
            cliente.setTipo("Cliente");
            cliente.setFechaNacimiento(fechaNacimiento);
            cliente.setEntrada(entrada);
            Cliente c = cliente;
            clienteService.insertar(cliente);

            return "redirect:/";
        } catch (Exception ex){
            return "error";
        }
    }
}
