package chuwa3926.Coding.Q11;

public abstract class Shape {
    protected String color;
    public Shape(String color) {
        this.color = color;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String getColor() {
        return this.color;
    }
}
