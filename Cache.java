package Control;

import Model.User;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    private final List<User> users;
    private static Cache cache;

    private Cache() {
        users = new ArrayList<>();
    }

    public static synchronized Cache getInstance() {
        if (cache == null) {
            cache = new Cache();
        }
        return cache;
    }

    public List<User> getUsers() {
        return users;
    }
}
