package ex_04_Operators;

public class CommandLineArguments {
    public static void main(String[] args) {
        String SurName=args[0];
        String FirstName=args[1];
        String AgeString=args[2];
        String HeightString=args[3];
        int Age=Integer.parseInt(AgeString);
        float Height=Float.parseFloat(HeightString);
        System.out.println("SurName:"+SurName);
        System.out.println("FirstName:"+FirstName);
        System.out.println("Age:"+Age);
        System.out.println("Height:"+Height);
    }
}
