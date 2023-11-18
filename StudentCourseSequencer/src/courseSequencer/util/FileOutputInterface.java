package courseSequencer.util;


public interface FileOutputInterface {
    public void putFileOutput(String filename, int studentID, String courses, int stateChanges, int numOfSemesters);
    public void errLogOut(String errorFileName);
}
