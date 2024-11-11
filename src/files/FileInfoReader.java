import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class FileInfoReader {
    private HashMap<String, Student> students;
    private HashMap<String, Professor> professors;
    private HashMap<String, Admin> admins;
    private HashMap<String, Course> courses;

    public FileInfoReader() {
        students = new HashMap<>();
        professors = new HashMap<>();
        admins = new HashMap<>();
        courses = new HashMap<>();
    }

    public void loadFiles() {
        loadCourses("courseInfo.txt");
        loadAdmins("adminInfo.txt");
        loadProfessors("profInfo.txt");
        loadStudents("studentInfo.txt");
    }

    private void loadCourses(String filename) {
        // Load course data
    }

    private void loadAdmins(String filename) {
        // Load admin data
    }

    private void loadProfessors(String filename) {
        // Load professor data
    }

    private void loadStudents(String filename) {
        // Load student data
    }

    public Student authenticateStudent() {
        // Authentication logic for students
    }

    public Professor authenticateProfessor() {
        // Authentication logic for professors
    }

    public Admin authenticateAdmin() {
        // Authentication logic for admins
    }
}
