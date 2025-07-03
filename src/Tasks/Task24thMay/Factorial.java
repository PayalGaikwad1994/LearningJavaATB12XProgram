package Tasks.Task24thMay;
//Task 3 : Factorial for n = user will enter the n from 0 to Max(int) with scanner as a input

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        if(scanner.hasNextInt())
        {
            int n = scanner.nextInt();
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + n + " is: " + factorial);
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}
