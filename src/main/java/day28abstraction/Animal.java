package day28abstraction;

public abstract class Animal {

    //body'si olmayan method'lar "abstract method" olarak adlandırılır.
    //Bir method'u abstract yapmak için; i)Method body'i sil  ii)"abstract" keyword kullan
    //"abstract methdod"lar "abstract class" içinde olmalıdır
    public abstract void eat();

    //Abstract classlarda hem abstract method hem de concrete(non-abstract) method kullanılabilir


    public abstract void move();// abstract method

    //concrete method
    public void drink() {
        System.out.println("Animals drink");
    }

}
