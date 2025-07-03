package Tasks.Task24thMay;
//Write a Java program that takes a month number (1-12)
// and prints the number of days in that month using a switch statement. Handle February separately for leap years.


import java.util.Scanner;
public class DaysInMonths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number: ");
        int month = scanner.nextInt();
        int days = 0;
        switch (month) {
            case 1,3,5,7,8,10,12:
                days = 31;
                break;
            case 4,6,9,11:
                days = 30;
                break;
            case 2:
                System.out.println("Enter year: ");
                int year = scanner.nextInt();
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                System.out.println("Invalid month number");
                break;
        }
        System.out.println("Number of days: " + days);
    }
}
