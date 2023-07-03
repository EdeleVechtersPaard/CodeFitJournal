abstract public class Observer {
    Observable subject;

    public Observer(Observable o) {
        if (o == null) return;
        this.subject = o;
        this.subject.subscribe(this);
    }

    void update(){
        methode1();
        methode2();
        methode3();
    }

    abstract void methode1();
    abstract void methode2();
    abstract void methode3();


}
