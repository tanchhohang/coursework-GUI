import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherGUI implements ActionListener
{
    ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
    
    JFrame frame1;
    
    JTextField TeacherID;
    JTextField TeacherName;
    JTextField Address;
    JTextField WorkingHours;
    JTextField WorkingType;
    JTextField Specialization;
    JTextField Salary;
    JTextField AcademicQualifications;
    JTextField EmploymentStatus;
    JTextField PerformanceIndex;
    
    JLabel TutorT;
    JLabel TeacherIDl;
    JLabel TeacherNamel;
    JLabel Addressl;
    JLabel WorkingHoursl;
    JLabel WorkingTypel;
    JLabel Specializationl;
    JLabel Salaryl;
    JLabel AcademicQualificationsl;
    JLabel EmploymentStatusl;
    JLabel PerformanceIndexl;
    
    JButton SetSalary;
    JButton RemoveTutor;
    JButton Display;
    JButton Clear;
    JButton AddTutor;
    
    public TeacherGUI(){
        //Tutor 
        frame1 = new JFrame();
        
        TutorT = new JLabel("Tutor");
        TutorT.setBounds(308,66,167,46);
        frame1.add(TutorT);
        
        //Text fields for Main Tutor GUI
        TeacherID = new JTextField();
        TeacherName = new JTextField();
        Address = new JTextField();
        WorkingHours = new JTextField();
        WorkingType = new JTextField();
        Specialization = new JTextField();
        Salary = new JTextField();
        AcademicQualifications = new JTextField();
        EmploymentStatus = new JTextField();
        PerformanceIndex = new JTextField();
        
        //Label for Main Tutor GUI
        TeacherIDl= new JLabel("Teacher ID:"); 
        TeacherIDl.setBounds(308,163,161,41);
        TeacherID.setBounds(488,166,175,32);
                
        //Teacher Name
        TeacherNamel= new JLabel("Teacher Name:"); 
        TeacherNamel.setBounds(308,226,161,41);
        TeacherName.setBounds(488,226,175,32);
        
        //Address
        Addressl= new JLabel("Address:"); 
        Addressl.setBounds(308,289,161,41);
        Address.setBounds(488,290,175,32);
        
        //Working Hours
        WorkingHoursl= new JLabel("Working Hours:"); 
        WorkingHoursl.setBounds(308,353,161,41);
        WorkingHours.setBounds(488,354,175,32);
        
        //Working Type
        WorkingTypel= new JLabel("Teacher ID:"); 
        WorkingTypel.setBounds(693,167,161,42);
        WorkingType.setBounds(856,167,175,32);
        
        //Specialization
        Specializationl= new JLabel("Specialization:"); 
        Specializationl.setBounds(693,228,161,41);
        Specialization.setBounds(856,228,175,32);
        
        //Salary
        Salaryl= new JLabel("Salary:"); 
        Salaryl.setBounds(693,289,161,41);
        Salary.setBounds(856,290,175,32);

        
        //Academic Qualifications
        AcademicQualificationsl= new JLabel("Academic Qualifications:"); 
        AcademicQualificationsl.setBounds(308,471,161,41);
        AcademicQualifications.setBounds(592,473,175,32);
        
        
        //Employment Status
        EmploymentStatusl= new JLabel("Employment Status:"); 
        EmploymentStatusl.setBounds(308,536,161,41);
        EmploymentStatus.setBounds(592,538,175,32);
        
        
        //Performance Index
        PerformanceIndexl= new JLabel("Salary:"); 
        PerformanceIndexl.setBounds(308,597,161,41);
        PerformanceIndex.setBounds(592,599,175,32);
        
        
        //Buttons for Tutor GUI
        //Set Salary
        SetSalary = new JButton("Set Salary");
        SetSalary.setBounds(693,348,142,47);
        SetSalary.addActionListener(this);

        
        //Remove Tutor
        RemoveTutor = new JButton("Remove Tutor");
        RemoveTutor.setBounds(849,348,182,47);
        RemoveTutor.addActionListener(this);
        
        //Display
        Display = new JButton("Display");
        Display.setBounds(854,475,175,36);
        Display.addActionListener(this);
        
        //Clear
        Clear = new JButton("Clear");
        Clear.setBounds(854,534,175,36);
        Clear.addActionListener(this);
        
        //Add Tutor
        AddTutor = new JButton("Add Tutor");
        AddTutor.setBounds(854,597,175,36);
        AddTutor.addActionListener(this);
        
        frame1.add(TeacherIDl);
        frame1.add(TeacherID);
        frame1.add(TeacherNamel);
        frame1.add(TeacherName);
        frame1.add(Addressl);
        frame1.add(Address);
        frame1.add(WorkingHoursl);
        frame1.add(WorkingHours);
        frame1.add(WorkingTypel);
        frame1.add(WorkingType);
        frame1.add(Specializationl);
        frame1.add(Specialization);
        frame1.add(Salaryl);
        frame1.add(Salary);
        frame1.add(AcademicQualificationsl);
        frame1.add(AcademicQualifications);
        frame1.add(EmploymentStatusl);
        frame1.add(EmploymentStatus);
        frame1.add(PerformanceIndexl);
        frame1.add(PerformanceIndex);
        
        frame1.add(SetSalary);
        frame1.add(RemoveTutor);
        frame1.add(Display);
        frame1.add(Clear);
        frame1.add(AddTutor);
        
        frame1.setLayout(null);
        frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
        frame1.setVisible(true);
        frame1.setBounds(250,50,1106,730);
        frame1.setTitle("Full Time Employees");        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
    }
}
