public class Main {
    public static void main(String[] args) {

      SBI account = new SBI(123,"mohsin",0,5.2);

      Kotak_Bank account1 = new Kotak_Bank(1234,"misba",100000,7.00);

      account.addMoney(100);
      account.withdrawMoney(50);
      int balance = account.checkBalance();

      System.out.println("The balance is "+balance);

      double interest = account.calculateInterestOnBalance(10);

      System.out.println("interest is "+interest);
    }
}