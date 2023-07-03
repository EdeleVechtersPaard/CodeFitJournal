import static org.junit.jupiter.api.Assertions.*;

class BenchPressTest {

    @org.junit.jupiter.api.Test
    void randwaardenTest1() {
        Member member = new Member("Sjaak", null);
        Oefening benchPress = new Oefening("Bench", "");
        PR pr = new PR(benchPress, member, 1,3,80);
        String expected = "Je krijgt niks";
        String result = pr.checkPrijs(39);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void randwaardenTest2() {
        Member member = new Member("Sjaak", null);
        Oefening benchPress = new Oefening("Bench", "");
        PR pr = new PR(benchPress, member, 1,3,80);
        String expected = "Je krijgt een medium prijs";
        String result = pr.checkPrijs(40);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void randwaardenTest3() {
        Member member = new Member("Sjaak", null);
        Oefening benchPress = new Oefening("Bench", "");
        PR pr = new PR(benchPress, member, 1,3,80);
        String expected = "Je krijgt een medium prijs";
        String result = pr.checkPrijs(41);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void randwaardenTest4() {
        Member member = new Member("Sjaak", null);
        Oefening benchPress = new Oefening("Bench", "");
        PR pr = new PR(benchPress, member, 1,3,80);
        String expected = "Je krijgt een medium prijs";
        String result = pr.checkPrijs(79);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void randwaardenTest5() {
        Member member = new Member("Sjaak", null);
        Oefening benchPress = new Oefening("Bench", "");
        PR pr = new PR(benchPress, member, 1,3,80);
        String expected = "Je krijgt een coole prijs";
        String result = pr.checkPrijs(80);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void randwaardenTest6() {
        Member member = new Member("Sjaak", null);
        Oefening benchPress = new Oefening("Bench", "");
        PR pr = new PR(benchPress, member, 1,3,80);
        String expected = "Je krijgt een coole prijs";
        String result = pr.checkPrijs(81);
        assertEquals(expected, result);
    }
}