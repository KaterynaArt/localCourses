package homeworks.HomeLesson18;

class SelfEntrepreneur extends Client {
    public SelfEntrepreneur(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException, NegativeBalanceException {
       if (balance - amount < 0) {
            throw new NegativeBalanceException("Ошибка: Отрицательный баланс не допускается.");
        } else {
            balance -= amount;
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Баланс SelfEntrepreneur: " + balance);
    }
}