package Laba1; 

import java.util.Scanner;

public class example09_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        
        System.out.print("Введите год рождения: ");
        int age = scanner.nextInt();
        
        int year = 2026 - age;
        
       
        System.out.println("Имя: " + name + ", Ваш возраст: " + year);
    }
}