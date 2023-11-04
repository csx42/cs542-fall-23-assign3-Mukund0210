package courseSequencer.state;

public interface CourseSequencerStateI {

    public void setState();
    public void register();
    public boolean checkCourses();
    public boolean checkCurrentSum();
}