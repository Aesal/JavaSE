package section05;
/*
 * 000*000
 * 00***00
 * 0*****0
 * *******
 *  *****
 *   ***
 *    *
 * */


public class LoopHomeWork01 {

    public static void main(String[] args) {

        int maxCount = 4;

        Work01(maxCount);
        Work02(maxCount);
        Work03(maxCount);


    }







  public static void Work01(int maxCount){
      //1번
      for (int i = 0; i <maxCount; i++) {

          for (int j=0; j<=i; j++) {
              System.out.print("*");
          }

          for (int k=maxCount; k>i; k--){
              System.out.print(" ");
          }

          System.out.println("");
      } // end of for

      System.out.println("-----------------------------------------");
  }

    public static void Work02(int maxCount) {
        //2번
        for (int i = 0; i < maxCount; i++) {

            for (int j = maxCount; j>i; j--) {
                System.out.print(" ");
            }

            for (int k=0; k<=i; k++) {
                System.out.print("*");
            }

            System.out.println("");

        } // end of for

        System.out.println("-----------------------------------------");
    }

    public static void Work03(int maxCount) {

        //3번
        for (int i = 0; i < maxCount; i++) {

            for (int j = maxCount; j>i; j--) {
                System.out.print(" ");
            }

            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }

            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        } // end of for
        System.out.println("-----------------------------------------");
    }

    public static void Work04(int maxCount) {
        System.out.println("-----------------------------------------");

    }



}
