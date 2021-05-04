package server.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import server.mappers.CategoryMapper;
import server.models.Category;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Category> getCategories() {
        jdbcTemplate.execute("USE categories");
        return jdbcTemplate.query(
                "SELECT * FROM all_categories",
                new CategoryMapper()
        );
    }
}
