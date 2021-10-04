package bo;

import ui.CartInfo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CartHandler {
    public static Collection<CartInfo> getcartsWithGroup(String s){
        Collection c = Cart.searchCarts(s);
        ArrayList<CartInfo> carts = new ArrayList<CartInfo>();
        for(Iterator it = c.iterator(); it.hasNext();){
            Cart cart = (Cart) it.next();
            carts.add(new CartInfo(cart.getId_cart(),cart.getCart_user()));

        }
        return carts;
    }
}
