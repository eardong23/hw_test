import java.util.ArrayList;

public class Student extends User {
    private ArrayList<Course> courses;

    public Student(String id, String name, String username, String password) {
        super(id, name, username, password);
        this.courses = new ArrayList<>();
    }

    public void displayMenu() {
        System.out.println("Student Menu");
        System.out.println("1. View Courses");
        System.out.println("2. Add Course");
        System.out.println("3. Drop Course");
        // Additional options...

        // Handle student's choice
    }

    public boolean addCourse(Course course) {
        if (!hasConflict(course)) {
            courses.add(course);
            return true;
        }
        return false;
    }

    private boolean hasConflict(Course course) {
        // Check if adding the course will cause a schedule conflict
    }
}
