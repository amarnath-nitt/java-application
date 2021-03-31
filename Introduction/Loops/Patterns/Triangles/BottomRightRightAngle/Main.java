package Introduction.Loops.Patterns.Triangles.BottomRightRightAngle;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of triangle: ");
        int n = sc.nextInt();
        System.out.println("Left right angle triangle is ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) >= (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Thank You!");
        sc.close();
    }
}