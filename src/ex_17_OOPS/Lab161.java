package ex_17_OOPS;

public class Lab161 {
    public static void main(String[] args) {
        cat c1 = new cat();
        cat c2 = null;
        new cat();

        c1.running();
        // c2.running(); //NullPointerException because "c2" is null

    }
}
    class cat{
        String Name;
        String Breed;
        int Age;
        String Color;

        void running(){};

}
