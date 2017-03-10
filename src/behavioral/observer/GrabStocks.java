package behavioral.observer;

/**
 * Created by smota_000 on 10.3.2017 г..
 */
public class GrabStocks {

    public static void main(String[] args) {

        StockGrabber stockgraber  = new StockGrabber();

        StockObserver user1  = new StockObserver(stockgraber);

        stockgraber.setAaplPrice(182.00);
        stockgraber.setGoogPrice(212.00);
        stockgraber.setIbmPrice(432.00);

        

    }
}
