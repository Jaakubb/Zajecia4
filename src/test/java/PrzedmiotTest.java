import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PrzedmiotTest {

    @Test
    public void dwaPrzedmiotyZTaSamaCenaINazwaPowinnyBycRowne(){
        Assertions.assertEquals(new Przedmiot("przedmiot", 55.66), new Przedmiot("przedmiot", 55.66));
    }

    @Test
    public void przedmiotyZInnymiNazwamiNieSaRowne(){
        Assertions.assertNotEquals(new Przedmiot("przedmiot1",80.99), new Przedmiot("przedmiot2", 33.66));
    }

    @Test
    public void przedmiotyZInnaCenaNieSaRowne() throws Exception {
        Assertions.assertNotEquals();
    }
}
