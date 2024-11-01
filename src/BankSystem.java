import java.util.HashMap;

public class BankSystem {
    private HashMap<String,BankAccount> accounts=new HashMap<>();

    public void createAccount(String accountHolderName,String accountNumber){
        if(!accounts.containsKey(accountNumber)){
            BankAccount newAccount=new BankAccount(accountHolderName,accountNumber);
            accounts.put(accountNumber,newAccount);
            System.out.println("Account created Successfully for :"+accountNumber);
        }else{
            System.out.println("Account Number already Exists!");
        }
    }

    public BankAccount getAccount(String accountNumber){
        return accounts.get(accountNumber);
    }

    public void displayAllAccounts(){
        for(BankAccount account:accounts.values()){
            account.displayAccountInfo();
            System.out.println(".....................................");
        }
    }

}
