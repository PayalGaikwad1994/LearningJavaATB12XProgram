package ex_18_OOPs_Constructor;

public class Lab_165_Const {
    public static void main(String[] args) {
        Car2 Tesla=new Car2();
        System.out.println("Model name"+Tesla.model);
        System.out.println("Year Created"+Tesla.year);
        System.out.println("Car name"+Tesla.name);
        System.out.println();

        Car2 Audi=new Car2("A4",1991);
        System.out.println("Model name"+Audi.model);
        System.out.println("Year Created"+Audi.year);
        System.out.println("Car name"+Audi.name);
        System.out.println();
    }
}
