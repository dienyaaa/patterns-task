package observers;

public interface Observable {
    void addObserver(UserObserver userObserver);
    void removeObserver(UserObserver userObserver);
    void notifyObservers();
}
