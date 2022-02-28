package javiermm.miguelmm.finalproyectjpahibernate.controladores;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class MainController {

    @GetMapping({"/", "/index"})
    public String index() {
        return "index";
    }

    @GetMapping({"/quienesSomos"})
    public String quienesSomos() {
        return "/app/quienesSomos";
    }

}
