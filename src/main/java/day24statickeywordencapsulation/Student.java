package day24statickeywordencapsulation;

public class Student {

    //Encapsulation: "Data hiding"
    /*
    -Datayı neden gizlersin ? Data dış etkenlerden korumak için gizlenir
    -Datayı nasıl gizlersin? Access modifierinı "private" yaparak gizlerim
    -Datayı gizledikten sonra başka classlardan okumak istersen ne yaparsın?
     "get methodlar" olustururak gizlediğimiz dataları okunur hale getirebiliriz
     get methodlar = "getters"
     -Datayı gizledikten sonra başka classlardan degistirmek istersen ne yaparsın?
     "set methodlar" olustururak gizlediğimiz dataları degistirebiliriz
     set methodlar = setters
     -Variable'ın "data type"ı ile get methodun "return type"ı aynı olmalıdır
     -Ger methodları isimlendirirken "get+variablename" Ancak variable ın data type ı boolean ise müstesna "is+variablename"

     */

    public String stdName ="Tom Hanks";
    private String stdId ="TH202201";
    private double gpa = 3.8;
    private boolean retired = false;

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}
