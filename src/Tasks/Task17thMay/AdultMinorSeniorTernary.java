package Tasks.Task17thMay;

//Again, use the nested ternary. You have to figure it out if I am an adult, minor, or senior.
// What is the condition? The condition is very simple. If my age is greater than 18, then I can be minor or adult or senior.
// But if my age is greater than 65, then I am a senior. If I am between 18 to 65, then I am an adult.

public class AdultMinorSeniorTernary {
    public static void main(String[] args)  {
        int age = 75;
        String result = (age < 18) ? "Minor" : (age >= 18 && age < 65) ? "Adult" : "Senior";
        System.out.println(result);
    }
}
