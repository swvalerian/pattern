package main.java.com.swvalerian.basepatterns.behavioral.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        Admin admin = new Admin("ADmin!", chat);

        chat.setAdmin(admin);

        SimpleUser user1 = new SimpleUser(chat, "uZver_1");
        SimpleUser user2 = new SimpleUser(chat, "uZver_2");
        SimpleUser user3 = new SimpleUser(chat, "uZver_3");

        chat.addUserToChat(user1);
        chat.addUserToChat(user2);
        chat.addUserToChat(user3);

        user2.sendMessage("KuKu");

        System.out.println("=====================");

        admin.sendMessage("Zloy admin deleted ALL!");
    }
}