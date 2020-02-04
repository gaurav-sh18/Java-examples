public class BankAccount

{
        
        private double balance=10000;
        private Address address;
        private AccountType accountType;

        private long accountId;
        private static long INITIAL_ACCOUNT_ID_VALUE=10000;


        public BankAccount(AccountType accountType, double initialDepositAmount, Address address){
          this.accountType=accountType;
          if(initialDepositAmount>10000){
            this.balance=initialDepositAmount;
          }
          this.address=address;
          this.accountId= ++INITIAL_ACCOUNT_ID_VALUE;
        }
        public BankAccount(AccountType accountType,Address address){
          this.accountType=accountType;
          this.address=address;
        }
      

        public double deposit(int amount)
        {
           // System.out.println("Deposited amount"+amount); 
            balance=balance+amount;
            return balance;
            
        }

        public double withdraw(double amount)
        {
          switch(this.accountType){
            case CURRENT_ACCOUNT:
            if((this.balance-amount)>25000) {
              this.balance=this.balance-amount;
              return this.balance;
            }
            
            break;

            case SALARY_ACCOUNT:
            if((this.balance-amount)>0) {
              this.balance=this.balance-amount;
              return this.balance;
            }
            
             break;
            case SAVING_ACCOUNT:
            if((this.balance-amount)>10000) {
              this.balance=this.balance-amount;
              return this.balance;
            }
            
            break;
          }

           return 0; 
           
        }
        public double show() {
             
            System.out.println("Balance="); 
            return balance;               
        }
        public void updateAddress(Address address)
        {
          this.address=address;

        }

  public AccountType getAccountType() {
    return accountType;
  }

  public long getAccountId() {
    return accountId;
  }

  


    
}