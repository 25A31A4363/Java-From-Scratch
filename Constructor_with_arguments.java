class Student{
    Student(String name, int age){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
public class Constructor_with_arguments{
    public static void main(String[] args){
        Student s1 = new Student("Mohith",18);
    }
}