package design_patterns.observer_pattern.observable;

import design_patterns.observer_pattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{

    List<NotificationAlertObserver> observerList = new ArrayList<>();
    int stocksCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer: observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if (stocksCount == 0){
            notifySubscribers();
        }

        stocksCount = stocksCount + newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stocksCount;
    }
}
