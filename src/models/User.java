package models;

import observers.Observable;
import observers.UserObserver;
import workouts.Workout;

import java.util.ArrayList;
import java.util.List;

public class User implements Observable {
    private final String name;
    private Workout workout;
    private final List<UserObserver> userObservers = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void addObserver(UserObserver userObserver) {
        userObservers.add(userObserver);
    }

    public void removeObserver(UserObserver userObserver) {
        userObservers.remove(userObserver);
    }

    public void addProgress(int step) {
        workout.addProgress(step);
        notifyObservers();
    }

    public void notifyObservers() {
        for (UserObserver userObserver : userObservers) {
            userObserver.notify(this);
        }
    }

    public String getName() {
        return name;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }
}
