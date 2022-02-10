package ru.netology;

public class BillboardManager {
    private BillboardFilm [] films = new BillboardFilm[0];

    public void add(BillboardFilm film) {
        int length = films.length + 1;
        BillboardFilm [] tmp = new  BillboardFilm[length];
        for (int i = 0; i < films.length; i++) {
            tmp [i] = films [i];
       }
        int lastIndex = tmp.length - 1;
        tmp [lastIndex] = film;
        films = tmp;
    }

    public BillboardFilm[] getAll() {
        BillboardFilm[] result = new BillboardFilm[films.length];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}
