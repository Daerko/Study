package univer.Task1;

import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        in.close();
        if (num > 0) {
            System.out.print("Result " + Math.pow((double)num, 2.0D));
        } else if (num == 0) {
            System.out.print("Result " + num);
        } else {
            System.out.print("Result " + num * -1);
        }
    }
}
