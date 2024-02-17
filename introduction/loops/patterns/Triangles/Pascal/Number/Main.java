package introduction.loops.patterns.Triangles.Pascal.Number;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of triangle: ");
        int n = sc.nextInt();
        int t = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(t++ + "  ");
            }
            System.out.println();
        }
        System.out.println("\nThank You!");
        sc.close();
    }
}