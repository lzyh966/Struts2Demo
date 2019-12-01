package action;

import bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.UserDao;

import java.util.Map;

public class LoginAction extends ActionSupport {
    // 属性名必须和JSP页面的name一致
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String execute() {
        UserDao userDao=new UserDao();
        User u = userDao.selectUserByUsername(this.user.getUsername());
        if(u==null){
            return ERROR;
        }else {
            if(u.getUsername().equals(user.getUsername())&u.getPassword().equals(user.getPassword())){
                return SUCCESS;
            }
        }
        return ERROR;
    }
}
