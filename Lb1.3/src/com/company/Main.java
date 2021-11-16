package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int x = in.nextInt();
        in.close();

           int  x1=x%10;
            x/=10;
            int x2= x%10;
            x/=10;
            int x3=x%10;
            x/=10;
            System.out.print(x1+"\n"+x2+"\n"+x3);

        }


    }