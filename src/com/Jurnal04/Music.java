package com.Jurnal04;

public class Music {
    private String judul;
    private String penyanyi;

    public Music(String judul, String penyanyi) {
        this.judul = judul;
        this.penyanyi = penyanyi;
    }
    public String ambilLagu(){
        return this.judul;
    }

    @Override
    public String toString() {
        return "judul='" + judul + '\'' +
                ", penyanyi='" + penyanyi + '\'';
    }
}
