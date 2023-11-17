package courseSequencer.state;

public interface CourseSequencerStateI {

    public void setState();
    public void register(String course, String option);
    public String checkCourses(String course);
    public int checkCurrentSum();
    public void setSemester(Semester semesterIn);
    public Semester getSemester();
}