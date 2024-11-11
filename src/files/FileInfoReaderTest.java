import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FileInfoReaderTest {

    @Test
    void testLoadCourses() {
        FileInfoReader fileReader = new FileInfoReader();
        fileReader.loadFiles();
        assertNotNull(fileReader.getCourses(), "Courses should be loaded");
        assertFalse(fileReader.getCourses().isEmpty(), "Courses list should not be empty");
    }

    @Test
    void testLoadStudents() {
        FileInfoReader fileReader = new FileInfoReader();
        fileReader.loadFiles();
        assertNotNull(fileReader.getStudents(), "Students should be loaded");
        assertFalse(fileReader.getStudents().isEmpty(), "Students list should not be empty");
    }
    
    @Test
    void testAuthenticateStudent() {
        FileInfoReader fileReader = new FileInfoReader();
        fileReader.loadFiles();
        Student student = fileReader.authenticateStudent("testStudent01", "password590");
        assertNotNull(student, "Student should authenticate with correct credentials");
    }
}
