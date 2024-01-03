package admin;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ChromeDriver {
    private static WebDriver driver;
    static Map<String, Object> vars;


    private ChromeDriver(){
        // prevent instantiation
    }

    public static WebDriver getChromeDriver(){

        if(driver == null){
            System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
            driver = new org.openqa.selenium.chrome.ChromeDriver();
        }
        return driver;
    }

    public static  Map<String,Object> getVars(){
        if(vars == null)
            vars = new HashMap<String, Object>();
        return vars;
    }

    public static String waitForWindow(int timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set<String> whNow = driver.getWindowHandles();
        Set<String> whThen = (Set<String>) vars.get("window_handles");
        if (whNow.size() > whThen.size()) {
            whNow.removeAll(whThen);
        }
        return whNow.iterator().next();
    }

}
