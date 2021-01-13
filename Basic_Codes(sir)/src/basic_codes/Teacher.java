
package basic_codes;

class Teacher extends Person {
    float salary;
    String designation;
    Teacher(float salary, String name, int age, float height, String designation){
        super(name, age, height);
        this.salary = salary;
        this.designation = designation;
    }
    void showSalary()
    {
        System.out.println("Salary");
    }
}
