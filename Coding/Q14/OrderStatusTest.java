package chuwa3926.Coding.Q14;

public class OrderStatusTest {
    public static void main(String[] args) {
        // 1. Iterate and print all statuses
        for (OrderStatus status : OrderStatus.values()) {
            System.out.println(status.name() + " -> " + status.getCode() + " -> " + status.getDescription());
        }

        System.out.println();

        // 2. Get status by name
        OrderStatus paidStatus = OrderStatus.valueOf("PAID");
        System.out.println("Retrieved by name: " + paidStatus + " -> " + paidStatus.getCode());
    }
}
