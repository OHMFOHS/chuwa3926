package chuwa3926.Coding.Q14;

public enum OrderStatus implements IStatusCode{
    PENDING(0, "Order is pending"),
    PAID(1, "Payment received"),
    SHIPPED(2, "Order has been shipped"),
    DELIVERED(3, "Order delivered"),
    CANCELLED(-1, "Order cancelled");

    private final int code;
    private final String description;

    OrderStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public int getCode() {
        return code;
    }
    @Override
    public String getDescription(){
        return description;
    }

}
