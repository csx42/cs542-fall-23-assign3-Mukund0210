package courseSequencer.state;


public class Graduate {

    Group1 group1 = new Group1();
    Group2 group2 = new Group2();
    Group3 group3 = new Group3();
    Group4 group4 = new Group4();
    Group5 group5 = new Group5();
    
    public boolean canGraduate(){

        if(group1.coursesRegistered>1 && group2.coursesRegistered>1 && group3.coursesRegistered>1 && group4.coursesRegistered>1 && group5.coursesRegistered>1){

            return true;
        }

        return false;
        
    }
}
