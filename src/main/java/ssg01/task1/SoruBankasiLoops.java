package ssg01.task1;

public class SoruBankasiLoops {
    public static void main(String[] args) {
   /* soru 5 nested loop
   Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
A A A A A
A A A A A
A A A A A

        String ekran = "A";
        int rowsatir = 3;
        int columsutun = 5;
        for (int i = 1; i <= rowsatir; i++) {
            for (int j = 1; j <= columsutun; j++) {
                System.out.print(ekran + " ");
            }
            System.out.println();
        }*/
/*  soru6
Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
A
A A
A A A
A A A A
*/

        int rowsatir = 5;
        for (int i = 1; i <= rowsatir; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("A ");
            }
            System.out.println();
        }

    /*    int rows = 4;
        char character = 'A';

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(character + " ");
            }
            System.out.println();
        }*/


    }}

