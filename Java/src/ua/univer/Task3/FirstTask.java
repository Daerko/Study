package ua.univer.Task3;

import java.util.Scanner;

public class FirstTask {

    public static boolean isSorted (int[] array){
        boolean inOrder = true;
        //boolean inOrderDesc = true;
        for (int i = 0; i < array.length-1 && inOrder; i++) {
            //check the pair starting at i
            inOrder = array[i] <= array[i+1];
        }
        return inOrder;
    }

    public static boolean isSortedDesc (int[] array){
        boolean inOrderDesc = true;
        //boolean inOrderDesc = true;
        for (int i = 0; i < array.length-1 && inOrderDesc; i++) {
            //check the pair starting at i
            inOrderDesc = array[i] >= array[i+1];
        }
        return inOrderDesc;
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
            System.out.println("Values in order\nSorted by ascending");
        }
        else if (isSortedDesc(values)){
            System.out.println("Values in order\nSorted by descending");
        }
        else
            System.out.println("Values not in order");
    }
}
