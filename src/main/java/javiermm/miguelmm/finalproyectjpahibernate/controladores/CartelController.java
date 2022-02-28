package javiermm.miguelmm.finalproyectjpahibernate.controladores;

import javiermm.miguelmm.finalproyectjpahibernate.servicios.ArtistaService;
import javiermm.miguelmm.finalproyectjpahibernate.servicios.CartelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Slf4j
@Controller
public class CartelController {

    @Autowired
    private CartelService cartelService;

    @Autowired
    private ArtistaService artistaService;

    @GetMapping({"/carteles"})
    public String carteles(Model model) {

        model.addAttribute("artistas", artistaService.findAll());

        return "/app/carteles";
    }
}
