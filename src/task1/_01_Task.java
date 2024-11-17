package task1;

import java.util.Scanner;

public class _01_Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Depremin büyüklüğünü Richter aralığına göre giriniz= ");
        double buyukluk = scanner.nextDouble();

        if (buyukluk > 0.0 && buyukluk < 2.0) {
            System.out.println("Micro - Mikro");
        } else if (buyukluk >= 2.0 && buyukluk < 3.0) {
            System.out.println("Very minor - Çok küçük");
        } else if (buyukluk >= 3.0 && buyukluk < 4.0) {
            System.out.println("Minor- Küçük");
        } else if (buyukluk >= 4.0 && buyukluk < 5.0) {
            System.out.println("Light - Hafif");
        } else if (buyukluk >= 5.0 && buyukluk < 6.0) {
            System.out.println("Moderate - Orta");
        } else if (buyukluk >= 6.0 && buyukluk < 7.0) {
            System.out.println("Strong - Ağır");
        } else if (buyukluk >= 7.0 && buyukluk < 8.0) {
            System.out.println("Major - Büyük");
        } else if (buyukluk >= 8.0 && buyukluk < 10.0) {
            System.out.println("Great - Çok büyük");
        } else if (buyukluk >= 10.0) {
            System.out.println("Meteoric - Meteorik");
        } else
        System.out.println("Lütfen geçerli bir ölçek aralığı giriniz.");



    }

}
