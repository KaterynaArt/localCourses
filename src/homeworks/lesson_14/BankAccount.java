package homeworks.lesson_14;
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

class BankAccount {
    private String accountName;
    private double balance;

    public BankAccount(String accountName, double initialBalance) {
        this.accountName = accountName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.err.println("Ошибка: Сумма депозита должна быть положительной.");
        } else {
            balance += amount;
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException, NegativeBalanceException {
        if (amount < 0) {
            System.err.println("Ошибка: Сумма снятия должна быть положительной.");
        } else if (amount > balance) {
            throw new InsufficientFundsException("Ошибка: Недостаточно средств на счете.");
        } else if (balance - amount < 0) {
            throw new NegativeBalanceException("Ошибка: Отрицательный баланс не допускается.");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void transferTo(BankAccount targetAccount, double amount) throws InsufficientFundsException, NegativeBalanceException {
        withdraw(amount);
        targetAccount.deposit(amount);
    }
}

