package courseSequencer.state;

import java.util.ArrayList;

public class Group5 implements CourseSequencerStateI{

    Semester semester;


    public void setSemester(Semester semesterIn){
        this.semester = semesterIn;
    }

    
    ArrayList<String> g5registeredList = new ArrayList<>();

    boolean stateSet = false;
    public int coursesRegistered = 0;

    public void setState(){
        stateSet = true;
    }

    public void register(String course, String option){

        if(option.equals("Register")){
            semester.courseList.add(course);
            g5registeredList.add(course);
            coursesRegistered = g5registeredList.size();

            if(semester.courseList.size() % 3 == 0){
                semester.prevSemester = semester.currSemester;
                semester.currSemester += 1; 
            }
        }
    }

    public String checkCourses(String course){
            
        return "Register";

    }

    public int checkCurrentSum(){
        return coursesRegistered;
    }

    public Semester getSemester(){
        return semester;
    }
}