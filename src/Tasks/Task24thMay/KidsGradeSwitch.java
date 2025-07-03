package Tasks.Task24thMay;

// Kids -> A -> Excellent, F -> Fail
// Create a program (with scanner as a input) that will basically be based on
// the alphabet or based on the grade.
// You will give the message to the kid if you got
// excellent, very good, good, needs improvement,
// fail, or invalid grade.

import java.util.Scanner;

public class KidsGradeSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter grade: ");

        String input = scanner.nextLine().trim();  // Read the full line and trim whitespace

        if (input.isEmpty()) {
            System.out.println("Input is empty. Please enter a valid grade.");
        } else {
            String grade = input.toUpperCase();  // Make it case-insensitive

            switch (grade) {
                case "A":
                    System.out.println("Excellent");
                    break;
                case "B":
                    System.out.println("Very Good");
                    break;
                case "C":
                    System.out.println("Good");
                    break;
                case "D":
                    System.out.println("Needs Improvement");
                    break;
                case "F":
                    System.out.println("Fail");
                    break;
                default:
                    System.out.println("Invalid Grade");
                    break;
            }
        }

        scanner.close();
    }
}
