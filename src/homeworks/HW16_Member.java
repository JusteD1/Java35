package homeworks;

public abstract class HW16_Member {


    protected String name;
    protected int age;
    protected String phoneNumber;
    protected String address;
    protected int salary;

    //Constructor
    public HW16_Member(String name, int age, String phoneNumber, String address, int salary){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public abstract void printSalary();

}
