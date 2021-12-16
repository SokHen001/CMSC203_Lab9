public class SavingsAccount extends BankAccount {

   private static final double INTEREST_RATE = 2.5;
   private static int savingsNumber = 0;
   private String accountNumber;

   /**
   * @param name
   * @param amount
   */
   public SavingsAccount(String name, double amount) {
       super(name, amount);
       accountNumber = super.getAccountNumber() + "-" + savingsNumber;
   }

   /**
   * @param oldAccount
   * @param amount
   */
   public SavingsAccount(BankAccount oldAccount, double amount) {
       super(oldAccount, amount);
       savingsNumber++;
       accountNumber = super.getAccountNumber() + "-" + savingsNumber;
   }

   public void postInterest() {

       setBalance(getBalance() + (getBalance() * (INTEREST_RATE / 100)));
   }

   @Override
   public String getAccountNumber() {

       return accountNumber;
   }

}