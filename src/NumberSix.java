import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class NumberSix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> dt = new ArrayList<>();
        HashMap<String, Integer> hmp = new HashMap<>();
        boolean flag = true;

        dt.add("tate");
        hmp.put("tate", 0);
        dt.add("keldishvili");
        hmp.put("keldishvili", 1);
        dt.add("21");
        hmp.put("21", 2);
        dt.add("tbilisi");
        hmp.put("tbilisi", 3);
        dt.add("georgia");
        hmp.put("georgia", 4);

        System.out.println(dt.size());

        while (flag) {
            System.out.println("Write an element which you want to delete: ");
            String data = scanner.next();
            if (hmp.containsKey(data)) {

                int size = dt.size();
                int index = hmp.get(data);

                String last = dt.get(size - 1);
                Collections.swap(dt, index, size - 1);

                dt.remove(size - 1);
                hmp.put(last, index);

                System.out.println("Data Deleted");

            } else {
                System.out.println("Data Not found");
            }
            System.out.println("Remove another? (y/n): ");
            String letter = scanner.next();


            if (letter.charAt(0) != 'y' && letter.charAt(0) != 'n') {
                while (letter.charAt(0) != 'y' && letter.charAt(0) != 'n') {

                    System.out.println("Wrong answer !!! Try again!!! ");
                    System.out.println("Remove another? (y/n): ");
                    letter = scanner.next();
                }
            }

            if (letter.charAt(0) == 'n') {
                flag = false;
            }
        }
    }

}