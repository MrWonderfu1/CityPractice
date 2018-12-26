package com.qst.dao;

import com.qst.bean.User;
import com.qst.util.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class userDao {
    Connection conn =null;
    PreparedStatement ps=null;
    ResultSet rs = null;
    Statement stmt = null;


    public User login(String username, String password) {
        User user = null;
        Connection conn = JDBCUtil.getConnection();
        try {
            ps = conn.prepareStatement("SELECT  * from  tb_user where user_name =?and user_password=?;");
            ps.setString(1, username);
            ps.setString(2, password);
             rs = ps.executeQuery();
            //将结果
            while (rs.next()){
                user=new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("user_name"));
                user.setPassword(rs.getString("user_password"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(conn,stmt,ps,rs);
        }
        return user;
    }
    public int register(String username,String password){
        int i =0;
        boolean result = this.findUserByName(username);
        if (result==true){
            return 0;
        }else {
            conn=JDBCUtil.getConnection();
            try {
                ps=conn.prepareStatement(" INSERT into tb_user values (0,?,?,0,0) ");
                ps.setString(1,username);
                ps.setString(2,password);
                i =ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                JDBCUtil.close(conn,stmt,ps,rs);
            }
        }
            return i;
    }
    public boolean findUserByName(String username){
        conn=JDBCUtil.getConnection();
        boolean result=false;
        try {
            ps=conn.prepareStatement("SELECT * from tb_user where user_name=? ");
            ps.setString(1,username);
            rs=ps.executeQuery();
            if (rs.next()==true){
                result=true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(conn,stmt,ps,rs);
        }
        return result;
    }
    public User findUserById(String userId){
        conn=JDBCUtil.getConnection();
        User user = null;
        try {
            ps=conn.prepareStatement(" select * from tb_user where id=? and user_state =0");
            ps.setString(1,userId);
            rs=ps.executeQuery();
            if (rs.next()){
                user=new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("user_name"));
                user.setPassword(rs.getString("user_password"));
                user.setState(rs.getInt("user_state"));
                user.setType(rs.getInt("user_type"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
    public List<User>findUserList(){
        conn=JDBCUtil.getConnection();
        List<User> userList=new ArrayList<>();
        try {
            ps=conn.prepareStatement("select *from tb_user order by id;");
            rs=ps.executeQuery();
            while (rs.next()){
              User user = new User();
              user.setId(rs.getInt("id"));
              user.setUsername(rs.getString("user_name"));
              user.setPassword(rs.getString("user_password"));
              user.setState(rs.getInt("user_state"));
              user.setType(rs.getInt("user_type"));
              userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }
public List<User>findUserListByPage(int page,int rows){
    conn=JDBCUtil.getConnection();
    List<User> userList=new ArrayList<>();
    try {
        String sql="select * from tb_user where user_state=0 order by id limit "+((page-1)*5)+","+rows;

        ps=conn.prepareStatement(sql);
        rs=ps.executeQuery();
        while (rs.next()){
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("user_name"));
            user.setPassword(rs.getString("user_password"));
            user.setState(rs.getInt("user_state"));
            user.setType(rs.getInt("user_type"));
            userList.add(user);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return userList;
}

    public int deleteUserById(String userid) {
        conn=JDBCUtil.getConnection();
        int i =0;
        try {
            ps=conn.prepareStatement("UPDATE tb_user set user_state =1 where id=? ");
            ps.setString(1,userid);
            i=ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(conn,stmt,ps,rs);
        }
        return i;
    }
//    public int deleteUserById(String userid) {
//        conn=JDBCUtil.getConnection();
//        int i =0;
//        try {
//            ps=conn.prepareStatement("delete from tb_user where id=?");
//            ps.setString(1,userid);
//            i=ps.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return i;
//    }
    public int updateUserById (String userid,String newPassword){
        conn=JDBCUtil.getConnection();
        int result=0;
        try {
            ps=conn.prepareStatement("update tb_user set user_password=? where id=? ");
            ps.setString(1,newPassword);
            ps.setString(2,userid);
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(conn,stmt,ps,rs);
        }
        return result;
    }
}
