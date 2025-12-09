import java.util.Arrays;
class Hospital{
	private String hospitalName;
	private int hospitalID;
	private String hospitalLocation;
	private Department[] departments;
	private int noOfDepartments;


	public Hospital(){

		this.hospitalName="Gondal Hospital";
		this.hospitalID=1233;
		this.hospitalLocation="Gujranwala";
		departments = new Department[5];
		noOfDepartments=0;
	
	}

	public Hospital(String hospitalName,int hospitalID,String hospitalLocation,int maxCount){
		this.hospitalName=hospitalName;
		this.hospitalID=hospitalID;
		this.hospitalLocation=hospitalLocation;
		this.departments = new Department[maxCount];
		noOfDepartments=0;


	}

	public void setHospitalName(String n){
		this.hospitalName=n;

	}
	public void setHospitalID(int i){
		this.hospitalID=i;

	}

	public void setHospitalLocation(String l){
		this.hospitalLocation=l;

	}

	public String getHospitalName(){
		return this.hospitalName;

	}
	public int getHospitalID(){

		return this.hospitalID;
	}
	public String getHospitalLocation(){

		return this.hospitalLocation;
	}


	public void addDepartment(Department d){


			if(noOfDepartments< departments.length){
					departments[noOfDepartments++] = d;
				}else{		
					System.out.println("No more slots for new Department");
			
				}

	}
	

	public String toString(){
		return "Hospital Name : "+getHospitalName()+"\nHospital ID : "+getHospitalID()+"\nHospital Location : "
		+getHospitalLocation();

	}
}