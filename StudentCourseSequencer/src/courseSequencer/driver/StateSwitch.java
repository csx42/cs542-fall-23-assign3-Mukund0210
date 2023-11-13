package courseSequencer.driver;

import courseSequencer.state.Graduate;
import courseSequencer.state.Group1;
import courseSequencer.state.Group2;
import courseSequencer.state.Group3;
import courseSequencer.state.Group4;
import courseSequencer.state.Group5;
import courseSequencer.state.Semester;
import courseSequencer.util.FileInput;
import courseSequencer.util.FileOutput;
import courseSequencer.util.GroupIdentifier;

public class StateSwitch {

     Graduate graduate = new Graduate();

    GroupIdentifier groupIdentifier = new GroupIdentifier();
    Group1 group1 = new Group1();
    Group2 group2 = new Group2();
    Group3 group3 = new Group3();
    Group4 group4 = new Group4();
    Group5 group5 = new Group5();
    FileOutput fileOutput = new FileOutput();


    public void methodCall(){
        FileInput fileInput = new FileInput("input.txt","errfile.txt");

        try{
            while(fileInput.hasNext()){
                String inputLine = fileInput.getFileInput();
                String[] splitInput = fileInput.splitValues(inputLine);

                int studentID = fileInput.studentId;

                for(int i=1; i<splitInput.length;i++){
                    String course = splitInput[i];
                    String group = groupIdentifier.findGroup(course);
                    if(group.equals("Group 1")){
                        String option = group1.checkCourses(course);
                        group1.register(course, option);
                        if(graduate.canGraduate()){
                            break;
                        }

                    }
                    else if(group.equals("Group 2")){
                        String option = group2.checkCourses(course);
                        group2.register(course, option);
                        if(graduate.canGraduate()){
                            break;
                        }
                    }
                    else if(group.equals("Group 3")){
                        String option = group3.checkCourses(course);
                        group3.register(course, option);
                        if(graduate.canGraduate()){
                            break;
                        }
                    }
                    else if(group.equals("Group 4")){
                        String option = group4.checkCourses(course);
                        group4.register(course, option);
                        if(graduate.canGraduate()){
                            break;
                        }
                    }
                    else{
                        group5.register(course, "Register");
                        if(graduate.canGraduate()){
                            break;
                        }
                    }



                    if(graduate.canGraduate()){
                        break;
                    }

                }

                Semester semester = new Semester(group1,group2,group3,group4,group5);

                semester.waitingListAllotment(semester.waitingQueue);

                String opCourses = String.join(" ", semester.courseList);

                fileOutput.putFileOutput("Output.txt", studentID, opCourses, semester.stateChanges);

                semester.reset();

         }


         
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{

        }
    }
    
    

}
