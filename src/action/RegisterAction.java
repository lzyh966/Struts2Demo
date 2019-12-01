package action;

import bean.User;
import com.opensymphony.xwork2.ActionSupport;
import dao.UserDao;

public class RegisterAction extends ActionSupport {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String execute() throws Exception {
        int i = new UserDao().addUser(user);
        if(i>0){
            return SUCCESS;
        }else {
            return INPUT;
        }
    }
}

