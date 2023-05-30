package ssg01.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayscalisma {
    public static void main(String[] args) {
 /* Soru: Bir kullanıcıdan pozitif iki tamsayı girmesini isteyen bir program yazmanız isteniyor.
Ardından, girilen sayıların faktöriyelini hesaplayan bir program yazın ve bu iki sayının faktöriyellerinin toplamı sonucunu ekrana yazdırın.
pozitif bir tam sayi harici bir deger girerse sonsuz döngü oluşturun(otamatik olarak döngü tekrar etsin)
ekrana "Hatalı giriş yaptınız Lütfen pozitif iki tam sayi giriniz" mesajını yazdırın
ve kullanıcının otamatik(yeniden run yapmadan) olarak iki sayı girecegi ekran gelmesini saglayın
Faktöriyel, bir sayının kendisi ile 1 arasındaki tüm sayıların çarpımıdır.
 Örneğin, 3 faktöriyel (5!) = 3 x 2 x 1 = 6'dir.
          4 faktöriyel (5!) = 4 x 3 x 2 x 1 = 24'dir.
          toplam 30

 Lütfen pozitif iki tam sayi giriniz
 4
 -3
 Hatalı giriş yaptınız lütfen pozitif iki tam sayi giriniz
 3
 4
     //kullanıcıdan iki sayi aldik
        Scanner input=new Scanner(System.in);
        do {
            System.out.println("lütfer 2 pozitif tam sayi giriniz...");
        int num1 = input.nextInt();
        int num2= input.nextInt();
        //girilen sayinin faktöriyelini hesaplayan ve sonra faktoriyellerin toplamını ekrana yazdırın
         if (num1>0 &&num2>0) {
            int faktoriyel1 = 1;
            for (int i = 1; i <= num1; i++) {
                faktoriyel1 = (faktoriyel1 * i);
            }
            System.out.println(num1 + " sayisinin faktöriyeli=" + faktoriyel1);

            int faktoriyel2 = 1;
            for (int i = 1; i <= num2; i++) {
                faktoriyel2 = faktoriyel2 * i;
            }
            System.out.println(num2 + " sayisinin faktöriyeli=" + faktoriyel2);

            System.out.println("girdiğiniz 2 sayinin faktöriyellerinin toplamı=" + (faktoriyel1 + faktoriyel2));
        }else{
            System.out.println("OPPS! lütfen tam sayi değeri giriniz...");
        } }while (true);

       // pozitif bir tam sayi harici bir deger girerse sonsuz döngü oluşturun(otamatik olarak döngü tekrar etsin)
*/
///Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden kodu yazınız
     /*   Scanner input= new Scanner(System.in);
        System.out.println("lütfen kaç adet sayi girişi yapacağınızı belirtiniz");
        int arr[]=new int[input.nextInt()]; // kullanıcının girdiği degerler array olarak alındı
         for (int i =0 ; i < arr.length; i++) {
            System.out.println(i + ".index için eleman girişi yapınız: ");
            arr[i]=input.nextInt();
            System.out.println( Arrays.toString(arr));
        }
     for (int i = 0; i < arr.length ; i++) {
            if (arr[i]%2==1){
                System.out.println("arr[i] = " + arr[i]);
           } }

        int arr[]= new int[]{5,3,6,1,4,8,9};
        for (int w:arr) {
         if (w%2!=0){
             System.out.println(w);
        }}
      */

        /*
        Soru: Bir tamsayı dizisi verildiğinde, bu dizideki ardışık olmayan elemanları toplamının maksimum değerini bulan
         bir Java fonksiyonu yazmanızı istiyoruz. Eğer dizide en az 2 eleman yoksa veya dizi geçerli değilse (null veya boş ise),
          fonksiyon 0 değerini döndürmelidir.
         */
        int arr[]=new int[]{9,8,4,2,7}; //dizi ekledim
       Arrays.sort(arr);//diziyi sıraladım
        System.out.println(Arrays.toString(arr));
        int ardisikOlmayanlarinToplami=0;
         if (arr.length>=2){                //en az 2 elemandan fazla ise
             for (int i = 0; i < arr.length-1 ; i++) {  //ilk indexten son indexe kadar tek tek ele al
                 if (arr[i] + 1 != arr[i + 1]&&arr[i] + 1 != arr[i + 1] ) {    // eğer ilk ve sonrakinin bir fazlasıne ve bir eksigine eşit değilse
                   ardisikOlmayanlarinToplami+=(arr[i]);    //ardışık olmayanları seç(2,4)
                     System.out.println(ardisikOlmayanlarinToplami); // 6  FAKAT 6DAN ÖNCE NEDEN 2 GÖRÜNÜYDR?
                     }
             }
         }else if (arr.length<2 || arr.length==0){  //erey 2 den küçük ise veya boş ise
             System.out.println("dizi geçerli değil");
           //  return 0;  // burası da neden olmadı anlamadım :)
         }
    }}













