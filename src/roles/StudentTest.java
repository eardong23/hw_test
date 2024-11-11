import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testAddCourse() {
        Student student = new Student("001", "Student1", "testStudent01", "password590");
        Course course = new Course("CIS120", "Programming Languages", "Prof. Smith", "MWF", "11:00", "12:00", 30);
        
        assertTrue(student.addCourse(course), "Course should be added without conflicts");
        assertEquals(1, student.getCourses().size(), "Student should have one course");
    }

    @Test
    void testAddCourseConflict() {
        Student student = new Student("001", "Student1", "testStudent01", "password590");
        Course course1 = new Course("CIS120", "Programming Languages", "Prof. Smith", "MWF", "11:00", "12:00", 30);
        Course course2 = new Course("CIS160", "Math Foundations", "Prof. Doe", "MWF", "11:00", "12:00", 30);

        student.addCourse(course1);
        assertFalse(student.addCourse(course2), "Adding a conflicting course should fail");
    }
}
