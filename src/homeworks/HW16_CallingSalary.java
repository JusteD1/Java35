package homeworks;

public class HW16_CallingSalary {
    public static void main(String[] args) {
        HW16_Employee employee= new HW16_Employee("Bob", 45, "+23423423", "Street", 1000, "worker" );
        HW16_Manager manager = new HW16_Manager("Nick", 45, "+23423423", "Street", 2000, "sales");

        employee.printSalary();
        manager.printSalary();

    }
}
