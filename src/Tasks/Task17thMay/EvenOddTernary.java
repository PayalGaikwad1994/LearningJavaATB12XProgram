package Tasks.Task17thMay;
//The ternary operator and let me know if I give you a number. Let me know if it is even or odd.

public class EvenOddTernary {
    public static void main(String[] args) {
        int num = -13;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
