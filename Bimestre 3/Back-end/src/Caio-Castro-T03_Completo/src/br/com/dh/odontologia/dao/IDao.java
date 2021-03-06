package br.com.dh.odontologia.dao;

import java.util.List;
import java.util.Optional;

public interface IDao<T> {

    T salvar(T t);
    Optional<T> buscar(Integer id);
    void excluir(Integer id);
    List<T> listarTodos();

}
