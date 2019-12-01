package bean;

public class Student {
    private int studentId;
    private String name;
    private String sex;
    private String major;
    private String birthDate;
    private String memo;

    public Student() {

    }

    public Student(int studentId, String name, String sex, String major, String birthDate, String memo) {
        this.studentId = studentId;
        this.name = name;
        this.sex = sex;
        this.major = major;
        this.birthDate = birthDate;
        this.memo = memo;
    }

    public Student(String name, String sex, String major, String birthDate, String memo) {
        this.name = name;
        this.sex = sex;
        this.major = major;
        this.birthDate = birthDate;
        this.memo = memo;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
