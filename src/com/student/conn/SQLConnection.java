package com.student.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**连接数据库
 * Created by peter on 2017/2/17.
 */
public class SQLConnection {
    public static  final String DRIVER ="com.mysql.jdbc.Driver";
    public  static final String URL = "jdbc:mysql://localhost:3306/test";
    public static final String USER = "root";
    public static final String PASSWORD = "mysql";
    //连接数据库
    public Connection getConnection(){
        //加载mysql驱动
        try {
            Class.forName(DRIVER);
            System.out.println("驱动加载成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("驱动加载失败");
        }
        Connection conn = null;
        try {
             conn = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("数据库连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("数据库连接失败");
        }
        return conn;
    }
}
