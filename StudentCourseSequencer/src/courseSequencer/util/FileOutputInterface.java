package courseSequencer.util;


public interface FileOutputInterface {
    public void putFileOutput(String filename, String studentID, String courses, int stateChanges);
    public void errLogOut(String errorFileName);
}
