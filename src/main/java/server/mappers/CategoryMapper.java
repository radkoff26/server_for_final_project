package server.mappers;

import org.springframework.jdbc.core.RowMapper;
import server.models.Category;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryMapper implements RowMapper<Category> {

    @Override
    public Category mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer id = resultSet.getInt("id");
        String title = resultSet.getString("title");

        return new Category(
                id,
                title
        );
    }
}
