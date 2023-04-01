package day22inheritancepolymorphism;

public class Runner {
    public static void main(String[] args) {
        /*
        1) İnheritance'de variable'lar secilirken java objectin data type'na bakar
        2) Öncelikle istediğiniz variable'ı objectin data type i olan classta arar
           o classta bulamazsa parent classlara bakar, hiçbir parent classta bulmazsa hata verir
         */

        Cat cat1 = new Cat();
        System.out.println(cat1.a);
        System.out.println(cat1.b);
        System.out.println(cat1.c);


        Mammal cat2 = new Cat();
        System.out.println(cat2.a);


        Animal cat3 = new Cat();
        System.out.println(cat3.a);


        // Object olusturulurken objectin  data type i child classtan secilemez
        //İnheritance da method'lar secilirken java constructor a bakar öncelikle istediğiniz methodu
        //Constructor ı kullanılan classtan alır. Oclassta bulamazsa sırasıyla parent classlara bakar. Hiçbir yerde o methoduy bulamazsa hata verir
        Cat cat4 = new Cat();
        cat4.eat();
        cat4.drink();





        Mammal cat5 = new Mammal();
        cat5.eat();


        Animal cat6 = new Animal();
        cat6.eat();



    }
}
