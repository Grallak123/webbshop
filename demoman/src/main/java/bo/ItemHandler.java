package bo;

import ui.ItemInfo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ItemHandler {
    public static Collection<ItemInfo> getItemsWithGroup(String s){
        Collection c = Item.searchItems(s);
        ArrayList<ItemInfo> items = new ArrayList<ItemInfo>();
        for(Iterator it = c.iterator(); it.hasNext();){
            Item item = (Item) it.next();
            items.add(new ItemInfo(item.getId(),item.getName(), item.getDesc(),item.getCart_nr()));

        }
        return items;
    }

    public static Collection<ItemInfo> findUserItems(int id_user){
        Collection c = Item.findUserItems(id_user);
        ArrayList<ItemInfo> items = new ArrayList<ItemInfo>();
        for(Iterator it = c.iterator(); it.hasNext();){
            Item item = (Item) it.next();
            items.add(new ItemInfo(item.getId(),item.getName(), item.getDesc(),item.getCart_nr()));

        }
        return items;
    }
}
