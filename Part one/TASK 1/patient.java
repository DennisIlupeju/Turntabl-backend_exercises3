public class Patient {
    private String name;
    private Doctor doctor; // one doctor

    public Patient(String name) {
        this.name = name;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getName() {
        return name;
    }
}
