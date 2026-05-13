package chuwa3926.Coding.Q15;

public class CPU {
    private String brand;
    private int speed;
    public CPU(String initBrand, int initSpeed) {
        this.brand = initBrand;
        this.speed = initSpeed;
    }
    @Override
    public String toString() {
        return brand + " " + speed + "GHz";
    }
}
