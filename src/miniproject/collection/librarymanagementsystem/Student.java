package collection.librarymanagementsystem;

public class Student {
    int Studentid ;
    String Studentname;

    public Student(int studentid, String studentname) {
        this.Studentid = studentid;
        this.Studentname = studentname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Studentid=" + Studentid +
                ", Studentname='" + Studentname + '\'' +
                '}';
    }
}
