package ssg01.task1;

import java.util.Arrays;

public class ArraysTask {
    public static void main(String[] args) {
        // Bölüm 1:
        // Dizelerden oluşan bir dizi listesi oluştur
        // içine - "Kırmızı", "Yeşil", "Mavi", "Sarı" ve "Siyah" ekleyin
        // tüm elemanları yazdır, her eleman yeni satırda

        // Bölüm 2:
        // Bir String dizi listesini ve bir String'i parametre olarak kabul eden bir yöntem oluşturun
        // method, elementi arraylist'in ilk indeksine eklemelidir

        // 3. Bölüm:
        // Bir String dizi listesini ve bir String'i parametre olarak kabul eden bir yöntem oluşturun
        // son elemandan önce eleman eklemeli
        // ör: [1, 2, 3] -> [1, 2, 4, 3]

        String colurs[]=new String[5];
        colurs[0]="red";
        colurs[1]="green";
        colurs[2]="blue";
        colurs[3]="yellow";
        colurs[4]="black";
        System.out.println(Arrays.toString(colurs)); //[red, green, blue, yellow, black]








    }
}
