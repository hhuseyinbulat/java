package day22inheritancepolymorphism;

public class Honda extends Car{
    public Honda(){
        super("white",54000);
        System.out.println("Honda Constructor");

    }
    public String colour;

    public Honda(String colour){
        this.colour=colour;

    }
}
