package osu;
import java.util.Random;
public class GameState {
    public static final int MAX_HAND = 500;
    public static final int MAX_DECK =  500;
    

    public int numPlayers; //number of players
    public int supplyCount[];
    public int embargoTokens[];
    public int outpostPlayed;
    public int outpostTurn;
    public int whoseTurn;
    public int phase;
    public int numActions; /* Starts at 1 each turn */
    public int coins; /* Use as you see fit! */
    public int numBuys; /* Starts at 1 each turn */
    public int hand[][];
    public int handCount[];
    public int deck[][];
    public int deckCount[];
    public int discard[][];
    public int discardCount[];
    public int playedCards[];
    public int playedCardCount;

    public Random rand;
};

