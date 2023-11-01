package homeworks.HomeLesson18;

public class LegalEntities extends Client {
    public LegalEntities(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException, NegativeBalanceException {
        if (amount < 0) {
            throw new NegativeBalanceException("Ошибка: Сумма снятия должна быть положительной.");
        } else if (amount > balance) {
            throw new InsufficientFundsException("Ошибка: Недостаточно средств на счете.");
        } else if (balance - (amount + (amount * 0.01)) < 0) {
            throw new NegativeBalanceException("Ошибка: Отрицательный баланс не допускается.");
        } else {
            balance -= amount + (amount * 0.01); // 1% комиссия
        }
    }
    @Override
    public void checkBalance() {
        System.out.println("Баланс LegalEntities: " + balance);
    }
}