package academy.mindswap;

public class BlackJack {

    public static void main(String[] args) {

        Player player1 = new Player("Lucky" );
        Player player2 = new Player("Dealer" );

        while (player1.getHandCounter() < 21 && player2.getHandCounter() < 21) {
            player1.sumHandCounter(randomCard());
            System.out.println(player1.getName() + " has " + player1.getHandCounter() + " this hand.");

            if (player1.getHandCounter() > 21) {
                System.out.println(player1.getName() + " got burst. " + player2.getName() + " won!");
                break;
            }
            if (player1.getHandCounter() == 21) {
                System.out.println(player1.getName() + " got 21 and won!");
                break;
            }

            player2.sumHandCounter(randomCard());
            System.out.println(player2.getName() + " has " + player2.getHandCounter() + " this hand.");
            if (player2.getHandCounter() > 21) {
                System.out.println(player2.getName() + " got burst. " + player1.getName() + " won!");
                break;
            }
            if (player2.getHandCounter() == 21) {
                System.out.println(player2.getName() + " got 21 and won!");
                break;
            }
        }
    }
    public static int randomCard() {return (int) ((Math.random() * 13) + 1) ; }

}