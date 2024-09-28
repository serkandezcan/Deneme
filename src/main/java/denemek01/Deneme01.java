package denemek01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Deneme01 {
    public static void main(String[] args) {

        //Ornek 1: Bir int array olusturun ve 5 ten kucuk olan elemanlari yazdirin.
        //Example 1: Create an int array and write the elements less than 5.
        //           [12, 3, -3, 5, 23] ==> 3, -3

        //int[] numbers = {12, 3, -3, 5, 23};

        //for (int w : numbers) {
          //  if (w < 5) {
             //   System.out.println(w);

     //      }
      //  }
        //-------------------

        //Ornek 2: Spesifik bir elemanin Array'de olup olmadigini anlamak icin gereken kodu yaziniz.
        //Example 2: Write the code to find out if a specific element is in Array

        //binarySearch() methodu var olan elemanlar icin size o elemanin index’ini verir
        //binarySearch() methodunu sort() kullanmadan kullanmayiniz
        //binarySearch() methodu olmayan elemanlar icin size negatif tamsayi verir
        // "-" ==> isaretinin anlami eleman yok demektir

        /*
        Yani, metot şu şekilde çalışır:
            Diziyi ikiye bölün.
            Aranan değer, ortadaki elemana eşitse, arama tamamlanır.
            Aranan değer, ortadaki elemandan küçükse, dizinin sol yarısında aramaya devam edilir.
            Aranan değer, ortadaki elemandan büyükse, dizinin sağ yarısında aramaya devam edilir.
            Bu işlem, aranan değer bulunana veya dizi içinde aranacak bir alt dizi kalmayana kadar
             tekrar edilir.
         */

      /*  String[] nms = {"C", "F", "T", "G", "R"};
        Arrays.sort(nms);
        System.out.println(Arrays.toString(nms));

        int sonuc = Arrays.binarySearch(nms,"R");
        System.out.println(sonuc);*/

        //ARASTIRMA ODEVI: Java'da char veya boolean turunde bir array olusturabilir misiniz?
        //-------------------------
        //Ornek 3: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
        //Example 3: Write the code that shows you how many words are in a given sentence.
        //String s = "Java is easy. Learn Java earn money.";

        String s = "Java is easy. Learn Java earn money.";
        System.out.println(s);
        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);


    }
}
