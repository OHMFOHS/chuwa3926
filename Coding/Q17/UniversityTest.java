package chuwa3926.Coding.Q17;

// 测试 main
public class UniversityTest {
    public static void main(String[] args) {
        // 创建教授
        Professor prof1 = new Professor("Alice", "Computer Science");
        Professor prof2 = new Professor("Bob", "Mathematics");

        // 创建大学
        University uni = new University("MyUniversity");

        // 添加教授（Aggregation）
        uni.addProfessor(prof1);
        uni.addProfessor(prof2);

        // 展示大学信息
        uni.listDepartments();
        uni.listProfessors();

        // 测试 Aggregation: 教授独立存在
        uni = null; // 删除大学对象
        System.out.println("Professors still exist:");
        System.out.println(prof1);
        System.out.println(prof2);
    }
}
