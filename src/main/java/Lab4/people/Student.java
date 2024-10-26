package Lab4.people;

import java.util.ArrayList;

public class Student extends Person{
    private int credits;
    private int student_id;
    private ArrayList<int> grades;
    public Student(String name, String street) {
        super(name, street);
        this.credits = 0;
    }

    public int getStudentId(){
        return this.student_id;
    }

    public void setStudentId(int student_id){
        this.student_id = student_id;
    }

    public ArrayList<int> getGrade(){
        return grades;
    }

    public void addGrade(int grade){
        if (grade < 5 || grade > 10) {
            System.out.println("Invalid grade");
        } else {
            grades.add(grade);
            System.out.println("Grade added");
        }
    }

    public int credits() {
        return this.credits;
    }
    public void study(){
        this.credits++;
    }
}
