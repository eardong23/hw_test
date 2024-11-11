import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @Test
    void testAddStudent() {
        Course course = new Course("CIS120", "Programming Languages", "Prof. Smith", "MWF", "11:00", "12:00", 30);
        Student student = new Student("001", "Student1", "testStudent01", "password590");
        
        assertTrue(course.addStudent(student), "Student should be added successfully");
        assertEquals(1, course.getEnrolledStudents().size(), "Course should have one student enrolled");
    }

    @Test
    void testRemoveStudent() {
        Course course = new Course("CIS120", "Programming Languages", "Prof. Smith", "MWF", "11:00", "12:00", 30);
        Student student = new Student("001", "Student1", "testStudent01", "password590");
        
        course.addStudent(student);
        assertTrue(course.removeStudent(student), "Student should be removed successfully");
        assertEquals(0, course.getEnrolledStudents().size(), "Course should have no students after removal");
    }

    @Test
    void testHasTimeConflict() {
        // Assuming hasTimeConflict is implemented
        Course course1 = new Course("CIS120", "Programming Languages", "Prof. Smith", "MWF", "11:00", "12:00", 30);
        Course course2 = new Course("CIS160", "Math Foundations", "Prof. Doe", "MWF", "11:00", "12:00", 30);
        Student student = new Student("001", "Student1", "testStudent01", "password590");
        
        student.addCourse(course1);
        assertTrue(course2.hasTimeConflict(student), "Course should have a time conflict");
    }
}
