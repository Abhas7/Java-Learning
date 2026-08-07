public class TestAccounts {
    public static void main (String[] args){
        Savings s1 = new Savings(2000);
        Current c1 = new Current(2000); 

        System.out.println(s1 instanceof Account);
        System.out.println(c1 instanceof Account); 

        if(c1 instanceof Account){
            Account a1 = c1;
            a1.deposit(2000);
            a1.displayBalance();
            System.out.println("c1 balance : " + c1.getBalance());
            System.out.println("c1 overdraft limit : " + c1.getOverdraftLimit());

        }
    }
        
}
