package courseSequencer.util;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;


public class FileInput implements FileInterface{

        FileOutput regOutput = new FileOutput();  

        private BufferedReader reader;
        private String currLine;

        public FileInput(String filenameIn, String errFile){
            try {
                String currDirectory = System.getProperty("user.dir");
                String coursePrefsPath = currDirectory + File.separator + filenameIn; 
                reader = new BufferedReader(new FileReader(coursePrefsPath));
                currLine = reader.readLine();
            } catch (IOException e) {

                regOutput.errLogOut(errFile);
                e.printStackTrace();
                System.exit(1);
            }
            catch(ArrayIndexOutOfBoundsException e1){
                regOutput.errLogOut(errFile);
                e1.printStackTrace();
                System.exit(1);
            }
            finally{

            }
        }

        public boolean hasNext() {
            return currLine != null;
        }
        
        
        public String getFileInput(){
         String lineToReturn = currLine;
        try{
            currLine = reader.readLine();
        }catch (IOException e) {
            e.printStackTrace();
        }
        finally{

        }
            return lineToReturn;
            
        }


        public String[] splitValues(String studentInfo){

            String[] values = studentInfo.split("[:;]+");
    
            return values;
    
        }

        public String toString(){ return "";}
}