// Doctor.java
public class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
        patient.setDoctor(this); //  a doctor to a patient
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public String getName() {
        return name;
    }
}


