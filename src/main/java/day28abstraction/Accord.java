package day28abstraction;

public class Accord implements Engine,Ac,Hood {


    @Override
    public void eco() {
        System.out.println("uses eco engine");
    }

    @Override
    public void gas() {
        System.out.println("uses gas");

    }

    @Override
    public void tsi() {
        System.out.println("uses tsi");

    }

    @Override
    public void digital() {
        System.out.println("uses digital ac");
    }

    @Override
    public void climent() {
        System.out.println("uses climent ac");

    }

    @Override
    public void steal() {
        System.out.println("hood is made by steal");
    }
}
