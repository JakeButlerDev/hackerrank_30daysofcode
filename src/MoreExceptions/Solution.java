package MoreExceptions;

import java.util.*;
import java.io.*;

//Write your code here
class Calculator {
    try {
        public int power(int a, int b) {
            int sum = 0;
            for (int i = 0; i < b; i++) {
                sum = a * a;
            }
            return sum;
        }
    } catch (Exception e) {

    }
}
class Solution{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
