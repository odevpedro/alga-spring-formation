package com.odevpedro.algafood.controller;

import com.odevpedro.algafood.model.Cliente;
import com.odevpedro.algafood.service.AtivacaoClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeuPrimeiroController {
    private AtivacaoClienteService ativacaoClienteService;

    public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;

        System.out.println("MeuPrimeiroController: " + ativacaoClienteService);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){

        Cliente joao = new Cliente("João","joao@xyz.com", "97698092");
        ativacaoClienteService.ativar(joao);
        return "Hello";
    }
}
