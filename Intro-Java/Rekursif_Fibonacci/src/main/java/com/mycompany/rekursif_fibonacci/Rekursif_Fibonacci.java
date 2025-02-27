/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rekursif_fibonacci;

/**
 *
 * @author hibrizi
 */

import java.util.Scanner;

public class Rekursif_Fibonacci {
    
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan inputan: ");
        int n = input.nextInt();
        
        System.out.println("Deret fibonacci: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        
    }
}
