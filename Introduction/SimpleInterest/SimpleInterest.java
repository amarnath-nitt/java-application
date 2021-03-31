package Introduction.SimpleInterest;

import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter value of principleAmount: ");
        int principleAmount = sc.nextInt();
        System.out.println("Please enter value of rateInterest: ");
        float rateOfInterest = sc.nextFloat();
        System.out.println("Please enter time: ");
        int time = sc.nextInt();
        double A = principleAmount + (principleAmount * rateOfInterest * time) / 100;
        System.out.println("Total amount after " + time + " years: " + A);
        sc.close();
    }
}