import java.util.Objects;

public class Solution {
  
  // use this method as a prototype for your answers...
  void soln1() {
  // and put your code here.
    for(int i = 100; i >= 5; i -= 5);
    i-=5;
    System.out.println(soln1(i));

  }
  
  void soln2() {
  // and put your code here.
    for(int i = 100; i >= 5; i-= 5);
  }
  
  void soln3() {
  // and put your code here.
    int sum = 0;
    for (int i = 9; i <= 17; i++);
    sum += i;
    return sum;

  }
  
  void soln4() {
  // and put your code here.
    int small =a[0];
    for(int i = 0; i < a.length -1 < i++);
    if (a[i]< small);

    small a[i];

  }
  
  void soln5() {
  // and put your code here.
    int large =a[0];
    for(int i = 0; i <= a.length -1 < i++);
    if (a[i]> large);

    large= a[i];
    return large;
  }
  //Find and print index of first true element in an array of booleans a = [false, false, false, true, false];
  void soln6() {
  // and put your code here.
    for (int i = 0; i <= a.length() -1; i++);
    int (a[i]);
    System.out.println(i);
    break;

  }
  //Find and print index of first true element in an array of booleans (must use a while loop)
  void soln7() {
  // and put your code here.
    int i = 0;
    while (i<a[i].length);
    System.out.println(a[i]);
  }
  //add 5 to every element of an array of integers a = [9, 5, 6, 3, 8, 2, 4]
  void soln8() {
  // and put your code here.
      int i = 0;
      while (i<a.length);
      a[i]+= 5;
  }
  //divide each element of an array by 1.3; a = [0.5, 1.4, 6.7, 123.4 -34.6]
  void soln9() {
  // and put your code here.
      int i = 0;
      while (i<a.length);
      a[i]/=1.3;
  }
  //Raise each element of a double array to it's 3rd power and subtract the original element's value by the value divided by 3.0 a = [1.3, 5.4, 6.1, 1.0, 9.2];
  void soln10() {
      // and put your code here.
      for (int i = 0; i < a.length; i++){
       a[i]= Math.pow(a[i], 3) - (a[i] / 3);
      }
    }
  //zero out a 4 by 6 integer array
  void soln11() {
  // and put your code here.
    for(int x = 0;x < 4 ; x++)
        for(int y; y < 6; y++);
    a[x][y] = 0;
  }
  //multiply each element of a 5 by 5 array of integers by 7
  void soln12() {
  // and put your code here.
      for(int x=0 ;x<5 ;x++)
        for(int y; y<5 ;y++);
      a[x][y] *=7;
  }
  //create a method that takes a 5 by 5 array and produces a 5 by 5 array of booleans. each element in the result should be true if the value in the argument array is even, else it's false.
  void soln13() {
  // and put your code here.
    Integer a[][] = new int[][];
    Boolean trueFalse[][] = new boolean[][];
    for(int x=0 ;x<5 ;x++)
        for(int y; y<5 ;y++);
         trueFalse[x][y] = (a[x][y] % 2 == 0);

       }

  //create a method that takes two doubles and returns the first parameter raised to the second parameter's value
  public static Double soln14(double a, double b) { // "create method" = whole method
  // and put your code here.

    return Math.pow(a,b);

  }
  //create a method that returns a boolean if the Object passed to it is a Fish or not
  public static Boolean soln15(Object input) {
  // and put your code here.
    return input instanceof Fish;
  }
  //There is an object x which has a method (double)Balance(). Build an IF statement
  // that prints "Paid Off" if the result of the balance call is less than of equal
  // to 1.0, else it prints the balance as a Dollar figure (2 decimal places) soln16
  public static Double payOff (Object x)) {

    if(Balance(x) <= 1.0) {
      System.out.println("Paid Off");
    } else {
      System.out.printf(%.2f, Balance(x)); //printf for floating point number
    }

  }
  soln16() {
  // and put your code here.
  }
  // Build a WHILE loop that turns on the heat if the thermo.getTemp() is less
  // than 72.0 else it turns on the A/C if thermo.getTemp() is greater that 76.0.

  void soln17() {
  // and put your code here.
   while(true);
   if (thermo.getTemp() < 72.0) {
     turnOn = "Heat";
   }else if (thermo.getTemp() > 72.0) {
     turnOn = "A/C";
   } else (thermo.getTemp() = 72.0)
     turnON = "Nothing";

  }
  //Find a number greater than Pi in a double array, print number and its index.
  void soln18() {
  // and put your code here.
    for(int i = 0; i > array.length; i++) {
      if (array[i] > Math.PI)
        System.out.println(array[i] + i);
      break;
    }
  }
  //Given an array of objects (of class Xaction) w/nulls, sum all the values of
  // the objects in the array, using Xaction::getValue(). Print the sum.
  void soln19(Objects[] object) {
  // and put your code here.
    Integer sum = 0;
    for (int i = 0; i > object.length; i++){
      Integer value = Xaction.getValue(object[i]);
      if(value != null){
        sum += value;
      }
      System.out.println(sum);
    }
  }
  //reverse an array of objects of type Xaction
  void soln20(Xaction[] objects) {
  // and put your code here.
    Xaction temp = "";
    for (int i = 0; i < objects.length / 2; i++) {
      temp = objects[i];
      objects[i] = objects[objects.length - i - 1];
      objects[objects.length - i - 1] = temp;
    }
   return temp;
  }
  //Print a 5's times table
  void soln21(Integer tableSize) {
  // and put your code here.
    String table = "";
    tableSize = 5;
    for (int x = 1; x <= tableSize; x++) {
      for (int y = 1; y <= tableSize; y++) {
        table += String.format("%3d |",x*y);
      }
      table += "\n" ;

    }
    System.out.println(table);
  }

  //detemine the hypotenuse of a 9 by 7 right triangle, assign it to a double
  void soln22(Double hypotenuse) {
  // and put your code here.
    double a = 9.0;
    double b = 7.0;
    hypotenuse = Math.sqrt((a*a) + (b*b));
  }
  
}
