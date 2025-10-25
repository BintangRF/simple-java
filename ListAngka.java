/*
====================================
KISI-KISI PENJELASAN PROGRAM
------------------------------------
Nama file   : ListAngka.java
Tujuan      : Menunjukkan cara menggunakan LinkedList di Java.
Penjelasan  :
- Mengimpor library java.util.LinkedList.
- Membuat LinkedList bertipe Integer bernama 'listAngka'.
- Menambahkan elemen: 22, 19, 44, 60, 72.
- Program mencetak seluruh isi LinkedList ke layar.
====================================
*/

import java.util.LinkedList;
import java.util.Scanner;

public class ListAngka {
    public static void main(String[] args) {
        LinkedList<Integer> listAngka = new LinkedList<>();

        // Menambahkan elemen ke LinkedList
        // listAngka.add(22);
        // listAngka.add(19);
        // listAngka.add(44);
        // listAngka.add(60);
        // listAngka.add(72);

        // Menambahkan LinkedList via input
        Scanner input = new Scanner(System.in);

        System.out.print("Berapa banyak angka yang ingin dimasukkan? ");
        int jumlah = input.nextInt();

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            int angka = input.nextInt();
            listAngka.add(angka);
        }

        System.out.println("Isi LinkedList listAngka: " + listAngka);

        input.close();
    }
}