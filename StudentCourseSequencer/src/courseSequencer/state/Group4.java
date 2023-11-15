package courseSequencer.state;

import java.util.ArrayList;

public class Group4 implements CourseSequencerStateI {

    Semester semester;


    public void setSemester(Semester semesterIn){
        this.semester = semesterIn;
    }

    ArrayList<String> g4registeredList = new ArrayList<>();

    int g1CurrEntry = 0;
    int g1PrevEntry = 0;

    String[] g4Courses = {"M", "N", "O", "P"};

    boolean stateSet = false;

    public int coursesRegistered = 0;

    public void setState(){
        stateSet = true;
    }

    public void register(String course, String option){

        if(option.equals("Register")){
            semester.courseList.add(course);
            g4registeredList.add(course);
            coursesRegistered =+ 1;
            g1PrevEntry += 1;

            if(semester.courseList.size() % 3 == 0){
                semester.prevSemester = semester.currSemester;
                semester.currSemester += 1; 
            }
        }
        else if(option.equals("Waiting List")){
            semester.waitingQueue.add(course);
        }
        

    }

    public String checkCourses(String course){

        for(int i  = 0; i<g4Courses.length; i++){
            if(g4Courses[i] == course){
                g1CurrEntry = i;
            }
        }


        if(semester.prevSemester < semester.currSemester && (coursesRegistered == g1CurrEntry && coursesRegistered == 0)){
            return "Register";
        }
        else if(semester.prevSemester < semester.currSemester && (coursesRegistered == g1CurrEntry && coursesRegistered < semester.currSemester )){
            return "Register";
        }
        else if(semester.prevSemester < semester.currSemester && coursesRegistered == semester.currSemester ){
            return "Waiting List";
        }
        
        return "";



    }

    public int checkCurrentSum(){
        return coursesRegistered;
    }

}
