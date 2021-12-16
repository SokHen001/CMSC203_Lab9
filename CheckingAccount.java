public class CheckingAccount extends BankAccount {

   protected static final double FEE = .15;

   /**
   *
   * @param name
   * @param amount
   */
   public CheckingAccount(String name, double amount) {
       super(name, amount);
       setAccountNumber(getAccountNumber() + "-10");
   }

   @Override
   public boolean withdraw(double amount) {

       if (getBalance() < amount) {

           return false;
       } else {

           setBalance(getBalance() - amount - FEE);
           return true;
       }
   }

}