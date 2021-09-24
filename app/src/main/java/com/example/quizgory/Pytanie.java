package com.example.quizgory;

public class Pytanie {
    private int tekstPytania;
    private int[] odpowiedzi = new int[3];
    private boolean[] odpPopr = new boolean[3];

    public Pytanie(int tekstPytania, int[] odpowiedzi, boolean[] odpPopr) {
        this.tekstPytania = tekstPytania;
        this.odpowiedzi = odpowiedzi;
        this.odpPopr = odpPopr;
    }

    public int getTekstPytania() {
        return tekstPytania;
    }

    public int getOdpowiedzi(int i) {
        return odpowiedzi[i];
    }

    public boolean[] getOdpPopr() {
        return odpPopr;
    }
}
