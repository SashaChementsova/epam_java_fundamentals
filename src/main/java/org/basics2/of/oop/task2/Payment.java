package org.basics2.of.oop.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
//нескольких товаров.
public class Payment {
    public Payment(){}
    private List<Product> products;
    {
        products = new ArrayList<>();
    }

    public static class Product{
        private String name;
        private double price;


        public Product(String name, double price) {
            this.name = name;
            this.price = price;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Product product = (Product) obj;
            return Double.compare(product.price, price) == 0 && Objects.equals(name, product.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, price);
        }

        @Override
        public String toString() {
            return "Product: name=" + name + ", price=" + price;
        }


    }
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public boolean addProduct(Product product) {
        return products.add(product);
    }

    public boolean removeProduct(Product product) {
        return products.remove(product);
    }

    public double getPaymentCost(){
        double sum=0;
        for(Product product:products){
            sum+=product.getPrice();
        }
        return sum;
    }

}
