package day22inheritancepolymorphism;

public class Car extends Vehicle{
    public Car(){

    }
    public String colour;
    public int km;

    public Car(String colour, int km){
        super("car");
        this.colour=colour;
        this.km=km;
        System.out.println("Car constructor");
    }
}
