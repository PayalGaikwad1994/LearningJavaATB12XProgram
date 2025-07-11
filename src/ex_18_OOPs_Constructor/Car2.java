package ex_18_OOPs_Constructor;

public class Car2 {
    String name;
    String model;
    int year;

    Car2(){
        name = "Unknown Car";
        model = "XXX";
        year = 0;
        System.out.println("DC");
    }
    Car2(String ModelName,int YearCreated){

        this.model=ModelName;
        this.year=YearCreated;
        System.out.println("PC");
    }
}
