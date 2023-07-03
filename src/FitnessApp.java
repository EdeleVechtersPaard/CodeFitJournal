import java.util.ArrayList;
import java.util.Scanner;

public class FitnessApp {

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        //code voor de newsletter
        Observable notification = new Nieuwsbrief();

        ArrayList<Member> members = new ArrayList<>();
        members.add(new Member("Kees", notification));
        members.add(new Member("Karel",notification));
        members.add(new Member("Johan",notification));

        ArrayList<Oefening> oefeningen = new ArrayList<>();
        oefeningen.add(new Oefening("Squat", "Been oefening"));
        oefeningen.add(new Oefening("Bench press", "Borst oefening"));
        oefeningen.add(new Oefening("Deadlift", "rug oefening"));
        System.out.println("Welkom bij onze fitness applicatie!");

        //haalt alle gebruikers uit de list en toont ze.
        for (int i = 0; i < members.size(); i++) {
            System.out.println(i + 1 + ") " + members.get(i).getNaam());
        }


        int memberKeuze = scanner.nextInt();
        Member currentMember = members.get(memberKeuze- 1);
        System.out.println("ingelogd met "  + currentMember.getNaam());

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMaak een keuze:");
            System.out.println("1. Voer progressie in voor een bestaande oefening");
            System.out.println("2. Bekijk favoriete oefeningen");
            System.out.println("3. Bekijk alle oefeningen");
            System.out.println("4. Voortgang bekijken");
            System.out.println("5. Inbox");
            System.out.println("6. Verlaat het programma");

            int optie = scanner.nextInt();
            scanner.nextLine();


            switch (optie) {
                case 1:
                    System.out.println("Welke oefening wil je bijwerken?");
                    int teller = 1;
                    for (Oefening oefening : oefeningen) {
                        System.out.println(teller + ") " + oefening.getNaam());
                        teller++;
                    }

                    int oefeningKeuze = scanner.nextInt();
                    Oefening huidigeOefening = oefeningen.get(oefeningKeuze - 1);
                    System.out.println("Je hebt gekozen voor de " + huidigeOefening.getNaam());
                    scanner.nextLine();
                    System.out.println("Wil je de progressie aanpassen? (ja/nee)");
                    String antwoord = scanner.nextLine();

                    if (antwoord.equals("ja")) {
                        System.out.println("Voer het nieuwe gewicht in:");
                        int nieuwGewicht = scanner.nextInt();
                        System.out.println("Voer het aantal sets in:");
                        int sets = scanner.nextInt();
                        System.out.println("Voer het aantal reps in:");
                        int reps = scanner.nextInt();


                        Integer verwijderPR = null;
                        for (int i = 0; i < currentMember.getPersonalRecords().size(); i++) {
                            PR currentPR = currentMember.getPersonalRecords().get(i);
                            if (currentPR.getOefening().getNaam().equals(huidigeOefening.getNaam())) {
                                verwijderPR = i;
                            }
                        }
                        if (verwijderPR != null) {
                            currentMember.getPersonalRecords().remove((int) verwijderPR);
                        }
                        currentMember.addPR(new PR(huidigeOefening, currentMember,sets, reps, nieuwGewicht));

                        System.out.println("Opgeslagen!");

                    } else {
                        for (PR pr : currentMember.getPersonalRecords()) {
                            System.out.println(pr.getOefening().getNaam() + ": " + pr.getGewicht());
                        }
                    }
                    break;

                case 2:
                    for (int i = 0; i < currentMember.getFavOefeningen().size(); i++) {
                        System.out.println("Naam: " + currentMember.getFavOefeningen().get(i).getNaam());
                        System.out.println("Beschrijving: " + currentMember.getFavOefeningen().get(i).getBeschrijving());
                    }
                    break;

                case 3:
                    System.out.println("Alle oefeningen:");

                    for (Oefening oefening : oefeningen) {
                        System.out.println("\nNaam: " + oefening.getNaam());
                        System.out.println("Beschrijving: " + oefening.getBeschrijving());
                    }
                    System.out.println("\nWil je een van deze oefeningen toevoegen aan je favorieten? ");
                    System.out.println("(ja/nee)");
                    String antwoord2 = scanner.nextLine();
                    if (antwoord2.equals("ja")) {
                        System.out.println("Welke oefening wil je toevoegen aan je favorieten?");
                        for(int i = 1; i <= oefeningen.size(); i++){
                            System.out.println(i + ". " + oefeningen.get(i - 1).getNaam());
                        }
                        int keuze = scanner.nextInt();
                        currentMember.addFavOefening(oefeningen.get(keuze - 1));
                    }
                    break;
                case 4:
                    System.out.println("Oefeningen: ");
                    for(PR pr : currentMember.getPersonalRecords()){
                        System.out.println("Oefening: " + pr.getOefening().getNaam());
                        System.out.println("Sets: " + pr.getSets());
                        System.out.println("Reps: " + pr.getReps());
                        System.out.println("Gewicht: " + pr.getGewicht());
                        System.out.println();
                    }
                    break;

                case 5:
                    nieuwOnderwerp(notification);
                    break;

                case 6:
                    for (int i = 0; i < members.size(); i++) {
                        System.out.println(i + 1 + ") " + members.get(i).getNaam());
                    }
                     memberKeuze = scanner.nextInt();
                     currentMember = members.get(memberKeuze- 1);
                    System.out.println("ingelogd met "  + currentMember.getNaam());
                    break;

                default:
                    System.out.println("Ongeldige keuze. Probeer opnieuw.");
                    break;

            }
        }
        System.out.println("Bedankt voor het gebruik van onze fitness applicatie!");
    }

    public void nieuwOnderwerp(Observable notification){
        String onderwerp = "Sporter is ernstig gewond geraakt in de sportschool";
        notification.setState(onderwerp);
    }
}