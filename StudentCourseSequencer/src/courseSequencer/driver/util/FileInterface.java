package courseSequencer.driver.util;

public interface FileInterface {
    public String getFileInput();
    public boolean hasNext(); 
    public String[] splitValues(String studentInfo);
    
}
