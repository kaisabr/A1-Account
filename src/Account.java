public class Account {

    private double balance;
    private double interestRate;

    void deposit(double deposit) {
        if (deposit >= 0 ) {
            balance += deposit;
        }
    }

    void addInterest() {
        balance += balance*interestRate;
    }

    double getBalance(){
        return balance;
    }

    double getInterestRate(){
        return interestRate;
    }

    void setInterestRate(double newRate) {
        interestRate = newRate;
    }

    public String toString() {
        String s = "Interest rate: " + interestRate;
        s += "\n Current balance: " + balance;
        return s;
    }


}
