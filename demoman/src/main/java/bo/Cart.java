package bo;

import db.CartDB;

import java.util.Collection;

public class Cart {

    private int id_cart;
    private int cart_user;

    static public Collection searchCarts(String group){
        return CartDB.searchCarts(group);
    }

    protected Cart(int id_cart, int cart_user){
        this.id_cart = id_cart;
        this.cart_user = cart_user;

    }

    public int getId_cart() {
        return id_cart;
    }

    public void setId_cart(int id_cart) {
        this.id_cart = id_cart;
    }

    public int getCart_user() {
        return cart_user;
    }

    public void setCart_user(int cart_user) {
        this.cart_user = cart_user;
    }
}
