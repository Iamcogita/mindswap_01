public class Debit extends Account{

    private int accountBalance ;
    private String BankName;
    private String accountType = "Debit";

    Debit(String BankName, int accountNumber ) {
        super( BankName , accountNumber) ;
        this.accountType = accountType;
    }

}
