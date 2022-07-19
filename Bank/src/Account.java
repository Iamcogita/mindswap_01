public class Account{

    public String ERROR_NOT_ENOUGH_MONEY = "ERROR_NOT_ENOUGH_MONEY";
    public String ERROR_NO_MONEY = "ERROR_NO_MONEY";
    public String ERROR_PAY_DEPT_FIRST = "ERROR_PAY_DEPT_FIRST";

    private Credit credit;
    private Debit debit;
    private String BankName;
    public int accountBalance ;
    private int accountNumber;
    private String bankName ;
    public boolean doIHaveCard;
    private String accountType ;
    private static Account[] personalAccounts = new Account[3];

    public int getAccountBalance(){
        return credit.getAccountBalance();
    };

    Account(String BankName , int accountNumber){
        this.accountBalance = getAccountBalance();

    }

    /* public Account(String bankName, int accountNumber) {
        this.accountBalance = 0;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.accountType = "";
        this.doIHaveCard = false;
        for (int i= 0; 0 < personalAccounts.length ; i++) {
            if (personalAccounts[i] == null){
                personalAccounts[i] = this;
                return;
            }
        }
    }

/*paying debit
    public void pay(int amountToPay ) {
        if ( this.clientAccountId.accountBalance <= 0){
            System.out.println(ERROR_NO_MONEY);
            return;
        }
        if (amountToPay > this.clientAccountId.accountBalance){
            System.out.println(ERROR_NOT_ENOUGH_MONEY);
            return;
        }
        this.ClientAccountId.accountBalance -= amountToPay ;
    } */
}