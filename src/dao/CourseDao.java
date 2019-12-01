package dao;

import bean.Course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CourseDao {
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/strutsDemo", "root", "admin");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public int addCourse(Course course) {
        int count = 0;
        Connection connection = getConnection();
        PreparedStatement ps = null;
        try {
            String sql = "insert into courses(course_name,credit,teacher) values(?,?,?);";
            ps = connection.prepareStatement(sql);
            ps.setString(1, course.getCourseName());
            ps.setInt(2, course.getCredit());
            ps.setString(3, course.getTeacher());
            count = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }
}
