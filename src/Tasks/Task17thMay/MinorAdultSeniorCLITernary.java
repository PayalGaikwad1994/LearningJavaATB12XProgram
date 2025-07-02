package Tasks.Task17thMay;

public class MinorAdultSeniorCLITernary {
    public static void main(String[] args)  {
        int age = 75;
        String result = (age < 18) ? "Minor" : (age >= 18 && age < 65) ? "Adult" : "Senior";
        System.out.println(result);
    }
}
