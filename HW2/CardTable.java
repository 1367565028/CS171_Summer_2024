/* THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
   CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES.
   Michael Zhao */

import java.util.Arrays;

public class CardTable implements Table<Card, CardPlayer> {

    private Card[] places;
    private int currentPlace;

    //Constructor to initialize the card table.
    public CardTable() {
        this.places = new Card[NUMBER_OF_PLACES];
        Arrays.fill(this.places, null); // Initialize all places as null
        this.currentPlace = 0;
    }

    //Adds a card to the current place on the table.
    public void addCardToPlace(Card card) {
        places[currentPlace] = card; // Place the card at the current place
        currentPlace = (currentPlace + 1) % NUMBER_OF_PLACES; // Move to the next place
    }

    //Returns an array of identifiers for the cards.
    public int[] getPlaces() {
        int[] ids = new int[NUMBER_OF_PLACES];
        for (int i = 0; i < NUMBER_OF_PLACES; i++) {
            ids[i] = (places[i] != null) ? places[i].identifier : -1; // Get card identifier or -1 if null
        }
        return ids;
    }

    //Checks for matching card ranks
    public void checkPlaces(CardPlayer player) {
        int lastPlace = (currentPlace - 1 + NUMBER_OF_PLACES) % NUMBER_OF_PLACES; // Get the last placed card's index
        Card currentCard = places[lastPlace]; // Get the last placed card
        if (currentCard != null) {
            for (int i = 0; i < NUMBER_OF_PLACES; i++) {
                if (i != lastPlace && places[i] != null && places[i].getRank() == currentCard.getRank()) {
                    // Match found
                    player.addToBank(currentCard); // Add current card to bank
                    player.addToBank(places[i]); // Add matched card to bank
                    player.setPoints(player.getPoints() + 1); // Increment points
                    System.out.println("Matched ranks: " + places[i].identifier + " (on table) and " + currentCard.identifier + " (" + player.name + "'s card)");
                    places[lastPlace] = null; // Remove current card from table
                    places[i] = null; // Remove matched card from table

                    // Refill places with new cards from hand if available
                    if (!player.getHand().isEmpty()) {
                        places[lastPlace] = player.play();
                    }
                    if (!player.getHand().isEmpty()) {
                        places[i] = player.play();
                    }
                    return;
                }
            }
        }
    }
}



