package ex_19_OOPs_Part2_Inheritance;

public class Lab168_Single_Inheritance {
    public static void main(String[] args) {
        Son Bramha=new Son();
        Bramha.bhk3();
        Bramha.bhk2();
        System.out.println(Bramha.gold);

        Cousin C1=new Cousin();
        C1.bhk3();
        // C1.gold   Cousin cannot access Fathers gold as not inherited
    }
}
