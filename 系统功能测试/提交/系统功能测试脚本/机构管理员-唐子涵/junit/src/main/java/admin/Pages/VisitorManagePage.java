package admin.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.Map;

import static admin.ChromeDriver.getChromeDriver;
import static admin.ChromeDriver.getVars;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class VisitorManagePage extends BasePage {
    WebDriver driver = getChromeDriver();
    Map<String,Object> vars = getVars();

    public VisitorManagePage getVisitorManagePage() {
        driver.findElement(By.cssSelector(".el-menu-item:nth-child(7) > span")).click();
        return this;
    }


    public VisitorManagePage searchVisitor(String text) {
        driver.findElement(By.cssSelector(".el-input:nth-child(2) > .el-input__inner")).click();
        driver.findElement(By.cssSelector(".el-input:nth-child(2) > .el-input__inner")).sendKeys(text);
        driver.findElement(By.cssSelector(".el-input:nth-child(2) > .el-input__inner")).sendKeys(Keys.ENTER);
        return this;
    }

    public VisitorManagePage clickBanVisitor(String s) {
        //assertThat(driver.findElement(By.cssSelector(".el-table__row:nth-child(1) .el-button:nth-child(3)")).getText(), is(s));
        assertBanVisitor(s);
        driver.findElement(By.cssSelector(".el-table__row:nth-child(1) > .el-table_1_column_10 span")).click();
        return this;
    }

    public VisitorManagePage assertBanVisitor(String s) {
        assertThat(driver.findElement(By.cssSelector(".el-table__row:nth-child(1) > .el-table_1_column_10 span")).getText(), is(s));
        return this;
    }

    public VisitorManagePage clickBanConfirm() {
        driver.findElement(By.cssSelector(".el-button--default:nth-child(2) > span")).click();
        return this;
    }

    public VisitorManagePage clickBanCancel() {
        driver.findElement(By.cssSelector(".el-button--small:nth-child(1) > span")).click();
        return this;
    }

    public VisitorManagePage assertMsgText(String text) {
        assertThat(driver.findElement(By.cssSelector(".el-message__content")).getText(), is(text));
        //assertThat(driver.getTitle(), is("首页"));
        return this;
    }

    public VisitorManagePage assertNull(String s) {
        assertThat(driver.findElement(By.cssSelector(".el-table__empty-text")).getText(), is(s));
        return this;
    }

    public VisitorManagePage assertTotal(String s) {
        assertThat(driver.findElement(By.cssSelector(".total > span")).getText(), is(s));
        return this;
    }

    public VisitorManagePage assertVisitor() {
        assertThat(driver.findElement(By.cssSelector(".el-table__row:nth-child(1) span:nth-child(2)")).getText(), is("王璐一"));
        assertThat(driver.findElement(By.cssSelector(".el-table__row:nth-child(2) span:nth-child(2)")).getText(), is("王课abc"));
        return this;
    }

    public VisitorManagePage assertFirst(String s) {
        assertThat(driver.findElement(By.cssSelector(".el-table__row:nth-child(1) span:nth-child(2)")).getText(), is(s));
        return this;
    }

    public VisitorManagePage assertTable(String s) {
        String totalStr = driver.findElement(By.cssSelector(".total > span")).getText();
        int total = Integer.parseInt(totalStr);
        if(total > 10) total -= 10;
        for(int i = 1; i <=  total; i++) {
            String index = String.valueOf(i);
            assertThat(driver.findElement(By.cssSelector(".el-table__row:nth-child("+index+") span:nth-child(2)")).getText(), containsString(s));
        }
        //assertThat(driver.findElement(By.cssSelector(".el-table__row:nth-child("+"1"+") span:nth-child(2)")).getText(), containsString(s));
        return this;
    }
}
