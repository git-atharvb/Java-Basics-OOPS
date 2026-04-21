package BasicJavaPrograms.Objects;
class Student {
    String name;
    int age;
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // This is a non-parameterized (or default) constructor.
    // It's called when an object is created without passing any arguments, e.g., Student s = new Student();
    Student() {
    }
    // This is a parameterized constructor.
    // It's used to create an object and initialize its fields with the provided values.
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // This is a copy constructor.
    // It's used to create a new object by copying the values from an existing object of the same class.
    Student(Student other) {
        this.name = other.name;
        this.age = other.age;
    }
    // Java does not have explicit deconstructors (like C++).
    // Memory deallocation is handled automatically by the Java Virtual Machine's (JVM) garbage collector.
    // Objects are garbage collected when they are no longer referenced.
}
public class StudentMain{
    public static void main(String args[]){
        // More efficient: Initialize directly using the parameterized constructor
        Student student1 = new Student("Alice", 20);
        
        // Using the copy constructor to create student3 from student1
        Student student3 = new Student(student1);
        student1.printInfo();
        System.out.println();
        // More efficient: Initialize directly using the parameterized constructor
        Student student2 = new Student("Bob", 22);
        student2.printInfo();
        System.out.println();
        Student s1=new Student("Atharv", 21);
        s1.printInfo();        
        System.out.println("\n--- Using Copy Constructor ---");
        System.out.println("Student 3 (copied from Student 1):");
        student3.printInfo();
    }
}