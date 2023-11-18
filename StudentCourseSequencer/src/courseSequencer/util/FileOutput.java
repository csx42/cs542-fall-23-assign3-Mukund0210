package courseSequencer.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutput implements FileOutputInterface{


    
    /** 
     * @param filename
     * @param studentID
     * @param courses
     * @param stateChanges
     * @param numOfSemesters
     */
    public void putFileOutput(String filename, int studentID, String courses, int stateChanges, int numOfSemesters){
        
        String currDirectory = System.getProperty("user.dir");
        String resultsPath = currDirectory + File.separator + filename;

        try{

            FileWriter filewriter = new FileWriter(resultsPath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(filewriter);
            String contentToWrite = studentID +": " + courses + " -- " + stateChanges + " Semesters: " + numOfSemesters + "\n";

            bufferedWriter.write(contentToWrite);

            bufferedWriter.close();
        }catch(IOException e){
            e.printStackTrace();
            System.err.println("Output files cannot be found");
            System.exit(0);
        }
        finally{

        }

    }

    public void errLogOut(String errorFileName){
        String filename = errorFileName;
        String currDirectory = System.getProperty("user.dir");
        String resultsPath = currDirectory + File.separator + filename;

        try{
            FileWriter filewriter = new FileWriter(resultsPath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(filewriter);
            String content = "An error has occured while reading the input. \n Please check the input properly !";

            bufferedWriter.write(content);

            bufferedWriter.close();

        }catch(IOException e){
            e.printStackTrace();
        }
        finally{}

    }

    public String toString(){ return "";}
}