package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObervable;

public class EmailAlertOberverImpl implements NotificationAlertObserver{
    String emailId;
    StocksObervable obervable;
    public EmailAlertOberverImpl(String emailId,StocksObervable obervable){
        this.obervable=obervable;
        this.emailId=emailId;
    }
    @Override
    public void update() {
        //before sendMsgOnMobile method is called this update method can use obervable object to get the required data and perform the required business logic
        sendMail(emailId,"product is in stock hurry up!");
    }

    private void sendMail(String emailId, String s) {
        System.out.println("mail sent to: "+emailId);
    }
}
