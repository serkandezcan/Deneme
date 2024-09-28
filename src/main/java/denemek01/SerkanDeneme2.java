package denemek01;

import java.util.Scanner;

public class SerkanDeneme2 {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);  // Yanlışlık: System.!n -> System.in olarak düzeltildi
            System.out.println("Lütfen -128 ile 127 arasında bir sayı giriniz");  // Metindeki '!' işaretleri düzeltildi
            Byte sayı = scan.nextByte();
            System.out.println(sayı + sayı + sayı + sayı + sayı);
    }
}

