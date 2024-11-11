import java.util.Scanner;

public class Admin extends User {
    public Admin(String id, String name, String username, String password) {
        super(id, name, username, password);
    }

    public void displayMenu() {
        System.out.println("Admin Menu");
        System.out.println("1. Add Course");
        System.out.println("2. Delete Course");
        System.out.println("3. Add Student");
        System.out.println("4. Delete Student");
        // Additional options...

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        handleMenuChoice(choice);
    }

    private void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                // Add course logic
                break;
            case 2:
                // Delete course logic
                break;
            // Additional cases...
            default:
                System.out.println("Invalid choice.");
        }
    }
}
