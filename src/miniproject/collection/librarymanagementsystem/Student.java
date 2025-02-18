package collection.librarymanagementsystem;

public class Student {
    int studentId ;
    String stdnetName;

    public Student(int studentId, String stdnetName) {
        this.studentId = studentId;
        this.stdnetName = stdnetName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Studentid=" + studentId +
                ", Studentname='" + stdnetName + '\'' +
                '}';
    }
}
