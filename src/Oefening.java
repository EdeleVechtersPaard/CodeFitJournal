public class Oefening {
     private String naam;
     private String beschrijving;



    public Oefening(String naam, String beschrijving) {
         this.naam = naam;
         this.beschrijving = beschrijving;


     }


     public String getBeschrijving() {
         return beschrijving;
     }

     public String getNaam() {
         return naam;
     }

     public void setNaam(String naam) {
         this.naam = naam;
     }

     public void setBeschrijving(String beschrijving) {
         this.beschrijving = beschrijving;
     }



    //method for testing purposes
    public static boolean recordGewicht(int benchpressGewicht, int squatGewicht, int deadliftGewicht){
        if( benchpressGewicht> 100 || squatGewicht > 120 || deadliftGewicht > 150){
            System.out.println("Je krijgt een pluim!");
            return true;
        }
        return false;
    }

    //method for testing purposes (legpress is 1, 2 or 3)
    public static boolean checkRecords(int legpress, boolean deadlift, boolean squat, boolean benchpress) {
        /*
          if legpress == 1 -> 'geen record behaald'
          if legpress == 2 -> 'set record behaald'
          if legpress == 3 -> 'gewicht record behaald'

        */
        if(legpress > 1 || deadlift || squat || benchpress){
            System.out.println("Je krijgt een pluim!");
            return true;
        }
        return false;

    }

}




