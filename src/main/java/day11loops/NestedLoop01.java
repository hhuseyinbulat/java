package day11loops;

public class NestedLoop01 {
    public static void main(String[] args) {
        /*
            1.Example:Aşağıdaki çıktıyı verecek kodu yazınız

                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
         */
        for (int i= 1; i<5; i++){
            System.out.println("week: "+ i);
            for (int k= 1; k<8;k++){
                System.out.println("Day: "+k);

            }


        }














    }
}
