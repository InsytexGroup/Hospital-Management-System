class Department  {
	
	private int departmentID;
	private String departmentName;
	private Doctor[] doctor;
	private int noOfDoctors;

	 public Department(){
	 	this.departmentID = 1;
	 	this.departmentName = "dispensary";
	 	this.doctor=new Doctor[5];
	 	this.noOfDoctors=0;
	 }
	 public Department(int departmentID,String departmentName,int maxCount){
	 	this.departmentID = departmentID;
	 	this.departmentName = departmentName;
	 	this.doctor=new Doctor[maxCount];
	 	this.noOfDoctors=0;
	 }
	 public Department(Department arg){
	 	this.setDepartmentID(arg.getDepartmentID());
	 	this.setDepartmentName(arg.getDepartmentName());

	 }

	public void setDepartmentName(String departmentName){
		this.departmentName = departmentName;

	}
	public String getDepartmentName(){
		return departmentName;
	}
	public void setDepartmentID(int departmentID){
		this.departmentID = departmentID;

	}
	public int getDepartmentID(){
		return departmentID;
	}

	public void addDoctor(Doctor arg){

		if(noOfDoctors < doctor.length){
			doctor[noOfDoctors]=arg;
			noOfDoctors++;
		}
		else{
			System.out.println("No more doctos can be added!");
		}
	}

	public String toString(){
		return "Department ID : " +getDepartmentID()+ 
		"\n Department Name : "+getDepartmentName();

	}
}//class