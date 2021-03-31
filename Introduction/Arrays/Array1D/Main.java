package Introduction.Arrays.Array1D;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] myArr = new int[n];
        for (int i = 0; i < n; i++) {
            myArr[i] = sc.nextInt();
        }
        System.out.println("\nArray is: ");
        for (int x : myArr) {
            System.out.print(x + " ");
        }
        System.out.println("\nThank You!");
        sc.close();
    }
}