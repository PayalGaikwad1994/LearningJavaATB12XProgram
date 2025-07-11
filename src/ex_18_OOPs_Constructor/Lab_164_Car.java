package ex_18_OOPs_Constructor;

public class Lab_164_Car {
    public static void main(String[] args) {
        Car Tesla=new Car();
        Tesla.name="Tesla";
        Tesla.model="Model 3";

        System.out.println("Car Name:"+ Tesla.name);
        System.out.println("Car Model:"+ Tesla.model);
        System.out.println("Car Manufacturing Year:"+ Tesla.year);

        System.out.println();
        System.out.println();
        LoginPage L1=new LoginPage();
    }
}
