package server.models;

public class Word {
    private Integer id;
    private String eng;
    private String ru;
    private String url;
    private Integer gr;
    private Integer category_id;

    public Word(Integer id, String eng, String ru, String url, Integer gr, Integer category_id) {
        this.id = id;
        this.eng = eng;
        this.ru = ru;
        this.url = url;
        this.gr = gr;
        this.category_id = category_id;
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

    public Integer getCategory_id() {
        return category_id;
    }
}
