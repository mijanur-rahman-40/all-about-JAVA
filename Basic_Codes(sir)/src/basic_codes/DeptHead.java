package basic_codes;

public class DeptHead extends Teacher {

    DeptHead(float salary, String name, int age, float height, String designation) {
        super(salary, name, age, height, designation);
    }

    void callMeeting() {
        System.out.println("MEEETTTTIIINNNNG");
    }
}
