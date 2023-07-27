package Que_8;

import java.lang.invoke.LambdaMetafactory;
import java.sql.SQLOutput;
import java.util.Scanner;

class Deposit extends Thread{
    private Bank b;
    private  int Amount;

      public Deposit(Bank b ,int Amount) {
          this.b = b;
          this.Amount = Amount;
      }

      public  void run(){
          b.Deposit_Money(Amount);
          System.out.println(" Deposited Money : "+Amount);
          System.out.println("Account Balance after Deposit is : "+ b.getBalance());
      }
  }
   class Withdraw extends  Thread{
      private  Bank b;
      private int amount;

       public Withdraw(Bank b, int amount) {
           this.b = b;
           this.amount = amount;
       }

       public void run(){
           b.Withdraw_money(amount);
           System.out.println("Withdraw Money : "+ amount);
           System.out.println("Account Balance after withdraw is  : "+ b.getBalance());
      }

   }
   class Bank {
      private  int balance ;
       int b;
       public   Bank(int initialBalance) {
           balance =0;
            b = initialBalance;
       }


       synchronized public void Withdraw_money( int amount){
           if(balance>=amount){
               balance = balance- amount;
               System.out.println("Amount after withdraw is " +balance);
           }
           else {
               System.out.println("Insufficient balance");
           }

      }
      synchronized public void Deposit_Money(int amount) {
          balance += amount;
          if (balance > 0) {
              int i = 0;
              if (i == 0) {
                  System.out.println("Account balance after deposit is " + balance);
                  i++;
              }
          }
      }


       public int getBalance() {
           return balance;
       }

   }
public class main {

    public static void main(String[] args) throws InterruptedException {
        int InitialBalance = 0;
       Bank b = new Bank(InitialBalance);
       b.Deposit_Money(InitialBalance);
//        System.out.println(b.getBalance());

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the amount you Want to withdraw");

        int amount = Sc.nextInt();
        System.out.println("Enter the amount you want to deposit");
        int amount1 = Sc.nextInt();

        // Creating Threads
        Withdraw t2 = new Withdraw(b,amount);
        Deposit t1= new Deposit(b,amount1);

        // starting
        t1.start();
        t2.start();

        t2.join();


        System.out.println(" Remaining Account Balnace is : "+b.getBalance());





    }
}
