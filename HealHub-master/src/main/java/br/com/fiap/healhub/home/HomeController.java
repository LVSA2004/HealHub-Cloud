package br.com.fiap.healhub.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    public String index(Model model){
        return "home/index";
    }
}
