
package basic_codes;


public class main {
    public static void main(String[] args)
    {
        Person ok = new Person("Ami", 43, 12);
        ok.doWork();
        Teacher ok2 = new Teacher (1200, "Faul", 45, 6, "Lame" );
        ok2.showSalary();
        DeptHead ok3 = new DeptHead (1200, "Faul", 45, 6, "Lame" );
        ok3.callMeeting();
    }
}
