package bo;

import db.ItemDB;

import java.util.Collection;

public class Item {

    private int id;
    private String name;
    private String desc;
    private int cart_nr;

    static public Collection searchItems(String group){
        return ItemDB.searchItems(group);
    }

    static public Collection findUserItems(int id_user){
        return ItemDB.findUserItems(id_user);
    }

    protected Item(int id, String name, String desc, int cart_nr){
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.cart_nr = cart_nr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCart_nr() {
        return cart_nr;
    }

    public void setCart_nr(int cart_nr) {
        this.cart_nr = cart_nr;
    }
}
