package br.com.dh.odontologia.test;

import br.com.dh.odontologia.dao.impl.EnderecoDaoH2;
import br.com.dh.odontologia.model.Endereco;
import br.com.dh.odontologia.service.EnderecoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class EnderecoServiceTest {

    Endereco endereco1, endereco2, endereco3, endereco4, endereco5;
    EnderecoService enderecoService = new EnderecoService(new EnderecoDaoH2());
    @BeforeEach
    void setUp() {
        endereco1 = new Endereco("rua 1","1","Bairro 1", "Cidade 1");
        endereco2 = new Endereco("rua 2","2","Bairro 2", "Cidade 2");
        endereco3 = new Endereco("rua 3","3","Bairro 3", "Cidade 3");
        endereco4 = new Endereco("rua 4","4","Bairro 4", "Cidade 4");
        endereco5 = new Endereco("rua 5","5","Bairro 5", "Cidade 5");
    }

    @Test
    void salvar() {
        Assertions.assertNotNull(enderecoService.salvar(endereco1));
        Assertions.assertNotNull(enderecoService.salvar(endereco2));
        Assertions.assertNotNull(enderecoService.salvar(endereco3));
        Assertions.assertNotNull(enderecoService.salvar(endereco4));
        Assertions.assertNotNull(enderecoService.salvar(endereco5));
    }

    @Test
    void buscar() {
        Assertions.assertNotNull(enderecoService.buscar(endereco1.getId()));
        Assertions.assertNotNull(enderecoService.buscar(endereco2.getId()));
        Assertions.assertNotNull(enderecoService.buscar(endereco3.getId()));
        Assertions.assertNotNull(enderecoService.buscar(endereco4.getId()));
    }

    @Test
    void buscarTodos() {
        Assertions.assertNotNull(enderecoService.buscarTodos());
    }

    @Test
    void excluir() {
        enderecoService.excluir(endereco5.getId());
        Assertions.assertNull(enderecoService.buscar(endereco5.getId()));
    }
}