package day23inheritancepolymorphism;

public class Cat extends Mammal{

    public void meow(){
        System.out.println("cat meow");
    }

    //Overriding
    @Override // overridde annotation ını kullanarak java nın yaptıgınız override ıslemını kontrol etmesını saglarız.
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b+1;
    }

    @Override
    public Mammal create() {
        return new Mammal();
    }

    /*
    1) Override yapılırken "methodun body"si değiştirilir.
    2) Override yapılırken "method signature"a asla değiştirilemez.
    3) Override yaparken "inheritance" olmak zorundadır.
    4) Override yaparken access modifierlar belli kurallara göre farklılastırılabilirler.
         i)private methodlar override edilemezler
         ii) Child class taki override edilen method un access modifier ı parent classtaki methodun access modifierı
             ile aynı veya geniş olmalıdır
             note : child classtaki methodun access modifier ı daha dar olamaz.
         iii) "Default" methodlar aynı package icindeyse override edilebilirler. Farklı packageten override edilemezler.
    5) Parent classtaki methodun return type ı "void" ise return type degıstırılemez
    6) Parent classtaki methodun return type ı "primitive" ise return type degıstırılemez
    7) Parent classtaki methodun return type ı "wrapper class" ise return type degıstırılemez
    8) Parent classtaki methodun return type ı "parent class" ise return type "child" lardan biri olabilir.
       Note: Child classtaki return type parent class dakinden daha geniş olamaz
       Note: Aralarında parent child ilişkisi olmayan classlar overriding te return type degısımınde kullanılamazlar
             Mesela Short Integer dan kücüktür fakat aralarında parent child ilişkisi olmadıgından
             Integer yerine Short kullanamazsınız.
       Note: Child taki methodun return type ından parent taki methodun return type ına gidişte "is-a" reletionship olmalı
       Note: parent taki methodun return type ından cchild taki methodun return type ına gidişte "has-a" reletionship olmalı
      9) Aralarında  "ıs-a" reletionship olan data typelara "covariant" denir.
      10) Final methodlar overriding edilemezler.
      11) polymorphism = overloading + overriding


      overloading / overriding farkları:

      1) Overloading icin "inheritance" gerekmez fakat Overriding icin gerekir.
      2) Private methodlar overload edilebilir fakat override edilemezler.
      3) Final methodlar overload edilebilir fakat override edilemezler.
      4) Overloading "static polymorphism" olarak overriding "dynamic polymorphism" olarak anlandırılır.
         Cünkü static methodlar overload edilebilir overriding edilemezler.
      5) overloadingte method signature degisir ama overridingte signature a dokunulmaz.





     */
}

