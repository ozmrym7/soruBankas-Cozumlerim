package soruBankasi;

public class LoopSorulari01 {
    public static void main(String[] args) {
        /* soru 6
    Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
A
A A
A A A
A A A A

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("A  ");
            }
            System.out.println();
        }*/
  /* soru 7
Aşağıdaki çarpım tablosunu oluşturmak için kod yazınız.
3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30

        int num = 3;
        for(int i=1; i<11; i++){
            System.out.print(num + "x" + i + "=" + num*i);
            System.out.print(" ");
        }

        //2.yol
        int num = 3;
int i=1;
while(i<11){
System.out.println(num + "x" + i + "=" + num*i);
i++;
}
*/
        /*soru 8
        ) 20'den 3'e kadar olan tek tamsayıları aynı satırda ardışık olacak şekilde aralarında boşluk
bırakarak yazdırmak için gereken kodu yazınız.


        for (int i = 20; i > 2; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }*/
/* soru 9
) String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
Örneğin; 'Ali Can?' ==> l*i*a*n*

String s ="Ali Can?";
        s = s.replaceAll("[^a-z]", "");// s sepetindeki kücükhariç hepsini sil
       // System.out.println(s); //*li**an*
String t ="";
for( int i=0 ; i<s.length();i++){
    String c= s.substring(i,i+1);
    t=t+c+"*";

}System.out.print(t);*/
        /* soru 10
        Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
işaretiyle yazdırmak için gereken kodu yazınız.
Örneğin; 75.4238 ´ *4*2*3*8

double x = 75.4238;
String s =String.valueOf(x);
String bos= "";
       String noktasonrasi=  s.split("\\.")[1];
        for (int i=0; i<noktasonrasi.length();i++){
            char c= noktasonrasi.charAt(i);
            bos=bos+"*"+c;
        }
        System.out.println(bos);*/
      /* gbt çözümü
       double sayi = 75.4238;
        String ondalikKisim = String.valueOf(sayi).split("\\.")[1];

        for (int i = 0; i < ondalikKisim.length(); i++) {
            System.out.print("*" + ondalikKisim.charAt(i));
        }

        System.out.println();*/







    }
}
