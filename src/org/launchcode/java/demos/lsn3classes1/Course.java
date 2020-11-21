package org.launchcode.java.demos.lsn3classes1;

import java.util.HashMap;
import java.util.Objects;

public class Course {
    private HashMap<Integer,Student> students = new HashMap<Integer, Student>();
    private String name;
    private int courseId;
    private int credits;

    private int courseIdCount = 0;

    // constructor
    public Course(){
        setCourseId(courseIdCount++);
    }

    @Override
    public String toString() {
        return "Course{" +
                "students=" + students +
                ", name='" + name + '\'' +
                ", courseId=" + courseId +
                ", credits=" + credits +
                ", courseIdCount=" + courseIdCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return courseId == course.courseId &&
                credits == course.credits &&
                courseIdCount == course.courseIdCount &&
                Objects.equals(students, course.students) &&
                name.equals(course.name);
    }

    public HashMap<Integer, Student> getStudents() {
        return students;
    }

    public void setStudents(HashMap<Integer, Student> aStudents) {
        students = aStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int aCourseId) {
        courseId = aCourseId;
    }

    public int getCredits() {
        return credits;
    }

    private void setCredits(int aCredits) {
        credits = aCredits;
    }
}
