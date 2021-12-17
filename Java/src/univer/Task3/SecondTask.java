package univer.Task3;

import java.util.Scanner;

public class SecondTask {

    public static boolean isSorted (int[] array){
        boolean inOrder = true;
        //boolean inOrderDesc = true;
        for (int i = 0; i < array.length-1 && inOrder; i++) {
            //check the pair starting at i
            inOrder = array[i] <= array[i+1];
        }
        return inOrder;
    }

    public static int transformArr (int[] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            k = array[i]+=i;
        }
        return k;
    }

    public static void main(String[] args) {
        //int[] values = {12,3,-4,4,0,16,41,-1,45,54};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int size = in.nextInt();
        int[] values = new int[size];
        System.out.println("Insert array values: ");

        //fill the array
        for (int i = 0; i < size; i++){
            values[i]=in.nextInt();
        }

        //print out the array
        System.out.println("Values");
        for (int val: values) {
            System.out.print(val + ", ");
        }
        System.out.println();
        //determine if it is in order
        if (isSorted(values)){
            transformArr(values);
            System.out.println("Values in order\nResult is: ");
            for (int i = 0; i < size; i++) {
                System.out.print(values[i] + " ");
            }
        }
        else
            System.out.println("Values not in order");
    }
}
