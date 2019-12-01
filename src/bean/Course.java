package bean;

public class Course {
    // 课程id
    private int id;
    // 课程名称
    private String courseName;
    // 课程学分
    private int credit;
    // 授课老师
    private String teacher;

    public Course() {
    }

    public Course(int id, String courseName, int credit, String teacher) {
        this.id = id;
        this.courseName = courseName;
        this.credit = credit;
        this.teacher = teacher;
    }

    public Course(String courseName, int credit, String teacher) {
        this.courseName = courseName;
        this.credit = credit;
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
