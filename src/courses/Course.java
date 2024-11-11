package courses;

import java.util.ArrayList;

public class Course {
    private String courseId;
    private String name;
    private String instructor;
    private String days;
    private String startTime;
    private String endTime;
    private int capacity;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseId, String name, String instructor, String days, String startTime, String endTime, int capacity) {
        this.courseId = courseId;
        this.name = name;
        this.instructor = instructor;
        this.days = days;
        this.startTime = startTime;
        this.endTime = endTime;
        this.capacity = capacity;
        this.enrolledStudents = new ArrayList<>();
    }

    // Getter and Setter methods

    public boolean addStudent(Student student) {
        if (enrolledStudents.size() < capacity && !hasTimeConflict(student)) {
            enrolledStudents.add(student);
            return true;
        }
        return false;
    }

    public boolean removeStudent(Student student) {
        return enrolledStudents.remove(student);
    }

    private boolean hasTimeConflict(Student student) {
        // Logic to check for schedule conflicts
    }
}
