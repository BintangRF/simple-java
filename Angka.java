/*
====================================
KISI-KISI PENJELASAN PROGRAM
------------------------------------
Nama file   : Angka.java
Tujuan      : Menunjukkan cara deklarasi array dua dimensi.
Penjelasan  :
- Array bernama 'Angka' bertipe String.
- Ukuran 3 baris x 3 kolom.
- Berisi data: 1, 3, 5, 14, 19, 20, 22, 27, 29.
- Program menampilkan isi array dua dimensi dengan dua perulangan for bersarang.
====================================
*/

public class Angka {
    public static void main(String[] args) {
        String[][] Angka = {
            {"1", "3", "5"},
            {"14", "19", "20"},
            {"22", "27", "29"}
        };

        System.out.println("Isi array dua dimensi Angka:");
        for (int i = 0; i < Angka.length; i++) {
            for (int j = 0; j < Angka[i].length; j++) {
                System.out.print(Angka[i][j] + " ");
            }
            System.out.println();
        }
    }
}
