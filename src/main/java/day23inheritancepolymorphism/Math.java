package day23inheritancepolymorphism;

public class Math extends Courses{
    public void practice(){
        System.out.println("Solve questions");
    }

    public Math(){
        super("Second");
        System.out.println("Constructor 1");
    }

    public Math(int a){
        this(); // Aynı classın içinde diğer constructor'u kullan
        System.out.println("Constructor 2");
    }



}
