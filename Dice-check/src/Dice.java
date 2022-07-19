public class Dice {
    public static void main(String[] args) {
        Player player1 = new Player("john", 3);
        Player player2 = new Player("James", 7);
        diceRoll(player1, player2);
    }

    public static void diceRoll(Player player1, Player player2) {

        Util util = new Util();

        while (true) {
            int winningNumber = Util.getRandomUtil() + Util.getRandomUtil();
            System.out.println(winningNumber);


            if (player1.getNumChosen() == winningNumber) {
                System.out.println("Bingo! " + player1.getName() + " Wins with a  " + player1.getNumChosen());
                return;
            }
            if (player2.getNumChosen() == winningNumber) {
                System.out.println("Bingo! " + player2.getName() + " Wins with a  " + player2.getNumChosen());
                return;
            }
            System.out.println("play again!");
        }
    }
}



