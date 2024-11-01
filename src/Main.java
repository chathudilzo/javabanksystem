import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankSystem bankSystem=new BankSystem();
        Scanner scanner=new Scanner(System.in);


        while(true){
            System.out.println("\n-- Simple Banking System");
            System.out.println("1. Create Account");
            System.out.println("2 Deposit Money");
            System.out.println("3.  Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");

            System.out.print("Choose an Option");

            int choice=scanner.nextInt();

            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter account holder's name");
                    String name=scanner.nextLine();
                    System.out.print("Enter account number");
                    String accountNumber=scanner.nextLine();
                    bankSystem.createAccount(name,accountNumber);
                    break;
                case 2:
                    System.out.print("Enter account number");
                    accountNumber=scanner.nextLine();

                    BankAccount depositAccount=bankSystem.getAccount(accountNumber);

                    if(depositAccount!=null){
                        System.out.print("Enter deposit amount");
                        double depositAmount=scanner.nextDouble();
                        depositAccount.deposit(depositAmount);
                    }else{
                        System.out.print("Account not found!");
                    }
                    break;
                case 3:
                    System.out.print("Enter account number");
                    accountNumber=scanner.nextLine();

                    BankAccount withdrawAccount=bankSystem.getAccount(accountNumber);

                    if(withdrawAccount!=null){
                        System.out.print("Enter amount to withdraw!");
                        double withdrawAmount=scanner.nextDouble();
                        withdrawAccount.withdraw(withdrawAmount);
                    }else{
                        System.out.print("Account not found!");
                    }
                    break;
                case 4:
                    System.out.print("Enter account number");
                    accountNumber=scanner.nextLine();

                    BankAccount balanceAccount=bankSystem.getAccount(accountNumber);

                    if(balanceAccount!=null){
                        System.out.println("Current Balance:$ "+balanceAccount.getBalance());
                    }else{
                        System.out.print("Account not found!");
                    }
                    break;
                case 5:
                    bankSystem.displayAllAccounts();
                    break;
                case 6:
                    System.out.println("Good Bye!");
                    scanner.close();
                    return;
                default:
                    System.out.print("Invalid option,Please try again!");

            }

        }


    }
}