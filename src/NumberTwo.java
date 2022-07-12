import java.util.Scanner;

public class NumberTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount of money(თეთრებში): ");
        int amount = scanner.nextInt();

        System.out.printf("minSplit is: %d", minSplit(amount));
    }

    public static int minSplit(int amount) {
        int answer = 0;
        while (amount >= 50) {
            amount -= 50;
            answer += 1;
        }
        while (amount >= 20) {
            amount -= 20;
            answer += 1;
        }
        while (amount >= 10) {
            amount -= 10;
            answer += 1;
        }
        while (amount >= 5) {
            amount -= 5;
            answer += 1;
        }
        while (amount > 0) {
            amount -= 1;
            answer += 1;
        }


        return answer;
    }
}