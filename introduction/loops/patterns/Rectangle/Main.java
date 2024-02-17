package introduction.loops.patterns.Rectangle;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        int n = sc.nextInt();

        System.out.println("Enter breadth of rectangle: ");
        int m = sc.nextInt();
        System.out.println("Rectangle of " + n + "x" + m + " is as following--");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Thank You!");
        sc.close();
    }
}