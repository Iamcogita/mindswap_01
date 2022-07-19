public class Client {
    private String name;
    private String checkAccount;

    private Bank bank;

    private Account account;

    private int accountNumber;
    private String BankName;

    private String accountType;

    private int accountBalance = getAccountBalance();


    Client(String name){
        this.name = name;
        checkAccount = " Welcome " +  getClientName() + ", your balance is:";
        
    }

    public String getClientName() {
        return this.name;
    }

    public void checkAccount(String BankName, int accountNumber) {
        this.BankName = BankName;
        this.accountNumber = accountNumber;
        System.out.println(checkAccount);
        System.out.println( " - - - " );
        System.out.println(accountBalance);
    }

    public int getAccountBalance(){
        return this.accountBalance;
    }
    /*

    public void setBankAccount(bankAccountNumber[]);

    public void createAccount();

    public void askForCard() ;

    public void depositMoney() ;

    public void checkAccount() ;

    public void withdrawMoney() ;

    public void pay() ;
    */

}
