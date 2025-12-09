public class Main {                              //Group Memebers: Fatima Khalid(231400062),
                                                //Areeba Aslam(231400044),Zainab Akram(231400064),
                                                //Shumaria Shahid(231400066)

    public static void main(String[] args) {

        Hospital h1=new Hospital();
        System.out.println(h1);
        System.out.println();
        Doctor d1 = new Doctor("Ahmed Khan", "Male", 23456755, 30012567, 4,9,5);
        Doctor d2 = new Doctor("Fatima Ali", "Female", 23456756, 30014568, 10, 12,5);
        // Doctor d3 = new Doctor("Omar Farooq", "Male", 23456757, 30014569, 8, 16);
        // Doctor d4 = new Doctor("Aisha Bibi", "Female", 23456758, 30034570, 11, 19);
        // Doctor d5 = new Doctor("Ali Raza", "Male", 23456759, 30012571, 7, 15);
        System.out.println("**Information of Doctor**");
        
  

        Appointment a1 = new Appointment(1, 5, d1, 5);
        Appointment a2 = new Appointment(2, 8, d1, 5);
        // Appointment a3 = new Appointment(3, 11, d1, 5);
        // Appointment a4 = new Appointment(4, 14, d1, 5);
        // Appointment a5 = new Appointment(5, 16, d1, 5);
       

        d1.addAppointment(a1);
        d1.addAppointment(a2);
        System.out.println(d1);
         // System.out.println(d2);
        // System.out.println(d3);
        // System.out.println(d4);
        // System.out.println(d5);
        System.out.println();
        System.out.println();
        
        System.out.println("**Check the availibity of Doctor**");
        System.out.println(a2.isDoctorAvailable());
        System.out.println();
      

        Patient p1 = new Patient("Bisma", "Female", 243654542, 34556435, "01-02-2024", a1);
        Patient p2 = new Patient("Ahmed", "Male", 345678123, 34567812, "15-03-2024", a2);

        a1.addPatient(p1);
        a2.addPatient(p2);

        System.out.println("**Appointment details**:");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println();

        System.out.println("Discharging patient with CNIC 243654542:");
        d1.dischargePatient(243654542);
        //d1.dischargePatient(345678123);

        System.out.println();

        System.out.println("**Updated Doctor details:**");
        System.out.println(d1);
    }
}
