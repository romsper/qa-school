package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGTestBase {

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        System.out.println("--- URA I STARTED MY TESTS ---");
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        System.out.println("--- I FINISHED THIS SHIT ---");
    }
}
