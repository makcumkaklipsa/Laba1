package Laba1; 

import java.util.Scanner;

public class example09_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        
        System.out.print("Введите число: ");
        int b = scanner.nextInt();
        
        int sum = a + b;
        
        int raz = a - b;
      
       
        System.out.println("Сумма чисел: " + sum +  "," + "Разность чисел: " + raz);
    }
}