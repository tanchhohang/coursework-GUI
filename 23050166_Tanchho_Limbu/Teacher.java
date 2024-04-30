
public class Teacher
{   
    //Declaring attributes
    private int teacherID;
    private String teacherName;
    private String address;
    private String workingtype;
    private String employment;
    private int workinghours;
    
    //Creating constructor
    public Teacher(int teacherID, String teacherName, 
    String address, String workingtype, String employment){
        this.teacherID = teacherID;
        this.teacherName = teacherName;
        this.address = address;
        this.workingtype = workingtype;
        this.employment = employment;
    }
    
    public int getTeacherID(){ //getter method for teacherID
        return this.teacherID;
    }
    
    public String getTeacherName(){ //getter method for teacherName
        return this.teacherName;
    }
    
    public String getAddress(){ //getter method for address
        return this.address;
    }
    
    public String getWorkingType(){ //getter method for workingtype
        return this.workingtype;
    }
    
    public String getEmployment(){ //getter method for employment
        return this.employment;
    }
    
    public int getWorkinghours(){ //getter method for workinghours
        return this.workinghours;
    }
    
    public void setWorkinghours(int workinghours){ //setter method for workinghours
        this.workinghours = workinghours;
    }
    
    //Output Function
    public void output(){
        System.out.println("Teacher ID: " + getTeacherID());
        System.out.println("Teacher Name: " + getTeacherName());
        System.out.println("Address: " + getAddress());
        System.out.println("Working Type: " + getWorkingType());
        System.out.println("Employment Status: " + getEmployment());
        
        /*
         * Uninitialized int variable have the value of 0
        
         * Checking whether the attribute has been assigned a value or not 
         * by comapring it's value to 0.
        */
        if(workinghours == 0){
            System.out.println("Working hours not assigned");
        }
        else{
            System.out.println("Working Hours: " + getWorkinghours());
        }
    }
}
