import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        /**
         *  12345
         *
         *  1
         *  2
         *  3
         *  4
         *  5
         */


        while (true) {
            Scanner scanner = new Scanner(System.in);
            Integer fullNumber = scanner.nextInt(); // 123
            String fullNumberStr = fullNumber.toString();
            for (int i = 0; i < fullNumberStr.length(); i++) {
                System.out.println(fullNumberStr.charAt(i));
            }

        }

    }
}
