import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdminTest {

    @Test
    void testAddCourse() {
        Admin admin = new Admin("001", "Admin1", "admin01", "password590");
        FileInfoReader fileReader = new FileInfoReader();
        fileReader.loadFiles();
        Course course = new Course("CIS120", "Programming Languages", "Prof. Smith", "MWF", "11:00", "12:00", 30);
        
        assertTrue(admin.addCourse(course), "Admin should be able to add a course");
    }

    @Test
    void testDeleteCourse() {
        Admin admin = new Admin("001", "Admin1", "admin01", "password590");
        FileInfoReader fileReader = new FileInfoReader();
        fileReader.loadFiles();
        Course course = new Course("CIS120", "Programming Languages", "Prof. Smith", "MWF", "11:00", "12:00", 30);

        admin.addCourse(course);
        assertTrue(admin.deleteCourse("CIS120"), "Admin should be able to delete an existing course");
    }
}
