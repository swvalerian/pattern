package main.java.com.swvalerian.basepatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDevJobSite implements Observed {
    List<String> vacancies = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<Observer>();

    public void addVacancy(String vacancy) {
        vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy) {
        vacancies.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.handleEvent(this.vacancies);
        }
    }
}
