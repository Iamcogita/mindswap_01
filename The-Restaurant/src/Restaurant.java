public class Restaurant {
    private Table[] tables;
    private boolean fullCapacity = false;
    private int numberOfOccupiedTables = 0;
    private int totalNumberOfTables;



    Restaurant(int numberOfTables){
        this.tables = new Table[numberOfTables];
        populatingTables(numberOfTables);
        totalNumberOfTables = numberOfTables;
    }

    private void populatingTables(int numberOfTables){
        for (int i = 0; i < numberOfTables; i++) {
            tables[i] = new Table();
        }
    }

    public int findTable(){
        if(!fullCapacity){
            int table = 0;
            while(true){
                ;
                if(tables[table].isFree()){
                    tables[table].Ococcupy();
                    numberOfOccupiedTables++;
                    fullCapacity = numberOfOccupiedTables == totalNumberOfTables;
                    return table;
                }
                table++;
            }
        }
        return -2;
    }

    public void order(String order, int tableNumber){

        tables[tableNumber].saveOrder(order);

    }
    public boolean getAlreadyOrdered(int table){
        if(table < 0){return false;}
        return this.tables[table].getAlreadyOrdered();
    }
    public void freeTable(int tableNumber){
        tables[tableNumber].cleanOrder();
        tables[tableNumber].unoccupy();
        System.out.println("Don't forget to tip us on the way out!");
        numberOfOccupiedTables--;
        fullCapacity = false;

    }
}
