package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    private static int nextStudentId = 0;

    //constructor
    public Student() {

    }
    //constructor
    public Student(String aName, int aStudentId, int aNumberOfCredits, double aGpa) {
        name = aName;
        studentId = aStudentId;
        numberOfCredits = aNumberOfCredits;
        gpa = aGpa;
    }

    //constructor
    public Student(String aName, int aStudentId){
        name = aName;
        studentId = aStudentId;
        numberOfCredits = 0;
        gpa = 0;
    }

    public String studentInfo() {
        return (this.name) + " has a GPA of:  " + this.gpa;
    }
    public Student(String aName) {
        name = aName;
        setStudentId(nextStudentId++);
    }

    public void addGrade(int courseCredits, double grade){
        numberOfCredits = numberOfCredits + courseCredits;
        gpa = ((gpa * numberOfCredits) + grade)/numberOfCredits;
    }

    public String getGradeLevel(){
        if (numberOfCredits > 89) {
            return "Senior";
        }
        else if (numberOfCredits > 59) {
            return "Junior";
        }
        else if (numberOfCredits > 29) {
            return "Sophomore";
        }
        else {
            return "Freshman";
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", numberOfCredits=" + numberOfCredits +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return studentId == student.studentId &&
                numberOfCredits == student.numberOfCredits &&
                Double.compare(student.gpa, gpa) == 0 &&
                name.equals(student.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getStudentId() {
        return studentId;
    }

    private void setStudentId(int aStudentId){
        studentId = aStudentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public Double getGpa(){
        return gpa;
    }

    public void setGpa(Double aGpa) {
        //gpa = aGpa;
    }
}