package server.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import server.mappers.WordMapper;
import server.models.Word;

import java.util.List;

@Repository
public class WordRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Word> getAllWords() {

        jdbcTemplate.execute(
                "USE server"
        );

        return jdbcTemplate.query(
                "SELECT * FROM all_words",
                new WordMapper()
        );
    }

    public List<Word> getWords(int gr) {

        jdbcTemplate.execute(
                "USE server"
        );

        return jdbcTemplate.query(
                "SELECT * FROM all_words WHERE gr = " + gr,
                new WordMapper()
        );
    }


}
