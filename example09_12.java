package Laba1; 

import java.util.Scanner;

public class example09_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();
        
      
        int year = 2026 - age;
        
       
        System.out.println("Ваш год рождения: " + year);
    }
}