package com.example.aula20.service;

import com.example.aula20.domain.Paciente;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class OdontoService {

    private static Map<Integer, Paciente> flyweight = new HashMap<>();

    private static String[] nomesVec = {"Lucas", "Ana", "Pedro", "Julia", "Roberto",
                                    "Larissa", "Antonio", "Pietra", "Rubens", "Giovana"};

    private static String[] sobrenomesVec = {"Silva", "Santos", "Gomes", "Paglia", "Grisa",
            "Andrade", "Quinteiros", "Tempesta", "Franco", "Andrade"};

    public Paciente criarPaciente(){
        Random rand = new Random();
        int upperbound = 10;
        String nome = nomesVec[rand.nextInt(upperbound)];
        String sobrenome = sobrenomesVec[rand.nextInt(upperbound)];
        String email = nome.toLowerCase() + sobrenome.toLowerCase() + "@gmail.com";
        Integer id = flyweight.size() + 1;

        flyweight.put(id, new Paciente(nome, sobrenome, email, (rand.nextInt(upperbound) + 18)));

        return flyweight.get(id);
    }

    public Map<Integer, Paciente> buscarPacientes(){
        return flyweight;
    }

    public void deletar(Integer id){
        flyweight.remove(id);
    }

}
