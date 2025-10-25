/*
====================================
KISI-KISI PENJELASAN PROGRAM
------------------------------------
Nama file   : EmpatAngka.java
Tujuan      : Menunjukkan cara deklarasi array satu dimensi.
Penjelasan  :
- Array bernama 'empatAngka' bertipe int.
- Berisi 4 elemen: 7, 10, 20, 23.
- Program menggunakan perulangan for-each untuk menampilkan isi array.
====================================
*/

public class EmpatAngka {
    public static void main(String[] args) {
        int[] empatAngka = {7, 10, 20, 23};
        System.out.print("Isi array empatAngka: ");
        for (int angka : empatAngka) {
            System.out.print(angka + " ");
        }
    }
}
