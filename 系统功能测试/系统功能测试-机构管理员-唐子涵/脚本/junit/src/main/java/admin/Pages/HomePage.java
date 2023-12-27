package admin.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import java.util.Map;

import static admin.ChromeDriver.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class HomePage extends BasePage{
    WebDriver driver = getChromeDriver();
    Map<String,Object> vars = getVars();
    //JavascriptExecutor js = (JavascriptExecutor) driver;

    public HomePage getSelfInfo() {
        String js = "var x = document.getElementByClassName(\"el-popover el-popper menuClass\"); x[0].style.display='block'";
        ((JavascriptExecutor) driver).executeScript(js);
        driver.findElement(By.cssSelector(".menuActionItem > span:nth-child(1)")).click();
        return this;
    }

    public HomePage clickModifyConfirm() {
        driver.findElement(By.cssSelector(".confirm")).click();
        return this;
    }

    public HomePage assertOriginError(String text) {
        assertThat(driver.findElement(By.cssSelector(".el-row:nth-child(1) .el-form-item__error")).getText(), is(text));//"请输入原密码"
        return this;
    }

    public HomePage enterOriginPassword(String pswd) {
        driver.findElement(By.cssSelector(".el-row:nth-child(1) .el-input__inner")).sendKeys(pswd);
        return this;
    }

    public HomePage enterNewPassword(String pswd) {
        driver.findElement(By.cssSelector(".el-row:nth-child(2) .el-input__inner")).sendKeys(pswd);
        return this;
    }

    public HomePage checkNewPassword(String pswd) {
        driver.findElement(By.cssSelector(".el-row:nth-child(3) .el-input__inner")).sendKeys(pswd);
        return this;
    }

}
