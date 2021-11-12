package TemplateMethod__pagamentoSalario.dh.ecommerce.service.impl;

import TemplateMethod__pagamentoSalario.dh.ecommerce.model.Endereco;
import TemplateMethod__pagamentoSalario.dh.ecommerce.model.Produto;

import java.util.List;

public class EnvioService {

    public void processarEnvio(List<Produto> produtos, Endereco endereco){
        System.out.println("Enviando produtos a " + endereco.getRua() +" "+ endereco.getNro() +","+ endereco.getBairro());
    }
}
