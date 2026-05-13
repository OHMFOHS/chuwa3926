package chuwa3926.Coding.Q12;
public class TestProduct {
    public static void main(String[] args) {
        Product p1 = new Product("P001", "Laptop", 999.99);
        Product p2 = new Product("P001", "Notebook", 899.99);

        System.out.println("Equals: " + p1.equals(p2));        // true
        System.out.println("HashCode p1: " + p1.hashCode());   // same for both
        System.out.println("HashCode p2: " + p2.hashCode());
        System.out.println("Product 1: " + p1);
        System.out.println("Product 2: " + p2);
    }
}