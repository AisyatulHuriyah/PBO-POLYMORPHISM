public class Employee {
    public String nip;
    public String name;

    public Employee() {

    }

    public Employee(String nip, String name) {
        this.nip = nip;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("NIP  : " + nip);
        System.out.println("Name : " + name);
    }
}
