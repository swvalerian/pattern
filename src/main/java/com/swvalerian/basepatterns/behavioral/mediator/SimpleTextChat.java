package main.java.com.swvalerian.basepatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat {
    Admin admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public void addUserToChat(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User userName) {
        for (User u : users) {
            if (u != userName) {
                u.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
