// add lecturer
public class Lecturer extends Employee {
    public String nidn;

    public Lecturer() {
    }

    public Lecturer(String nip, String name, String nidn) {
        super(nip, name);
        this.nidn = nidn;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIDN     : " + nidn);
    }

    public void teach() {
        System.out.println("Make teaching plan");
        System.out.println("Arrange material");
        System.out.println("Conduct the teaching and learning process");
        System.out.println("Conduct evaluation");
    }
}
