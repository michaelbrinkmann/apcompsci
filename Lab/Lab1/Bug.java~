/*
 * This simulates the movement of a bug
 * Ryan O'Hara
 * September 24, 2008
 */

public class Bug
{
     private int pos;
     private int direction = 1;
     
     public Bug (int initPosition)
     {
          pos = initPosition;
     }
     
     public void move ()
     {
          if (direction == 1) 
               pos += 1;
          
          else 
               pos -= 1;
     }
     
     public void turn ()
     {
          direction *= -1;
          
          if (direction == 1) 
               pos += 1;
          
          else 
               pos -= 1;
     }
     
     public int getPosition ()
     {
          return pos;
     }
}