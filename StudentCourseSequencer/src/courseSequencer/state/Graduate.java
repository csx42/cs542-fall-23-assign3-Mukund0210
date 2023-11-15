package courseSequencer.state;


public class Graduate {

    public boolean canGraduate(Group1 group1, Group2 group2, Group3 group3, Group4 group4, Group5 group5){

        if(group1.coursesRegistered>1 && group2.coursesRegistered>1 && group3.coursesRegistered>1 && group4.coursesRegistered>1 && group5.coursesRegistered>1){

            return true;
        }

        return false;
        
    }
}
