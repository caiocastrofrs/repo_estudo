package Spring_MVC__TrainerDH.src.main.java.com.example.trainerDH.service;

import Spring_MVC__TrainerDH.src.main.java.com.example.trainerDH.domain.Trainer;
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
