package courseSequencer.state;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import courseSequencer.util.GroupIdentifier;

public class Semester {

    public ArrayList<String> courseList = new ArrayList<>();
    public Queue<String> waitingQueue = new LinkedList<>();
    GroupIdentifier groupIdentifier = new GroupIdentifier();
    Group1 group1;
    Group2 group2;
    Group3 group3;
    Group4 group4;
    Group5 group5;
    Graduate graduate;

    public String currState = "";
    public int numOfStateChanges = 0;

    public Semester(){
        
    }

    public Semester(Group1 group1In,Group2 group2In,Group3 group3In,Group4 group4In,Group5 group5In, Graduate graduateIn){
        this.group1 = group1In;
        this.group2 = group2In;
        this.group3 = group3In;
        this.group4 = group4In;
        this.group5 = group5In;
        this.graduate = graduateIn;
    }

   int currSemester = 1;
   int prevSemester = 0;

   public int getCurrSemester() {
       return currSemester;
   }

   public void setCurrSemester(int currSemester) {
       this.currSemester = currSemester;
   }

   public String compareStateSum(int g1Sum,int g2Sum,int g3Sum,int g4Sum,int g5Sum){

        if(g1Sum>g2Sum && g1Sum>g3Sum && g1Sum>g4Sum && g1Sum>g5Sum){
            return "Group 1";
        }
        else if(g2Sum>g3Sum && g2Sum>g4Sum && g2Sum> g5Sum){
            return "Group 2";
        }
        else if(g3Sum> g4Sum && g3Sum>g5Sum){
            return "Group 3";
        }
        else if(g4Sum>g5Sum){
            return "Group 4";
        }

        return "Group 5";

   }


   public void waitingListAllotment(Queue<String> waitingQueue){
        

        while(!waitingQueue.isEmpty()){
            boolean willGraduate = graduate.canGraduate(group1,group2,group3,group4,group5);
            if(willGraduate){
                break;
            }
            String currCourse = waitingQueue.poll();
            String group = groupIdentifier.findGroup(currCourse);
            if(group.equals("Group 1")){
                String option = group1.checkCourses(currCourse);
                if(option.equals("Register")){
                    String stateSetter = compareStateSum(group1.coursesRegistered, group2.coursesRegistered ,group3.coursesRegistered,group4.coursesRegistered,group5.coursesRegistered);
                    if(!stateSetter.equals(currState)){
                        numOfStateChanges =+1;
                    }
                }
                group1.register(currCourse, option);

            }
            else if(group.equals("Group 2")){
                String option = group2.checkCourses(currCourse);
                if(option.equals("Register")){
                    String stateSetter = compareStateSum(group1.coursesRegistered, group2.coursesRegistered ,group3.coursesRegistered,group4.coursesRegistered,group5.coursesRegistered);
                    if(!stateSetter.equals(currState)){
                        numOfStateChanges =+1;
                    }
                }
                group2.register(currCourse, option);
            }
            else if(group.equals("Group 3")){
                String option = group3.checkCourses(currCourse);
                if(option.equals("Register")){
                    String stateSetter = compareStateSum(group1.coursesRegistered, group2.coursesRegistered ,group3.coursesRegistered,group4.coursesRegistered,group5.coursesRegistered);
                    if(!stateSetter.equals(currState)){
                        numOfStateChanges =+1;
                    }
                }
                group3.register(currCourse, option);
            }
            else if(group.equals("Group 4")){
                String option = group4.checkCourses(currCourse);
                if(option.equals("Register")){
                    String stateSetter = compareStateSum(group1.coursesRegistered, group2.coursesRegistered ,group3.coursesRegistered,group4.coursesRegistered,group5.coursesRegistered);
                    if(!stateSetter.equals(currState)){
                        numOfStateChanges =+1;
                    }
                }
                group4.register(currCourse, option);
            }
            else{
                    String stateSetter = compareStateSum(group1.coursesRegistered, group2.coursesRegistered ,group3.coursesRegistered,group4.coursesRegistered,group5.coursesRegistered);
                    if(!stateSetter.equals(currState)){
                        numOfStateChanges =+1;
                    }
                group5.register(currCourse, "Register");
            }
        }

   }


   public void reset(Group1 g1, Group2 g2, Group3 g3, Group4 g4, Group5 g5){

        courseList.clear();
        waitingQueue.clear();
        
        
        g1.coursesRegistered = 0;
        g2.coursesRegistered = 0;
        g3.coursesRegistered = 0;
        g4.coursesRegistered = 0;
        g5.coursesRegistered = 0;
        
        
        g1.g1registeredList.clear();
        g2.g2registeredList.clear();
        g3.g3registeredList.clear();
        g4.g4registeredList.clear();
        g5.g5registeredList.clear();
        
        
        g1.semesterNum = 0;
        g2.semesterNum = 0;
        g3.semesterNum = 0;
        g4.semesterNum = 0;

        g1.g1PrevEntry = 0;
        g1.g1CurrEntry = 0;
        g2.g1PrevEntry = 0;
        g2.g1CurrEntry = 0;
        g3.g1CurrEntry = 0;
        g3.g1PrevEntry = 0;
        g4.g1CurrEntry = 0;
        g4.g1PrevEntry = 0;
   }

}