package courseSequencer.util;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;


public class FileInput implements FileInterface{

        FileOutput regOutput = new FileOutput();  

        private BufferedReader reader;
        private String currLine;
        public int studentId = 0;

        public FileInput(String filenameIn, String outputFile, String errFile){

            deleteOutputFiles(outputFile);

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

            String[] values = studentInfo.split(":\\s*", 2);
            String coursesstring = values[1];
            String[] courses = coursesstring.split("\\s+");
            studentId = Integer.parseInt(values[0]);
    
            return courses;
    
        }


        public void deleteOutputFiles(String Output){
            String resfile = Output;

            String currDirectory = System.getProperty("user.dir");
            String resPath = currDirectory + File.separator + resfile;
    
            File resfilesToDelete = new File(resPath);
    
            if(resfilesToDelete.exists()){
                resfilesToDelete.delete();
            }
        }

        public String toString(){ return "";}
}