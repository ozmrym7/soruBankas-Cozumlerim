package ssg01.task1;

import java.util.Scanner;

public class ssgsorusu {
    public static void main(String[] args) {
        /* kullanıcıdan ibr harf girmesini isteyin;
        girilen harf sesli ise sesli olduğunu
        değilse sessiz olduğunu;
        girilen değer harf deilse yada bir karakterden fazla ise hata msjı gösterin( test edilen harfi büyük yada küçüğe duyarlıdır)

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir harf girişi yapınız");
        String harf = input.next();*/
//---------------------------------------------------------------------------
        /*
  1. Basit bir Kahve makinesi oluşturun.    3 çeşit kahvemiz olsun.
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
        calısmaya devam edecektir, o konuyu daha görmediniz bu yüzden bastan baslatın.)*/
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

        }

        /*  todo ----------------------------------
       Sistem bize şu soruyu sorsun: "Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):
         "   Konsolda aynen böyle  yazmalı. Parantez içi de konsolda olsun.
       String sut olusturun.
                                                                           todo 2.Koşul Bölümü
       eğer String sut,  evet   e eşitse,konsola, Süt ekleniyor... yazısı gelsin.
        --(Büyük küçük harf duyarlı olmaması için String methodu kullanın. Olması gereken ihtimaller:
         Evet, EVET, EvEt,EVEt vs.
      eğer String sut, hayır a eşit ise, konsola , Süt eklenmiyor  yazısı gelsin. */
        System.out.println("süt eklemek ister misiniz? (evet veya hayır olarak cevaplayınız)");
      String sut=input.next();
      if (sut.equalsIgnoreCase("evet")){
          System.out.println(" süt ekleniyor");
      } else if (sut.equalsIgnoreCase("hayır")) {
          System.out.println("süt eklenmiyor");
      }else{
          System.out.println("tanımlanmamış giriş");
      }
      /*  todo ----------------------------------
      Sistem bize "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : " şeklinde bir soru sorsun.
        (Büyük küçük harf duyarlılıgı olmaması için string method kullanın.
        String seker oluşturunuz.
                                                                todo 3.Koşul Bölümü
        todo if(){
        Eğer String seker   Evet e eşitse ,  sistem bize "Kaç şeker olsun?" sorusunu sormalı.
        Sorunun altına int kacSeker  oluşturunuz.
        Şeker sayısını giriniz.
        Ve konsola   şunu yazdırınız örnek: 5 şeker ekleniyor.  (ipucu: Bu kodların heosi if bloğunun içerisinde olacak)
        todo }
        todo else{
    Eğer String şeker  hayır 'a eşitse, sistem bize "Şeker eklenmiyor" cevabını versin.
            ONEMLİ !! =   bir int girdisinden sonra String girdisi yapacaksak,araya boş bir nextLine
            koymamız gerekiyor. (String bosKod = sc.nextLine();    )  dummy kod ekleyiniz.*/

        System.out.println("Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : ");
        String seker= input.next();

        if(seker.equalsIgnoreCase("hayır")){
            System.out.println("seker eklenmiyor");
        } else if (seker.equalsIgnoreCase("evet")) {
            System.out.println("kac seker olsun");
            int sekersayisi= input.nextInt();
            System.out.println(sekersayisi+" şeker ekleniyor.");
        } else{
            System.out.println("geçersiz giriş yaptınız");}

        /* Sistem bize "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :   sorusunu sorsun.
  (büyük küçük harf duyarlılıgı olmamalı. yani kullanıcı büyük boy veya BüYüK Boy girdiginde kabul etmeli.
  String boyut oluşturun...
                                                   todo 4.Koşul Bölümü
        eğer String boyut Büyük boy' a eşitse =  Kahveniz büyük boy hazırlanıyor.
        (Büyük boy kısmını String boyut'u kullanarak yazalım= "Kahveniz" + boyut + "hazırlanıyor.")
        Eğer String boyut  Orta Boy'a eşitse = Kahveniz orta boy hazırlanıyor.. ("Kahveniz" + boyut + "hazırlanıyor.)
        Eğer String boyut  Küçük boy'a eşitse = Kahveniz küçük boy hazırlanıyor.    yazsın.
        ("Kahveniz" + boyut + "hazırlanıyor.) */
        String bosKod = input.nextLine();
        System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) : ");
        String boyut= input.nextLine();
        boyut.replace("\\s","");

        if (boyut.equalsIgnoreCase("büyük boy")){
            System.out.println("Kahveniz" + boyut + "hazırlanıyor.");
        } else if (boyut.equalsIgnoreCase("orta boy")) {
            System.out.println("Kahveniz" + boyut + "hazırlanıyor.");
        } else if (boyut.equalsIgnoreCase("kücük boy")) {
            System.out.println("Kahveniz"+"  " + boyut + "  "+"hazırlanıyor.");
        } else {
            System.out.println("tanımlanmamıs giris yaptınız.yeniden deneyin.");
        }
        /*   //todo  SONUÇ BÖLÜMÜ
                    Siparişlerimizi verdik. Son hali görmek istiyoruz.
                    konsola şunu yazdırın örnek :
        Türk Kahvesi orta boy hazırdır. Afiyet olsun !!! (Türk kahvesi için String hangiKahveyi kullanın.
         orta boy için de String boyut ' u kullanın.)
        todo Açıklama :
       Projeyi bilerek biraz zor hazırladık. Üzerinde fazla fazla kafa yormanız ve "grupça çalışmanız için"
       böyle düzenledik. Yapamayan arkadaşlar kesinlikle canlarını sıkmasın.
       Size çok zor gelebilir. Ancak adım adım ilerlerseniz, grup ile çözerseniz ve yazdığım notları tamamen
        uygularsanız halledebilirsiniz. Öğrenmediğiniz hiçbir şey yok. Sadece biraz karışık.
       HERKESE KOLAY GELSİN !! :)
                 */
        System.out.println( hangiKahve + "niz  " + boyut + "da hazırdır. Afiyet olsun");


    }
}
