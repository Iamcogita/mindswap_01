public class Main {

    public static void main(String[] args) {

        Shop shop1 = new Shop();
        Shop shop2 = new Shop();

        System.out.println("PRODUCING: SHOP 01");
        System.out.println("-".repeat(40) + "\n");
        shop1.amountOfBearsToProduce( 10 , 20);
        System.out.println("\n");
        System.out.println("PRODUCING: SHOP 02");
        System.out.println("-".repeat(40) + "\n");
        shop2.amountOfBearsToProduce( 10 , 55);
        System.out.println("\n");

        System.out.println("TESTING THE BEARS: SHOP 01");
        System.out.println("-".repeat(40) + "\n");
        shop1.makeThemSpeak();
        System.out.println("\n");
        System.out.println("TESTING THE BEARS: SHOP 02");
        System.out.println("-".repeat(40) + "\n");
        shop2.makeThemSpeak();
        System.out.println("\n");

        System.out.println("-".repeat(40) + "\n");

        System.out.println("TESTING THE BEARS: SHOP 01 / SECOND TIME");
        System.out.println("-".repeat(40) + "\n");
        shop1.makeThemSpeak();
        System.out.println("\n");
        System.out.println("TESTING THE BEARS: SHOP 02 / SECOND TIME");
        System.out.println("-".repeat(40) + "\n");
        shop2.makeThemSpeak();
        System.out.println("\n");

        System.out.println("-".repeat(40) + "\n");

        System.out.println("TESTING THE BEARS: SHOP 01 / THIRD TIME");
        System.out.println("-".repeat(40) + "\n");
        shop1.makeThemSpeak();
        System.out.println("\n");
        System.out.println("TESTING THE BEARS: SHOP 02 / THIRD TIME"); // only drunk bears should speak
        System.out.println("-".repeat(40) + "\n");
        shop2.makeThemSpeak();
        System.out.println("\n");

    }
}