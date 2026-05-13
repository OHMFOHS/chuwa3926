package chuwa3926.Coding.Q17;

public class Professor {
    private String name;
    private String specialization;

    public Professor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return name + " (" + specialization + ")";
    }
}
