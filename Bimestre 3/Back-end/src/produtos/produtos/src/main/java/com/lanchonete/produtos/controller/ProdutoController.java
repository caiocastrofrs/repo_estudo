package com.lanchonete.produtos.controller;


import com.lanchonete.produtos.model.Produto;
import com.lanchonete.produtos.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    @Autowired
    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    //ex01
    @PostMapping
    public ResponseEntity<?> criarProduto(@RequestBody Produto produto) {
        produtoService.guardar(produto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Produto>> listarTodosProdutos() {
        return ok(produtoService.obterTodos());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarProdutoPorId(@PathVariable Long id) {
        produtoService.deletar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<Optional<Produto>> alterarProduto(@RequestBody Produto produto) {
        if(produto.getId() != null && produtoService.buscar(produto.getId()).isPresent())
            return ResponseEntity<Produto>.ok(produtoService.alterar(produto));
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        return response;
    }
}
