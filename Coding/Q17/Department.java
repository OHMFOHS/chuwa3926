package chuwa3926.Coding.Q17;

// Department 类：被 University 创建和管理（Composition）
class Department {
    private String name;
    private String building;

    public Department(String name, String building) {
        this.name = name;
        this.building = building;
    }

    @Override
    public String toString() {
        return name + " Dept, Building: " + building;
    }
}