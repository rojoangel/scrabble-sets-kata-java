import org.junit.Test;

import static org.junit.Assert.*;

public class ScrabbleSetsTest {

    @Test
    public void testInitialOutput() throws Exception {
        ScrabbleSets scrabbleSets = new ScrabbleSets();
        assertEquals(
                "12: E"+ "\n" +
                "9: A, I" + "\n" +
                "8: O" + "\n" +
                "6: N, R, T" + "\n" +
                "4: D, L, S, U" + "\n" +
                "3: G" + "\n" +
                "2: B, C, F, H, M, P, V, W, Y, _" + "\n" +
                "1: J, K, Q, X, Z" + "\n",
                scrabbleSets.toString());
    }

    @Test
    public void testOneTilePlayed() throws Exception {
        ScrabbleSets scrabbleSets = new ScrabbleSets();
        scrabbleSets.playTiles("_");

        assertEquals(
            "12: E"+ "\n" +
            "9: A, I" + "\n" +
            "8: O" + "\n" +
            "6: N, R, T" + "\n" +
            "4: D, L, S, U" + "\n" +
            "3: G" + "\n" +
            "2: B, C, F, H, M, P, V, W, Y" + "\n" +
            "1: J, K, Q, X, Z, _" + "\n",
            scrabbleSets.toString());
    }
}