class Teacher {
    Teacher(double salary) {
        System.out.println("Teacher Salary: " + salary);
    }
}

class Student extends Teacher {
    Student(String name, int age, double salary) {
        super(salary);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class SuperKeyword{
    public static void main(String[] args) {
        Student s1 = new Student("Mohith", 18, 87000);
    }
}