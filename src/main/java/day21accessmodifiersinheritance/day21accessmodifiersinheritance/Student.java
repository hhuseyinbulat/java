package day21accessmodifiersinheritance.day21accessmodifiersinheritance;

public class Student {
    /*

               Access Modifiers

    1)Public   2)Protected  3)Default(Access modifierı default yapmak için access modifier yazmayız  4)Private

    Note: Access modifier ları genişten dar a dogru
    public==>Protected==>Default==>Private

    Note : access modifierları acıklaynız:
          i) Public her class tan kullanılabilir
          ii) Protected olanlar baska packagelerden kullanılamaz ancak baska package te child class icinden kullanılabilir
          iii) Default olanlar başka packageten kullanılamazlar
          iv) Private olanlar sadece olusturuldukları class içinde kullanılarbilirler.

    Note: "protected" ile "default" un farkini soyleyiniz.
            i) protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir
            ii) default olanlar baska package'den kullanilamazlar

    Note: Class'lar icin hangi Access Modifier'lar kullanilabilir.
          public, default kullanilir ama protected ve private kullanilamaz

    */
    //Public her class tan kullanılabilir
    public String stdName = "TomHanks";

    //Protected olanlar baska packagelerden kullanılamaz
    //ancak baska package te child class icinden kullanılabilir
    protected String adress = "Miami";

    //Default olanlar başka packageten kullanılamazlar
    String email = "th@gmail.com";

    //Private olanlar sadece olusturuldukları class içinde kullanılarbilirler.
    private String stdId = "20206517004";




}
