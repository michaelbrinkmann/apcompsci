/**
 * Shows 3 different greetings
 * Michael Brinkmann
 * September 25, 2008
 */
public class GreeterTester
{
     
     public static void main (String args [])
     {
          Greeter world = new Greeter ("World");
          Greeter michael = new Greeter ("Michael");
          Greeter kobe = new Greeter ("Kobe");
          
          michael.sayGoodbye ();
          kobe.refuseHelp ();
          
          System.out.println (""+ world.getGreeting ());
          System.out.println (""+ michael.getGreeting ());
          System.out.println (""+ kobe.getGreeting ());
     }
     
     
     
}
          
          