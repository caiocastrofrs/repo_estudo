package com.lanchonete.produtos.service;

import com.lanchonete.produtos.model.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoService {

    //Obter todos
    List<Produto> obterTodos();


    //Salvar
    void guardar(Produto produto);

    void deletar(Long id);

    Optional<Produto> alterar(Produto produto);

    Optional<Produto> buscar(Long id);
}
