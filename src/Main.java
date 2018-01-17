public class Main {

    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(100);
        a.setInterestRate(0.02);
        System.out.println(a.toString());
        a.addInterest();
        System.out.println(a.toString());
    }
}
