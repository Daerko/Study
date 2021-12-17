package univer.Task3;

import java.util.Scanner;

public class ThirdTask {

    public static int MultiArithmeticElements(int a, int b){
        int result = a;
        int fN = a;
        for (int k = 0; k <= b-2; k++) {
            fN += 3;
            result *= fN;
            System.out.print(result + "  ");
            System.out.print(fN + "  ");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number of progression: ");
        int fNumber = in.nextInt();
        System.out.print("Enter the count of numbers: ");
        int cNumber = in.nextInt();
        System.out.print("The result of progression: " + MultiArithmeticElements(fNumber, cNumber));
    }
}
