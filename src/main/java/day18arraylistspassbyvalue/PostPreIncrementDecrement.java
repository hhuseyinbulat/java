package day18arraylistspassbyvalue;

public class PostPreIncrementDecrement {
    public static void main(String[] args) {
        int a = 5;
        int b = a++; // b=5 a=6 "post ıncrement"

        int c = 10;
        int d = ++c; // d=11 c =11 "pre increment"

        int e = 20;
        int f = e--; // e=19 f =20 "post decrement"

        int h = 30;
        int i= --h; // i=29, h=29 "pre decrement"
    }
}
