/** @author Eroll Gorçi */
/** Blackjack is the controller class of the game 21 (also known as BLACKJACK) */
import javax.swing.*;
public class Blackjack
{ 
   public static void main(String [] args)
   { 
      Player p = new Player();
      int b = p.getScore();
      String pSuit = p.getName();
      //String name = p.getUsersName().substring(0, 1).toUpperCase() + p.getUsersName().substring(1) ;
      if ( b == 21 )
      { JOptionPane.showMessageDialog(null, "BLACKJACK -- Congratulations, you won automatically by scoring " + b);}
        //JOptionPane.showMessageDialog(null, "You have " + b + " points" + "\nPlayer 2 has " + c + " points");
      else { 
          ComputerPlayer cp = new ComputerPlayer();
          String cpSuit = cp.getName();
          int c = cp.getScore();
         JOptionPane.showMessageDialog(null, "You have " + b + " points" + "\nPlayer 2 has " + c + " points");
         if ( b > c && b <= 21 )
         { JOptionPane.showMessageDialog(null, "Congratulations, you won by scoring " + b + " points");}
         else { 
            if ( c <= 21 && c != b) { JOptionPane.showMessageDialog(null, "The winner is Player 2 with " + c + " points");}
            else { 
               if ( c == b && c < 21 && b < 21) JOptionPane.showMessageDialog(null, "We have a draw " + b + "--" + c);
               else if ( b > 21 && c > 21) JOptionPane.showMessageDialog(null, "Both players have exceeded 21 points " + b + "--" + c);
               else  JOptionPane.showMessageDialog(null, "Congratulations, you won by scoring " + b + " points");
            }
         }
      }
   }
}
