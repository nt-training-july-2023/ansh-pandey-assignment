package ATM_Machinne;

import java.util.Scanner;

class InvalidInputException extends Exception{
    public InvalidInputException(String message) {
        super(message);
    }
}
class atm_machine {
    private double Acc_Balance;

    public atm_machine(double acc_Balance) {
        this.Acc_Balance = Acc_Balance;
    }

    public void Withdraw(double num) throws InvalidInputException {
        if (num > Acc_Balance) {
            throw new InvalidInputException("Insufficient Account balance");
        }
        if (num <= 0) {
            throw new InvalidInputException("Amount,cannot be -ve or zero try again");
        } else {
            System.out.println("your remaining account balance is " + (Acc_Balance - num));


        }
    }
}

    public class mainAtm {
        public static void main(String[] args) {
            Scanner S = new Scanner(System.in);
            System.out.println("Enter acc balance");
            double Acc_balance = S.nextDouble();
            System.out.println("Enter Withdrawn Ammount");
            double Withdrawn_amt = S.nextDouble();
            atm_machine ATM = new atm_machine(Acc_balance);
            try {
                ATM.Withdraw(Withdrawn_amt);
            } catch (InvalidInputException e) {
                System.out.println("Invalid input " + e.getMessage());
            }

        }
    }




