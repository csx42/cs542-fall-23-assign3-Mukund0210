package courseSequencer.driver;

import courseSequencer.util.FileInput;
import courseSequencer.util.GroupIdentifier;

public class StateProcesor {

    GroupIdentifier groupIdentifier = new GroupIdentifier();


    public void stateProcessor(){
        FileInput fileInput = new FileInput("input.txt","errfile.txt");

        try{
            while(!fileInput.hasNext()){
                String inputLine = fileInput.getFileInput();
                String[] splitInput = fileInput.splitValues(inputLine);

                String studentID = splitInput[0];

                for(int i=1; i<splitInput.length;i++){
                    groupIdentifier.findGroup(splitInput[i]);
                }

         }
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{

        }
    }
    
    

}
