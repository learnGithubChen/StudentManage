package com.student.service;

import com.student.conn.SQLConnection;
import com.student.model.UserInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**处理用户登录
 * Created by peter on 2017/2/17.
 */
public class UserDao {
   private static SQLConnection sqlConnection = new SQLConnection();
   private static Connection conn = sqlConnection.getConnection();
    //用户登录
    public boolean login(UserInfo userInfo){
        String sql = "select * from userinfo where username=? and password=? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,userInfo.getUsername());
            ps.setString(2,userInfo.getPassword());
            ResultSet rs = ps.executeQuery();
            rs.next();//默认指向第一行
            if(rs.getInt(1)==1){
                //查询到数据,登录成功
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
