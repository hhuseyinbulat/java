package day03typecastingwrapperscanner;

public class WrapperClass01 {

    public static void main(String[] args) {

        /*
        Note: Java primitive'lere method'lar ekleyerek yeni bir yapı oluşturdu,
      bu yapıya "Wrapper Class" denir.

      Primitive         Wrapper

        byte      ==>    Byte
        short     ==>    Short
      **int       ==>    Integer
        long      ==>    Long
        float     ==>    Float
        double    ==>    Double
        boolean   ==>    Boolean
      **char      ==>    Character
    */
        byte primitiveByte = 12;
        Byte wrapperClass = 12;
        // wrapperclass yazıp nokta koyduğunuzda birçok method görürüz çünkü non primitivedir.


        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        float f1 = 13.99f;
        Float wrapperF1 = f1;

        Character w1 = 's';
        char primitiveW1 = w1;

        // aotuboxing ve unboxing java tarafından otomatik olarak yapılır.





    }
}
