package courseSequencer.state;

import java.util.ArrayList;

public class Group1 implements CourseSequencerStateI {
    ArrayList<String> g1WaitingList = new ArrayList<>();
    

    Semester semester = new Semester();
    
    int g1CurrSemester = 0;
    int g1PrevSemester = 0;

    String[] g1CoursesList = {"A", "B", "C", "D"};

    boolean stateSet = false;

    int coursesRegistered = 0;

    public void setState(){
        stateSet = true;
    }

    public void register(String course){

        semester.courseList.add(course);
        coursesRegistered =+ 1;

    }

    public boolean checkCourses(String course){
        
        g1CurrSemester = semester.getCurrSemester();

        if(g1CurrSemester > g1PrevSemester && g1WaitingList.isEmpty()){

            g1CoursesList[semester.courseList.size() + 1] = course;
            
        } 
        else{
            g1WaitingList.add(course);

            
        }

    }



}
