package chuwa3926.Coding.Q16;

public class DatabaseConnection {
    //1. private constructor 私有构造器
    private DatabaseConnection() {
        System.out.println("Database connection created");
    }

    //2. static inner class
    private static class Holder {
        private static final DatabaseConnection INSTANCE = new DatabaseConnection();
    }
    
    public static DatabaseConnection getInstance() {
        return Holder.INSTANCE;
    }
    public void executeQuery(String sql) {
        System.out.println("Executing" + sql);
    }
     // 5. main 方法测试
     public static void main(String[] args) {
        // 获取两次实例
        DatabaseConnection conn1 = DatabaseConnection.getInstance();
        DatabaseConnection conn2 = DatabaseConnection.getInstance();

        // 验证是否是同一个对象
        System.out.println("conn1 == conn2: " + (conn1 == conn2));

        // 执行示例查询
        conn1.executeQuery("SELECT * FROM users;");
    }
}
