package task4;

import java.util.Scanner;

public class _01_Task {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int suSicakligi;
        System.out.print("Su sıcaklığını giriniz= "); suSicakligi= scanner.nextInt();

if (suSicakligi<=0){
    System.out.println("Su katı haldedir.");
} else if (suSicakligi > 0 && suSicakligi < 100) {
    System.out.println("Su sıvı haldedir.");
} else System.out.println("Su gaz halindedir.");










    }

}
