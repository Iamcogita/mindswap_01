public class Bank {

    private String checkAccount = " YOUR BALANCE HERE  " ;
    public String ERROR_MUST_ASK_FOR_CARD = "ERROR_MUST_ASK_FOR_CARD";
    public String ERROR_MUST_ASK_FOR_ACCOUNT = "ERROR_MUST_ASK_FOR_ACCOUNT";
    public String CARD_GIVEN = "Here's your new card.";

    private String BankName;
    private boolean hasAccount;
    private boolean hasCard;

    private Account account;

    Bank(String BankName){
        this.BankName = BankName;
        this.hasAccount = hasAccount;
        this.hasCard = hasCard;
    }
    public int getAccountBalance(){
        //if(!hasAccount()){ }
        //if(!hasCard()){ }
        return account.getAccountBalance();
    };

    private boolean hasCard(){
        if (false) {
            System.out.println(ERROR_MUST_ASK_FOR_CARD);
            System.out.println(CARD_GIVEN);
            return true;
        }
        return true;
    }
    private boolean hasAccount(){
        if (false) {
            System.out.println(ERROR_MUST_ASK_FOR_ACCOUNT);
            return false;
        }
        return true;
    }
}
