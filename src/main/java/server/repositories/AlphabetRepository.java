package server.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import server.mappers.LetterMapper;
import server.models.Letter;

import java.util.List;

@Repository
public class AlphabetRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Letter> getLetters() {
        jdbcTemplate.execute("USE server");
        return jdbcTemplate.query(
                "SELECT * FROM alphabet",
                new LetterMapper()
        );
    }
}
