package com.company;
import java.util.Scanner;


public class Main {
    public static boolean isSorted ( int[] array )
    {
        boolean inOrder = true;
        System.out.println("Задайте метод сортування:z(по зростанню),s(по спаданню)");
        Scanner scan = new Scanner(System.in);
        String res =scan.nextLine();
        if(res.charAt(0) == 's') {
            for (int j = 0; j < array.length - 1 && inOrder; j++) {

                inOrder = array[j] >= array[j + 1];
            }
        }
        if(res.charAt(0) == 'z') {
            for (int j = 0; j < array.length - 1 && inOrder; j++) {
                // check the pair starting at j
                inOrder = array[j] <= array[j + 1];
            }
        }
        return inOrder;
    }
    public static int Transform(int [] array) {
        int z=0;
        for (int i = 0; i < array.length; i++ ){
           array[i]=array[i]+i;

        }
    return z;
}
    public static void main(String[] args) {
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter array length");
            int size = input.nextInt();
            int[] num = new int[size];
            System.out.println("Insert array elements");
            int i;
            for(i = 0; i < size; ++i) {
                num[i] = input.nextInt();
            }
            System.out.println("values: ");
            for ( int val : num )
                System.out.print( val + ", " );
            System.out.println( );
            if ( isSorted(num) ) {
                Transform(num);
                System.out.println("Is in order");
                System.out.println("values: ");
                for ( int val : num )
                    System.out.print( val + ", " );}
            else
                System.out.println( "Is NOT in order" );
        }
    }
    }

