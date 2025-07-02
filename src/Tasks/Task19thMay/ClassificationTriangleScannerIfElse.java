package Tasks.Task19thMay;

import java.util.Scanner;


public class ClassificationTriangleScannerIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sides of triangle: ");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}
