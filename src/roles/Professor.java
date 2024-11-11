import java.util.ArrayList;

public class Professor extends User {
    private ArrayList<Course> courses;

    public Professor(String id, String name, String username, String password) {
        super(id, name, username, password);
        this.courses = new ArrayList<>();
    }

    public void displayMenu() {
        System.out.println("Professor Menu");
        System.out.println("1. View Course List");
        System.out.println("2. View Student List in a Course");
        // Additional options...

        // Handle professor's choice
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
}
