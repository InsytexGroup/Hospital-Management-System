abstract class Person {
    private String name;
    private String gender;
    private int cnic;
    private int phoneNO;

    Person(){
        this.setName("Ali");
        this.setGender("Male");
        this.setCnic(32467897);
        this.setPhoneNO(03453777777);
    }
    Person(String name,String gender,int cnic,int phoneNO){
        this.setName(name);
        this.setGender(gender);
        this.setCnic(cnic);
        
    }
    Person(Person arg){
        this.setName(arg.getName());
        this.setGender(arg.getGender());
        this.setCnic(arg.getCnic());
        this.setPhoneNO(arg.getPhoneNO());

    }


    public void setName(String name) {
        this.name = name;
    }
     public void setGender(String gender) {
        this.gender = gender;
    }
    public void setCnic(int cnic) {
        this.cnic = cnic;
    }
    public void setPhoneNO(int phoneNO) {
        this.phoneNO = phoneNO;
    }


    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public int getCnic() {
        return cnic;
    }
    public int getPhoneNO() {
        return phoneNO;
    }

   public abstract String toString();

   }


