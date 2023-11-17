package courseSequencer.state;

import java.util.ArrayList;


public class Group1 implements CourseSequencerStateI {

    Semester semester;

    int semesterNum = 0;


    public void setSemester(Semester semesterIn){
        this.semester = semesterIn;
    }
    ArrayList<String> g1registeredList = new ArrayList<>();

    int g1CurrEntry = 0;
    int g1PrevEntry = 0;

    String[] g1Courses = {"A", "B", "C", "D"};

    boolean stateSet = false;

    public int coursesRegistered = 0;

    public void setState(){
        stateSet = true;
    }

    public void register(String course, String option){

        if(option.equals("Register")){
            semester.courseList.add(course);
            g1registeredList.add(course);
            coursesRegistered += 1;
            g1PrevEntry += 1;
            semesterNum = semester.currSemester;

            if(semester.courseList.size() != 0 && semester.courseList.size() % 3 == 0){
                semester.prevSemester = semester.currSemester;
                semester.currSemester += 1; 
            }
        }
        else if(option.equals("Waiting List")){
            semester.waitingQueue.add(course);
        }
        

    }

    public String checkCourses(String course){

        for(int i  = 0; i<g1Courses.length; i++){
            if(g1Courses[i].equals(course)){
                g1CurrEntry = i;
            }
        }


        if(semester.prevSemester < semester.currSemester && (coursesRegistered == g1CurrEntry && coursesRegistered == 0)){
            return "Register";
        }
        else if(semester.prevSemester < semester.currSemester && (coursesRegistered == g1CurrEntry && semesterNum < semester.currSemester )){
            return "Register";
        }
        else if(semester.prevSemester < semester.currSemester && coursesRegistered <= semester.currSemester ){
            return "Waiting List";
        }
        
        return "";


    }

    public int checkCurrentSum(){
        return coursesRegistered;
    }

    public Semester getSemester(){
        return semester;
    }


}
