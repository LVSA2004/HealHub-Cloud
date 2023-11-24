package br.com.fiap.healhub.agendamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import org.springframework.ui.Model;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/agendamento")
public class AgendamentoController {

    @Autowired
    MessageSource message;

    @Autowired
    AgendamentoService service;

    @GetMapping
    public String index(Model model){
        model.addAttribute("agendamentoList", service.findAll());
        return "agendamento/index";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, RedirectAttributes redirect){
        if (service.delete(id)){
            redirect.addFlashAttribute("success", "Agendamento apagado com sucesso");
        }else{
            redirect.addFlashAttribute("error",  "Agendamento nao encontrado");
        }
        return "redirect:/agendamento";
    }

    @GetMapping("new")
    public String form(Agendamento agendamento){
        return "agendamento/form";
    }

    @PostMapping
    public String create(@Valid Agendamento agendamento, BindingResult binding, RedirectAttributes redirect){
        if (binding.hasErrors()) return "/agendamento/form";
        service.save(agendamento);
        redirect.addFlashAttribute("success",  "Agendamento cadastrado com sucesso");
        return "redirect:/agendamento";
    }
    
}
