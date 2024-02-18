import java.util.Random;

public class MontyHall {
    private final char[] doors;
    private final char car = 'C';
    private final char goat = 'G';

    public MontyHall() {
        doors = new char[3];

        // Puts car behind a random door
        int index = getRandom();
        doors[index] = car;

        // Puts goats behind the other two doors
        for (int i = 0; i < doors.length; i++) {
            if (doors[i] != car) {
                doors[i] = goat;
            }
        }
    }

    public int getRandom() {
        Random rand = new Random();
        return rand.nextInt(3);
    }

    public int hostChoice(int choice) {
        int index = getRandom();

        while (index == choice || doors[index] != goat) {
            index = getRandom();
        }
        return index;
    }

    // array of characters
    //
    public int otherDoor(int a, int b) {
        int newChoice = 0;
        for (int i = 0; i < doors.length; i++) {
            if (!(i == a || i == b)) {
                newChoice = i;
            }
        }
        return newChoice;
    }

    public boolean isCar(int i) {
        return (doors[i] == car);
    }
}