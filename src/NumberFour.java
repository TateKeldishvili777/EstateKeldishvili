import java.util.Scanner;

public class NumberFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sequence: ");
        String sequence = scanner.next();

        System.out.println(isProperly(sequence));
    }

    public static boolean isProperly(String sequence){

        int amount = 0;

        for(int x=0;x<sequence.length();x++){

            if(sequence.charAt(x)=='('){
                amount+=1;
            }
            if(sequence.charAt(x)==')'){
                amount-=1;
            }
            if(amount<0){
                break;
            }
        }

        return amount == 0;
    }
}
