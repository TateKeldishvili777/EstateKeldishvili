import java.util.Scanner;

public class NumberFive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stearsCount = scanner.nextInt();

        System.out.println(countVariants(stearsCount));

    }

    public static int countVariants(int stearsCount) {


        int[] amount = new int[stearsCount + 1];
        int numb = 0;
        amount[0] = 1;

        for (int i = 1; i <= stearsCount; i++) {
            int v1 = i - 2 - 1;
            int v2 = i - 1;
            if (v1 >= 0) {
                numb -= amount[v1];
            }
            numb += amount[v2];
            amount[i] = numb;
        }
        return amount[stearsCount];
    }
}
