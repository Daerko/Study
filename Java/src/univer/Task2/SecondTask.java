package univer.Task2;

import java.util.Scanner;

public class SecondTask {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length");
        int size = input.nextInt();
        int num[] = new int[size];
        System.out.println("Insert array elements");

        for (int i = 0; i < size; i++) {
            num[i] = input.nextInt();
        }
        int number_max = 0;
        int number_max_index = 0;

        for (int i = 1; i < size; i++) {
            if(num[i] >= number_max) {number_max = num[i]; number_max_index = i;}
        }
        System.out.print("Result is: " + (number_max_index-1));
    }
}
