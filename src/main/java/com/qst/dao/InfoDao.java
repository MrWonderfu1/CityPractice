package com.qst.dao;

import com.qst.bean.Info;
import com.qst.util.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class InfoDao {
    Connection conn = null;
    Statement stmt = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public int addinfo(Info info) {
        int i = 0;
        conn = JDBCUtil.getConnection();
        try {
            ps = conn.prepareStatement("insert into tb_info(INFO_TYPE, INFO_TITLE, INFO_CONTENT, INFO_PHONE, INFO_LINKMAN, INFO_EMAIL )values (?,?,?,?,?,?)");
            ps.setInt(1, info.getType());
            ps.setString(2, info.getTitle());
            ps.setString(3, info.getContent());
            ps.setString(4, info.getPhone());
            ps.setString(5, info.getLinkman());
            ps.setString(6, info.getEmail());
            System.out.println("type："+info.getType());
            System.out.println("title："+info.getTitle());
            System.out.println("content："+info.getContent());
            System.out.println("phone："+info.getPhone());
            System.out.println("linkman："+info.getLinkman());
            System.out.println("email："+info.getEmail());
            i = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(conn, stmt, ps, rs);
        }

        return i;
    }

    public int findInfoByType(int type) {
        int i = 0;
        conn = JDBCUtil.getConnection();
        try {
            ps = conn.prepareStatement("select * from tb_info where info_type = ?");
            ps.setInt(1, type);

            i = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(conn, stmt, ps, rs);
        }


        return i;
    }

    public int selectFreeInfo(int infotype) {
        int i = 0;
        conn = JDBCUtil.getConnection();
        try {
            ps = conn.prepareStatement("select * from tb_info where info_payfor = 0 and info_type=?");
            ps.setInt(1, infotype);
            i = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(conn, stmt, ps, rs);
        }

        return i;
    }

    public int selectPayInfo(int infotype) {
        int i = 0;
        conn = JDBCUtil.getConnection();
        try {
            ps = conn.prepareStatement("select * from tb_info where info_payfor = 1 and info_type=?");
            ps.setInt(1, infotype);
            i = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(conn, stmt, ps, rs);
        }


        return i;
    }


    public void searchInfo(String sqlvalue, String subsql, String type) {

        conn=JDBCUtil.getConnection();
        try {
            ps=conn.prepareStatement("");
            rs=ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(conn, stmt, ps, rs);
        }

    }

    public List<Info> searchInfoByPage(String sqlvalue, String subsql, String type, int start, int end) {
        conn = JDBCUtil.getConnection();
        Info info = null;
        List<Info> list = new ArrayList<>();

        try {
            ps = conn.prepareStatement("select * from tb_info");
            rs = ps.executeQuery();
            while (rs.next()){
                info=new Info();
                info.setId(rs.getInt("id"));
                info.setType(rs.getInt("info_type"));
                info.setTitle(rs.getString("info_title"));
                info.setLinkman(rs.getString("info_linkman"));
                info.setPhone(rs.getString("info_phone"));
                info.setDate(rs.getDate("info_date"));
                info.setState(rs.getString("info_state"));
                info.setContent(rs.getString("info_content"));
                info.setEmail(rs.getString("info_email"));
                info.setPayfor(rs.getString("info_payfor"));
                list.add(info);

            }



        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(conn, stmt, ps, rs);
        }



        return list;
    }
}
