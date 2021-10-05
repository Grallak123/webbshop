package bean;

public class ItemBean {

    private String name, description;
    private int cart_nr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCart_nr() {
        return cart_nr;
    }

    public void setCart_nr(int cart_nr) {
        this.cart_nr = cart_nr;
    }
}
