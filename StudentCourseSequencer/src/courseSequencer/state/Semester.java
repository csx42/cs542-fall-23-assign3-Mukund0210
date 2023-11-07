package courseSequencer.state;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Semester {

    ArrayList<String> courseList = new ArrayList<>();

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
}
