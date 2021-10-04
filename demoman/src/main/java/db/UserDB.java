package db;

import bo.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Vector;

public class UserDB extends User{
    public static Collection searchUsers(String item_group){
        Vector v = new Vector();
        try {
            Connection con = DBManager.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select id_user,user_cart, username, user_password from User");

            while(rs.next()){
                int i = rs.getInt("id_user");
                int user_cart = rs.getInt("user_cart");
                String username = rs.getString("username");
                String user_password = rs.getString("user_password");
                v.addElement(new UserDB(i,user_cart,username,user_password));
            }

            //con.close();
            //st.close();
            //rs.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return v;
    }

    private UserDB(int id_user, int user_cart , String username, String user_password){
        super(id_user,user_cart,username,user_password);
    }

}
