import java.util.Scanner;

public class BankAccountClient {
    public static void main(String [] args){
        BankAccount gAccount = new BankAccount("Gillian", "USAA",
                "Gillian's Checking", 510, 0.02, 22);
        BankAccount nAccount = new BankAccount("Nina", "Wells Fargo",
                "Nina's Checking", 612, 0.02, 45);
        Scanner scan = new Scanner(System.in);


        gAccount.unlock(20);
        System.out.println("~ Transfer ~");
        gAccount.transfer(100, nAccount);
        System.out.println(gAccount.toString());

        gAccount.unlock(22);
        System.out.println("~ Withdrawing money from account ~");
        gAccount.withdrawl(600);
        System.out.println(gAccount.toString());

        System.out.println("~ Depositing money into account ~");
        gAccount.Deposit(400);
        System.out.println(gAccount.toString());

        gAccount.lock(22);

    }
}
