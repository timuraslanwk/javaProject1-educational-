package task2;

import java.util.Scanner;

public class _01_Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Üçgenin ilk kenar uzunluğunu giriniz= ");
        double kenar1 = scanner.nextDouble();
        System.out.print("Üçgenin ikinci kenar uzunluğunu giriniz= ");
        double kenar2 = scanner.nextDouble();
        System.out.print("Üçgenin üçüncü kenar uzunluğunu giriniz= ");
        double kenar3 = scanner.nextDouble();

        if (kenar1 > (kenar2 + kenar3) || kenar2 > (kenar1 + kenar3) || kenar3 > (kenar1 + kenar2)) {
            System.out.println("Geçersiz Üçgen");
        } else if ((kenar1 == kenar2 && kenar2 == kenar3 && kenar1 == kenar3)) {
            System.out.println("Eşkenar üçgen");
        } else if ((kenar1 == kenar2 || kenar2 == kenar3 || kenar1 == kenar3)) {
            System.out.println("İkizkenar üçgen");
        } else if ((kenar1 != kenar2 && kenar2 != kenar3 && kenar1 != kenar3)) {
            System.out.println("Çeşitkenar Üçgen");
        }


    }

}
