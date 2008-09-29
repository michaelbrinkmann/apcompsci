/* This displays three different greetings
 * Michael Brinkmann
 * September 25. 2008
 */

public class Greeter
{
     private String name;
     private String greeting;
     private int m;
     
     public Greeter (String n)
     {
          name = n;
          String g = greeting;
          m = 1;
          
          if (m==1)
          {
               greeting = ("Hello "+ name);
          }
     }
     
     public void sayGoodbye ()
     {
          m *= -1;
          if (m==-1)
          {
               greeting = ("Goodbye "+ name);
          }
     }
     
     public void refuseHelp ()
     {
          m *= 0;
          if (m==0)
          {
               greeting = ("I'm sorry "+ name +" It's my body.");
          }
     }
     
     public String getGreeting ()
     {
         return greeting;
     }
     
}
     
     
          