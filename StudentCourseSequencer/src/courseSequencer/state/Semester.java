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

    public Semester(){
        
    }

    public Semester(Group1 group1In,Group2 group2In,Group3 group3In,Group4 group4In,Group5 group5In){
        this.group1 = group1In;
        this.group2 = group2In;
        this.group3 = group3In;
        this.group4 = group4In;
        this.group5 = group5In;
    }

    public int stateChanges = 0;

   int currSemester = 1;
   int prevSemester = 0;

   public int getCurrSemester() {
       return currSemester;
   }

   public void setCurrSemester(int currSemester) {
       this.currSemester = currSemester;
   }

   public int compareStateSum(int g1Sum,int g2Sum,int g3Sum,int g4Sum,int g5Sum){

        if(g1Sum>g2Sum && g1Sum>g3Sum && g1Sum>g4Sum && g1Sum>g5Sum){
            return g1Sum;
        }
        else if(g2Sum>g3Sum && g2Sum>g4Sum && g2Sum> g5Sum){
            return g2Sum;
        }
        else if(g3Sum> g4Sum && g3Sum>g5Sum){
            return g3Sum;
        }
        else if(g4Sum>g5Sum){
            return g4Sum;
        }

        return g5Sum;

   }


   public void waitingListAllotment(Queue<String> waitingQueue){
        
        String currCourse = waitingQueue.poll();
        String group = groupIdentifier.findGroup(currCourse);
        if(group.equals("Group 1")){
            String option = group1.checkCourses(currCourse);
            group1.register(currCourse, option);
        }
        else if(group.equals("Group 2")){
        
        }
        else if(group.equals("Group 3")){

        }
        else if(group.equals("Group 4")){

        }
        else{

        }

        if(!waitingQueue.isEmpty()){
            waitingListAllotment(waitingQueue);
        }
   }


   public void reset(){

        courseList.clear();
        waitingQueue.clear();
        group1.coursesRegistered = 0;
        group2.coursesRegistered = 0;
        group3.coursesRegistered = 0;
        group4.coursesRegistered = 0;
        group5.coursesRegistered = 0;
   }

}