package Week4;

import java.util.Random;

public class Card {
	
	//these are the class variables of each card. The ints will be converted to strings when they are being viewed by a user
	int value;
	int suit;
	
	//assigns the ints as static variables
		Card(int value, int suit){
			this.value = value;
			this.suit = suit;
		}
		
		public static void main(String[] args) {
			
			//this generator will be used to create random cards
			Random cardGen = new Random();
			
			//this is how many cards to be dealt
			int cardsDealt = 5;
			
			//creates a "hand" which is an array that will be filled with cards. This assumes that hand size will be no more than the cards dealt
			Card[] hand = new Card[cardsDealt];

			//this generates a new card and adds it to the hand array for each new card dealt
			for(int i = 0; i < cardsDealt; i++) {
			hand[i] = new Card(cardGen.nextInt(12) + 1, cardGen.nextInt(3));
			}
			
			//this prints out the card description of the hand array, using the custom toString method detailed below
			for (Card card : hand) {
				System.out.println(card.toString(card.value, card.suit));

			}
		}
		
		//this overrides the toString method in a way which will output the proper card descriptions
		public String toString(int value, int suit) {
			
			//this is the string variable which will be output at the end of the loop. It starts blank
			String cardDescription = "";
			
			//this if statement first checks to see if the card is either an ace or a face card.
			//if it isn't, it uses the integer to string method to convert the value to a string which can be added to the cardDescription string
			//if the card is an ace or a face card, a switch method uses the card value to determine what face card it is, then adds it to the cardDescription string
			if (value > 1 && value <= 10) {	
				cardDescription += Integer.toString(value);
			}
			else {
				
				switch(value) {
				case 1:
					cardDescription += "Ace";
					break;
				case 11:
					cardDescription += "Jack";
					break;
				case 12:
					cardDescription += "Queen";
					break;
				case 13:
					cardDescription += "King";
					break;
				default:
					cardDescription += "";
					break;
				}
			}
			
			//this adds spaces and a descriptor between the card value and card suit
			cardDescription += " of ";
			
			//similar to the card value switch method, this switch method uses the int of the card suit to determine what suit the card is
			//this suit is then added to the cardDescription
			switch(suit) {
			case 0:
				cardDescription += "Hearts";
				break;
			case 1:
				cardDescription += "Diamonds";
				break;
			case 2:
				cardDescription += "Clubs";
				break;
			case 3:
				cardDescription += "Spades";
				break;
			default:
				cardDescription += "";
				break;
			}

			//returns the full card description in the format: "[Value] of [Suit]"
			return cardDescription;
			
		}
}
