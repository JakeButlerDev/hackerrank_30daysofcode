package Review;
import java.io.*;
import java.util.*;

public class Solution {



        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner keyboard = new Scanner(System.in);
            int testCases = keyboard.nextInt();
            String blah = keyboard.nextLine();

            for (int b = 0; b < testCases; b++) {

                String myString = keyboard.nextLine();
                String evenChars = "";
                String oddChars = "";


                for (int i = 0; i < myString.length(); i++) {
                    if (i % 2 == 0) {
                        char evens = myString.charAt(i);
                        evenChars += evens;
                    } else {
                        char odds = myString.charAt(i);
                        oddChars += odds;
                    }
                }
                System.out.println(evenChars + " " + oddChars);
            }

        }

    }