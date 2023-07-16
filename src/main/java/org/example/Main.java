package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı girin : ");
        int n = scanner.nextInt();
        System.out.print("3 ve 4'e bölünen tam sayılar :");
        for(int i = 1; i<= n ; i++){
            if(i%3 == 0 && i%4 ==0){
                System.out.print(i +" ");
            }
        }
    }
}