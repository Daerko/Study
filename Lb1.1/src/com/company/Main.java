package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int x = in.nextInt();
        if (x>0) x*=x;
        else if (x<0) x*=(-1);
        else if (x==0) x=0;
        System.out.printf("Result:"+x);
    }
}
