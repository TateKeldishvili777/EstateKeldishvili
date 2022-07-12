import java.util.Scanner;

public class NumberThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {3, 4, 5, 7 ,8, 6, 1, 9, 2, 12};

        System.out.println(notContains(array));
    }


    public static int notContains(int[] array) {

        int maxNum = 0;

        for (int i : array) {
            if (i > maxNum) {
                maxNum = i;
            }
        }

        int minNum = maxNum;

        for (int j : array) {
            if (j < minNum) {
                minNum = j;
            }
        }

        int numb;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    numb = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = numb;
                }
            }
        }

        int x;

        for (x = 1; x < maxNum + 1; x++) {
            if (x < minNum) {
                break;
            }
            if (x > maxNum) {
                break;
            }
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i - 1] > 1) {
                x = array[i - 1] + 1;
                break;
            }
        }

        return x;
    }
}