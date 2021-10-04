package ui;

public class ItemInfo {

    private int id;
    private String name;
    private String Description;
    private int cart_nr;

    public ItemInfo(int id,String name, String Description, int cart_nr) {
        this.id = id;
        this.name = name;
        this.Description = Description;
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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getCart_nr() {
        return cart_nr;
    }

    public void setCart_nr(int cart_nr) {
        this.cart_nr = cart_nr;
    }
}