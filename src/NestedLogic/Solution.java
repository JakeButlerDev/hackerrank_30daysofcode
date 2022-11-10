package NestedLogic;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        // Accept input
        // Store input as data
        // Compare return date and due date
        // Output fine according to how overdue the book is

        Scanner keyboard = new Scanner(System.in);
        int returnDay = keyboard.nextInt();
        int returnMonth = keyboard.nextInt();
        int returnYear = keyboard.nextInt();
        keyboard.nextLine();
        int dueDay = keyboard.nextInt();
        int dueMonth = keyboard.nextInt();
        int dueYear = keyboard.nextInt();
        int fine = 0;

        if (returnYear > dueYear) {
            fine = 10_000;
        }
        if (returnYear == dueYear) {
            if (returnMonth > dueMonth) {
                fine = 500 * (returnMonth - dueMonth);
            }
            if (returnMonth == dueMonth) {
                if (returnDay > dueDay) {
                    fine = 15 * (returnDay - dueDay);
                }
            }
        }
        System.out.println(fine);
    }
}
