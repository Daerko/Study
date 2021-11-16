package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        int size = input.nextInt();
        int[][] matrix = new int [size][size];
        System.out.println("Insert array elements");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Your matrix: ");
        for (int[] anMatrix : matrix) {
            for (int anAnMatrix : anMatrix) {
                System.out.print(anAnMatrix + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length-1; j++) {
                matrix[i][j+1] = 1;
            }
        }
        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < i+1; j++) {
                matrix[i+1][j] = 0;
            }
        }
        System.out.println("Result matrix: ");
        for (int[] anMatrix : matrix) {
            for (int anAnMatrix : anMatrix) {
                System.out.print(anAnMatrix + " ");
            }
            System.out.println();
        }
    }
}