package behavioral.observer;

/**
 * Created by smota_000 on 10.3.2017 г..
 */
public interface Subject {

    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

}
