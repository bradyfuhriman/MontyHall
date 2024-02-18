import java.util.Random;

public class MontyHall {
    private char[] doors;
    private char car = 'C';
    private char goat = 'G';

    public MontyHall() {
        doors = new char[3];

        // Puts car behind a random door
        int index = getRandom();
        doors[index] = car;

        // Puts goats behind the rest
        for (int i = 0; i < doors.length; i++) {
            if (doors[i] != car) {
                doors[i] = goat;
            }
        }
    }

    public int getRandom() {
        Random rand = new Random();
        return rand.nextInt(2) + 1;
    }

    public int hostChoice() {
        int index = getRandom();

        // Ensures the host opens a goat door
        while (doors[index] != goat) {
            index = getRandom();
        }
        return index;
    }

    public int switchChoice(int a, int b) {
        int newChoice = 0;
        for (int i = 0; i < doors.length; i++) {
            if (!(doors[i] == a || doors[i] == b)) {
                newChoice = i;
            }
        }
        return newChoice;
    }

    public boolean isCar(int i) {
        return (doors[i] == car);
    }
}

