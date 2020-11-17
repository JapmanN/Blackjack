import java.util.ArrayList;

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
}