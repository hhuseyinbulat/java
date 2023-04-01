package day24statickeywordencapsulation;

public class StudentRunner {
    public static void main(String[] args) {
        Student stdt1 = new Student();
        System.out.println(stdt1.getStdId());
        System.out.println(stdt1.getGpa());
        System.out.println(stdt1.isRetired());

        stdt1.setStdId("AB");
        System.out.println(stdt1.getStdId());

        stdt1.setGpa(4.0);
        System.out.println(stdt1.getGpa());

        stdt1.setRetired(true);
        System.out.println(stdt1.isRetired());


    }
}
