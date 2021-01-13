
package basic_codes;
class Person {
    private int id;
    public String name;
    public int age;
    public float height;
    Person(String name, int age, float height){
        this.height = height;
        this.name = name;
        this.age = age;
    }
    void doWork()
    {
        System.out.println("Do Work");
    }
    void ln(){
        
    }
}
