package interfaces;

/**
 * @author gmuniz
 */
public interface IPayStrategy {
    public boolean pay(int paymentAmount);
    public void collectPaymentDetails();
}