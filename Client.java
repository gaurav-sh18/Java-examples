public class Client
{
    public static void main(String args[])
    {
        Savingaccount b= new Savingaccount();

        System.out.println(b.deposit(1000));
        ;
        System.out.println(b.withdraw(6000));
        
        System.out.println(b.show());
    }
}