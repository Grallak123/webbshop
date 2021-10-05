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
            int nagot = rs.getInt(2);
            System.out.println("kolumn index 2 är user = " + nagot );
            status=rs.next();

        }catch(Exception e){}

        return status;

    }

    public static int checkUserId(LoginBean bean){
        int userId = 1;
        try{
            Connection con = DBManager.getConnection();

            PreparedStatement ps=con.prepareStatement(
                    "select id_user from user where username=? and user_password=?");

            ps.setString(1,bean.getUsername());
            ps.setString(2, bean.getUser_password());

            ResultSet rs=ps.executeQuery();
            //userId=rs.next();
            userId = rs.getInt("id_user");
            System.out.println("the userId is = " + userId);

        }catch(Exception e){
            e.printStackTrace();
        }

        return userId;

    }
}