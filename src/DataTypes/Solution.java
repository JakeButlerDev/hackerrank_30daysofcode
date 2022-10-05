package DataTypes;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int a = 4;
        double b = 4.0;
        String c = "HackerRank ";

        Scanner keyboard = new Scanner(System.in);

        int i = keyboard.nextInt();
        double d = keyboard.nextDouble();
        String blah = keyboard.nextLine();
        String s = keyboard.nextLine();

        System.out.println(a + i);
        System.out.println(b + d);
        System.out.println(c + s);
    }
}