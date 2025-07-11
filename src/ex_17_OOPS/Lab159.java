package ex_17_OOPS;

public class Lab159 {
    public static void main(String[] args) {
        ATBx Payal = new ATBx();

        Payal.name = "Payal";
        Payal.age = 30;
        Payal.gender = "Female";
        Payal.DoAssignment();
        Payal.TakeTest();

        ATBx Bramha = new ATBx();
        Bramha.name = "Bramha";
        Bramha.age = 33;
        Bramha.gender = "Male";
        Bramha.DoAssignment();
        Bramha.TakeTest();
        Bramha.speak();


    }
}
