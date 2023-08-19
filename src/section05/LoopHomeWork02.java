package section05;

public class LoopHomeWork02 {

     public static void main(String[] args) {

        int[][] iArray = {{2,4},{5,7},{8,9}};

        for (int[] num : iArray){
            for (int i = 1; i <= 9; i++) {
                for (int j = num[0]; j <= num[1]; j++) {
                    System.out.print(multiply(j,i));
                }
                System.out.println("");
            }
        }

    }

    public static String multiply(int i, int j) {
        return String.format("%2d  X %2d = %-3d     ", i, j, i * j);
    }

}