package db;

import bo.Item;

import java.sql.*;
import java.util.Collection;
import java.util.Vector;

public class ItemDB extends Item{
    public static Collection searchItems(String item_group){
        Vector v = new Vector();
        try {
            Connection con = DBManager.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select id, name, description, cart_nr from T_ITEM");

            while(rs.next()){
                int i = rs.getInt("id");
                String name = rs.getString("name");
                String desc = rs.getString("description");
                int cart_nr = rs.getInt("cart_nr");
                v.addElement(new ItemDB(i,name,desc,cart_nr));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return v;
    }

    public static void addItem(String name, String description, int cart_nr){
        Vector v2 = new Vector();
        Connection con;
        Statement st;
        ResultSet rs;
        try{
            String query = "insert into T_item (name, descripton, cart_nr)" + "values (?,?,?)";
            con = DBManager.getConnection();
            //st = con.createStatement();
            //rs = st.executeQuery("select id, name, description, cart_nr from T_ITEM");
            //rs = st.executeQuery(INSERT INTO `reine`.`t_item` (`name`, `description`, `cart_nr`) VALUES ('kex', 'crummy', '1'));
            //rs = st.executeQuery(INSERT);
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1,name);
            preparedStmt.setString(2,description);
            preparedStmt.setInt(3,cart_nr);
            preparedStmt.execute();

            //con.close();
            //st.close();
            //rs.close();


        } catch(SQLException e){
            e.printStackTrace();

        }

    }

    private ItemDB(int id, String name, String desc, int cart_nr){
        super(id,name,desc,cart_nr);
    }

}
