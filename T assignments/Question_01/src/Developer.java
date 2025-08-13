public class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int employeeID, double salary, String programmingLanguage) {
        super(name, employeeID, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println();
    }
}