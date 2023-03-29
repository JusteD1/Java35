package homeworks;

public class HW16_Employee extends HW16_Member{

    private String specialization;
    public HW16_Employee(String name, int age, String phoneNumber, String address, int salary, String specialization){
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    @Override
    public void printSalary() {
        System.out.println("Salary for " + name + " is "+ salary);
    }
}
