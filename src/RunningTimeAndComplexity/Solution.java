package RunningTimeAndComplexity;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner keyboard = new Scanner(System.in);
        int cases = keyboard.nextInt();
        keyboard.nextLine();
        for (int i = 1; i <= cases; i++) {
            boolean isPrime = true;
            int x = keyboard.nextInt();
            keyboard.nextLine();
            if (x <= 1) {
                isPrime = false;
            }
            for (int j = 2; j <(x/2); j++) {
                if (x % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }
}

