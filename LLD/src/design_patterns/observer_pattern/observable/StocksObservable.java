package design_patterns.observer_pattern.observable;

import design_patterns.observer_pattern.observer.NotificationAlertObserver;

public interface StocksObservable {

    void add(NotificationAlertObserver observer);

    void remove(NotificationAlertObserver observer);

    void notifySubscribers();

    void setStockCount(int newStockAdded);

    int getStockCount();
}
