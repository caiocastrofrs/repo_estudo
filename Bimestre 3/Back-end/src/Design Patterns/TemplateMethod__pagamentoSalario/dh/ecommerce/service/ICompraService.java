package TemplateMethod__pagamentoSalario.dh.ecommerce.service;

import TemplateMethod__pagamentoSalario.dh.ecommerce.model.Endereco;
import TemplateMethod__pagamentoSalario.dh.ecommerce.model.Cartao;

public interface ICompraService {

    public void processarCompra(String produtoId, Integer quantidade, Cartao cartao, Endereco endereco);
}
