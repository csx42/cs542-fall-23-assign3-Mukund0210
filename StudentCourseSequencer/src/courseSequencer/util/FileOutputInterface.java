package courseSequencer.util;


public interface FileOutputInterface {
    public void putFileOutput(String filename, StringBuilder rootmap, StringBuilder backupmap1, StringBuilder backupmap2, StringBuilder backupmap3, int rootSum, int rootSumUpdated, int ob1Sum, int ob2Sum, int ob3Sum, int ob1SumUpdated, int ob2SumUpdated, int ob3SumUpdated);
    public void errLogOut(String errorFileName);
}
