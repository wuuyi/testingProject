package admin.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.util.Map;

import static admin.ChromeDriver.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginPage extends BasePage{
    WebDriver driver = getChromeDriver();
    Map<String,Object> vars = getVars();

    public LoginPage login() {
        this.goLoginPage()
                .enterAccount("ecnu_admin")
                .enterPassword("pl,okm123")
                .clickLogin();
        return this;
    }

    public LoginPage goLoginPage() {
        driver.get("https://sei-test.021hqit.com/group-6/#/login");
        driver.manage().window().setSize(new Dimension(1051, 806));
        return this;
    }

    public LoginPage enterAccount(String acc) {
        driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys(acc);
        return this;
    }

    public LoginPage enterPassword(String pswd) {
        driver.findElement(By.cssSelector(".el-form-item:nth-child(2) .el-input__inner")).sendKeys(pswd);
        return this;
    }

    public LoginPage clickLogin() {
        driver.findElement(By.cssSelector(".el-button > span")).click();
        return this;
    }

    public LoginPage putHandler(String handlers){
        super.putHandler(handlers);
        return this;
    }

    public LoginPage assertMsgText(String text) {
        assertThat(driver.findElement(By.cssSelector(".el-message__content")).getText(), is(text));
        //assertThat(driver.getTitle(), is("首页"));
        return this;
    }

    public LoginPage assertTitle(String text) {
        assertThat(driver.getTitle(), is(text));
        return this;
    }

    public LoginPage assertNoEnter(String text) {
        assertThat(driver.findElement(By.cssSelector(".el-form-item__error")).getText(), is(text));
        return this;
    }




}
