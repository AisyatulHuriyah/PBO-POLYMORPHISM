public class EducationalStaff extends Employee {
    public String category;

    public EducationalStaff() {
    }

    public EducationalStaff(String nip, String name, String category) {
        super(nip, name);
        this.category = category;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Category : " + category);
    }
}
