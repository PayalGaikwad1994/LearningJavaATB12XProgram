package Tasks.Task17thMay;
//Use the ternary operator, nested ternary operator. If we have three numbers, N1, N2, and N3, give me the maximum between the three numbers.

public class MaxOfThreeTernary {
    public static void main(String[] args) {
        int N1 = 10, N2 = 20, N3 = 30;
        int max = (N1 > N2) ? (N1 > N3 ? N1 : N3) : (N2 > N3 ? N2 : N3);
        System.out.println(max);
    }
}
