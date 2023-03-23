import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        int n = 8;
        int factorial = 1;
        for (int i = 1; i<=n; i++) {
            // factorial *= i;
            factorial = factorial*i;

        }
        System.out.println("Factorial of "+n+" is: "+factorial);
    }
}
