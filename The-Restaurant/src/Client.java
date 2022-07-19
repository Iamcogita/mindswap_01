public class Client {
    private int tableNumber = -1;
    Restaurant restaurant;

    public void setRestaurant(Restaurant restaurant){
        this.restaurant = restaurant;

    }
    public void askForTable(){
        if(tableNumber >= 0){System.out.println("You already have a table"); return;}
        if(this.restaurant == null){
            System.out.println("Oh wait... First i have to go to a restaurant before i do this...");
            return;
        }

        this.tableNumber = this.restaurant.findTable();
        if(this.tableNumber == -2){
            System.out.println("We're full, sorry. Kindly go away.");
            return;
        }
        System.out.println("Welcome! Here's your table number: " + (this.tableNumber +1));

    }
    public void order(){System.out.println("Can you specify your order pls?");}

    public void order(String order) {
        if(!checkRestaurantpresence(this.tableNumber, this.restaurant)){return;}
        restaurant.order(order, this.tableNumber);
    }
    private boolean checkRestaurantpresence(int tableNumber, Restaurant restaurant){
        if(restaurant == null){System.out.println("Oh wait... First i have to go to a restaurant before i do this..."); return false;}
        if (tableNumber < 0){System.out.println("Oh wait... First i have to ask for a table before i do this..."); return false;}
        return true;
    }

    public void pay() {
        if(checkRestaurantpresence(tableNumber, restaurant)){
            if(!this.restaurant.getAlreadyOrdered(this.tableNumber)){
                System.out.println("You can't leave! you don't even ordered!");
                return;}
            this.restaurant.freeTable(tableNumber);
            this.tableNumber = -2;

            return;}

    }
}

