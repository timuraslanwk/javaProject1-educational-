package task3;

import java.util.Scanner;

public class _01_Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float aylikFatura;
        float birimFiyat = 1;

        System.out.print("Eski okuma= ");
        int eskiOkuma = scanner.nextInt();
        System.out.print("Yeni okuma= ");
        int yeniOkuma = scanner.nextInt();

        int elektrikTuketimi = yeniOkuma - eskiOkuma;

        if (elektrikTuketimi >= 0 && elektrikTuketimi <= 100) {
            aylikFatura = elektrikTuketimi * (birimFiyat * 1.1F);
            System.out.println("Aylik Fatura = " + aylikFatura);
        } else if (elektrikTuketimi > 100 && elektrikTuketimi <= 200) {
            aylikFatura = elektrikTuketimi * (birimFiyat * 1.3F);
            System.out.println("Aylik Fatura = " + aylikFatura);
        } else if (elektrikTuketimi > 200 && elektrikTuketimi <= 300) {
            aylikFatura = elektrikTuketimi * (birimFiyat * 1.5F);
            System.out.println("Aylik Fatura = " + aylikFatura);
        }else if (elektrikTuketimi > 300 && elektrikTuketimi <= 400) {
            aylikFatura = elektrikTuketimi * (birimFiyat * 1.7F);
            System.out.println("Aylik Fatura = " + aylikFatura);
        }else if (elektrikTuketimi > 400 && elektrikTuketimi <= 500) {
            aylikFatura = elektrikTuketimi * (birimFiyat * 1.9F);
            System.out.println("Aylik Fatura = " + aylikFatura);
        }else if (elektrikTuketimi > 500 ) {
            aylikFatura = elektrikTuketimi * (birimFiyat * 2.3F);
            System.out.println("Aylik Fatura = " + aylikFatura);
        }else System.out.println("Lütfen geçerli değerleri giriniz.");





    }

}
