package Sorting;

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

        int n = Integer.parseInt(bufferedReader.readLine().trim());         // 3

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int numSwaps = 0;
        int endPosition = a.size() - 1;
        //System.out.println(endPosition);
        int swapPosition;

        while( endPosition > 0 ) {
            swapPosition = 0;

            for(int i = 0; i < endPosition; i++) {

                if( a.get(i) > a.get(i + 1) ){
                    // Swap elements 'i' and 'i + 1':
                    int tmp = a.get(i);
                    a.set(i, a.get(i + 1));
                    a.set(i + 1, tmp);
                    numSwaps++;

                    swapPosition = i;
                }

            }

            endPosition = swapPosition;
        }

        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(a.size()-1));


        bufferedReader.close();
    }
}