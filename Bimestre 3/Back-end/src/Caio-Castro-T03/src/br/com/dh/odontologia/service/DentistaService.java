package br.com.dh.odontologia.service;

import br.com.dh.odontologia.dao.IDao;
import br.com.dh.odontologia.model.Dentista;

import java.util.List;

public class DentistaService {

    IDao<Dentista> dentistaIDao;

    public DentistaService(IDao<Dentista> dentistaIDao) {
        this.dentistaIDao = dentistaIDao;
    }

    public Dentista salvar(Dentista dentista) {
        return dentistaIDao.salvar(dentista);
    }

    public Dentista buscar(Integer id) {
        return dentistaIDao.buscar(id);
    }

    public void excluir(Integer id) {
        dentistaIDao.excluir(id);
    }

    public List<Dentista> listarTodos() {
        return dentistaIDao.listarTodos();
    }
}
