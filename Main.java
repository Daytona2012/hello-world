import java.util.*;
import java.io.*;

class Main {
  static Scanner scnr = new Scanner(System.in);
  public static void main (String [] args) {
    
    System.out.println("Welcome to calculator ");
    System.out.println("Enter (+ , - , *, /, %) to start ");
    char input = scnr.next().charAt(0);
    double firstNum;
    double SecondNum;
    
    if (input != '+' && input != '-' && input != '*' && input != '/' && input != '%') {
    do {
      System.out.println("Please enter a valid operator");
      input = scnr.next().charAt(0);
    } while (input != '+' && input != '-' && input != '*' && input != '/' && input != '%');
    }
    
    switch(input){
      case '+': 
        System.out.println("\nWelcome to addition ");
        System.out.println("Enter two number you wish to add");
        firstNum = scnr.nextDouble();
        SecondNum = scnr.nextDouble();
        System.out.println(add(firstNum,SecondNum));
        break;
        
      case '-': 
        System.out.println("\nWelcome to subtraction ");
        System.out.println("Enter two number you wish to subtract");
        firstNum = scnr.nextDouble();
        SecondNum = scnr.nextDouble();
        System.out.println(subtract(firstNum,SecondNum));
        break;
        
      case '*': 
        System.out.println("\nWelcome to multiplication ");
        System.out.println("Enter two number you wish to multiply");
        firstNum = scnr.nextDouble();
        SecondNum = scnr.nextDouble();
        System.out.println(multiply(firstNum,SecondNum));
        break;
        
      case '/': 
        System.out.println("\nWelcome to division ");
        System.out.println("Enter two number you wish to divide");
        firstNum = scnr.nextDouble();
        SecondNum = scnr.nextDouble();
        System.out.println(divide(firstNum,SecondNum));
        break;
        
      case '%': 
        System.out.println("\nWelcome to remainder ");
        System.out.println("Enter two number to find the remainder");
        firstNum = scnr.nextDouble();
        SecondNum = scnr.nextDouble();
        System.out.println(mod(firstNum,SecondNum));
        break;
      
      default: 
        break;
    }
    
    
  }
  
  public static double add (double a, double b) {
    return a + b;
    
  }
  
   public static double subtract (double a, double b) {
    return a - b;
    
  }
  
   public static double multiply (double a, double b) {
    return a * b;
    
  }
  
   public static double divide (double a, double b) {
    return a/b;

  }

   public static double mod (double a, double b) {
    return a % b;
    
  }
}