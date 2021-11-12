package com.example.trainerDH.service;

import com.example.trainerDH.domain.Trainer;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.List;

@Service
public class TrainerServiceImpl implements TrainerService{
    @Override
    public List<Trainer> listTrainer() {
        return Arrays.asList(
                new Trainer ("Caio"),
                new Trainer ("Adso"),
                new Trainer ("Diego"),
                new Trainer ("Ícaro")
        );
    }
}
