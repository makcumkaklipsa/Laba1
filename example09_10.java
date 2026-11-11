package Laba1; 

import java.util.Scanner;

public class example09_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите год рождения: ");
        int birthYear = scanner.nextInt();
        
      
        int age = 2026 - birthYear;
        
       
        System.out.println("Ваш возраст: " + age);
    }
}