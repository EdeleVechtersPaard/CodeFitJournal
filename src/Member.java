import java.util.ArrayList;
import java.util.Scanner;

public class Member extends Observer {
    private String naam;
    private ArrayList<PR>personalRecords = new ArrayList<>();
    private  ArrayList<Oefening> favOefening = new ArrayList<>();


    public Member(String naam, Observable o){
        super(o);
        this.naam = naam;
    }

    @Override
    public void methode1() {
        System.out.println("Hoi " + this.naam + " je hebt een nieuwe nieuwsbrief klaarstaan!");
    }

    @Override
    public void methode2() {
        System.out.println("Het onderwerp is " + super.subject.getState());
    }

    @Override
    public void methode3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Als je deze notificaties niet wilt, tik unsubscribe, anders druk op enter");
        String input = scanner.nextLine();
        if (input.equals("unsubscribe")) {
            super.subject.unsubscribe(this);
            System.out.println("je bent niet meer gesubscribed");
            return;
        }
        System.out.println("je bent nog steeds gesubscribed");
    }

    public void addPR(PR personalRecord) {
        this.personalRecords.add(personalRecord);
    }

    public String getNaam() {
        return naam;
    }

    public ArrayList<PR> getPersonalRecords() {
        return personalRecords;
    }
    public ArrayList<Oefening> getFavOefeningen() {
        return favOefening;
    }

    public void addFavOefening(Oefening oefening) {
        if(favOefening.contains(oefening)){
            System.out.println("Sorry. De gekozen oefening is al toegevoegd aan favorieten.");
        } else {
            System.out.println(oefening.getNaam() + " is toegevoegd aan je favorieten.");
            this.favOefening.add(oefening);
        }
    }
}
