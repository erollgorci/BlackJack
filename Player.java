import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.awt.Graphics.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
/** Player models a player for the game 21 controlled by a human 
    user and creates a frame and panel to draw the game*/

public class Player extends JPanel
{ 
   private int score; // keeps track of the value of all cards in player's hand
   private int handSize = 0 ; // how many cards in hand
   private String cardsName = ""; // the card's "name"
   private String username;
   private int cardScore;
   CardDeck a = new CardDeck(); // creates an instance of CardDeck class
   Card[] hand = new Card[4 * Card.SIZE_OF_ONE_SUIT]; // creates an array of 52 cards
/** Constructor Player creates a player for the game 21 controlled by a human user */
   public Player()
   {
      JFrame my_frame = new JFrame();
      my_frame.setSize(800,600);
      my_frame.getContentPane().add(this);
      //panel.setBackground(Color.WHITE);
     // panel.setLayout(new BorderLayout());
      my_frame.setTitle("Black Jack : Your Cards !");
      my_frame.setVisible(true);
      my_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //username = JOptionPane.showInputDialog("Please enter your name");
      while ( handSize < 2 )
      {
         hand[handSize] = a.newCard();
         cardScore = hand[handSize].getNumber();
         score = score + hand[handSize].getCount();
         //new Card2(cardScore);
         //cardsName = hand[handSize].getName()+hand[handSize].getSuit();
         handSize++;
      }
      
      while ( score < 21 )
      {
         
         int input = JOptionPane.showConfirmDialog(null,"You have "+score+" points"+"\nDo you want another card ?");
         if ( input == JOptionPane.NO_OPTION ){ 
            break ;}
         else {
            hand[handSize] = a.newCard();
            cardScore = hand[handSize].getNumber();
            score = score + hand[handSize].getCount();
            //new Card2(cardScore);
            //cardsName = cardsName + " " + hand[handSize].getName() + " of " + hand[handSize].getSuit() + "  ";
            handSize++;
            if(handSize > 4){
            my_frame.setSize(handSize*200,600);}
            this.repaint();
            
         }
      }
   }
/** getName returns the cards value as a String.  */
   public String getName()
   { 
      return cardsName;} 
   
/** getScore returns the score of all cards in player's hand. */   
   public int getScore()
   { 
      return score;}
   
/** getUsersName returns the name of the user.  
   public String getUsersName()
   { 
      return username.trim();}*/
      
      public void paintComponent(Graphics g){
      g.setColor(Color.WHITE);
      g.fillRect(0,0,1500,1024);
       BufferedImage imaged = new BufferedImage(1,1,1); 
         try{
            imaged = ImageIO.read(new File("image/PNG/gray_back.png"));
            }
            catch(IOException ex){}  
         g.drawImage(imaged,300,30,null);
         for(int i=0; i != handSize; i++){
         String name = hand[i].getName()+hand[i].getSuit();
         //System.out.println(name);
         BufferedImage image = new BufferedImage(1,1,1); 
         try{
            image = ImageIO.read(new File("image/PNG/"+name+".png"));
            }
            catch(IOException ex){}  
         g.drawImage(image,30+(i*200),270,null);}
         
   }        
}

