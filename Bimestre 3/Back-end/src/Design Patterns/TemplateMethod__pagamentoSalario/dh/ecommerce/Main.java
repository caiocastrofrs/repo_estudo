package TemplateMethod__pagamentoSalario.dh.ecommerce;

import TemplateMethod__pagamentoSalario.dh.ecommerce.model.Endereco;
import TemplateMethod__pagamentoSalario.dh.ecommerce.model.Produto;
import TemplateMethod__pagamentoSalario.dh.ecommerce.model.Cartao;
import TemplateMethod__pagamentoSalario.dh.ecommerce.service.ICompraService;
import TemplateMethod__pagamentoSalario.dh.ecommerce.service.impl.ArmazemService;
import TemplateMethod__pagamentoSalario.dh.ecommerce.service.impl.CompraService;
import TemplateMethod__pagamentoSalario.dh.ecommerce.service.impl.EnvioService;
import TemplateMethod__pagamentoSalario.dh.ecommerce.service.impl.PgtoService;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Produto produtoUm = new Produto("1",5,1000,"Mouse");
        Produto produtoDois = new Produto("2",5,3000,"Teclado");
        Cartao cartao = new Cartao("1111222233334444","012","2025/07/09");

        Endereco endereco = new Endereco("Av Morumbi","1500","14280000","Morumbi","São Paulo");
        ICompraService compraService = new CompraService(new ArmazemService(Arrays.asList(produtoUm,produtoDois)),new PgtoService(),new EnvioService());

        compraService.processarCompra("1",3, cartao, endereco);

    }
}
