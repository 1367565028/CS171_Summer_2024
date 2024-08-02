/* THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
   CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES.
   Michael Zhao */

import java.util.ArrayList;

public class CardPlayer extends GeneralPlayer<Card> {
    private ArrayList<Card> hand;
    ArrayList<Card> bank;
    private boolean turn;
    private int points;

    //Constructor
    public CardPlayer() {
        super("General Player");
        this.hand = new ArrayList<>();
        this.bank = new ArrayList<>();
        this.turn = false;
        this.points = 0;
    }

    //Constructor
    public CardPlayer(String name) {
        super(name);
        this.hand = new ArrayList<>();
        this.bank = new ArrayList<>();
        this.turn = false;
        this.points = 0;
    }

    //Adds a card to the player's hand.
    public void addToHand(Card card) {
        this.hand.add(card);
    }

    //Gets the player's hand.
    public ArrayList<Card> getHand() {
        return hand;
    }

    //Returns a string representation of the player's hand.
    public String handToString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : hand) {
            sb.append(card.identifier).append(" ");
        }
        return sb.toString().trim();
    }

    // Returns a string representation of the player's bank.
    public String bankToString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" bank has ").append(bank.size()).append(" cards: ");
        for (Card card : bank) {
            sb.append(card.identifier).append(" ");
        }
        return sb.toString().trim();
    }

    //Plays a card from the player's hand.
    public Card play() {
        if (!hand.isEmpty()) {
            return hand.remove(0);
        }
        return null;
    }

    //Gets the player's points.
    public int getPoints() {
        return points;
    }

    //Sets the player's points
    public void setPoints(int points) {
        this.points = points;
    }

    //Sets the player's turn status.
    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    //Checks if it's the player's turn.
    public boolean isTurn() {
        return turn;
    }

    //Adds a card to the player's bank.
    public void addToBank(Card card) {
        this.bank.add(card);
    }
}


