package chuwa3926.Coding;

public class Main {
    public static void main(String[] args) {
       Student student1 = new Student("test", 15, 50);
       System.out.println("Student1:");
       System.out.println(student1.getName());
       System.out.println(student1.getAge());
       System.out.println(student1.getGrade());

       student1.setAge(30);
       System.out.println(student1.getAge());
       student1.setGrade(88);
       System.out.println(student1.getGrade());

       Student student2 = new Student("test2", -5, -50);
       System.out.println("Student2:");
       System.out.println(student2.getName());
       System.out.println(student2.getAge());
       System.out.println(student2.getGrade());

       //BankAccont Test
       BankAccount user1 = new BankAccount("12345");
       user1.deposit(100);
       System.out.println(user1.getAccountNumber());
       System.out.println(user1.getBalance());
       user1.withdraw(10);
       System.out.println(user1.getAccountNumber());
       System.out.println(user1.getBalance());
       user1.withdraw(1000);
       System.out.println(user1.getAccountNumber());
       System.out.println(user1.getBalance());

    }
}
