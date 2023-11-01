package homeworks.HomeLesson18;

class PrivateEntities extends Client {
    public PrivateEntities(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount < 1000) {
            balance += amount - (amount * 0.01); // Комиссия 1% при пополнении менее 1000
        } else {
            balance += amount;
        }
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
            if (amount <= 0.5) {
                balance -= amount;
            } else {
                balance -= amount + (amount * 0.01); // Комиссия 1% при снятии более 0.5
            }
        }
    }
    @Override
    public void checkBalance() {
        System.out.println("Баланс PrivateEntities: " + balance);
    }

}