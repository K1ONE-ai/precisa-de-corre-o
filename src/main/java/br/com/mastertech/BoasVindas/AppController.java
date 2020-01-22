package br.com.mastertech.BoasVindas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    @GetMapping
    public String mostrarHome() {
        return "index";
    }


    @GetMapping("/produtos")
    public String mostrarProdutos() {
        return "produtos";

    }

    @GetMapping("/contato")
    public String mostrarContato() {
        return "contato";
    }
}


