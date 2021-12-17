package univer.Task1;

import java.util.Scanner;

public class SecondTask {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number(100 < number < 999): ");
        int num = in.nextInt();
        in.close();
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = num%10;
            num/=10;
        }
        for (int i = 0; i < 2; i++) {
            int temp = 0;
            if (arr[i] < arr[i+1]) {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i]);
        }
    }
}
