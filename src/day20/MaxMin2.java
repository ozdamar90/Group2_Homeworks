package day20;

import java.util.Scanner;

public class MaxMin2 {
    public static void main(String[] args) {


        System.out.println("Lütfen 10 Adet Sayı Giriniz : ");
        Scanner input = new Scanner(System.in);
        int[] sayilar = new int[10];
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(i + 1 + ". Sayı :");
            sayilar[i] = input.nextInt();

        }


        int max = sayilar[0];
        int min = sayilar[0];


        for (int i = 1; i < sayilar.length; i++) {

            if (max < sayilar[i]) {
                max = sayilar[i];
            }
            if (min > sayilar[i]) {
                min = sayilar[i];
            }

        }
        System.out.println();

        System.out.printf("Max sayi=%5d\nMin sayi=%5d", max, min);



    }
}


