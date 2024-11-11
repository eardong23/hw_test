import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void testViewCourseList() {
        Professor professor = new Professor("002", "Prof. Smith", "Smith", "password590");
        Course course = new Course("CIS120", "Programming Languages", "Prof. Smith", "MWF", "11:00", "12:00", 30);
        
        professor.addCourse(course);
        assertEquals(1, professor.getCourses().size(), "Professor should have one course in the list");
    }
}
