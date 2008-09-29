/*
 * This tests where the bug will be
 * Michael Brinkmann
 * September 25, 2008
 */
public class BugTester
{
     public static void main (String args [])
     {
          Bug tick = new Bug (10);
          Bug spider = new Bug (7);
          
          tick.move ();// move 1 right
          tick.turn ();// turn and move 1 left
          tick.move ();// move 1 left
          tick.move ();// move 1 left
          tick.turn ();// turn and move 1 right
          tick.move ();// move 1 right
          
          spider.move ();// move 1 right
          spider.turn ();// turn and move 1 left
          spider.move ();// move 1 left
          spider.move ();// move 1 left
          spider.turn ();// turn and mobe 1 right
          
          System.out.println ("The tick is at: "+ tick.getPosition());
          System.out.println ("The spider is at: "+ spider.getPosition());
     }
}
               