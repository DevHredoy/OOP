package hredoy.com.interface_payment_gateway;

import java.sql.SQLOutput;

public interface AmarPay {

    void rocketPayment(double payableAmount);
    void bkashPayment(double payableAmount);
    void nexusPayment(double payableAmount);

}
