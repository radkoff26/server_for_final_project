package server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.models.BigAnimal;
import server.repositories.BigAnimalRepository;

import java.util.List;

@Service
public class BigAnimalService {

    @Autowired
    BigAnimalRepository repository;

    public List<BigAnimal> getBigAnimals() {
        return repository.getBigAnimals();
    }
}
