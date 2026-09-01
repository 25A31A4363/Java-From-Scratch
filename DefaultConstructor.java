class Student{
    String name;
    int age;
}
public class DefaultConstructor{
    public static void main(String[] args){
        Student s1 = new Student("Mohith",18);
        
    System.out.println("Name:"+s1.name);
    System.out.println("Age:"+s1.age);
    }
}