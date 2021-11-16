package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length");
        int size = input.nextInt();
        int size_2 = size / 2;
        int num[] = new int[size];
        System.out.println("Insert array elements");

        for (int i = 0; i < size; i++) {
            num[i] = input.nextInt();
        }
        for (int z = 0, size1 = size-1; z < size_2; z++, size1--) {
            int temp = 0;
            temp = num[z];
            num[z] = num[size1];
            num[size1] = temp;
        }

        for (int i = 0; i < size; i++) {
            System.out.print("\n"+num[i]);
        }
    }
}