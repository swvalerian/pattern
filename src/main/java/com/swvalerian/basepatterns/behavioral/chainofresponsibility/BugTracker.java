package main.java.com.swvalerian.basepatterns.behavioral.chainofresponsibility;

public class BugTracker {
    public static void main(String[] args) {
        SimpleReportNotifier report = new SimpleReportNotifier(Priority.ROUTINE);
        EmailNotifier email = new EmailNotifier(Priority.IMPORTANT);
        SMSNotifier sms = new SMSNotifier(Priority.ASAP);

        report.setNextNotifier(email);
        email.setNextNotifier(sms);

        report.notifyManager("Its Ok, very well!", Priority.ROUTINE);


        report.notifyManager("oh - ho - ho", Priority.IMPORTANT);
        report.notifyManager("Warning! We have problems!!! ASAP!!!", Priority.ASAP);
    }
}
