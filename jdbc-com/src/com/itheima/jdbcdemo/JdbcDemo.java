package com.itheima.jdbcdemo;

import com.itheima.pojo.Account;
import com.mysql.cj.xdevapi.JsonString;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
//        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql:///ch?useServerPrepStmts=true";
        String username = "root";
        String password = "123321";
        Connection conn = DriverManager.getConnection(url, username, password);

        //Thread.sleep(10000);

        //System.out.println(12);

        //Thread.sleep(10000);

        //String sql = "update score set math = 300 where id = 1";
//
//        String sql = "drop database ch2";
//
//        Statement stmt = conn.createStatement();
//
//        try {
//
//            //conn.setAutoCommit(false);
//
//            int i = stmt.executeUpdate(sql);//DDLnot
//
//            //System.out.println(3/0);
//
//            System.out.println(i);
//
//            //conn.commit();
//        } catch (Exception e) {
//            //conn.rollback();
//            e.printStackTrace();
//        }
//
//        stmt.close();
//
//        conn.close();

//        String sql  ="select * from score";
//
//        Statement stmt = conn.createStatement();
//
//        ResultSet rs = stmt.executeQuery(sql);
//
//        List<Account> list = new ArrayList<>();
//
//        while (rs.next()){
//
//            Account account = new Account();
//
//
//            int id = rs.getInt("id");
//            String name = rs.getString("name");
//            int math = rs.getInt("math");
//            int chinese = rs.getInt("chinese");
//            int english = rs.getInt("english");
//
//            account.setId(id);
//            account.setName(name);
//            account.setMath(math);
//            account.setChinese(chinese);
//            account.setEnglish(english);
//
//            list.add(account);
//        }
//        rs.close();
//        stmt.close();
//        conn.close();
//        System.out.println(list);

        String name = "zhangsha";
        String pw = " ' or '1' = '1";
//        String sql = "select * from users where name ='"+name+"' and password = '"+pw+"'";
//        Statement stmt = conn.createStatement();
//        ResultSet rs = stmt.executeQuery(sql);
//        if(rs.next()){
//            System.out.println("login");
//        }else {
//            System.out.println("fall");
//        }
        String sql = "select * from users where name = ? and password = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,name);
        pstmt.setString(2,pw);
        ResultSet rs = pstmt.executeQuery();
        if(rs.next()){
            System.out.println("Yes");
        }else{
            System.out.println("Not");
        }
        rs.close();
        pstmt.close();
        conn.close();
    }
}
