package section05;
/*
* *
* ***
* *****
* *******
* *****
* ***
*
* */
public class Loop04 {

    public static void main(String[] args) {
        int num = 0;

        for (int i = 0; i < 7; i++) {

            for (int j = 0; j < 7; j++) {
                /*
                *  i: 0 j :0 num :0
                * */

                System.out.println((i * 7) + j + 1);
            }
        }
    }

}
