public class Runner {

    public static void main(String[] args) {
        int won = 0;
        int lost = 0;
        int wonChanged = 0;
        int lostChanged = 0;
        int passes = 100000;

        for (int i = 0; i < passes; i++) {
            // If this is true, the contestant will change their choice
            boolean changeDoors = false;

            // Creates a scenario
            MontyHall problem = new MontyHall();
            final int initialChoice = problem.getRandom();
            int choice = initialChoice;

            // The host opens a door
            int hostChoice = problem.hostChoice();

            // The contestant changes their choice, or not
            if (changeDoors) choice = problem.switchChoice(initialChoice, hostChoice);

            // If a car was chosen, the contestant won
            boolean isCar = problem.isCar(choice);
            if (isCar) {
                won++;
            } else {
                lost++;
            }
        }

        for (int i = 0; i < passes; i++) {
            // If this is true, the contestant will change their choice
            boolean changeDoors = true;

            // Creates a scenario
            MontyHall problem = new MontyHall();
            final int initialChoice = problem.getRandom();
            int choice = initialChoice;

            // The host opens a door
            int hostChoice = problem.hostChoice();

            // Our choice is changed, or not
            if (changeDoors) choice = problem.switchChoice(initialChoice, hostChoice);

            // If we chose a car, we won
            boolean isCar = problem.isCar(choice);
            if (isCar) {
                wonChanged++;
            } else {
                lostChanged++;
            }
        }

        System.out.println(passes + " tests were done, these are the results:\n");
        System.out.println("Games where initial choice was changed: " +
                "\nWon: " + wonChanged / (passes / 100) + "%" +
                "\nLost: " + lostChanged / (passes / 100) + "%");
        System.out.println("\nGames where initial choice was not changed: " +
                "\nWon: " + won / (passes / 100) + "%" +
                "\nLost: " + lost / (passes / 100) + "%");
    }
}
