package inheritance;
class Person1 {
    private int id;
    public String name;
    public int age;
    public float height;
    Person1(String name, int age, float height){
        this.height = height;
        this.name = name;
        this.age = age;
    }
    void doWork()
    {
        System.out.println("Do some Work");
    }
}
class Teacher1 extends Person1 {
    float salary;
    String designation;
    Teacher1(float salary, String name, int age, float height, String designation){
        super(name, age, height);
        this.salary = salary;
        this.designation = designation;
    }
    void showSalary()
    {
        System.out.println("Salary");
    }
}

public class DeptHead extends Teacher1 {
    DeptHead(float salary, String name, int age, float height, String designation)
    {
        super(salary,name, age, height, designation);
    }
    void callMeeting()
    {
        System.out.println("MEEETTTTIIINNNNG");
    }
}

 class main {
    public static void main(String[] args)
    {
        Person ok = new Person("Ami", 43, 12);
        ok.doWork();
        Teacher1 ok2 = new Teacher1 (1200, "Faul", 45, 6, "Lame" );
        ok2.showSalary();
        DeptHead ok3 = new DeptHead (1200, "Faul", 45, 6, "Lame" );
        ok3.callMeeting();
    }
}