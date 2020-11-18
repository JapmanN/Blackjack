import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<String> cards;

    public Deck() {
        this.cards = new ArrayList<String>();
    }
    
    // For Each loop to make new deck
    public void makeDeck() {
        for(Suit suit : Suit.values()) {
            for(Value value : Value.values()) {
                this.cards.add(value.toString() + suit);
            }
        }
    }
    
    public void shuffleDeck() {
        // Take cards from original deck, randomize them, and store them in a temporary deck. Then set the original deck to the temporary deck
        ArrayList<String> newDeck = new ArrayList<String>();
        Random randNum = new Random();
        int randCardIndex = 0;
        int sizeOfArray = this.cards.size();
        
        for(int i = 0; i < sizeOfArray; i++) {
            randCardIndex = randNum.nextInt((this.cards.size() - 1 - 0) + 1) + 0;
            newDeck.add(this.cards.get(randCardIndex));
            this.cards.remove(randCardIndex);
        }
        
        this.cards = newDeck;
    }

    // Create three getters and setters
    public void removeCard(int card) {
        this.cards.remove(card);
    }
    
    public String getCard(int card) {
        return this.cards.get(card);
    }
    
    public void addCard(String addCard) {
        this.cards.add(addCard);
    }
}