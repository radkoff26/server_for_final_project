package server.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import server.mappers.BigAnimalMapper;
import server.models.BigAnimal;

import java.util.List;

@Repository
public class BigAnimalRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<BigAnimal> getBigAnimals() {
        jdbcTemplate.execute("USE server");
        return jdbcTemplate.query(
                "SELECT * FROM big_animals",
                new BigAnimalMapper()
        );
    }
}
