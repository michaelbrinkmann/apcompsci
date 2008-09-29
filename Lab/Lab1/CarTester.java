/**
 * This shows how much Gas remains
 * Michael Brinkmann
 * September 25, 2008
 */
public class CarTester
{
     public static void main (String args [])
     {
          
          Car myCar = new Car (25);
          Car myNissan = new Car (20);

          myCar.addGas (10);
          myNissan.addGas (20);
          myCar.drive (100);
          myNissan.drive (225);
          
          System.out.println ("My Car has "+ myCar.checkGas ()+" gallons of gas remaining");
          System.out.println ("\nMy Nissan has "+ myNissan.checkGas () +" gallons of gas remaining");
          
     }// end main method
}// end Car class