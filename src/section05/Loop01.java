package section05;

public class Loop01 {

    public static void main(String[] args) {

        int count = 0;
        while (count < 100) {
            System.out.println(count);
            count++;
        }

        count = 0;
        boolean isRun = true;
        while (isRun) {
            System.out.println(count);
            count++;
            if (count == 100) {
                isRun = false;
            }
        }

        int i = 0;
        while (i < 100) {
            i++;

            if (i % 3 == 0)
                continue;

                System.out.println(i);

        }


    }
}
