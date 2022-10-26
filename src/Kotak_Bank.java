public class Kotak_Bank implements Bank{


    int accountNo;
    String name;
    int balance;
    double interestRate;

    public Kotak_Bank(int accountNo, String name, int balance, double interestRate) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void addMoney(int money) {
        balance=balance+money;

        System.out.println("your total balance is "+balance);
    }

    @Override
    public boolean withdrawMoney(int money) {
        if(money<=balance){
            balance=balance-money;
            System.out.println(money+"rs withdrawn");
            System.out.println("your total balance is "+balance);
            return true;
        }else {
            System.out.println("insufficient balance");
            return false;
        }
    }

    @Override
    public int checkBalance() {
        return this.balance;
    }

    @Override
    public double calculateInterestOnBalance(int year) {

        double interest=balance*interestRate*year/100;

        return  interest;
    }
}
