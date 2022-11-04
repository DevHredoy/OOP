package hredoy.com.interface_payment_gateway;

public class AmarPayTransactionImple implements AmarPay{
    void rocketPayment(double payableAmount)
    {
        System.out.println("payment through rocket successful, amount is "+payableAmount);
    };
    void bkashPayment(double payableAmount)
    {
        System.out.println("payment through bkash successful "+payableAmount);
    };
    void nexusPayment(double payableAmount)
    {
        System.out.println("payment through nexus successful "+payableAmount);
    };
}
