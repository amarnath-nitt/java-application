package Introduction.Conditions.TernoryOperator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        System.out.println((n % 2 == 0) ? "Even number." : "Odd number.");
        sc.close();
    }
}