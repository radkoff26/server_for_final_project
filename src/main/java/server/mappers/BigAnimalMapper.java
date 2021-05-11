package server.mappers;

import org.springframework.jdbc.core.RowMapper;
import server.models.BigAnimal;

import java.sql.ResultSet;
import java.sql.SQLException;

import static server.models.BigAnimalContract.*;

public class BigAnimalMapper implements RowMapper<BigAnimal> {
    @Override
    public BigAnimal mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer id = resultSet.getInt(COLUMN_ID);
        String uri = resultSet.getString(COLUMN_URI);
        String uri_bg = resultSet.getString(COLUMN_URI_BG);
        String word = resultSet.getString(COLUMN_WORD);

        return new BigAnimal(id, uri, uri_bg, word);
    }
}
