package univer.Task3;

import java.util.Scanner;

public class FourthTask {

    public static void main(String[] args) {
        int a = getNumberInConsole(); // first element
        double t = getDoubleInConsole(); // progression step
        int alim = getNumberInConsole(); // limit
        int result = symGeometricElements(a, t, alim);
        System.out.println(result);
    }

    private static double getDoubleInConsole() {
        return new Scanner(System.in).nextDouble();
    }

    private static int getNumberInConsole() {
        return new Scanner(System.in).nextInt();
    }

    public static int symGeometricElements(int a, double t, int alim) {
        if(a < alim){
            return 0;
        }
        else{
            return a + symGeometricElements((int)Math.round(a*t),t, alim);
        }
    }
}
