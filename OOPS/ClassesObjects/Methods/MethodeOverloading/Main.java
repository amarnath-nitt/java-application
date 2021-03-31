package OOPS.ClassesObjects.Methods.MethodeOverloading;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 3 numbers: ");
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        int c = sc.nextInt();
        int resInt = maxOf(a,b,c);
        System.out.println("Please enter marks of 3 subject: ");
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float z = sc.nextFloat();
        float resFloat = maxOf(x,y,z);
        System.out.println("Maximum of integers is "+ resInt);
        System.out.println("Maximum of float numbers is "+ resFloat);
        System.out.println("Thank You!");
        sc.close();

    }
    public static int maxOf(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>c && b>a){
            return b;
        }
        else{
            return c;
        }
    }
    public static float maxOf(float a, float b, float c){
        if(a>b && a>c){
            return a;
        }
        else if(b>c && b>a){
            return b;
        }
        else{
            return c;
        }
    }
}
