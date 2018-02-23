package Diziler;

import java.util.Random;
import java.util.Scanner;

public class DiziCalismasi {
    Scanner scanner = new Scanner(System.in);

    public void DiziIslemleri() {
        /*
         * Terstende aynı okunan kelimelere palindromik kelime denilmektedir.
         * Konsoldan girilen bir kelime veya cümlenin polindromik olup olmadığını
         * veren java algoritma kodunu yazınız ?*/
        //Kısayoldan Çözüm
        System.out.println("Lütfen Bir İfade Giriniz");
        String metin = scanner.nextLine();
        int boyut = metin.length();
        String tersMetin = "";

        for (int i = 0; i < boyut; i++) {
            tersMetin += metin.charAt(boyut - 1 - i);
        }
        if (metin.equals(tersMetin))
            System.out.println("polindromik");
        else
            System.out.println("Değil");

        // Aşağıdaki benim Çözümüm
        /*char dizi[] = new char[boyut];

        for (int i = 0; i < boyut; i++) {
            dizi[i] = metin.charAt(i);
        }

        int sayac=0;
        for (int i = 0; i < boyut; i++) {
            if(dizi[i]==dizi[boyut-1-i]){
                sayac++;
            }
        }
        if (sayac==(boyut))
            System.out.println("İfade polindromiktir");
        else
            System.out.println("Değildir");*/
    }


    public void randomSayi() {
        /*
        * 0 ile 1000 arasında random bir sayı oluşturarak bu
        sayının rakamları toplamını veren java algoritma kodunu yazınız */

        //Kısayoldan Çözüm
        int sayi= (int) (Math.random()*1000);
        System.out.println("Sayı    : "+sayi);
        int birler=sayi%10;
        sayi=sayi/10;
        int onlar=sayi%10;
        sayi=sayi/10;
        int yuzler=sayi%10;
        System.out.println("Rakamlar Toplamı    :   "+(birler+onlar+yuzler));
        // Aşağıdaki benim Çözümüm
    /*    Random random = new Random();
        int sayi = random.nextInt(1000);
        String deger = String.valueOf(sayi);
        int basamak = deger.length();
        int toplam = 0;
        System.out.println("Sayı    : " + sayi);

        for (int i = 0; i < basamak; i++) {
            System.out.println(deger.charAt(i));
            toplam += Character.getNumericValue(deger.charAt(i));
        }
        System.out.println("Toplam  : "+toplam);*/
    }
}
