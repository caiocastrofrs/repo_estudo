package br.com.dh.a21.idade.controller;

import br.com.dh.a21.idade.service.IPessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController {

    @Autowired
    private IPessoaService pessoaService;

    @GetMapping("/{dia}/{mes}/{ano}")
    public Integer calcularIdade( @PathVariable("dia") Integer dia,
                                  @PathVariable("dia") Integer mes,
                                  @PathVariable("dia") Integer ano) {
        return pessoaService.calcularIdade(dia,mes,ano);

    }
}
