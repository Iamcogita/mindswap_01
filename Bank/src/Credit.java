public class Credit extends Account{


    private String accountType = "Credit";
    private String BankName;
    private Bank BankOne;

    Credit(String BankName, int accountNumber ) {
        super( BankName , accountNumber) ;
        this.accountType = accountType;
    }

    private int accountBalance = 500 ;

    private int tax = 5 ;

    public int getAccountBalance() {
        return accountBalance;
    }

    /*
    @Override
    public void pay(int amountToPay ) {
        if (this.accountBalance <= -100){
            System.out.println(ERROR_NO_MONEY);
            return;
        }
        if (this.accountBalance - accountBalance <= -100){
            System.out.println(ERROR_PAY_DEPT_FIRST);
            return;
        }
        if (this.accountBalance < 0){
            accountBalance = accountBalance - ( amountToPay + tax);
        }

        accountBalance -= amountToPay ;
    } */
}
