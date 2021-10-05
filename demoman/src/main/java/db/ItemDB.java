package db;

import bo.Item;
//används inte
import bean.ItemBean;

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

        Connection con;

        try{
            String query = "insert into T_Item (name, description, cart_nr)" + "values (?,?,?)";
            con = DBManager.getConnection();

            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1,name);
            preparedStmt.setString(2,description);
            preparedStmt.setInt(3,cart_nr);
            preparedStmt.executeUpdate();


        } catch(SQLException e){
            e.printStackTrace();

        }

    }


    public static Collection findUserItems(int id_user){
        Vector v3 = new Vector();
        Connection con;
        Statement st;
        ResultSet rs;
        System.out.println(id_user + " hek3");
        try{
            //String query = "select id, name, description, cart_nr from T_ITEM where cart_nr = id_user";
            con = DBManager.getConnection();
            //Statement st2 = con.createStatement();
            System.out.println(id_user + " hek");
            String query2 ="select id, name, description, cart_nr from T_ITEM where cart_nr = ?";
            //ResultSet rs2 = st2.executeQuery("select id, name, description, cart_nr from T_ITEM where cart_nr = ?");
            PreparedStatement preparedStmt2 = con.prepareStatement(query2);
            preparedStmt2.setInt(1,id_user);
            ResultSet rs2 = preparedStmt2.executeQuery(query2);

            while(rs2.next()){
                int i = rs2.getInt("id");
                String name = rs2.getString("name");
                String desc = rs2.getString("description");
                int cart_nr = rs2.getInt("cart_nr");
                v3.addElement(new ItemDB(i,name,desc,cart_nr));
            }


        } catch(SQLException e){
            e.printStackTrace();

        }

        return v3;

    }



    private ItemDB(int id, String name, String desc, int cart_nr){
        super(id,name,desc,cart_nr);
    }

}
