package ru.netology;

public class AfficheManager {
    protected String[] films = new String[0];
    protected int limit;

    public AfficheManager() {
        this.limit = 10;
    }

    public AfficheManager(int limit) {
        this.limit = limit;
    }


    public void add(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;

    }

    public String[] findAll() {
        return films;

    }

    public String[] findLast() {
        int reallyAmount;
        if (films.length < limit) {
            reallyAmount = films.length;
        } else {
            reallyAmount = limit;
        }

        String[] tmp = new String[reallyAmount];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;

    }


}
