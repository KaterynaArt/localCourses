package homeworks.HomeLesson18;

public class Main {
    public static void main(String[] args) throws NegativeBalanceException, InsufficientFundsException {
        SelfEntrepreneur selfEntrepreneur = new SelfEntrepreneur(100);
        LegalEntities legalEntities = new LegalEntities(2000);
        PrivateEntities privateEntities = new PrivateEntities(3500);

        selfEntrepreneur.deposit(1100);
        legalEntities.deposit(100);
        privateEntities.deposit(200);

        try {selfEntrepreneur.withdraw(5000);}
        catch (NegativeBalanceException | InsufficientFundsException e)
        {
            System.err.println("Ошибка: Отрицательный баланс не допускается.");}

        try {
            legalEntities.withdraw(200);}
        catch (NegativeBalanceException | InsufficientFundsException e) {
            System.err.println("Ошибка: Отрицательный баланс не допускается.");}

        try {privateEntities.withdraw(200);}
        catch (NegativeBalanceException | InsufficientFundsException e) {
            System.err.println("Ошибка: Отрицательный баланс не допускается.");}

        selfEntrepreneur.checkBalance();
        legalEntities.checkBalance();
        privateEntities.checkBalance();
    }
}
