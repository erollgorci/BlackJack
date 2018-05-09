/** Card models a playing card */
public class Card
{ // definitions that one can use to describe the value of a card:
   public static String s = "S";
   public static String h = "H";
   public static String d = "D";
   public static String c = "C";
   public static int SIZE_OF_ONE_SUIT = 13; // how many cards in one suit
// These are the card’s attributes:
   private String suit;
  // static StringBuilder suits = new StringBuilder();
   private String cardsName;
   private int count;
   private int number;
/** Constructor Card sets the suit and count.
* @param s - the suit
* @param c - the count */
   public Card(String s, int c)
   { suit = s;
      number = c;
      if ( c == 1 )
      { 
         cardsName = "A";
         count = 11;
      }
      else { 
         if ( c == 11 )
         { 
            cardsName = "J";
            count = 10; 
         }
         else { 
            if ( c == 12)
            { 
               cardsName = "Q";
               count = 10;
            }
            else { 
               if ( c == 13 )
               {
                  cardsName = "K";
                  count = 10;
               }  
               else {
                  cardsName = ""+c;
                  count = c;
               }     
            }
         }
      }
   /*     switch (this.getSuit()) {
            case SPADES:
                suits.append((char)'\u2660');
                break;
            case DIAMONDS:
                suits.append((char)'\u2666');
                break;
            case CLUBS:
                suits.append((char)'\u2663');
                break;
            case HEARTS:
                suits.append((char)'\u2764');
                break;
        }*/
   }
/** getSuit returns the card’s suit. */
   public String getSuit()
   { 
      return suit; }
/** getSuits returns the card’s suit. */
 /*  public static StringBuilder getSuits()
   { 
      return suits; }*/

/** getCount returns the card’s count. */
   public int getCount()
   { 
      return count; }
/** getCount returns the card’s count. */
   public int getNumber()
   { 
      return number; }
/** getName returns the cards value as a String. */
   public String getName()
   { 
      return cardsName; }
}