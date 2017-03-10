package behavioral.observer;

/**
 * Created by smota_000 on 10.3.2017 г..
 */
public class StockObserver implements Observer {

    private double ibmPrice;
    private double googPrice;
    private double aaplPrice;

    private static int observerIDTracker = 0;

    private int observerID;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {

        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;

        System.out.println("New Observer" + this.observerID);

        stockGrabber.addObserver(this);
    }

    @Override
    public void update(double IbmPrice, double aaplPrice, double googPrice) {

        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        printThePrices();
    }

    private void printThePrices() {

        System.out.println(observerID +
                "\nIBM: " + ibmPrice +
                "\nAAPL: " + aaplPrice +
                "\nGoogle: " + googPrice +
                "\n");
    }
}
