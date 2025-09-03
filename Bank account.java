public class Main{
    public static final String BANK_NAME = "OpenAI Bank";

    public static void main(String[] args) {
    
        String accountHolder = "John Doe";
        int accountNumber = 123456789;
        double balance = 1500.75;
        boolean isActive = true;  

       
        System.out.println("Welcome to " + BANK_NAME);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Account Active? " + isActive);

     
        double depositAmount = 500.0;
        balance = balance + depositAmount;  

        System.out.println("After depositing $" + depositAmount + ", new balance is $" + balance);
    }
}
