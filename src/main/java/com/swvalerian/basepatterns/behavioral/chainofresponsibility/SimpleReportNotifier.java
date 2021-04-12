package main.java.com.swvalerian.basepatterns.behavioral.chainofresponsibility;

public class SimpleReportNotifier extends Notifier {
    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Simple report notifyin: " + message);
    }
}
