package dao;

import bean.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDao {
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

    public int addStudent(Student student){
        int count=0;
        Connection connection = getConnection();
        PreparedStatement ps=null;
        try {
            String sql="insert into student values(?,?,?,?,?,?);";
            ps=connection.prepareStatement(sql);
            ps.setInt(1,student.getStudentId());
            ps.setString(2,student.getName());
            ps.setString(3,student.getSex());
            ps.setString(4,student.getMajor());
            ps.setString(5,student.getBirthDate());
            ps.setString(6,student.getMemo());
            count = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }
}
