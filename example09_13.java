package Laba1; 

import java.util.Scanner;

public class example09_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите число: ");
        int namber1 = scanner.nextInt();
        
        
        System.out.print("Введите число: ");
        int namber2 = scanner.nextInt();
        
        int sum = namber1 + namber2;
        
       
        System.out.println("Сумма чисел " + sum);
    }
}