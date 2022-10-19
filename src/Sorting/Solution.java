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

        // Write your code here
        for (int i = 0; i < n; i++) {               // [3 2 1]
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;

            if (a.get(i) > a.get(i+1)) {
                Collections.swap(a, a.get(i), a.get(i+1));
                numberOfSwaps++;
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
            System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
            System.out.println("First Element: " + a.get(0));
            System.out.println("Last Element: " + a.get(a.size()));
        }



        bufferedReader.close();
    }
}
