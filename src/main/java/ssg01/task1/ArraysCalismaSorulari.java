package ssg01.task1;

import java.awt.event.InputEvent;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysCalismaSorulari {
    public static void main(String[] args) {
       /*
       Ortalama Hesaplama: Kullanıcıdan alınan bir dizi sayının ortalamasını hesaplayan bir program yazabilirsiniz.

        int num[]=new int[]{10,20,30,40,50};
        int ortalama=0;
        for(int w:num){
           ortalama=ortalama+w;
        }
        System.out.println(ortalama/num.length);*/


       /*
En Büyük ve En Küçük Sayıyı Bulma: Kullanıcıdan alınan bir dizinin en büyük ve
 en küçük sayısını bulan bir program yapabilirsiniz.
 int num[]= new int[]{19,2,8,0,25};
 int minNum=num[0];
int maxNum=num[0];
for( int w: num){
    minNum=Math.min(minNum,w);
    maxNum=Math.max(maxNum,w);
}
        System.out.println(minNum);
        System.out.println(maxNum); */
/*
Elemanları Sıralama: Kullanıcıdan alınan bir dizinin elemanlarını artan
 veya azalan sırada sıralayan bir program geliştirebilirsiniz.

        int siralama[]= new int[]{25,35,1,65,4,85};
        System.out.println(Arrays.toString(siralama));
        Arrays.sort(siralama);
        System.out.println(Arrays.toString(siralama));


 int num=4;
for(int i=1;i<11;i++) {
    System.out.println(num + "x" + i + "=" + (num * i));
} */

       /* kullanıcının girdigi bir array'in en buyuk elemani ile
        en kucuk elemanının  farkını bulan bir method create ediniz.*/

Scanner scan = new Scanner(System.in);
        System.out.println("bir uzunluk giriniz");// kaç adet değer girişi yapacaksınız
        int uzunluk = scan.nextInt();

        int arr[] =new int[uzunluk];
        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("arrayin "+ (i+1) + ".elemanini giriniz :");
            arr[i]= scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("arr[son eleman]-arr[ilk eleman] : " + (arr[uzunluk-1] - arr[0]));




    }
}
