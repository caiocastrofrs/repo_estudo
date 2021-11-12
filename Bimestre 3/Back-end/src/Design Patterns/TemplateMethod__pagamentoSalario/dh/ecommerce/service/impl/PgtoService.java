package TemplateMethod__pagamentoSalario.dh.ecommerce.service.impl;

import TemplateMethod__pagamentoSalario.dh.ecommerce.model.Cartao;

public class PgtoService {


    public Boolean processarPgto(Cartao cartao, String quantiaACobrar){
        Boolean pgtoRealizado = Boolean.FALSE;
        if(cartao != null && cartao.getNumerosFrente() != null && cartao.getCodSeguranca() != null)
            System.out.println("Processando o pagamento por "+ quantiaACobrar);
            pgtoRealizado = Boolean.TRUE;


        return pgtoRealizado;


    }

}
