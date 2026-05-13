package chuwa3926.Coding.Q17;

import java.util.ArrayList;
import java.util.List;

// University 类：展示 Composition 和 Aggregation
class University {
    private String name;
    private List<Department> departments;   // Composition
    private List<Professor> professors;     // Aggregation
    
    public University(String name) {
        this.name = name;
        // Composition: 内部创建 Departments
        departments = new ArrayList<>();
        departments.add(new Department("CS", "Block A"));
        departments.add(new Department("Math", "Block B"));
        departments.add(new Department("Physics", "Block C"));

        // Aggregation: 外部添加 Professors
        professors = new ArrayList<>();
    }

    public void addProfessor(Professor p) {
        professors.add(p);
    }

    public void listProfessors() {
        System.out.println("Professors in " + name + ":");
        for (Professor p : professors) {
            System.out.println("- " + p);
        }
    }

    public void listDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Department d : departments) {
            System.out.println("- " + d);
        }
    }
}
