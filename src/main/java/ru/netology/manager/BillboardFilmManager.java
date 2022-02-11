package ru.netology.manager;

import ru.netology.BillboardFilm;

public class BillboardFilmManager {
    private int limit = 10;
    private BillboardFilm[] items = new BillboardFilm[0];


    public BillboardFilmManager() {
    }

    public BillboardFilmManager(int limit) {
        this.limit = limit;
    }

    public void save(BillboardFilm item) {
        int length = items.length + 1;
        BillboardFilm[] tmp = new BillboardFilm[length];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public BillboardFilm[] getAll() {
        int resultLength = items.length;
        if (resultLength > limit) {
            resultLength = limit;
        } else {
            resultLength = items.length;
        }


        BillboardFilm[] result = new BillboardFilm[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public BillboardFilm[] findAll() {
        return items;
    }
}












