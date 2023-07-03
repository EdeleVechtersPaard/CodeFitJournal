public interface Observable {

    void subscribe(Observer o);

    void unsubscribe(Observer o);

    String getState();

    void setState(String s);

    void notifySubscribers();

}
