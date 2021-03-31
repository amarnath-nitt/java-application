package OOPS.ClassesObjects.Methods.Introduction;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number do you want to check: ");
        int n = sc.nextInt();
        ArrayList<Integer> arrList = new ArrayList<>();
        System.out.println("Please Enter " + n + " numbers-");
        for (int i = 0; i < n; i++) {
            int item = sc.nextInt();
            arrList.add(item);
        }
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            result = maxOf(result, arrList.get(i));
        }
        System.out.println("Max of give numbers is: " + result);
        sc.close();
    }

    public static int maxOf(int a, int b) {
        return a > b ? a : b;
    }
}
