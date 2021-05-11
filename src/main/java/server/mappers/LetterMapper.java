package server.mappers;

import org.springframework.jdbc.core.RowMapper;
import server.models.Letter;

import java.sql.ResultSet;
import java.sql.SQLException;

import static server.models.AlphabetContract.*;

public class LetterMapper implements RowMapper<Letter> {
    @Override
    public Letter mapRow(ResultSet resultSet, int i) throws SQLException {
        int id = resultSet.getInt(COLUMN_ID);
        String letter = resultSet.getString(COLUMN_LETTER);
        String uri = resultSet.getString(COLUMN_URI);
        String picture_uri = resultSet.getString(COLUMN_PICTURE_URI);

        return new Letter(id, letter, uri, picture_uri);
    }
}
