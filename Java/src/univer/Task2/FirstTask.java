package univer.Task2;

import java.util.Scanner;

public class FirstTask {

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
        for (int z = 0, sizee = size-1; z < size_2; z++, sizee--) {
            int temp = 0;
            if (num[z]%2 == 0 && num[sizee]%2 == 0) {
                temp = num[z];
                num[z] = num[sizee];
                num[sizee] = temp;
            }
            else continue;
        }

        for (int i = 0; i < size; i++) {
            System.out.print("\n"+num[i]);
        }
    }
}
