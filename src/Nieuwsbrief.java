import java.util.ArrayList;

public class Nieuwsbrief implements Observable {
    private String onderwerp = "leeg";

    private ArrayList<Observer> subscribers = new ArrayList<>();
    private ArrayList<Observer> unsubscribeList = new ArrayList<>();

    @Override
    public void subscribe(Observer sub){
        subscribers.add(sub);
    }

    @Override
    public void unsubscribe(Observer sub){
        unsubscribeList.add(sub);
    }

    @Override
    public String getState() {
        return onderwerp;
    }
    public void setState(String s) {
        onderwerp = s;
        notifySubscribers();
    }

    public void notifySubscribers(){
        for (Observer o : subscribers) {
            o.update();
        }
        if (unsubscribeList == null || unsubscribeList.size() == 0) return;
        for (Observer o : unsubscribeList) {
            subscribers.remove(o);
        }
        unsubscribeList.clear();
    }
}
