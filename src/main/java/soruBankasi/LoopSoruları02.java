package soruBankasi;

public class LoopSoruları02 {
    public static void main(String[] args) {
       /* soru 11
         Bir String’ i tersine çevirmek için kod yazınız. Örnek; Mark ==> kraM
    String word= "mark";
    String rever="";
    for(int i =word.length()-1; i>-1;i--){
        rever=rever+word.substring(i,i+1);
    }
        System.out.println(rever);
        //2,yol
    String worda= "tomhans";
    String rev="";
    int i= worda.length()-1;
    while (i>=0){
        rev= rev+worda.substring(i,i+1);
        i--;
    }
        System.out.println(rev);
    // 3. yol
        String wordb = "ozgun";
        String r = "";
        int i = wordb.length() - 1;
        do {
            r = r + wordb.substring(i, i + 1);
            i--;
        } while (i >= 0);

        System.out.println(r);*/
        /* soru 12
Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
A A A A A A A A
A X X X X X X A
A X X X X X X A
A X X X X X X A

        int row=4;
        int colum=8;
        for ( int i =1 ; i<=row ; i++){

        } */

        /*soru 13
        ) 3 ile 14 arasındaki tam sayıların toplamını bulmak için kodu yazınız

        int sum = 0;
        for (int i = 3; i < 15; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        //2.yol
       int total=0;
       int i=3;
       while (i<15){
           total=total+i;
           i++;
       }
        System.out.println(total);
        //3.yol
        int toplam = 0;
        int i = 3;
        do {
            toplam = toplam + i;
            i++;
        } while (i < 15);
        System.out.println(toplam);

       /* soru 14
       ) 3 ile 9 arasındaki tam sayıların çarpımını bulmak için kodu yazınız.

        int multiply = 1;
        for (int i = 3; i < 10; i++) {
            multiply = multiply * i;
        }
        System.out.println(multiply);
        //2.yol
        int product=1;
        int i=3;
        while(i<10){
            product *= i;
            i++;
        }
        System.out.println(product);
        //3.yol
        int carpim=1;
        int i=3;
        do{
            carpim =carpim*i;
            i++;
        }while (i<10);
        System.out.println(carpim);
         */


    }
}
