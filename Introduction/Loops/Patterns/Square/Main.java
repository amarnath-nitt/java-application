package Introduction.Loops.Patterns.Square;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of side of square: ");
        int n = sc.nextInt();
        System.out.println("Square of " + n + "x" + n + " is as following--");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Thank You!");
        sc.close();
    }
}