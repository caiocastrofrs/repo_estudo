package Spring_MVC__TrainerDH.src.main.java.com.example.trainerDH.controller;

import Spring_MVC__TrainerDH.src.main.java.com.example.trainerDH.service.TrainerService;
import Spring_MVC__TrainerDH.src.main.java.com.example.trainerDH.domain.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trainer")
public class TrainerController {

    private final TrainerService trainerService;

    @Autowired
    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @GetMapping
    public List<Trainer> getTrainer() {
        return trainerService.listTrainer();
    }
}
