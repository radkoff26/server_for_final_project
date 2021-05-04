package server.models;

public class Word {
    private Integer id;
    private String eng;
    private String ru;
    private String url;
    private Integer gr;
    private String category;

    public Word(Integer id, String eng, String ru, String url, Integer gr, String category) {
        this.id = id;
        this.eng = eng;
        this.ru = ru;
        this.url = url;
        this.gr = gr;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public String getEng() {
        return eng;
    }

    public String getRu() {
        return ru;
    }

    public String getUrl() {
        return url;
    }

    public Integer getGr() {
        return gr;
    }

    public String getCategory() {
        return category;
    }
}
