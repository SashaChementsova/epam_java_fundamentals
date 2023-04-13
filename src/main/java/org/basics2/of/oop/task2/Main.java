package org.basics2.of.oop.task2;

public class Main {
    public static void main(String[] args){
        Payment payment=new Payment();
        payment.addProduct(new Payment.Product("t-shirt",23.32));
        payment.addProduct(new Payment.Product("book",9.05));
        payment.addProduct(new Payment.Product("bag",15.35));
        System.out.println("All products:");
        for(Payment.Product product:payment.getProducts()){
            System.out.println(product.toString());
        }
        System.out.println("Total cost: "+String.format("%.2f", payment.getPaymentCost()));
    }
}
