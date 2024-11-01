public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;


    public BankAccount(String accountHolderName,String accountNumber){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.balance=0.0;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Successfully deposited: $"+amount);
        }else{
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount){
        if(amount>0&&amount<=balance-500){
            balance-=amount;
            System.out.println("Successfully withdraw: $"+amount);
        }else{
            System.out.println("Insufficient funds or invalid amount");
        }
    }

    public double getBalance(){
        return balance;
    }

    public void displayAccountInfo(){
        System.out.println("Account Holder:"+accountHolderName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Balance"+balance);
    }
}
