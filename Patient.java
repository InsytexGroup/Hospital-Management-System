public class Patient extends Person{
    
    private String entryDate;
    private Appointment appointment;

    public Patient(String name, String gender, int cnic, int phoneNO, String entryDate, Appointment appointment) {
        super(name, gender, cnic, phoneNO);
        this.entryDate = entryDate;
        this.appointment = appointment;
    }

    public String getEntryDate() {
        return entryDate;
    }
    public String getPatientName(){
        return  super.getName();
    }
    public int getPatientCnic(){
        return super.getCnic();
    }
    public String getPatientGender(){
        return  super.getGender();
    }


    @Override
    public String toString() {
        return "Patient Name: " + getPatientName()+ "\nPatient Cnic: " +getPatientCnic() +
         "\nPhone No: " + super.getPhoneNO()+"Patient Gender: "+getPatientGender()+ 
         "\nEntry Date: " + entryDate;
    }
}//class
