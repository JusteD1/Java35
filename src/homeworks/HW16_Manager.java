package homeworks;

public class HW16_Manager extends HW16_Member {


    private String department;

    public HW16_Manager(String name, int age, String phoneNumber, String address, int salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

        public void printSalary(){
            System.out.println("Salary for " + name + " is "+ salary);
        }
    }


