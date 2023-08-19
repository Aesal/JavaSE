package section06;

public class ArrayHomeWork {

    public static void main(String[] args) {
        //배열 생성
        final int[][] arrResult = createArr();

        String topStr = "", bottomStr = "";

        //메인loop
        for (int i = 0; i <= 6; i++) {
            //정방향
            int iCount = i;
            for (int j = 0; j <= i; j++) {
                if (i % 2 == 0) {
                    topStr += String.format("%-3d", (arrResult[iCount][j]));
                } else {
                    topStr += String.format("%-3d", (arrResult[j][iCount]));
                }
                if (j == i) topStr += "\n";
                iCount--;
            }
            //역방향
            iCount = 6;
            for (int j = i; j <= 6; j++) {
                if (i == 0) break;

                if (i % 2 == 0) {
                    bottomStr += String.format("%-3d", (arrResult[iCount][j]));
                } else {
                    bottomStr += String.format("%-3d", (arrResult[j][iCount]));
                }

                if (j == 6) bottomStr += "\n";
                iCount--;
            }

        }
        //출력
        System.out.print(topStr+bottomStr);
    }

    public static int[][] createArr () {
        int iCalc = 1; // ~ 49

        int[][] iArray = new int[7][7];

        //i 변수 입력 및 확인 ez
        for (int[] arrSub : iArray){

            for (int i = 0; i <= 6; i++) {
                arrSub[i] = iCalc++;
                System.out.printf("%-3d", arrSub[i]);

            }
            System.out.println("");
        }

        System.out.println("--------------------");

        return iArray;
    }
}
