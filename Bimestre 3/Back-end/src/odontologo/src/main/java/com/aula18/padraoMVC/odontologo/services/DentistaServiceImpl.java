package com.aula18.padraoMVC.odontologo.services;

import com.aula18.padraoMVC.odontologo.model.Dentista;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DentistaServiceImpl implements DentistaService{


    @Override
    public List<Dentista> listaDentistas() {
        return Arrays.asList( new Dentista("Maria"), new Dentista("João"));
    }


}
