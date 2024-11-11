public class Controller {
    public static void main(String[] args) {
        FileInfoReader fileInfoReader = new FileInfoReader();
        fileInfoReader.loadFiles();

        // Main application loop
        while (true) {
            System.out.println("Welcome to the Student Management System");
            System.out.println("Choose login type: (1) Student, (2) Professor, (3) Admin, (4) Quit");
            int choice = getUserInput();
            
            switch (choice) {
                case 1:
                    // Student login
                    Student student = fileInfoReader.authenticateStudent();
                    if (student != null) student.displayMenu();
                    break;
                case 2:
                    // Professor login
                    Professor professor = fileInfoReader.authenticateProfessor();
                    if (professor != null) professor.displayMenu();
                    break;
                case 3:
                    // Admin login
                    Admin admin = fileInfoReader.authenticateAdmin();
                    if (admin != null) admin.displayMenu();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
    
    private static int getUserInput() {
        // Handle user input for menu selection
    }
}
