package ssg01.task1;

import java.util.Scanner;

public class kahve {


    public class Method {
        String hangiKahve;
        String sut;
        String seker;
        String boyut;
        Scanner scan=new Scanner(System.in);
        public void hangiKahveSec(){
            System.out.println("hangi kahveyi istersiniz");
            System.out.println("türk kahvesi, filtre kahve,espresso");
            hangiKahve=scan.nextLine().toLowerCase();
            switch (hangiKahve){
                case "türk kahvesi":
                    System.out.println("türk kahvesi hazırlanıyor");
                    sutSec();
                    sekerSec();
                    boyutSec();
                    sonuc();
                    break;
                case "filtre kahve":
                    System.out.println("filtre kahve hazırlanıyor");
                    sutSec();
                    sekerSec();
                    boyutSec();
                    sonuc();
                    break;
                case "espresso":
                    System.out.println("espresso hazırlanıyor");
                    sutSec();
                    sekerSec();
                    boyutSec();
                    sonuc();
                    break;
                default:
                    System.out.println("lütfen bir seçim yapınız");}
        }
        public void sutSec(){
            System.out.println("süt eklememizi ister misiniz? (evet veya hayır olarak cevaplayınız)" );
            sut=scan.next().toLowerCase();
            switch (sut){
                case "evet":
                    System.out.println("süt ekleniyor");
                    break;
                case "hayır":
                    System.out.println("süt eklenmiyor");}}
        public void sekerSec(){
            System.out.println("şeker ister misiniz?(evet veya hayır olrak cevaplayınız)");
            seker=scan.next().toLowerCase();
            if (seker.equals("evet")){
                System.out.println("kahvenize seker ekleniyor");}
            if (seker.equals("hayır")) {
                System.out.println("kahvenize şeker eklenemiyor");}
        }
        public void boyutSec(){
            System.out.println("hangi boyutta olsun?(büyük,orta,küçük)");
            boyut=scan.next().toLowerCase();
            if (boyut.equalsIgnoreCase("büyük")){
                System.out.println("kahveniz" +  boyut + " " + "boy" + " " + "hazırlanıyor");}
            else if (boyut.equalsIgnoreCase("orta")) {
                System.out.println("kahveniz" + " " +  boyut  + " " +  "boy"+ " " + "hazırlanıyor");}
            else if (boyut.equalsIgnoreCase("küçük")){
                System.out.println("kahveniz" +" "+  boyut + " " + "boy" + " "  + "hazırlanıyor");}
        }
        public void sonuc(){
            System.out.println("Kahveniz " + boyut +" "  + "boy " +   hangiKahve + " şeklinde hazırlandı.Afiyet Olsun..." ) ;}
    }
}
