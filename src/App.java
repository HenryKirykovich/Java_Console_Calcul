import java.util.Scanner;
import java.util.Random; // import the Random class

public class App {
  // Henadzi Kirykovich CS 210
  // 5/13/2025
  // Practice 12
  // Description: Generator random number and do math operation with it

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  // external method for save input
    Random random = new Random (); // create a Random object
    boolean choice = false; // boolean variable to check if the ID is valid
    int counter = 0; // counter for number of attempts
    int num1, num2; 
    System.out.println("PLease put you first number"); 
    num1 = input.nextInt(); // get the first number from the user
    System.out.println("PLease put you second number"); // welcome message  
    num2 = input.nextInt(); // get the second number from the user
    int randomNum1 = random.nextInt(num2-num1+1)+num1;  // generate a random number between (max - min + 1) + min 
    int randomNum2 = random.nextInt(num2-num1+1)+num1;  // generate a random number between num1 and num2
    System.out.println("PLease choose one operation from +, -, *, /"); // choicing operator
    String operator = input.next(); // get the operator from the user
    System.out.println(randomNum1 + " " + operator + " " + randomNum2 + " = " + "?" );


    boolean check = false; // boolean variable to check if the answer is correct
    // check if the operator is valid
    while (!check) {
    System.out.println("PLease put your answer");
    int answer = input.nextInt();
    
    int result = math(operator, randomNum1, randomNum2); // call the math method to get the result of the operation
    if (answer == result ) { 
      check = true; // set check to true if the answer is correct
      System.out.println("You are math genius!Bye");
    } else {
      check = false; // set check to false if the answer is incorrect
      System.out.println("You are wrong!Try again");
    }
  }
    
  }

  public static int math(String answer, int randomNum1, int randomNum2) {
    int result = 0; // variable to store the result of the operation
    if (answer.equals("+")) { // if the operator is +
      result = randomNum1 + randomNum2; // add the two numbers
    } else if (answer.equals("-")) { // if the operator is -
      result = randomNum1 - randomNum2; // subtract the two numbers
    } else if (answer.equals("*")) { // if the operator is *
      result = randomNum1 * randomNum2; // multiply the two numbers
    } else if (answer.equals("/")) { // if the operator is /
      result = randomNum1 / randomNum2; // divide the two numbers
    }
    return result; // return the result of the operation
  }
}

