package introduction.scanneruserinput;

import java.util.*;

public class ScannerUserInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a string: ");
    String str = sc.nextLine();
    System.out.println(str);
    sc.close();
  }
}