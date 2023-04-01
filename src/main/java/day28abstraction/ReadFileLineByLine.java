package day28abstraction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 "throw" ile "throws" arasındaki farklar nelerdir:
 1)"throw" methodun bodysi içinde kullanılır. "throws" ise methodun isminden sonra kullanılır
 2)"throw" dan sonra obje oluşturulur."throws" dan sonbra sadece exception class ın ismi yazılır
 3)"throw" methodun içinde istediğimiz yerde exception uretmek için kullanılır.
   "throws" ise var olan checked exceptionı atmak için kullanılır.
 4) "throw" dan sonra sadece bir tane exception olabilir. "throws" dan sonra ise birden fazla exception olabilir
 */




public class ReadFileLineByLine {


    public static void main(String[] args) {

        readFileLineByLine();




    }


    public static void readFileLineByLine(){
        try {
            BufferedReader br = new BufferedReader( new FileReader("src\\main\\java\\day27exceptions\\File1.txt"));
            String line = br.readLine();
          // Bir dosyayı satır satır okumak için "readLine() " kullanılır. readLine() methodu nu kullanabilmek için BufferedReader
          //objesine ihtiyaç duyarız.


            while(line!=null){

                System.out.println(line);
                line = br.readLine();

            }

        } catch (FileNotFoundException e) {
            System.out.println("Ya path yanlış ya da dosya silinmiş. "+ e.getMessage());
        } catch (IOException e) {
            System.out.println("Okunamayacak karakter veya karakterler var. "+e.getMessage());
        }
    }
}
