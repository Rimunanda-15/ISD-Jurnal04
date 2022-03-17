package com.Jurnal04;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList <Music> list = new LinkedList<Music>();
        list.addLast(new Music("indonesia Raya", "Wr.supratman"));
        Scanner s = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("Pilihlah menu:");
            System.out.println("1. Input lagu");
            System.out.println("2. Hapus lagu terakhir");
            System.out.println("3. Hapus lagu sesuai judul");
            System.out.println("4. play lagu ");
            System.out.println("5. keluar");

            pilih = s.nextInt();

            if (pilih == 1){
                System.out.println("Tambahkan Lagu dan nama penyanyi");
                String judul = s.next();
                String penyanyi = s.next();
                list.addLast(new Music(judul,penyanyi));
            }else if (pilih == 2){
                list.removeLast();
                System.out.println("hapus Lagu terakhir Berhasil");

            }else if (pilih == 3){
                System.out.println("ketikkan Judul lagu yang ingin dihapus (Harus Sesuai input lagu) ");
                hapusJudulLagu(list,s.next());
                System.out.println("hapus lagu input judul berhasil");
            }else if (pilih == 4){
                play(list);
            }
        }while (pilih < 5);
    }
    public static void play(LinkedList musicList){
        ListIterator<Music> iterator = musicList.listIterator();
        System.out.println("mainkan dari awal list");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println("mainkan dari akhir list");

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        System.out.println();
    }

    public static void hapusJudulLagu(LinkedList musicList, String judul){
        ListIterator <Music> iterator = musicList.listIterator();
        while (iterator.hasNext()){
            Music listMusic = iterator.next();
            if (listMusic.ambilLagu().equals(judul)){
                iterator.remove();
            }
        }
    }
}
