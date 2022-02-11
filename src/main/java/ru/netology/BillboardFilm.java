package ru.netology;

public class BillboardFilm {
    private int id;
    private int productId;
    private String nameMovie;
    private String genreFilm;
    private int count;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public String getGenreFilm() {
        return genreFilm;
    }

    public void setGenreFilm(String genreFilm) {
        this.genreFilm = genreFilm;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public BillboardFilm(int id, int productId, String nameMovie, String genreFilm, int count) {
        this.id = id;
        this.productId = productId;
        this.nameMovie = nameMovie;
        this.genreFilm = genreFilm;
        this.count = count;
    }
}







