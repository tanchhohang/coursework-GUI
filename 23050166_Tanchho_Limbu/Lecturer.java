
public class Lecturer extends Teacher
{
    //Declaring attributes
    private String department;
    private int yearsofExperience;
    private int gradedScore;
    private boolean hasgraded;
    
    //Constructor
    public Lecturer(int teacherID, String teacherName, String address, String workingtype, String employment, int workinghours,
    String department, int yearsofExperience){
        /*
         * "super" keyword references the parent class
         * calling the constructor and setWorkinghours methods of the parent class Teacher
        */
        super(teacherID, teacherName, address, workingtype, employment);
        super.setWorkinghours(workinghours);
        
        //assigning values to attributes exclusively to the Lecturer class
        this.department = department;
        this.yearsofExperience = yearsofExperience;
        this.gradedScore = 0;
        this.hasgraded = false;
    }
    
    public String getDepartment(){ //getter method for department
        return this.department;
    }
    
    public int getYearsofExperience(){ //getter method for yearsofExperience
        return this.yearsofExperience;
    }
    
    public int getGradedScore(){ //getter method for gradedScore
        return this.gradedScore;
    }
    
    public boolean getHasGraded(){ //getter method for hasgraded
        return this.hasgraded;
    }
    
    public void setGradedScore(int gradedScore){ //Mutator Method
        this.gradedScore = gradedScore;
    }
    
      
    public void gradeAssignment(int gradedScore, String department, int yearsofExperience){
        this.gradedScore = gradedScore; //updates the gradedScore in class
        char grade; //declaring temporary variable to store the calculated grades
        //
        if(yearsofExperience >= 5 && this.department == department){
            if(gradedScore <= 100 && gradedScore >= 70){
                grade = 'A';
            }
            else if(gradedScore >= 60){
                grade = 'B';
            }
            else if(gradedScore >= 50){
                grade = 'C';
            }
            else if(gradedScore >= 40){
                grade = 'D';
            }
            else{
                grade = 'E';
            }
            System.out.println("Grade Achieved: " + grade);
            this.hasgraded = true;
        }
        
        else{
            if(!this.hasgraded){ //checks if hasgraded is false or not
                System.out.println("The lecturer is not eligible to grade it or has already been graded");
            }
        }
    }
    
    //Output Function
    public void output(){
        //Calling output method of parent class Teacher to display its details
        super.output();
        
        //Displaying the values of attributes exclusive to the Lecturer class
        System.out.println("Department: " + getDepartment());
        System.out.println("Years of Experience: " + getYearsofExperience());
        System.out.println("Graded Score: " + getGradedScore());
        
        if(!this.hasgraded){ //checks if hasgraded is false or not
            System.out.println("The lecturer has not graded the assignment");
        }
        else{
            System.out.println("The lecturer has graded the assignment");
        }
    }
}
