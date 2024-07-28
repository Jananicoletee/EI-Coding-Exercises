public class BankTransferPayment implements PaymentStrategy {
    private String accountNumber;

    public BankTransferPayment(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Bank Transfer to account " + accountNumber);
    }
}