import ObserverPattern.Observable.IphoneObervableImpl;
import ObserverPattern.Observable.StocksObervable;
import ObserverPattern.Observer.EmailAlertOberverImpl;
import ObserverPattern.Observer.MobileAlertOberverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StocksObervable iphoneStockObservable = new IphoneObervableImpl();
        NotificationAlertObserver observer1 = new EmailAlertOberverImpl("1@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertOberverImpl("2@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertOberverImpl("3@gmail.com",iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }
}