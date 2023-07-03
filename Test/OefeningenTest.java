import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OefeningenTest {

//    @Test
//    void CC_DC_C_DC_Test1(){
//        assertEquals(false, Oefeningen.recordGewicht(99, 119, 149));
//    }
//    @Test
//    void CC_DC_C_DC_Test2(){
//        assertEquals(true, Oefeningen.recordGewicht(101, 121, 151));
//    }
//
//    @Test
//    void MCC_Test1(){
//        assertEquals(false, Oefeningen.recordGewicht(99, 119, 149));
//    }
//    @Test
//    void MCC_Test2(){
//        assertEquals(true, Oefeningen.recordGewicht(99, 119, 151));
//    }
//    @Test
//    void MCC_Test3(){
//        assertEquals(true, Oefeningen.recordGewicht(99, 121, 149));
//    }
//    @Test
//    void MCC_Test4(){
//        assertEquals(true, Oefeningen.recordGewicht(99, 121, 151));
//    }
//    @Test
//    void MCC_Test5(){
//        assertEquals(true, Oefeningen.recordGewicht(101, 119, 149));
//    }
//    @Test
//    void MCC_Test6(){
//        assertEquals(true, Oefeningen.recordGewicht(101, 119, 151));
//    }
//    @Test
//    void MCC_Test7(){
//        assertEquals(true, Oefeningen.recordGewicht(101, 119, 149));
//    }
//    @Test
//    void MCC_Test8(){
//        assertEquals(true, Oefeningen.recordGewicht(101, 121, 151));
//    }

    @Test
    void mcdc1() {
        assertEquals(false, Oefening.recordGewicht(100,120,150));
    }

    @Test
    void mcdc2() {
        assertEquals(true, Oefening.recordGewicht(100, 120, 151));
    }

    @Test
    void mcdc3() {
        assertEquals(true, Oefening.recordGewicht(100, 121, 150));
    }

    @Test
    void mcdc4() {
        assertEquals(true, Oefening.recordGewicht(101, 120, 150));
    }




    @Test
    void pairwise1() {
        assertEquals(true, Oefening.checkRecords(1, true, false, true));
    }

    @Test
    void pairwise2() {
        assertEquals(true, Oefening.checkRecords(1, false, true, false));
    }

    @Test
    void pairwise3() {
        assertEquals(true, Oefening.checkRecords(2, true, true, false));
    }

    @Test
    void pairwise4() {
        assertEquals(true, Oefening.checkRecords(2, false, false, true));
    }

    @Test
    void pairwise5() {
        assertEquals(true, Oefening.checkRecords(3, true, true, true));
    }

    @Test
    void pairwise6() {
        assertEquals(true, Oefening.checkRecords(3, false, false, false));
    }
}