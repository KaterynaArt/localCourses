package homeworks.HomeLesson18;
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class NegativeBalanceException extends Exception {
    public NegativeBalanceException(String message) {
        super(message);
    }
}

abstract class Client {
    protected double balance;

    public Client(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount) throws InsufficientFundsException, NegativeBalanceException;

    public void checkBalance() {
        System.out.println("Баланс: " + balance);
    }
}
