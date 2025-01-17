public class Employee extends Person {
    String position;

    public Employee(String name, int age, String position){
        super(name, age);
        this.position =position;
    }
    public void displayEmployeeDetails(){
        displayDetails();
        System.out.print("Position:- "+position);
    }
}
