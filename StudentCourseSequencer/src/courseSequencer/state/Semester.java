package courseSequencer.state;

import java.util.ArrayList;

public class Semester {

    ArrayList<String> courseList = new ArrayList<>();

   int currSemester = 1;

   public int getCurrSemester() {
       return currSemester;
   }

   public void setCurrSemester(int currSemester) {
       this.currSemester = currSemester;
   }
}
