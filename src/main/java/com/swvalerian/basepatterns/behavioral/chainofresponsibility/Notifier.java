package main.java.com.swvalerian.basepatterns.behavioral.chainofresponsibility;

public abstract class Notifier {
    private int priority;
    private Notifier nextNotifier;

    public void notifyManager(String message, int level) {
        if (level >= priority) {
            write(message);
        }
        if (nextNotifier != null) {
            nextNotifier.notifyManager(message, level );
        }
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public Notifier(int priority) {
        this.priority = priority;
    }

    public abstract void write(String message);
}