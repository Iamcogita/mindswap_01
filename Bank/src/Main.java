public class Main {

    public static void main(String[] args) {

        Bank BankOne = new Bank("BankOne");
        Bank BankTwo = new Bank("BankTwo");

        Client Martha = new Client("Martha");
        Martha.checkAccount( "BankOne" , 777 );




    }
}
