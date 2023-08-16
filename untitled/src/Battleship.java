import java.util.HashSet;
import java.util.Set;

public class Battleship {

    private Set<String> locations = new HashSet<>();
    private boolean sunk = false;

    public Battleship() {
        locations.add("A1");
        locations.add("A2");
        locations.add("A3");
    }

    public boolean hit(String guess) {
        if (locations.contains(guess)) {
            locations.remove(guess);
            if (locations.isEmpty()) {
                sunk = true;
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean isSunk() {
        return sunk;
    }
}