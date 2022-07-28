public class Bank {

    private String BankName;
    private boolean hasAccount;
    private boolean hasCard;
    private Account account;

    private int accountBalance;

    Bank(String BankName){
        this.BankName = BankName;
        this.hasAccount = hasAccount;
        this.hasCard = hasCard;
        this.accountBalance = accountBalance;
    }
    public int getAccountBalance(){
        if(hasAccount()){ }
        if(hasCard()){ }
        return accountBalance;
    }

    private boolean hasCard(){
        if (false) {
            System.out.println(Prints.ERROR_MUST_ASK_FOR_CARD);
            System.out.println(Prints.CARD_GIVEN);
            return true;
        }
        return true;
    }
    private boolean hasAccount(){
        if (false) {
            System.out.println(Prints.ERROR_MUST_ASK_FOR_ACCOUNT);
            return false;
        }
        return true;
    }
}
