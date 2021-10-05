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
            status=rs.next();

        }catch(Exception e){}

        return status;

    }
}