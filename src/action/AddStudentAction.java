package action;

import bean.Student;
import com.opensymphony.xwork2.ActionSupport;
import dao.StudentDao;

public class AddStudentAction extends ActionSupport {
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String execute() throws Exception {
        StudentDao studentDao=new StudentDao();
        int i = studentDao.addStudent(student);
        if(i>0){
            return SUCCESS;
        }else {
            return ERROR;
        }
    }
}
