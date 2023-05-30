package ssg01.task1;

import java.util.Scanner;

public class PrimHesaplama {
    public static void main(String[] args) {



// Bir IT firması çalışanlarına Kurban Bayramı öncesi PRİM ve bayram İKRAMİYESİ verecektir.
    // Ünvan olarak; Development (D), Tester (T), Software için (S) girilecektir.
    // Kişinin Taban maaşı, tamsayı olarak girilecektir.
    // Kaç yıldır bu IT firmasında çalıştığı Tamsayı olarak girilecektir.
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen ünvanınızı giriniz.  Development (D), Tester (T), Software için (S) girilecektir");
        String unvan=input.next();
        switch (unvan.toLowerCase()){
            case "d":
                System.out.println("developmentsiniz");
                break;
            case "t":
                System.out.println("testersınız");
                break;
            case "s":
                    System.out.println("softwaresiniz");
                    break;
            default:
                System.out.println("geçersiz giriz yaptınız");
        }
        System.out.println("lütfen taban maaşinizi giriniz.");
        int maas=input.nextInt();

    // PRİM hesaplanırken ünvana bakılmaksızın, kişinin bu firmada kaç yıl çalıştığı baz alınacaktır,;
    // 5 ve daha az yıldır çalışanlara taban maaşının %10'u PRİM olarak verilecektir
    // 6 ve yukarı yıldır çalışanlara taban maaşının %15'i PRİM olarak verilecektir.
        System.out.println("firmamızda kacıncı yılınız?");
        int yil= input.nextInt();
        double prim10=maas*0.1;
        double prim15=maas*0.15;
        if(yil<=5){
            System.out.println( "prim hakedişiniz " + prim10 + "TL");
        } else if (yil>=6) {
            System.out.println( "prim hakedişiniz " +prim15 + "TL");
        }else{
            System.out.println("prim hak etmek icin en az 5 yıl bizimle calışmalısınız.");
        }

        // İKRAMİYE hesaplanırken kişinin ÜNVANI'na göre hesaplama yapılacaktır.
    // DEVELOPMENT ise; Taban Maaşı ve Prim toplamının % 7'si İKRAMİYE olarak verilecektir.
    // TESTER ise; Taban Maaşı ve Prim toplamının % 6'sı İKRAMİYE olarak verilecektir.
    // SOFTWARE ise; Taban Maaşı ve Prim toplamının % 5'i İKRAMİYE olarak verilecektir.
        if( unvan.equalsIgnoreCase("d")){
            System.out.println("ikramiyeniz : "+(maas ) * 0.07);
        } else if (unvan.equalsIgnoreCase("t")) {
            System.out.println("ikramiyeniz : "+(maas)*0.06);
        }else{
            System.out.println("ikramiyeniz : "+(maas)*0.05);
        }

        // Bu verilere göre; TABAN MAAŞI, ÇALIŞTIĞI YIL ve ÜNVAN'ı girilen kişinin PRİM ve İKRAMİYESİNİ bulunuz...



















}}