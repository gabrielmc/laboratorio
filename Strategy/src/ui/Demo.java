package ui;

import action.Order;
import services.*;
import interfaces.IPayStrategy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author gmuniz
 * Demo class. Everything comes together here.
 */
public class Demo {
    public static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static Order order = new Order();
    public static IPayStrategy strategy;

    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int cost;
            String continueChoice;
            
            do {
                System.out.print("Please, select a product:" + "\n" +
                        "1 - Mother board" + "\n" +
                        "2 - CPU" + "\n" +
                        "3 - HDD" + "\n" +
                        "4 - Memory" + "\n");
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);
                
                System.out.print("teste - " + cost);
                
                System.out.print("Count: ");
                
                int count = Integer.parseInt(reader.readLine());
                
                order.setTotalCost(cost * count);
                
                System.out.print("Do you wish to continue selecting products? Y/N: ");
                
                continueChoice = reader.readLine();
                
            } while (continueChoice.equalsIgnoreCase("Y"));

            if (strategy == null) {
                System.out.println("Please, select a payment method:" + "\n" +
                        "1 - PalPay" + "\n" +
                        "2 - Credit Card");
                
                String paymentMethod = reader.readLine();
                strategy = paymentMethod.equals("1") ? new PayByPayPal() : new PayByCreditCard();
            }
            
            order.processOrder(strategy);
            System.out.print("Pay " + order.getTotalCost() + " units or Continue shopping? P/C: ");
            String proceed = reader.readLine();
            
            if (proceed.equalsIgnoreCase("P")) {
                if (strategy.pay(order.getTotalCost())){
                    System.out.println("Payment has been successful.");
                } else {
                    System.out.println("FAIL! Please, check your data.");
                }
                order.setClosed();
            }
        }
    }
}