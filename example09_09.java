package Laba1; 

import java.util.Scanner;

public class example09_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите название месяца: ");
        String month = scanner.nextLine();
        
        System.out.print("Введите количество дней в месяце: ");
        int day = scanner.nextInt();
        
        
        System.out.println("Месяц " + month + " содержит " + day + " дней");
    }
}