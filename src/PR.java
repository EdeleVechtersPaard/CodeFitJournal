public class PR {
    private Oefening oefening;
    private Member member;
    private int gewicht;
    private int sets;
    private int reps;



    public PR (Oefening oefening, Member member, int sets, int reps, int gewicht){
        this.oefening = oefening;
        this.member = member;
        this.gewicht = gewicht;
        this.sets = sets;
        this.reps = reps;
    }

    public Oefening getOefening() {
        return oefening;
    }

    public Member getMember() {
        return member;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    //wordt gebruikt voor testen
    public String checkPrijs(int nieuwGewicht){
        if(nieuwGewicht<(gewicht/2)) {
            return "Je krijgt niks";
        }
        if(nieuwGewicht>=(gewicht/2)&&nieuwGewicht<gewicht) {
            return "Je krijgt een medium prijs";
        }
        setGewicht(nieuwGewicht);
        return "Je krijgt een coole prijs";
    }

}
