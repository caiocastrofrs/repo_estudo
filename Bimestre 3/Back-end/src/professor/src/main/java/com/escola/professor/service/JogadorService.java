package com.escola.professor.service;

import com.escola.professor.dao.JogadorDAO;
import com.escola.professor.model.Equipe;
import com.escola.professor.model.Jogador;
import com.escola.professor.model.Treinador;
import com.escola.professor.repository.EquipeRepository;
import com.escola.professor.repository.JogadorRepository;
import com.escola.professor.repository.TreinadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JogadorService {

    @Autowired
    private JogadorRepository jogadorRepository;

    @Autowired
    private TreinadorRepository treinadorRepository;

    @Autowired
    private EquipeRepository equipeRepository;

    public void inserir(JogadorDAO jogadorDAO) {
        Treinador treinador_id = treinadorRepository.getById(jogadorDAO.getIdTreinador());
        Equipe equipe_id = equipeRepository.getById(jogadorDAO.getIdEquipe());
        Jogador jogador = new Jogador(
                jogadorDAO.getNome(),
                jogadorDAO.getPosicao(),
                jogadorDAO.getNumero(),
                equipe_id,
                treinador_id);

        jogadorRepository.save(jogador);
    }
}
