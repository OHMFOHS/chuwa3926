package chuwa3926.Coding;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        setAge(age);
        setGrade(grade);
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age >= 1 && age <= 150) {
            this.age = age;
        }
    }
    public void setGrade(double grade) {
        if (grade >= 0.0 && grade <= 100.0) {
            this.grade = grade;
        }
    } 
}
