import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class ScrabbleSets {

    SortedMap<Character, Integer> tiles;

    public ScrabbleSets() {
        tiles = new TreeMap<Character, Integer>();
        initTiles();
    }

    private void initTiles() {
        tiles.put('A', 9);
        tiles.put('B', 2);
        tiles.put('C', 2);
        tiles.put('D', 4);
        tiles.put('E', 12);
        tiles.put('F', 2);
        tiles.put('G', 3);
        tiles.put('H', 2);
        tiles.put('I', 9);
        tiles.put('J', 1);
        tiles.put('K', 1);
        tiles.put('L', 4);
        tiles.put('M', 2);
        tiles.put('N', 6);
        tiles.put('O', 8);
        tiles.put('P', 2);
        tiles.put('Q', 1);
        tiles.put('R', 6);
        tiles.put('S', 4);
        tiles.put('T', 6);
        tiles.put('U', 4);
        tiles.put('V', 2);
        tiles.put('W', 2);
        tiles.put('X', 1);
        tiles.put('Y', 2);
        tiles.put('Z', 1);
        tiles.put('_', 2);
    }

    @Override
    public String toString() {
        Comparator<Integer> comparator =
                (o1, o2)->o1.compareTo(o2);
        SortedMap<Integer, String> tilesCount = new TreeMap<Integer, String>(comparator.reversed());
        for(Map.Entry<Character,Integer> tile : tiles.entrySet()) {
            Integer count = tile.getValue();
            Character character = tile.getKey();

            if(!tilesCount.containsKey(count)) {
                tilesCount.put(count, character.toString());
            }
            else {
                String currentString = tilesCount.get(count);
                tilesCount.put(count, currentString + ", "+character.toString());
            }
        }

        String output = "";
        for(Map.Entry<Integer, String> countedTiles : tilesCount.entrySet()) {
            output += countedTiles.getKey() + ": " + countedTiles.getValue() + "\n";
        }

        return output;
    }

    public void playTiles(String tiles) {
        for( Character tile : tiles.toCharArray() ) {
            if(this.tiles.containsKey(tile)) {
                Integer value = this.tiles.get(tile);
                value--;
                if(value < 0) {
                    //DO ANYTHING
                } else {
                    this.tiles.put(tile, value);
                }
            }
        }
    }
}
