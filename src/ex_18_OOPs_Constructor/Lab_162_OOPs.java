package ex_18_OOPs_Constructor;

public class Lab_162_OOPs {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        Baby b2 = new Baby();
        Baby b3 = new Baby();
        Baby b4;
    }
}

class Baby{
    String Name;

    Baby(){
        System.out.println("I am called, Object is created");
    }
}
