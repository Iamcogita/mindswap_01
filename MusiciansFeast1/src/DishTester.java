public class DishTester {
    /* A bunch of musicians are having a feast, and each of them is bringing a dish.
    The only rule is that the first and last letters of the dish must
    the first and last letters of the musicians name. */

    public static void main(String[] args) {
        testDish("Bob Dylan", "beef wellington");
        testDish("Mick Jagger", "mushroom soup");
        boolean testDishBool = testDish("Bob Dylan", "beef wellington");
        boolean testDishBool2 = testDish("Mick Jagger", "mushroom soup");
        System.out.println(testDishBool);
        System.out.println(testDishBool2);
    }

    public static boolean testDish(String musiciansName, String dish) {
        return musiciansName.toUpperCase().charAt(0) == dish.toUpperCase().charAt(0) &&
                musiciansName.toUpperCase().charAt(musiciansName.length() - 1) == dish.toUpperCase().charAt(dish.length() - 1) ;
    }
}
    /*
    public static void testDish(String musiciansName, String dish ) {
        if (musiciansName.toUpperCase().charAt(0) == dish.toUpperCase().charAt(0) &&
                musiciansName.toUpperCase().charAt( musiciansName.length() - 1) == dish.toUpperCase().charAt( dish.length() - 1)) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }
}
*/