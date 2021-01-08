import java.util.*;
public class calculatorproject{

   public static void main (String [] args)
   {  
      Scanner input = new Scanner(System.in);
   
      String H1 = "         Calculator Main Menu";
      String H2 = " 1.  Addition           2. Subtraction";
      String H3 = " 3.  Multiplication     4. Division";
      String H4 = " 5.  Percentages        6. Division Remainder";
      String H5 = " 7.  Logorathims        8. Roots";
      String H6 = " 9.  Trig Rad to Deg   10. Powers";
      String H7 = "11.  Fibonacci Series  12. ASCII Conversion";
      String H8 = "13.  Conversions       14. Free Form Calculation";
   
      System.out.println(H1);
      System.out.println(H2);
      System.out.println(H3);
      System.out.println(H4);
      System.out.println(H5);
      System.out.println(H6);
      System.out.println(H7);
      System.out.println(H8);
   
      System.out.println("Please enter a number between 1 and 14 for the option to perform");
      System.out.println("Or 999 to exit calculator...");
      int option = input.nextInt();
      
      if      (option == 999)
      {
      System.out.println("Thank you for using my first calculator");
         }
      else if (option <= 0 || option >= 15 && option <= 998 || option >= 1000)
      {
      System.out.println("NaN - Please enter an option between 1 and 14, then press enter");
      System.out.println("Or 999 to exit calculator...");
         }
      else if (option == 1) //addition method
      {
         System.out.println("Addition Calculator");
         System.out.println("You can add up to four numbers.");
         System.out.println("Please enter up to four numbers - if you have less than four, please enter 0");
         double a = input.nextDouble();
         double b = input.nextDouble();
         double c = input.nextDouble();
         double d = input.nextDouble();
      
         double sum = addition(a, b, c, d);       //calling my addition method - passing the four numbers through
         sum = sum * 100;                         //rounds to two digits
         sum = Math.round(sum);
         sum = sum / 100;
         System.out.println("The sum is " + sum ); //printing the answer from the method
         System.out.println();

         System.out.println("Would you like to do more?");
         System.out.println("Type   1  to continue or   2  to discontinue:");
         int retry = input.nextInt();
         
         if(retry == 1)
         {
         resend();
         }
         else
         System.exit(0);         
          }
      else if (option == 2) //subtraction method
      {
         System.out.println("Subtraction Calculator");
         System.out.println("You can subtract up to four numbers.");
         System.out.println("Please enter up to four numbers - if you have less than four, please enter 0");
         double a = input.nextDouble();
         double b = input.nextDouble();
         double c = input.nextDouble();
         double d = input.nextDouble();
      
         double sum = subtraction(a, b, c, d);    //calling my subtraction method - passing the four numbers through
         sum = sum * 100;                         //rounds to two digits
         sum = Math.round(sum);
         sum = sum / 100;
         System.out.println("The sum is " + sum ); //printing the answer from the method
         System.out.println();
         
         System.out.println("Would you like to do more?");
         System.out.println("Type   1  to continue or   2  to discontinue:");
         int retry = input.nextInt();
         
         if(retry == 1)
         {
         resend();
         }
         else
         System.exit(0);         }
   else if (option == 3) //multiply method
      {
         System.out.println("Multiply Calculator");
         System.out.println("You can multiply up to four numbers.");
         System.out.println("Please enter up to four numbers - if you have less than four, please enter 1");
         double a = input.nextDouble();
         double b = input.nextDouble();
         double c = input.nextDouble();
         double d = input.nextDouble();
      
         double sum = multiply(a, b, c, d);       //calling my multiply method - passing the four numbers through
         sum = sum * 100;                         //rounds to two digits
         sum = Math.round(sum);
         sum = sum / 100;
         Math.round(sum);
         System.out.println("The sum is " + sum ); //printing the answer from the method
         System.out.println();
         
         }
   else if (option == 4) //division method
      {
         System.out.println("Division Calculator");
         System.out.println("You can divide up to four numbers.");
         System.out.println("Please enter up to four numbers - if you have less than four, please enter 1");
         double a = input.nextDouble();
         double b = input.nextDouble();
         double c = input.nextDouble();
         double d = input.nextDouble();
      
         double sum = divide(a, b, c, d);       //calling my division method - passing the four numbers through
         sum = sum * 100;                         //rounds to two digits
         sum = Math.round(sum);
         sum = sum / 100;
         System.out.println("The sum is " + sum ); //printing the answer from the method
         System.out.println();
         
          }
   else if (option == 5) //percentage method
      {
         System.out.println("Percent Calculator");
         System.out.println("You can convert one number with a decimal into a percentage.");
         System.out.println("Please enter a number with a decimal");
         double a = input.nextDouble();
      
         double sum = percent(a);       //calling my percentage method - passing one number through
         System.out.println("The sum is " + sum + "%"); //printing the answer from the method
         System.out.println();
         
         System.out.println("Would you like to do more?");
         System.out.println("Type   1  to continue or   2  to discontinue:");
         int retry = input.nextInt();
         
         if(retry == 1)
         {
         resend();
         }
         else
         System.exit(0);
         }
   else if (option == 6) //remainder method
      {
         System.out.println("Remainder Calculator");
         System.out.println("You can show the remainder after division of two numbers.");
         System.out.println("Please enter two numbers:");
         double a = input.nextDouble();
         double b = input.nextDouble();
         
         double sum = remainder(a, b);       //calling my percentage method - passing one number through
         System.out.println("The remainder of " + a + " divided by " + b + " is " + sum); //printing the answer from the method
         System.out.println();
         
         System.out.println("Would you like to do more?");
         System.out.println("Type   1  to continue or   2  to discontinue:");
         int retry = input.nextInt();
         
         if(retry == 1)
         {
         resend();
         }
         else
         System.exit(0);
         }
   else if (option == 7) //logarithm method
      {
         System.out.println("Logarithm Calculator");
         System.out.println("You can get the logarithmic relationship in base 10, base e, and base x");
         System.out.println("Please enter any number for base 10 and natural:");
         double a = input.nextDouble();
         System.out.println("For base x, please enter Y and X:");
         double b = input.nextDouble();
         double c = input.nextDouble();
         
         double sum1 = logarithm10(a);       //calling my logarithm base 10 method - passing one number through
         double sum2 = logarithmnat(a);       //calling my natural logarithm - passing one number through
         double sum3 = logarithmx(b, c);       //calling my logarithm base x method - passing two numbers through

         System.out.println("The logarithm base 10 for " + a + " is " + Math.round(sum1)); //log base 10 first answer
         System.out.println("The natural logarithm for " + a + " is " + Math.round(sum2)); //log base e second answer
         System.out.println("The logarithm of " + b + " with a base of " + c + " is " + Math.round(sum3));
         
         System.out.println("Would you like to do more?");
         System.out.println("Type   1  to continue or   2  to discontinue:");
         int retry = input.nextInt();
         
         if(retry == 1)
         {
         resend();
         }
         else
         System.exit(0);
          }
     else if (option == 8) //root method
      {
         System.out.println("Root Calculator");
         System.out.println("You can get the nth root of any whole number greater than 0.");
         System.out.println("Please enter the base and then the root you desire:");
         double a = input.nextDouble();
         double b = input.nextDouble();
                
         double sum = root(a, b);       //calling my root method - passing two numbers through
         sum = sum * 100;               //rounds to two digits
         sum = Math.round(sum);
         sum = sum / 100;

         System.out.println("The answer to a base of " + a + " with a root of " + b + " is: " + sum);

         System.out.println("Would you like to do more?");
         System.out.println("Type   1  to continue or   2  to discontinue:");
         int retry = input.nextInt();
         
         if(retry == 1)
         {
         resend();
         }
         else
         System.exit(0);
         }
     else if (option == 9) //trig sin cos & tan method
      {
         System.out.println("Trigonometry Calculator");
         System.out.println("You can get the sine, cosine, and tangent of any radian (not degree)");
         System.out.println("Please enter the angle in radians");
         double a = input.nextDouble();
                
         double sum1 = trigsin(a);       //calling my sine method - passing one number through
         double sum2 = trigcos(a);       //calling my cosine method - passing one number through
         double sum3 = trigtan(a);       //calling my tangent method - passing one number through
         
         sum1 = sum1 * 100;               //rounds to two digits
         sum1 = Math.round(sum1);
         sum1 = sum1 / 100;
         
         sum2 = sum2 * 100;               //rounds to two digits
         sum2 = Math.round(sum2);
         sum2 = sum2 / 100;

         sum3 = sum3 * 100;               //rounds to two digits
         sum3 = Math.round(sum3);
         sum3 = sum3 / 100;
         
         System.out.println(a + " radians is Sine " + sum1);
         System.out.println(a + " radians is Cosine " + sum2);
         System.out.println(a + " radians is Tangent " + sum3);
         
         System.out.println("Would you like to do more?");
         System.out.println("Type   1  to continue or   2  to discontinue:");
         
         int retry = input.nextInt();
         
         if(retry == 1)
         {
         resend();
         }
         else
         System.exit(0);

         }
     else if (option == 10) //powers method
      {
         System.out.println("Powers Calculator");
         System.out.println("You can solve a power function with any whole number raisded to any exponent.");
         System.out.println("Please enter the base and the exponent:");
         double a = input.nextDouble();
         double b = input.nextDouble();
                         
         double sum = powers(a, b);       //calling my powers method
         
         sum = sum * 100;               //rounds to two digits
         sum = Math.round(sum);
         sum = sum / 100;

         System.out.println("The answer to a base of " + a + " with an exponent of " + b + " is: " + sum);
         
         System.out.println("Would you like to do more?");
         System.out.println("Type   1  to continue or   2  to discontinue:");
         int retry = input.nextInt();
         
         if(retry == 1)
         {
         resend();
         }
         else
         System.exit(0);
          }

        else if (option == 11) //Fibonacci Series method
      {
         System.out.println("Fibonacci Series Calculator");
         System.out.println("You can run the Fibonacci Series of any two numbers for a series of ten.");
         System.out.println("Please enter the first number:");
         int a = input.nextInt();
         System.out.println("Please enter the second number:");
         int b = input.nextInt();
         System.out.println();
                  
         System.out.println(a);
         System.out.println(b);         
         int c = fSeries(a, b);       //calling my method
         int d = fSeries(b, c);       //calling my method
         int e = fSeries(c, d);       //calling my method
         int f = fSeries(d, e);       //calling my method
         int g = fSeries(e, f);       //calling my method
         int h = fSeries(f, g);       //calling my method
         int i = fSeries(g, h);       //calling my method
         int j = fSeries(h, i);       //calling my method
         int k = fSeries(i, j);       //calling my method
         int l = fSeries(j, k);       //calling my method  
                                              
         System.out.println("Would you like to do more?");
         System.out.println("Type   1  to continue or   2  to discontinue:");
         int retry = input.nextInt();
         
         if(retry == 1)
         {
         resend();
         }
         else
         System.exit(0);
         }

      else if (option == 12) //ASCII Conversion method
      {
         System.out.println("ASCII Conversion Calculator");
         System.out.println("You can convert any character to its ASCII equivalent.");
         System.out.println("Please enter the number to be converted:");
         int a = input.nextInt();
                         
         char b = toASCII(a);       //calling my ASCII conversion method
         
         System.out.println("The ASCII equivalent of " + a + " is " + b);
         System.out.println("Would you like to do more?");
         System.out.println("Type   1  to continue or   2  to discontinue:");
         int retry = input.nextInt();
         
         if(retry == 1)
         {
         resend();
         }
         else
         System.exit(0);

         }

      else if (option == 13) //Binary Octal and HexDecimal Conversion method
      {
         System.out.println("Conversion Calculator");
         System.out.println("You can convert any number to its binary, octal, or hexidecimal equivalent.");
         System.out.println("Please enter the number to be converted greater than -0-:");
         int a = input.nextInt();
                         
         String sum1 = toBinary(a);       //calling my binary conversion method
         String sum2 = toOctal(a);        //calling my octal conversion method
         String sum3 = toHexDec(a);       //calling my hexidecimal conversion method
         
         System.out.println("The binary equivalent of " + a + " is " + sum1);
         System.out.println("The octal equivalent of " + a + " is " + sum2);
         System.out.println("The hexidecimal equivalent of " + a + " is " + sum3);

         System.out.println("Would you like to do more?");
         System.out.println("Type   1  to continue or   2  to discontinue:");
         int retry = input.nextInt();
         
         if(retry == 1)
         {
         resend();
         }
         else
         System.exit(0);
         }
     /* else if (option == 14) // Conversion method
      {
         System.out.println("Free Form Calculator");
         System.out.println("You can calculate any numbers your desire....two at a time.");
         System.out.println("Please enter two numbers to be used exponentially");
         double a = input.nextDouble();
         double b = input.nextDouble();
         double sum = powers(a, b);       //calling my powers method

         double sum = multiply(a, b, c, d);       //calling my multiply method - passing the four numbers through
         double a = input.nextDouble();
         double b = input.nextDouble();
         double c = input.nextDouble();
         double d = input.nextDouble();

         double sum = powers(a, b);       //calling my powers method
         
                                                                   

         System.out.println("Would you like to do more?");
         System.out.println("Type   1  to continue or   2  to discontinue:");
         int retry = input.nextInt();
         
         if(retry == 1)
         {
         resend();
         }
         else
         System.exit(0);
         }*/

   }
   public static double addition (double q, double r, double s, double t)
      {
      return q + r + s + t;
         }
   public static double subtraction (double q, double r, double s, double t)
      {
      return q - r - s - t;
         }
   public static double multiply (double q, double r, double s, double t)
      {
      return q * r * s * t;
         }
   public static double divide (double q, double r, double s, double t)
      {
      return q * r * s * t;
         }
   public static double percent (double q)
      {
      q = q * 100;
      return q;
         }
   public static double remainder (double q, double r)
      {
      double sum = q % r;
      return sum;
         }
   public static double logarithm10 (double q)
      {
      double sum = Math.log10(q);
      return sum;
         }
   public static double logarithmnat (double q)
      {
      double sum = Math.log(q);
      return sum;
      }
   public static double logarithmx (double q, double r)
      {
      double sum = (Math.log(q) / Math.log(r));
      return sum;
         }
   public static double root (double q, double r)
      {
      double sum = (Math.pow((Math.abs(q)),(1.0/r)));
      return sum;
         }
   public static double trigsin (double q)
      {
      double sum = Math.sin(q * Math.PI / 180);
      return sum;
         }
   public static double trigcos (double q)
      {
      double sum = Math.cos(q);
      return sum;
         }
   public static double trigtan (double q)
      {
      double sum = Math.tan(q);
      return sum;
         }
   public static double powers (double q, double r)
      {
      double sum = Math.pow(q, r);
      return sum;
         }
   public static String toBinary (int q)
      {
      String sum = Integer.toBinaryString(q);
      return sum;
         }

   public static String toOctal (int q)
      {
      String sum = Integer.toOctalString(q);
      return sum;
         }

   public static String toHexDec (int q)
      {
      String sum = Integer.toHexString(q);
      return sum;
         }
         
   public static char toASCII (int q)
      {
      char ch = (char)q;
      return ch;
         }
   public static int fSeries (int q, int r)
   {
   
    int sum = q + r;
    System.out.println(sum);
    return sum;
   
   }
   public static void resend()
   {  
      Scanner input = new Scanner(System.in);
   
      String H1 = "         Calculator Main Menu";
      String H2 = " 1.  Addition           2. Subtraction";
      String H3 = " 3.  Multiplication     4. Division";
      String H4 = " 5.  Percentages        6. Division Remainder";
      String H5 = " 7.  Logorathims        8. Roots";
      String H6 = " 9.  Trigonometry      10. Powers";
      String H7 = "11.  Fibonacci Series  12. ASCII Conversion";
      String H8 = "13.  Conversions       14. Free Form Calculation";
   
      System.out.println(H1);
      System.out.println(H2);
      System.out.println(H3);
      System.out.println(H4);
      System.out.println(H5);
      System.out.println(H6);
      System.out.println(H7);
      System.out.println(H8);
   
      System.out.println("Please enter a number between 1 and 14 for the option to perform");
      System.out.println("Or 999 to exit calculator...");
      int option = input.nextInt();
           
      if      (option == 999)
      {
      System.out.println("Thank you for using my first calculator");
         }
      else if (option <= 0 || option >= 15 && option <= 998 || option >= 1000)
      {
      System.out.println("NaN - Please enter an option between 1 and 14, then press enter");
      System.out.println("Or 999 to exit calculator...");
         }
   
}

}
      