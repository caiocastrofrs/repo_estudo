package br.com.dh.odontologia.dao;

import java.util.List;

public interface IDao<T> {

    public T salvar(T t);
    public T buscar(Integer id);
    public void excluir(Integer id);
    public ArrayList<T> listarTodos();

}
