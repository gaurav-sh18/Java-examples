public class Bank
{
    public static void main(String args[]) {
        int balance=0;
        //int amount=0;

        public void deposit(int amount)
        {
            System.out.println("Deposited amount"+amount); 
            System.out.println("New Balance"+ (balance+amount));                
        }

        public void withdraw(int amount)
        {
            if(amount>balance)
            System.out.println("Insuffcient balance");
            else{
            System.out.println("Withdrawl Amount amount"+amount); 
            System.out.println("New Balance"+ (balance-amount));
            }                
        }
        public void show()
        {
             
            System.out.println("Balance="+balance );                
        }

    }
}