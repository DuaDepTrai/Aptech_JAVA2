/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241206;

/**
 *
 * @author Admin
 */

interface Payment {
    void pay(); // Phương thức chung cho mọi loại thanh toán
}

// Class con cho CreditCardPayment
class CreditCardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Processing Credit Card Payment...");
    }
}

// Class con cho PayPalPayment
class PayPalPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Processing PayPal Payment...");
    }
}

// Factory Pattern để tạo đối tượng Payment

class PaymentFactory {
    public static Payment createPayment(String type) {
        if (type.equals("CreditCard")) {
            return new CreditCardPayment();
        } else if (type.equals("PayPal")) {
            return new PayPalPayment();
        }
        throw new IllegalArgumentException("Invalid payment type");
    }
}

class PaymentProcessor {
    public void processPayment(String type) {
        Payment payment = PaymentFactory.createPayment(type);
        payment.pay();
    }
}

public class PaymentTest {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        
        processor.processPayment("CreditCard");
        
        processor.processPayment("PayPal");
        
        try {
            processor.processPayment("Bitcoin");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
