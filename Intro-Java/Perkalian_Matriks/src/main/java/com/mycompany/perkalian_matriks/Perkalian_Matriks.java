/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perkalian_matriks;

/**
 *
 * @author hibrizi
 */

import java.util.Scanner;

public class Perkalian_Matriks {
    
    public static int[][] readMatriks(int n, Scanner scan, String matriksName) {
        int[][] matrix = new int[n][n];
        System.out.println("Masukkan nilai elemen matriks " + matriksName + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriksName + "[" + (i + 1) + "][" + (j + 1) + "] = ");
                matrix[i][j] = scan.nextInt();
            }
        }
        return matrix;
    }
    
    public static void printMatriks(int[][] matriks) {
        for (int[] baris : matriks) {
            for (int kolom : baris) {
                System.out.print(kolom + "\t");
            }
            System.out.println();
        }
    }
    
    public static int[][] perkalianMatriks(int[][] A, int[][] B) {
        int n = A.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++)
                    result[i][j] += A[i][k] * B[k][j];
        return result;
    }

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Masukkan ukuran matriks n: ");
       int n = scan.nextInt();
       
       int[][] A = readMatriks(n, scan, "A");
       int[][] B = readMatriks(n, scan, "B");
       
       System.out.println("\nHasil Perkalian Matriks:");
       printMatriks(perkalianMatriks(A, B));
    }
}
