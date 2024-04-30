
public class Tutor extends Teacher
{
    //Declaring attributes
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;
    
    //Constructor
    public Tutor(int teacherID, String teacherName, String address,String workingtype, String employment,int workinghours, double salary, 
    String specialization, String academicQualifications, int performanceIndex){
       /*
         * "super" keyword references the parent class
         * calling the constructor and setWorkinghours methods of the parent class Teacher
        */ 
       super(teacherID, teacherName, address, workingtype, employment);
       super.setWorkinghours(workinghours);
    
       //assigning values to attributes exclusively to the Tutor class
       this.salary = salary;
       this.specialization = specialization;
       this.academicQualifications = academicQualifications;
       this.performanceIndex = performanceIndex;
       this.isCertified = false;
    }
    
    public double getSalary(){ //getter method for salary
        return this.salary;
    }
    
    public String getSpecialization(){ //getter method for specialization
        return this.specialization;
    } 
    
    public String getAcademicQualifications(){ //getter method for academicQualifications
        return this.academicQualifications;
    } 
    
    public int getPerformanceIndex(){ //getter method for performanceIndex
        return this.performanceIndex; 
    } 
    
    public boolean getIsCertified(){ //getter method for isCertified
        return this.isCertified;
    } 
    
    public void setSalary(double salary, int performanceIndex){
        
        double appraisal; //declaring temporary variable to store the calculated appraisal
        
        if(performanceIndex > 5 && getWorkinghours() > 20){
            if(performanceIndex > 5 && performanceIndex <= 7){
                appraisal = 0.05; //5/100 = 0.05
                this.salary = salary + (salary * appraisal);
            }
            else if(performanceIndex == 8 || performanceIndex == 9){
                appraisal = 0.10; //10/100 = 0.10
                this.salary = salary + (salary * appraisal);
            }
            else if(performanceIndex == 10){
                appraisal = 0.20; //20/100 = 0.20
                this.salary = salary + (salary * appraisal);
            }
            this.isCertified = true;
        }
        else{
            if(!this.isCertified){ //checks if isCertified is false or not
                System.out.println("The salary cannot be approved because the turor is not certified and does not meet the requirements.");
            }
        }
    }
    
    //method to remove tutor
    public void removeTutor(){
        if(!this.isCertified){
            this.salary = 0;
            this.specialization = "0";
            this.academicQualifications = "0";
            this.performanceIndex = 0;
            this.isCertified = false;
        }
    }
    
    //Output Function
    public void output(){
        if(!this.isCertified){ //checks if isCertified is false or not
            super.output();
        }
        else{
            //Calling output method of parent class Teacher to display its details
            super.output();
            
            //Displaying the values of attributes exclusive to the Tutor class
            System.out.println("Salary: " + getSalary());
            System.out.println("Specialization: " + getSpecialization());
            System.out.println("Academic Qualifications: " + getAcademicQualifications());
            System.out.println("Performance Index: " + getPerformanceIndex());
        }
    }
}
