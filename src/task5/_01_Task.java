package task5;

import java.util.Scanner;

public class _01_Task {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        float toplamMaas;

        float prim;

        float primOrani;


        System.out.print("Lütfen sabit maaşınızı giriniz= "); float sabitMaas= scanner.nextFloat();
        System.out.print("Lütfen Satış Kazancınızı giriniz= "); float satisKazanci= scanner.nextFloat();
        System.out.print("Lütfen performans seviyenizi giriniz= "); float performansSeviyesi= scanner.nextFloat();

        if (satisKazanci>performansSeviyesi){
            primOrani=0.10F;
        } else primOrani=0.05F;

        prim=satisKazanci*primOrani;

        toplamMaas= sabitMaas+prim;

        System.out.println("Maaşınız= " + toplamMaas);

























    }

}
