public class Table {
    private boolean free = true;
    private String order = "waiting that client decide";
    private boolean alreadyOrdered = false;



    public void cleanOrder(){
        order ="waiting that client decide";
        alreadyOrdered = false;

    }
    public String getOrder(){
        return this.order;
    }
    public void saveOrder(String order){
        if(this.alreadyOrdered){
            System.out.println("This table already has an order. You can't put a new one.");
            return;
        }
        this.order = order;
        this.alreadyOrdered = true;
        System.out.println("Here's a hot plate of: " + getOrder());
    }

    public void unoccupy() {
        free = true;
    }
    public void Ococcupy() {
        free = false;
    }

    public boolean isFree(){
        return this.free;
    }
    public boolean getAlreadyOrdered(){
        return alreadyOrdered;
    }
}
