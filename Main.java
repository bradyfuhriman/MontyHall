public class Main {

    public static void main(String[] args) {
        int won = 0;
        int lost = 0;
        int wonChanged = 0;
        int lostChanged = 0;
        int passes = 100000;
        int choice;

        for (int i = 0; i < passes; i++) {
            MontyHall problem = new MontyHall();
            choice = problem.getRandom();

            if (problem.isCar(choice)) {
                won++;
            } else {
                lost++;
            }
        }

        for (int i = 0; i < passes; i++) {
            MontyHall problem = new MontyHall();
            choice = problem.getRandom();
            int hostChoice = problem.hostChoice(choice);

            // Choice is changed
            choice = problem.otherDoor(choice, hostChoice);

            if (problem.isCar(choice)) {
                wonChanged++;
            } else {
                lostChanged++;
            }
        }

        System.out.println("1,000,000 tests were done for each case. These are the results:\n");
        System.out.println("Games where initial choice was changed: " +
                "\nWon: " + wonChanged / (passes / 100) + "%" +
                "\nLost: " + lostChanged / (passes / 100) + "%");
        System.out.println("\nGames where initial choice was not changed: " +
                "\nWon: " + won / (passes / 100) + "%" +
                "\nLost: " + lost / (passes / 100) + "%");
    }
}
