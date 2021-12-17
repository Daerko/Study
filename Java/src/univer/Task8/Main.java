package univer.Task8;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        switch (option) {
            case 1: {

                String str = "in carnage carnage carnage i bloom bloom bloom like a flower in in in the down";
                int word = 0;
                String [] words = str.split(" ");
                System.out.println(Arrays.toString(words));
                while (word != 3) {
                    int count = 0;
                    String temp = words[0];
                    for (int i = 0; i < words.length - 1; i++) {
                        if (words[i].length() < words[i + 1].length()) {
                            temp = words[i + 1];
                        }
                    }

                    for (int i = 0; i < words.length; i++) {
                        if (words[i].equals(temp)) {
                            count++;
                        }
                    }
                    System.out.println("The word " + temp);
                    System.out.println("Times: " + count);

                    for (int i = 0; i < words.length; i++) {
                        if (words[i].equals(temp)) {
                            words[i] = words[words.length - 1];
                        }
                    }
                    word++;
                }
                break;
            }

            case 2:{
                String str = "in carnage i bloom like a carnage in the carnage";
                int word = 0;
                String [] words = str.split(" ");
                System.out.println(Arrays.toString(words));
                while (word != 3) {
                    int count = 0;
                    String temp = words[0];
                    for (int i = 0; i < words.length - 1; i++) {
                        if (words[i].length() < words[i + 1].length()) {
                            temp = words[i + 1];
                        }
                    }

                    for (int i = 0; i < words.length; i++) {
                        if (words[i].equals(temp)) {
                            count = words[i].length();
                        }
                    }
                    System.out.println("The word " + temp + " length " + count);

                    for (int i = 0; i < words.length; i++) {
                        if (words[i].equals(temp) || words[i].length() == temp.length()) {
                            words[i] = words[words.length - 1];
                        }
                    }
                    word++;
                }
                break;
            }
            case 3:
            {
                String str = "in carnage i bloom bloom bloom like a flower in the down";
                int word = 0;
                String [] words = str.split(" ");

                System.out.println(Arrays.toString(words));

                while (word != 3) {
                    String temp = words[0];

                    for (int i = 0; i < words.length - 1; i++) {
                        if (words[i].length() < words[i + 1].length()) {
                            temp = words[i + 1];
                        }
                    }

                    System.out.println("The word " + temp.toUpperCase());

                    for (int i = 0; i < words.length; i++) {
                        if (words[i].equals(temp)) {
                            words[i] = words[words.length - 1];
                        }
                    }
                    word++;
                }
                break;
            }
            default:{
                break;
            }
        }
    }
}
