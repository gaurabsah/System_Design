package design_patterns.observer_pattern;

import design_patterns.observer_pattern.observable.IphoneObservableImpl;
import design_patterns.observer_pattern.observable.StocksObservable;
import design_patterns.observer_pattern.observer.EmailAlertObserverImpl;
import design_patterns.observer_pattern.observer.MobileNumberAlertObserverImpl;
import design_patterns.observer_pattern.observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneStocksObservable = new IphoneObservableImpl();
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("gaurab.sah@gmail.com",iphoneStocksObservable);
        NotificationAlertObserver observer2 = new MobileNumberAlertObserverImpl("Gaurab",iphoneStocksObservable);
        iphoneStocksObservable.add(observer1);
        iphoneStocksObservable.add(observer2);

        iphoneStocksObservable.setStockCount(10);
    }
}
