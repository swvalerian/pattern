package main.java.com.swvalerian.basepatterns.behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDevJobSite site = new JavaDevJobSite();

        site.addVacancy("JavaDeveloper");
        site.addVacancy("C++Developer");
        site.addVacancy("MainCraftaDeveloper");

        Subscriber sub1 = new Subscriber("Piter Pan First");
        Subscriber sub2 = new Subscriber("Djo Dasen Second");
        Subscriber sub3 = new Subscriber("Mikki Rurk Therd");

        site.addObserver(sub1);
        site.addObserver(sub2);
        site.addObserver(sub3);

        site.addVacancy("Bodibilder");
        site.removeObserver(sub2);

        site.removeVacancy("MainCraftaDeveloper");
    }
}
