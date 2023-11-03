package courseSequencer.driver.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutput implements FileOutputInterface{


    
    /** 
     * @param filename
     * @param rootmap
     * @param backupmap1
     * @param backupmap2
     * @param backupmap3
     * @param rootSum
     * @param rootSumUpdated
     * @param ob1Sum
     * @param ob2Sum
     * @param ob3Sum
     * @param ob1SumUpdated
     * @param ob2SumUpdated
     * @param ob3SumUpdated
     */
    public void putFileOutput(String filename, StringBuilder rootmap, StringBuilder backupmap1, StringBuilder backupmap2, StringBuilder backupmap3, int rootSum, int rootSumUpdated, int ob1Sum, int ob2Sum, int ob3Sum, int ob1SumUpdated, int ob2SumUpdated, int ob3SumUpdated){
        
        String currDirectory = System.getProperty("user.dir");
        String resultsPath = currDirectory + File.separator + filename;

        try{

            FileWriter filewriter = new FileWriter(resultsPath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(filewriter);
            String contentToWrite = "\n//Inorder traversal\n"+ "\nBST: "+ rootmap.toString() + "\nBackup-1: "+ backupmap1.toString() + "\nBackup-2: "+ backupmap2.toString() + "\nBackup-3: "+ backupmap3.toString() + "\n" + "\n//Sum of all the numbers in each tree\n" + "\nBST: " + rootSum + "\nBackup-1: "+ ob1Sum + "\nBackup-2: "+ ob2Sum+ "\nBackup-3: "+ ob3Sum+ "\n"+ "\n//Sum of all the numbers after increment\n"+ "\nBST: " + rootSumUpdated + "\nBackup-1: "+ ob1SumUpdated + "\nBackup-2: "+ ob2SumUpdated + "\nBackup-3: "+ ob3SumUpdated;

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