package ui;

public class UserInfo {

    private int id_user;
    private int user_cart;
    private String username;
    private String user_password;

    public UserInfo(int id_user, int user_cart, String username, String user_password) {
        this.id_user = id_user;
        this.user_cart = user_cart;
        this.username = username;
        this.user_password = user_password;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getUser_cart() {
        return user_cart;
    }

    public void setUser_cart(int user_cart) {
        this.user_cart = user_cart;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }
}