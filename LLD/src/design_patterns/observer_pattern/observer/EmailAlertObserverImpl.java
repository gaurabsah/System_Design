package design_patterns.observer_pattern.observer;

import design_patterns.observer_pattern.observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId,"Product is available. Hurry Up!!!");
    }

    private void sendMail(String emailId, String s) {
        System.out.println("mail sent to "+emailId);
//        add your logic
    }
}
