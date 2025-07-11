package ex_17_OOPS;

public class Lab160 {
    public static void main(String[] args) {
        Student Payal = new Student();
        Payal.name = "Payal";
        Payal.age = 33;
        Payal.gender = "Female";
        Payal.DoAssignment();
        Payal.TakeTest();
    }
}

    class Student{

        String name;
        int age;
        String gender;
        String EmailId;
        String CourseName;

        //Behaviours
        void speak() {};
        void eat() {};
        void sleep() {};
        void DoAssignment() {};
        void TakeTest() {};

    }

