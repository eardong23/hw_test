public abstract class User {
    private String id;
    private String name;
    private String username;
    private String password;

    public User(String id, String name, String username, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public boolean authenticate(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public abstract void displayMenu();
}
