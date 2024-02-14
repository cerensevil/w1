// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean isPrime= true;
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        int k = Integer.parseInt(n);

        for(int i =0; i<k; i++) {
            String input = scan.nextLine();
            int num = Integer.parseInt(input);


            if (num <= 1) {
                isPrime = false;
                break;
            } else {
                for (int j = 2; j < num/2; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime == true) {
                    System.out.println("prime");
                } else {
                    System.out.println("NOT");
                }
            }



        }
    }
}
