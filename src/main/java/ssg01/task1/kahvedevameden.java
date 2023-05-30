package ssg01.task1;

import java.util.Scanner;

public class kahvedevameden {
    public static void main(String[] args) {

     /*   1. Basit bir Kahve makinesi oluşturun.    3 çeşit kahvemiz olsun.
        2. Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
        3.Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
        Örn:
        Hangi Kahveyi İstersiniz?
                1.Türk kahvesi
        2.Filtre Kahve
        3.Espresso
        String hangiKahve oluşturun ve var olan kahvelerden birini yazınız.
        (örn: Türk Kahvesi,  ya da türk kahvesi.  --->  Büyük- küçük harf duyarlı olmaması için String methodu kullanın.)
        todo 1. Koşul bölümü
        Eğer kahve Türk kahvesi ise, konsola = Türk kahvesi hazırlanıyor. yazsın.(Dümdüz Türk kahvesi yazmayın.
                String hangiKahve'yi çağırın!!)
        Eğer filtre kahve ise,   konsola = Filtre kahve hazırlanıyor.  yazsın.     (String hangiKahve'yi kullanın !)
        Eğer Espresso ise, konsola =  Espresso hazırlanıyor...   yazsın.  (String hangiKahve'yi kullanın !)
        Eğer yanlış harf girerseniz, konsola = Hatalı tuşlama yaptınız. yazsın. (Hatalı tuslamadan sonra kod
        calısmaya devam edecektir, o konuyu daha görmediniz bu yüzden bastan baslatın.)
        Scanner input = new Scanner(System.in);
        System.out.println("Merhaba, Hangi kahveyi istersiniz. \n 1.Türk kahvesi \n 2.Filtre kahve \n 3.Espresso");
        String hangiKahve= input.nextLine();
        switch (hangiKahve.toLowerCase()){
            case "türk kahvesi":
                System.out.println("Türk kahvesniz hazırlanıyor...");
                break;
            case "filtre kahve":
                System.out.println("Filtre kahveniz hazırlanıyor...");
                break;
            case "espresso":
                System.out.println("Espressonuz hazırlanıyor...");
                break;
            default:
                System.out.println("geçersiz giriş yaptınız. lütfen;\n 1.Türk kahvesi \n 2.Filtre kahve \n 3.Espresso için secim yapınız");

        }*/

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Merhaba, Hangi kahveyi istersiniz. \n 1.Türk kahvesi \n 2.Filtre kahve \n 3.Espresso");
            String hangiKahve = input.nextLine();
            switch (hangiKahve.toLowerCase()) {
                case "türk kahvesi":
                    System.out.println("Türk kahvesniz hazırlanıyor...");
                    break;
                case "filtre kahve":
                    System.out.println("Filtre kahveniz hazırlanıyor...");
                    break;
                case "espresso":
                    System.out.println("Espressonuz hazırlanıyor...");
                    break;
                default:
                    System.out.println("geçersiz giriş yaptınız. lütfen;\n 1.Türk kahvesi \n 2.Filtre kahve \n 3.Espresso için secim yapınız");
            }
        } while (true);
    }
}
