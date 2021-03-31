package Introduction.Arrays.Array2D;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of row: ");
        int n = sc.nextInt();
        System.out.println("Enter value of col: ");
        int m = sc.nextInt();

        int[][] myArr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                myArr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array is: ");
        for (int[] arr : myArr) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println("Thank You!");
        sc.close();
    }
}
