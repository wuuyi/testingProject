package admin;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

import java.util.Map;

import static admin.ChromeDriver.*;

public class BaseTest {
    static WebDriver driver;
    static Map<String,Object> vars;

    @BeforeAll
    public static  void startUpBrowser(){
        driver = getChromeDriver();
        vars = getVars();
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

}
