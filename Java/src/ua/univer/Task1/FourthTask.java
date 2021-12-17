package ua.univer.Task1;

import java.util.Scanner;

public class FourthTask {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        in.close();
        System.out.println(Integer.toBinaryString(num));
        String str = Integer.toBinaryString(num);
        System.out.print(str.split("1").length);
    }
}
