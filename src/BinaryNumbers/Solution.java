package BinaryNumbers;

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

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        int max = 0;
        int count = 0;
        String binary = Integer.toBinaryString(n);

        // while(n > 0) {
        //     int remainder = n%2;    // 1    1   1   0   1   1   0   1
        //     n = n/2;
        //     // Insert remainder to front of a list or push onto a stack
        //     binary.add(0, remainder);

        // }
        // System.out.println(binary);

//        if (binary.length() < 8) {
//            for (int j = binary.length(); j < 8; j++) {
//                binary = '0' + binary;
//            }
//        }
        System.out.println(binary);

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
                if (count > max) {
                    max = count;
                }
            } else if (binary.charAt(i) != '1') {
                count = 0;
            }
        }

        System.out.println(max);

    }
}