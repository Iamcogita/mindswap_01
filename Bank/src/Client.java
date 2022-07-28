public class Client {
    private String name;
    private String checkAccount;

    private Bank bank;

    private Account account;

    private boolean hasCard;

    private int accountNumber;
    private String BankName;

    private String accountType;

    Credit creditAccount = new Credit( "BankOne" , 777);

    Client(String name){
        this.name = name;
        checkAccount = " Welcome " +  getClientName() + ", your balance is:";
        this.hasCard = true;
    }

    public String getClientName() {
        return this.name;
    }

    public int checkAccount(String BankName, int accountNumber) {
        this.BankName = BankName;
        this.accountNumber = accountNumber;
        return bank.getAccountBalance();
    }

    /*

    public void createAccount(); -> has account

    public void askForCard() ; -> has card

    public void depositMoney() ;

    public void checkAccount() ;

    public void withdrawMoney() ;

    public void pay() ;
    */

}
