public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Smith");

        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");

        doctor.addPatient(p1);
        doctor.addPatient(p2);

        System.out.println(doctor.getName() + " has patients:");
        for (Patient p : doctor.getPatients()) {
            System.out.println("- " + p.getName());
        }
    }
}
