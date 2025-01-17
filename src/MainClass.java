public class MainClass {
    public static void main(String[] args) {
        Person person = new Person("Kumar", 23 );
        person.displayDetails();

        Employee employee = new Employee("Adeeb", 22, "Developer");
        employee.displayEmployeeDetails();
    }
}
