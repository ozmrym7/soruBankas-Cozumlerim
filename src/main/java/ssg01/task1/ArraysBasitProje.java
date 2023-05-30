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


        Scanner input = new Scanner(System.in);
        System.out.println("lütfen kac adet dizin gireceğinizi belirtiniz...");
        int arr[]= new int[input.nextInt()]; // kullanıcının girdiği değerleri arry olarak aldım
        for (int i = 0; i < arr.length-1; i++) {
          System.out.println(i + ".index için eleman girişi yapınız: ");
        arr[i]=input.nextInt();
            System.out.println(i+".index için değer giriniz" );
        } */

        Scanner input= new Scanner(System.in);
        System.out.println("lütfen kaç adet sayi girişi yapacağınızı belirtiniz");
        int arr[]=new int[input.nextInt()]; // kullanıcının girdiği degerler array olarak alındı
        for (int i =0 ; i < arr.length; i++) {
            System.out.println(i + ".index için eleman girişi yapınız: ");
            arr[i]=input.nextInt();
            System.out.println( Arrays.toString(arr));
        }




    }
}
