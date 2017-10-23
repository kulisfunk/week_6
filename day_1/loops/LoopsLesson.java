public class LoopsLesson{

  public static void main(String[] args){
    // int number = 20;
    //
    // if (number < 10) {
    //   System.out.println("The number is less than 10");
    // } else {
    //   System.out.println("The number is not less than 10");
    // }

    // lesson number 2
    // char grade = 'C';
    //
    // String result;
    //
    // switch(grade) { //replacement for if statements in java if required
    //   case 'A':
    //   result = "Excellent";
    //   break;
    //   case 'B':
    //   case 'C':
    //   result = "Well done"; //both checked in one case
    //   break;
    //   case 'D':
    //   result = "Average";
    //   break;
    //   case 'F':
    //   result = "Fail";
    //   break;
    //   default:
    //   result = "Invalid range";
    //
    // }
    // System.out.println(result);

    //lesson 3
    // int counter = 0;

    // while (counter < 20){ //checks condition before running loop
    //   System.out.println("Counter is " + counter);
    //   counter++; //increments counter

    // do { //this runs loop once then checks condition better if player one wins on first go, etc
    //   System.out.println("Counter is " + counter);
    //   counter++; //increments counter
    //
    // } while (counter < 20);

    //lesson 4
    // for (initialisation; Boolean expression; update) {
    //   do stuff
    // }
    // for (int i = 0; i < 20; i++){
    //   System.out.println(i); //count up

    // for (int i = 20; i > 0; i--){
    //   System.out.println(i); //counts down

    double[] myArray = {1.9, 3.4, 2.5, 6.2, 1.4}; //double is type like string or float
    // for (int i = 0; i < myArray.length; i++){
    //   System.out.println(myArray[i]); //lets us use array length for loop and output array contents

    for (double number : myArray) { //same as ruby for name in names, etc
      System.out.println(number);
    }
    }
  }
