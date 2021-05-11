package server.models;

public class Letter {
    private Integer id;
    private String letter;
    private String uri;
    private String picture_uri;

    public Letter(Integer id, String letter, String uri, String picture_uri) {
        this.id = id;
        this.letter = letter;
        this.uri = uri;
        this.picture_uri = picture_uri;
    }

    public Integer getId() {
        return id;
    }

    public String getLetter() {
        return letter;
    }

    public String getUri() {
        return uri;
    }

    public String getPicture_uri() {
        return picture_uri;
    }
}
