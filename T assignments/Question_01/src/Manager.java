public class Manager extends Employee {
    int teamSize;

    public Manager(String name, int employeeID, double salary, int teamSize) {
        super(name, employeeID, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
        System.out.println();
    }
}