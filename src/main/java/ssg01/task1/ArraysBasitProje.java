package ssg01.task1;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysBasitProje {
    public static void main(String[] args) {
        /*
        1.Kullanıcıdan 10 tamsayı girişi alın ve bunları bir dizide saklayın ve bunları bir dizide saklayın.
        2.Yine kullanıcıdan bir numara vermesini isteyin. Şimdi, kullanıcıya bu sayının dizide olup olmadığını söyleyin.
        3.
         şunu yazdırın:
        pozitif sayıların sayısı
        negatif sayıların
        sayısı tek sayıların
        sayısı çift sayıların
        sayısı 0'lar.
        4.elemanlarının toplamını ve çarpımını bulan bir program yazınız.
        5.Bir dizinin en büyük ve en küçük öğelerini bulun ve yazdırın
*/

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen kaç adat dizin girişi yapacağınızı belirtin");
        int arr[] = new int[input.nextInt()]; // kullanıcının girdigi degerler array olarak alındı
        for (int i = 0; i < arr.length; i++) {// 0 dan başlayıp 1 artırarak bütün girişleri al
            System.out.println(i + " . index için eleman girişi yapınız..");
            arr[i] = input.nextInt(); //tek tek aldığın girişleri arr dizinine yerleştir
            System.out.println(Arrays.toString(arr)); //alınan arrayleri konsola yazdır
        }
        System.out.println("dizinde olup olmadığını merak ettiğiniz sayıyı giriniz");
        int sayi = input.nextInt();
        int aranansayi= Arrays.binarySearch(arr,sayi);






    }}
