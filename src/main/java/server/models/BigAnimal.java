package server.models;

public class BigAnimal {
    private Integer id;
    private String uri;
    private String uri_bg;
    private String word;

    public BigAnimal(Integer id, String uri, String uri_bg, String word) {
        this.id = id;
        this.uri = uri;
        this.uri_bg = uri_bg;
        this.word = word;
    }

    public Integer getId() {
        return id;
    }

    public String getUri() {
        return uri;
    }

    public String getWord() {
        return word;
    }

    public String getUri_bg() {
        return uri_bg;
    }
}

