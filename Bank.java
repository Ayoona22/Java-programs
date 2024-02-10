class BankAccount {
    int balance;
    BankAccount(int r){
        balance=r;
    }void deposit(int a){
        System.out.println("Balance before Depositing : "+balance);
        balance+=a;
        System.out.println("Balance after depositing :"+balance);
    }void withdraw(int a){
        System.out.println("Balance before Withdrawing : "+balance);
        balance-=a;
        System.out.println("Balance after Withdrawing :"+balance);
    }
    
}class SavingsAccount extends BankAccount{
    SavingsAccount(int r){
        super(r);
    }void withdraw(int a){
        if(balance<100){
            System.out.println("Withdrawal not possible\nBalance : "+balance);
        }else{
            super.withdraw(a);
        }
    }
}class Bank{
    public static void main(String[] args) {
        SavingsAccount s =new SavingsAccount(100);
        s.deposit(100);
        s.withdraw(50);
        s.withdraw(70);
        s.withdraw(20);
    }
}
