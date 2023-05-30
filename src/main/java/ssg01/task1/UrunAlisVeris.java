package ssg01.task1;

import java.util.Scanner;

public class UrunAlisVeris {
    public static void main(String[] args) {
        /*
         * TASK :
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
         * alirsa %10 indirim yapan code create ediniz.
         */
        Scanner input= new Scanner(System.in);
        System.out.println("kaç adet ürün aldınız?");
        int piece= input.nextInt();
        System.out.println("ürünün liste fiyatı nedir");
        double price= input.nextDouble();
        System.out.println("müsteri kartınız var mı?");
        String card= input.next();
        if(card.equalsIgnoreCase("evet")){
            if (piece>10){
                System.out.println("ödemeniz= "+ (piece*price)*0.20 +"tl");
            }else{
                System.out.println((piece*price)*0.15);
            }
        } else if (card.equalsIgnoreCase("hayır")) {
            if(piece>10){
                System.out.println((piece*price)*0.15);
            }else{
                System.out.println((price*piece)*0.10);
            }

        }
    }
}
