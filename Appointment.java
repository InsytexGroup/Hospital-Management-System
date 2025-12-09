public class Appointment {
    private int appointmentID;
    private int appointmentTime;
    private Doctor doctor;
    private Patient[] patients;
    private int patientCount;

    public Appointment() {
        this.appointmentID = 1;
        this.appointmentTime = 11;
        this.doctor = new Doctor();
        this.patients = new Patient[5];
        this.patientCount = 0;
    }

    public Appointment(int appointmentID, int appointmentTime, Doctor doctor, int size) {
        this.appointmentID = appointmentID;
        this.appointmentTime = appointmentTime;
        this.doctor = doctor;
        this.patients = new Patient[size];
        this.patientCount = 0;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public void setAppointmentTime(int appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public int getAppointmentTime() {
        return appointmentTime;
    }

    public boolean isDoctorAvailable() {
        return appointmentTime >= doctor.getEntryTime() && appointmentTime <= doctor.getExitTime();
    }

    public void addPatient(Patient p) {
        if (patientCount < patients.length) {
            patients[patientCount++] = p;
        } else {
            System.out.println("No slots available for this appointment.");
        }
    }

    public Patient findPatientByCnic(int cnic) {
        for (Patient p : patients) {
            if (p != null && p.getCnic() == cnic) {
                return p;
            }
        }
        return null;
    }

    // Accessor methods
    public Patient[] getPatients() {
        return patients;
    }

    public int getPatientCount() {
        return patientCount;
    }

    public void setPatientCount(int patientCount) {
        this.patientCount = patientCount;
    }

    @Override
    public String toString() {
        
        String detail="{Appointment ID: "+getAppointmentID()+"Patient:[";

        for(int i=0;i<patientCount;i++){
            detail+=patients[i].getName();
            if(i<patientCount-1){
                detail+=" , ";
            }
        }
        detail+="] ";
        return detail;
    }
}//class
