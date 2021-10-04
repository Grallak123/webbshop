package db;

import bo.Cart;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Vector;

public class CartDB extends Cart{
    public static Collection searchCarts(String item_group){
        Vector v = new Vector();
        try {
            Connection con = DBManager.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select id_cart,cart_user from Cart");

            while(rs.next()){
                int i = rs.getInt("id_cart");
                int cart_user = rs.getInt("cart_user");
                v.addElement(new CartDB(i,cart_user));
            }

            //con.close();
            //st.close();
            //rs.close();


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

        }
        return v;
    }

    private CartDB(int id_cart, int cart_user){
        super(id_cart,cart_user);
    }

}