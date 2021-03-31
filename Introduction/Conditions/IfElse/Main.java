package Introduction.Conditions.IfElse;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter value your age");
        int age = sc.nextInt();
        sc.nextLine();
        // if(age>=18){
        // System.out.println("You can vote now.");
        // }
        // else{
        // System.out.println("You cann't vote now.");
        // }

        // Ternary Operatro
        System.out.println((age >= 18) ? "You can vote now." : "You cann't vote now.");
        System.out.println("\nThank You!!");
        sc.close();
    }
}