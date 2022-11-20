package regexPattersAndDatabases;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];

                // Start RegEx here

                String myRegExString = "/.(?=@gmail\\.com$)/";

                Pattern p = Pattern.compile(myRegExString);

                // String compString = "@gmail.com";

                Matcher m  = p.matcher(emailID);

                if( m.find() ){
                    System.out.println(firstName);
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}



//    // This will match a sequence of 1 or more uppercase and lowercase English letters as well as spaces
//    String myRegExString = "[a-zA-Z\\s]+";
//
//    // This is the string we will check to see if our regex matches:
//    String myString = "The quick brown fox jumped over the lazy dog...";
//
//    // Create a Pattern object (compiled RegEx) and save it as 'p'
//    Pattern p = Pattern.compile(myRegExString);
//
//    // We need a Matcher to match our compiled RegEx to a String
//    Matcher m = p.matcher(myString);
//
//// if our Matcher finds a match
//if( m.find() ) {
//        // Print the match
//        System.out.println( m.group() );
//        }