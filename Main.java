/*
Zain Chaudhry on 9-14-22
"Temperature Conversion"
Credit to Georgy, Ryan and Mariel
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  System.out.println("Type in the temperature in degrees Fahrenheit");
    
  Scanner scan = new Scanner(System.in);
    Double input = scan.nextDouble();

    Double fEquation = ((input - 32) * 5/9);
    System.out.println(input+" degrees Fahrenheit is "+fEquation+" degrees Celsius:");

    System.out.println("Type in the temperature in degrees Celsius");

  Scanner scan2 = new Scanner(System.in);
    Double input2 = scan2.nextDouble();

    Double cEquation = ((input2 * 1.8 + 32));

    System.out.println(input2+" degrees Celsius "+"is "+cEquation+" degrees Fahrenheit");

    System.out.println("\nType in your temperature in degrees Fahrenheit");

    Scanner scan3 = new Scanner(System.in);
    Double input3 = scan3.nextDouble();
    Double j = ((input3-32));
    Double fare = ((j * 5 / 9 + 273.15));
    Double Celcius = ((input3 - 32) * 5/9);
    System.out.println("\n"+input3 + " degrees Fahrenheit is " + fare + " Kelvin and " + Celcius + " Celcius");

    System.out.println("\nType in your temperature in degrees Celsius");

    Scanner scan4 = new Scanner(System.in);
    Double input4 = scan4.nextDouble();
    Double celctofaren = ((input4 * 1.8 + 32));
    Double kel2=((input4 + 273.15));
    System.out.println("\n"+input4 + " degrees Celsius " + "is " + celctofaren + " degrees Fahrenheit and "+ kel2 + " Kelvin");
     
    System.out.println("\nType in your temperature in Kelvin");

    Scanner scan5 = new Scanner(System.in);
    Double input5 = scan5.nextDouble();
   
    Double kelc = ((input5 - 273.15));
    Double kelf = ((input5 - 273.15) * 1.8 + 32);
    System.out.println("\n"+input5 + " Kelvin " + "is " + kelf + " degrees Fahrenheit"+" and "+kelc+" degrees Celcius");
  }
}