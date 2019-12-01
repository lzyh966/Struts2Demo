package action;

import bean.Course;
import com.opensymphony.xwork2.ActionSupport;
import dao.CourseDao;

public class AddCourseAction extends ActionSupport {
    private Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String execute() {
        int i = new CourseDao().addCourse(course);
        if(i>0){
            return SUCCESS;
        }else {
            return ERROR;
        }
    }
}
