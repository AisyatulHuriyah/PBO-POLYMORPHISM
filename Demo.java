import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Lecturer lecturer1 = new Lecturer("19940201", "Widia, S.Kom. M.Kom", "199402");
        Lecturer lecturer2 = new Lecturer("19700105", "Muhammad, S.T, M.T", "197001");
        EducationalStaff educationalStaff1 = new EducationalStaff("19750301", "Aida, A.Md.", "Staff Administration");
        EducationalStaff educationalStaff2 = new EducationalStaff("19650304", "Rika, S.T.", "Staff Laboratory");

        ArrayList<Employee> employeeList  = new ArrayList<Employee>();
        employeeList.add(lecturer1);
        employeeList.add(lecturer2);
        employeeList .add(educationalStaff1);
        employeeList .add(educationalStaff2);
        System.out.println("Number of Employees: " + employeeList .size());

          System.out.println("\n--- Upcasting & Downcasting Trials ---");
        Employee employee1 = lecturer1;
        System.out.println(employee1.nip);
        System.out.println(employee1.name);
        employee1.displayInfo(); 

        Lecturer newLecturer = (Lecturer) employee1;
        System.out.println(newLecturer.name);
        System.out.println(newLecturer.nidn);
        newLecturer.teach();
    }
}