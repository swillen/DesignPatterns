package behavioral.observer;

import java.util.ArrayList;

/**
 * Created by smota_000 on 10.3.2017 г..
 */
public class StockGrabber implements Subject
{
    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int observerIndex = observers.indexOf(o);

        System.out.println("Observer " + (observerIndex +1 ) + "deleted");

        observers.remove(observerIndex);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
                observer.update(ibmPrice,aaplPrice,googPrice);
        }
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObservers();
    }

    public void setAaplPrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObservers();

    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObservers();
    }
}



























