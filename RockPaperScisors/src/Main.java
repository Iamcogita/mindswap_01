public class Main {

    public static void main(String[] args) {

        Janken player1 = new Janken("Dave");
        Janken player2 = new Janken("Hal");

        GameRun(player1,player2);
    }

    public static void GameRun(Janken player1 , Janken player2) {

        switch (player1.getThrow()) {
            case 1 :
                System.out.println(player1.getName() + " used rock.");
                break;
            case 2 :
                System.out.println(player1.getName() + " used paper.");
                break;
            case 3 :
                System.out.println(player1.getName() + " used scissors.");
                break;
        }

        switch (player2.getThrow()) {
            case 1 :
                System.out.println(player2.getName() + " used rock.");
                break;
            case 2 :
                System.out.println(player2.getName() + " used paper.");
                break;
            case 3 :
                System.out.println(player2.getName() + " used scissors.");
                break;
        }

        GameMechanics( player1 , player2 ) ;
    }
    private static void GameMechanics(Janken player1 , Janken player2) {
        if (player1.getScore() == player2.getScore()) {
        System.out.println("Its a draw.");
        }
        else if (player2.getScore() == 3 && player1.getScore() == 1){
            System.out.println( player1.getName() + " wins.");
        }
        else if (player2.getScore() == 3 && player1.getScore() == 2){
            System.out.println( player2.getName() + " wins.");
        }
        else if (player2.getScore() == 2 && player1.getScore() == 1){
            System.out.println( player2.getName() + " wins.");
        }
        else if (player2.getScore() == 2 && player1.getScore() == 3){
            System.out.println( player1.getName() + " wins.");
        }
        else if (player2.getScore() == 1 && player1.getScore() == 2){
            System.out.println( player1.getName() + " wins.");
        }
        else if (player2.getScore() == 1 && player1.getScore() == 3){
            System.out.println( player2.getName() + " wins.");
        }
        //System.out.println( player1.getScore() + " " + player2.getScore());
    }
}
