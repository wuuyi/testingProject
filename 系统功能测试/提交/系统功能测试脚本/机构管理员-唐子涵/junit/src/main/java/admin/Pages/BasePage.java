package admin.Pages;

import org.openqa.selenium.WebDriver;

import java.util.Map;

import static admin.ChromeDriver.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BasePage {
    WebDriver driver = getChromeDriver();
    Map<String,Object> vars = getVars();

    public BasePage putHandler(String handlers){
        vars.put(handlers, driver.getWindowHandles());
        return this;
    }

    public BasePage putWin(String win){
        vars.put(win, waitForWindow(5000));
        return this;
    }

    public BasePage switchToWin(String win){
        driver.switchTo().window(vars.get(win).toString());
        return this;
    }

    public BasePage closePage(){
        //driver.switchTo().window(vars.get(win).toString());
        driver.close();
        return this;
    }

//    public BasePage assertMsgText(String text) {
//        assertThat(driver.findElement(By.cssSelector(".el-message__content")).getText(), is(text));
//        return this;
//    }

}
