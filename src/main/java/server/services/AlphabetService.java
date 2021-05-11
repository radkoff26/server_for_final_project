package server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.models.Letter;
import server.repositories.AlphabetRepository;

import java.util.List;

@Service
public class AlphabetService {

    @Autowired
    private AlphabetRepository alphabetRepository;

    public List<Letter> getLetters() {
        return alphabetRepository.getLetters();
    }
}
