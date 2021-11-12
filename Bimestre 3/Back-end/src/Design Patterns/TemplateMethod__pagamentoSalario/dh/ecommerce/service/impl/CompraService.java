package TemplateMethod__pagamentoSalario.dh.ecommerce.service.impl;

import TemplateMethod__pagamentoSalario.dh.ecommerce.model.Endereco;
import TemplateMethod__pagamentoSalario.dh.ecommerce.model.Produto;
import TemplateMethod__pagamentoSalario.dh.ecommerce.model.Cartao;
import TemplateMethod__pagamentoSalario.dh.ecommerce.service.ICompraService;

import java.util.Arrays;

public class CompraService implements ICompraService {

    private ArmazemService armazemService;
    private PgtoService pgtoService;
    private EnvioService envioService;

    public CompraService(ArmazemService armazemService, PgtoService pgtoService, EnvioService envioService) {
        this.armazemService = armazemService;
        this.pgtoService = pgtoService;
        this.envioService = envioService;
    }

    @Override
    public void processarCompra(String produtoId, Integer quantidade, Cartao cartao, Endereco endereco) {
        Produto produto = armazemService.buscarProduto(produtoId,quantidade);
        if(produto != null){
            //Se temos o produto, processamos o pagamento
           if(pgtoService.processarPgto(cartao,String.valueOf(produto.getValor() * quantidade))){
               envioService.processarEnvio(Arrays.asList(produto), endereco);
           }

        }
    }
}
