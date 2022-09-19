package day4;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        class Person {
            int age;

            Person(int initialAge) {
                if (initialAge >= 0) {
                    this.age = initialAge;
                } else {
                    this.age = 0;
                    System.out.println("Age is not valid, setting age to 0.");
                }
            }

            void yearPasses() {
                age++;
            }

            void amIOld() {
                if (age < 13) {
                    System.out.println("You are young.");
                } else if (age >= 13 && age < 18) {
                    System.out.println("You are a teenager.");
                } else {
                    System.out.println("You are old.");
                }
            }
        }

    }
}
