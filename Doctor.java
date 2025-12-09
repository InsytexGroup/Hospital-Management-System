import java.util.Arrays;

public class Doctor extends Person {
    private int doctorEntryTime;
    private int doctorExitTime;
    private Appointment[] appointments;
    private int numOfAppointment;

    public Doctor() {
        super();
        this.doctorEntryTime = 22;
        this.doctorExitTime = 30;
        this.appointments = new Appointment[10];
        this.numOfAppointment = 0;
    }

    public Doctor(String name, String gender, int cnic, int phoneNO, int doctorEntryTime, int doctorExitTime,int maxCount) {
        super(name, gender, cnic, phoneNO);
        this.doctorEntryTime = doctorEntryTime;
        this.doctorExitTime = doctorExitTime;
        this.appointments = new Appointment[maxCount];
        this.numOfAppointment = 0;
    }

    public Doctor(Doctor d) {
        super(d.getName(), d.getGender(), d.getCnic(), d.getPhoneNO());
        this.doctorEntryTime = d.doctorEntryTime;
        this.doctorExitTime = d.doctorExitTime;
        this.appointments = new Appointment[d.appointments.length];
        this.numOfAppointment = d.numOfAppointment;
        System.arraycopy(d.appointments, 0, this.appointments, 0, d.numOfAppointment);
    }

    public void setEntryTime(int e) {
        this.doctorEntryTime = e;
    }

    public void setExitTime(int t) {
        this.doctorExitTime = t;
    }

    public int getExitTime() {
        return doctorExitTime;
    }

    public int getEntryTime() {
        return doctorEntryTime;
    }

    public void addAppointment(Appointment appointment) {
        if (numOfAppointment < appointments.length) {
            appointments[numOfAppointment++] = appointment;
        } else {
            System.out.println("Cannot add more appointments.");
        }
    }

    public void dischargePatient(int cnic) {
        boolean found = false;

        for (int i = 0; i < numOfAppointment; i++) {
            Patient patient = appointments[i].findPatientByCnic(cnic);
            if (patient != null) {
                found = true;
                int j;
                for (j = 0; j < appointments[i].getPatients().length; j++) {
                    if (appointments[i].getPatients()[j] != null && appointments[i].getPatients()[j].getCnic() == cnic) {
                        appointments[i].getPatients()[j] = null;
                    }
                }
                for (int k = j; k < appointments[i].getPatients().length - 1; k++) {
                    appointments[i].getPatients()[k] = appointments[i].getPatients()[k + 1];
                }
                appointments[i].setPatientCount(appointments[i].getPatientCount() - 1);
                System.out.println("Patient " + cnic + " has been discharged from appointment ID " + appointments[i].getAppointmentID());
                break;
            }
        }

        if (!found) {
            System.out.println("Patient " + cnic + " not found.");
        }
    }

    @Override
    public String toString() {
        return "Doctor Name: " + super.getName() +
               "\nDoctor Gender: " + super.getGender() +
               "\nDoctor Cnic: " + super.getCnic() +
               "\nDoctor Phone No: " + super.getPhoneNO() +
               "\nEntry Time: " + getEntryTime() +
               "\nExit Time: " + getExitTime() +
               "\nAppointments: " + Arrays.toString(appointments);
    }
}
