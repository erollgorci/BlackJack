/** ComputerPlayer models a player for the game 21 controlled by the computer */
public class ComputerPlayer
{  private int score; // keeps track of the value of all cards in hand
   private int handSize; // how many cards in hand
   private String cardsName = ""; // the card's name
   CardDeck a = new CardDeck(); // creates an instance of CardDeck class
   Card[] hand = new Card[4 * Card.SIZE_OF_ONE_SUIT]; // creates an array of 52 cards
/** Constructor ComputerPlayer creates a computerized player for the game 21 */
   public ComputerPlayer()
   {  
      while ( handSize < 2 )
      {
         hand[handSize] = a.newCard();
         score = score + hand[handSize].getCount();
         cardsName = cardsName + " " + hand[handSize].getName() + " of " + hand[handSize].getSuit() + "  ";
         handSize++;
      }
      while ( score <= 16 )
      {
         handSize++;
         hand[handSize] = a.newCard();
         score = score + hand[handSize].getCount();
         cardsName = cardsName + " " + hand[handSize].getName() + " of " + hand[handSize].getSuit() + "  ";
      }
   }
/** getName returns the cards value as a String. */
   public String getName()
   { 
      return cardsName;}

/** getScore returns the score of all cards in player's hand. */   
   public int getScore()
   { 
      return score;}
}