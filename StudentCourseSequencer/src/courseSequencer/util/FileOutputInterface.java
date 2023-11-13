package courseSequencer.util;


public interface FileOutputInterface {
    public void putFileOutput(String filename, int studentID, String courses, int stateChanges);
    public void errLogOut(String errorFileName);
}
