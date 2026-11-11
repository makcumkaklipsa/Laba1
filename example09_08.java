package Laba1; 

import java.util.Scanner;

public class example09_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите название недели: ");
        String week = scanner.nextLine();
        
        
        System.out.print("Введите название месяца: ");
        String month = scanner.nextLine();
        
        System.out.print("Введите день: ");
        int day = scanner.nextInt();
        
       
        System.out.println("Сегодня " + day + ", " + week + " " + month);
    }
}