package db;

import bean.LoginBean;
import java.sql.*;
public class LoginDao {

    public static boolean validate(LoginBean bean){
        boolean status=false;
        try{
            Connection con = DBManager.getConnection();

            PreparedStatement ps=con.prepareStatement(
                    "select * from user where username=? and user_password=?");

            ps.setString(1,bean.getUsername());
            ps.setString(2, bean.getUser_password());

            ResultSet rs=ps.executeQuery();
            //int nagot = rs.getInt(2);
            //System.out.println("kolumn index 2 är user = " + nagot );
            status=rs.next();

        }catch(Exception e){
            e.printStackTrace();
        }

        return status;

    }

    public static int checkUserId(LoginBean bean){
        int userId = 1;
        System.out.println(bean.getUsername());
        String uname = bean.getUsername();
        try{
            Connection con2 = DBManager.getConnection();
            Statement st2 = con2.createStatement();
            ResultSet rs2 = st2.executeQuery("select id_user from User where username = '" + uname +"'");
            //String query2 ="select id_user from user where username = '" + uname +"'";
            rs2.next();
            System.out.println(rs2.getInt("id_user"));
            userId = rs2.getInt("id_user");


            /*Connection con2 = DBManager.getConnection();

            PreparedStatement ps=con2.prepareStatement(
                    "select id_user from user where username=? and user_password=?");

            //ps.setString(1,bean.getUsername());
            //ps.setString(2, bean.getUser_password());

            ResultSet rs=ps.executeQuery();
            rs.next();
            //userId=rs.next();
            userId = rs.getInt("id_user");
            System.out.println("the userId is = " + userId);*/



        }catch(Exception e){
            e.printStackTrace();
        }

        return userId;

    }
}