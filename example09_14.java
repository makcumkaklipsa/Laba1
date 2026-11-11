package Laba1; 

import java.util.Scanner;

public class example09_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        
        int b = a - 1;
        
        int c = a + 1;
      
        int d = (a + b + c );
        
        int sum = d * d;
        
       
        System.out.println(b + "," + a + "," + c + "," + sum);
    }
}