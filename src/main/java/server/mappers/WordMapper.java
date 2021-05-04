package server.mappers;

import org.springframework.jdbc.core.RowMapper;
import server.models.Word;

import java.sql.ResultSet;
import java.sql.SQLException;

import server.models.WordDatabaseContract;

public class WordMapper implements RowMapper<Word> {
    @Override
    public Word mapRow(ResultSet resultSet, int i) throws SQLException {
        Word word;

        int id = resultSet.getInt(WordDatabaseContract.COLUMN_ID);
        String eng = resultSet.getString(WordDatabaseContract.COLUMN_ENG);
        String ru = resultSet.getString(WordDatabaseContract.COLUMN_RU);
        String url = resultSet.getString(WordDatabaseContract.COLUMN_PHOTO_URL);
        int gr = resultSet.getInt(WordDatabaseContract.COLUMN_GROUP);
        String category = resultSet.getString(WordDatabaseContract.COLUMN_CATEGORY);

        word = new Word(
                id,
                eng,
                ru,
                url,
                gr,
                category
        );

        return word;
    }
}
