package design_patterns.observer_pattern.observer;

import design_patterns.observer_pattern.observable.StocksObservable;

public class MobileNumberAlertObserverImpl implements NotificationAlertObserver{

    String userName;
    StocksObservable observable;

    public MobileNumberAlertObserverImpl(String userName, StocksObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMessage(userName,"Product is available. Hurry Up!!!");
    }

    private void sendMessage(String userName, String s) {
        System.out.println("message sent to "+userName);
//        add your logic
    }
}
