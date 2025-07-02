package Tasks.Task19thMay;

public class ClassificationTriangleCLITernary {
    public static void main(String[] args) {
        String UserInput1=args[0];
        String UserInput2=args[1];
        String UserInput3=args[2];
        int side1 = Integer.parseInt(UserInput1);
        int side2 = Integer.parseInt(UserInput2);;
        int side3 = Integer.parseInt(UserInput3);;

        String result = (side1 == side2 && side2 == side3) ? "Equilateral" : (side1 == side2 || side2 == side3 || side1 == side3) ? "Isosceles" : "Scalene";
        System.out.println(result);
    }
}
