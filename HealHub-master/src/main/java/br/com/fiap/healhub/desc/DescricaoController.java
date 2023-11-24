package br.com.fiap.healhub.desc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/desc")
public class DescricaoController {
    @GetMapping
    public String index(Model model){
        return "desc/index";
    }
    
}
