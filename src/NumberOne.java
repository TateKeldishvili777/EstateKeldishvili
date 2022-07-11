import java.util.Scanner;
import java.util.Arrays;

public class NumberOne {

    public static boolean IsPalindrome(String text) {

        String arr[] = new String[text.length()];

        String arr2[] = new String[text.length()];

        for (int y = 0; y < text.length(); y++) {
            arr[y] = String.valueOf(text.charAt(y));
        }

        int z = 0;
        for (int x = text.length() - 1; x >= 0; x--) {
            arr2[z] = arr[x];
            z += 1;
        }

        return Arrays.equals(arr, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        System.out.println(IsPalindrome(text));

    }


}


