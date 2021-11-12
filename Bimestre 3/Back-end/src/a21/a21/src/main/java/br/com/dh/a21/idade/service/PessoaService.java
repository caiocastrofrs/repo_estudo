package br.com.dh.a21.idade.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class PessoaService implements IPessoaService{

    public Integer calcularIdade(Integer dia, Integer mes, Integer ano) {
        LocalDate data = LocalDate.of(ano, mes, dia);
        Period period = Period.between(data, LocalDate.now());

        return Math.abs(period.getYears() - data.getYear());
    }
}
