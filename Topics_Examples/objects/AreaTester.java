import java.awt.Rectangle; //or import java.awt.**;

public class AreaTester
{
  public static void main (String args[])
  {
    Rectangle box = new Rectangle (5, 10, 20, 30);
    //                             x  y   w   h
    
    System.out.println ("The area od a Rectangle with with" +
                        box.getWidth() + " and height " +
                        box.getHeight() + " is " +
                        (box.getWidth() * box.getHeight()) + ".");
  }//end main method
}//end class