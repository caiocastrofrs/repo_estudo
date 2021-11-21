package Aula21_Exercicio.springboot.controller;

import org.apache.tomcat.jni.Local;
import org.springframework.web.bind.annotation.*;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

@RestController
@RequestMapping("data/")
public class DataController {

    @GetMapping("/{dia}/{mes}/{ano}")
    @ResponseBody
    public int calcIdade(@PathVariable("dia") int dia,@PathVariable("mes") int mes,@PathVariable("ano") int ano) {
        LocalDate data = LocalDate.of(ano, mes, dia);
        LocalDate hoje = LocalDate.now();
        return Period.between(data, hoje).getYears();
    }
}
