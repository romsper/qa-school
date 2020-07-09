package testng;

import junit.Logic;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestNGTest extends TestNGTestBase {
    Logic mainPage = new Logic();

    @Test(groups = {"first", "regress"})
    public void checkSum() {
        mainPage
                .setFirstNum(1)
                .setSecondNum(1);
        int result = mainPage.getResult("sum");
        assertEquals(result, 2, "Some number");
    }

    @Test(groups = {"second", "regress"})
    public void checkMinus() {
        mainPage.setFirstNum(2);
        mainPage.setSecondNum(2);
        int result = mainPage.getResult("minus");
        assertEquals(result, 0, "Some number");
    }
}