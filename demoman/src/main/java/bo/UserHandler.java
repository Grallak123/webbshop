package bo;

import ui.UserInfo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class UserHandler {
    public static Collection<UserInfo> getUsersWithGroup(String s){
        Collection c = User.searchUsers(s);
        ArrayList<UserInfo> users = new ArrayList<UserInfo>();
        for(Iterator it = c.iterator(); it.hasNext();){
            User user = (User) it.next();
            users.add(new UserInfo(user.getId_user(),user.getUser_cart(),user.getUsername(), user.getUser_password()));

        }
        return users;
    }
}