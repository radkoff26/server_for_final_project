package server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.models.Word;
import server.repositories.WordRepository;

import java.util.List;

@Service
public class WordService {

    @Autowired
    WordRepository wordRepository;

    public List<Word> getAllWords() {
        return wordRepository.getAllWords();
    }

    public List<Word> getWords(int gr) {
        return wordRepository.getWords(gr);
    }

    public List<Word> getRangeOfWords(int start, int end) {
        return wordRepository.getRangeOfWords(start, end);
    }

}
