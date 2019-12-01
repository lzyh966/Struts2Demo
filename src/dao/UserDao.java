package dao;

import bean.User;

import java.sql.*;

public class UserDao {
    public static Connection getConnection(){
        Connection connection=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/strutsDemo","root","admin");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public User selectUserByUsername(String username){
        User user=null;
        try {
            Connection conn=getConnection();
            String sql="select * from users where username=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,username);
            ResultSet rs =   ps.executeQuery();
            while (rs.next()){
                user=new User();
                user.setId(rs.getInt(1));
                user.setUsername(rs.getString(2));
                user.setPassword(rs.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public int addUser(User user){
        int count=0;
        Connection connection = getConnection();
        PreparedStatement ps=null;
        try {
            String sql="insert into users(username,password) values(?,?);";
            ps=connection.prepareStatement(sql);
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            count = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }
}
