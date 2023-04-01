package day21accessmodifiersinheritance.day21accessmodifiersinheritance;

public class AnimalRunner {
    /*
    1)"Inheritance" sayesinde
        i)Code tekrarlarından kurtuluruz.
        ii)Code tamiri(maintenance) kolay olur.
        iii)Child Class'ları daha atomik yapmış oluruz.

    2)Bir Class'ı başka bir class'ın Child Class'ı yapmak için
      "extends" keyword kullanılır. ilk yazılan Class Child, ikinci
      yazılan Class parent olur.

    3)Child Class object'leri Parent Class'dan method ve variable'ları kullanabilirler.

    4)Parent Class object'leri Child Class'dan methodv e variable'ları kullanamazlar

    5) Object Class her Class'ın Parent'ıdır.
        Java'da Object Class hariç her class'ın parent'ı vardır
        Java'da parent'ı olmayan tek class Object Class'dır.

    6) "Private" method veya veriable lar child class tarafından kullanılamazlar. (inherit edilemezler)
       "Protected" method ve variable lar child class tarafından kullanılabilir.  (İnherit edilebilir)
       "Defaultlar" method ve variable lar aynı packageteki child class tarafından kullanılabilir.(inherit edilebilir)
       "Public" method ve variable'lar child class'lar tarafindan kullanilabilir.
    7) 4 Tip inheritance vardır;
       i) Multilevel inheritance -java kabul eder-
       ii) Hierarchical inheritance Bir paarent için coklu child -java kabul eder-
       iii) Multiple inheritance Bir child a coku parents -java kabul etmez-
       iv) Single inheritance Bir child clas icin bir parent class demektir -java kabul eder-
 */
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.eat();
        c1.drink();
        c1.meow();


         Dog d1 = new Dog();
         d1.eat();
         d1.drink();
         d1.bark();




    }
}
