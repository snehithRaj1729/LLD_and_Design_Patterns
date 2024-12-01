package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObervable;

public class MobileAlertOberverImpl implements NotificationAlertObserver{
    String userName;
    StocksObervable observable;
    public MobileAlertOberverImpl(String userName,StocksObervable observable){
        this.userName=userName;
        this.observable=observable;
    }

    @Override
    public void update() {
        //before sendMsgOnMobile method is called this update method can use obervable object to get the required data and perform the required business logic
        sendMsgOnMobile(userName,"Product is in stock hurry!");
    }

    private void sendMsgOnMobile(String userName, String msg) {
        System.out.println("Msg sent to "+userName);
    }
}
