public class Client
{
    public static void main(String args[])
    {
        Address address=new Address("202", "H-Block", "Gurgaon",4351);
      BankAccount BankAcoount1=new  BankAccount(AccountType.SAVING_ACCOUNT,20000,address);
      BankAccount BankAcoount2=new  BankAccount(AccountType.SALARY_ACCOUNT,address);
      BankAcoount2.withdraw(6000);

      System.out.println(BankAcoount2.show());
    }
}