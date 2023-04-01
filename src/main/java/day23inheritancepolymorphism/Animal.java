package day23inheritancepolymorphism;

public class Animal {

    //Overrriden
    public void eat(){
        System.out.println("Animals eat");
    }
    public Integer multiply(int a, int b){
        return a*b;
    }
    public Animal create(){
        return new Animal();
    }

}
