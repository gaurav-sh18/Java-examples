public class Savingaccount
{
   
        double balance;
        //int amount=0;

        public double deposit(int amount)
        {
           // System.out.println("Deposited amount"+amount); 
            balance=balance+amount;
            return (balance);
            
        }

        public double withdraw(int amount)
        {
            if(amount>balance) {
              System.out.println("Insuffcient balance");
              return 0;
            } else {
             // System.out.println("Withdrawl Amount amount"+amount); 
              balance=balance-amount;
              return (balance);
            }                
        }
        public double show() {
             
            System.out.println("Balance="); 
            return balance;               
        }

    
}