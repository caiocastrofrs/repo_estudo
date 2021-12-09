package com.example.demo.service;

import com.example.demo.model.Dentista;
import com.example.demo.repository.IDao;
import org.springframework.stereotype.Service;

@Service
public class DentistaService {
    private final IDao<Dentista> dentistaIdao;

    public DentistaService(IDao<Dentista> dentistaIdao) {
        this.dentistaIdao = dentistaIdao;
    }

    public Dentista registrarDentista(Dentista dentista) {
        return dentistaIdao.salvar(dentista);
    }
}
