package ua.univer.Task1;

import java.util.Scanner;

public class ThirdTask {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        in.close();

        int result = 0;
        boolean what = true;

        while(what){
            if(num%2!=0)result += num%10;
            num/=10;
            if(num == 0)what = false;
        }

        System.out.print("Result is: " + result);
    }
}
