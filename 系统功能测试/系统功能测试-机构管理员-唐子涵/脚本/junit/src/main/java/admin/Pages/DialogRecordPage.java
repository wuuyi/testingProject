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

public class DialogRecordPage extends BasePage {
    WebDriver driver = getChromeDriver();
    Map<String,Object> vars = getVars();

    public DialogRecordPage getDialogRecordPage() {
        driver.findElement(By.cssSelector(".el-menu-item:nth-child(4) > span")).click();
        return this;
    }

    public DialogRecordPage clickDialogRecordDetail() {
        driver.findElement(By.cssSelector(".el-table__row:nth-child(1) .el-button:nth-child(1) > span")).click();
        return this;
    }

    public DialogRecordPage clickRecordDetailExport() {
        driver.findElement(By.cssSelector(".btns > div:nth-child(1)")).click();
        return this;
    }

    public DialogRecordPage clickRecordDetailBack() {
        driver.findElement(By.cssSelector(".btns > div:nth-child(2)")).click();
        assertThat(driver.getTitle(), is("求助记录列表"));
        return this;
    }

    public DialogRecordPage assertTitle(String s) {
        assertThat(driver.getTitle(), is(s));
        return this;
    }

    public DialogRecordPage clickRecordDetailConfirm() {
        driver.findElement(By.cssSelector(".el-button--default:nth-child(2)")).click();
        return this;
    }

    public DialogRecordPage clickRecordDetailCancel() {
        driver.findElement(By.cssSelector(".el-button--small:nth-child(1) > span")).click();
        return this;
    }


    public DialogRecordPage searchCounselor(String s) {
        driver.findElement(By.cssSelector(".nameInput > .el-input__inner")).click();
        driver.findElement(By.cssSelector(".nameInput > .el-input__inner")).sendKeys(s);
        driver.findElement(By.cssSelector(".nameInput > .el-input__inner")).sendKeys(Keys.ENTER);
        return this;
    }

    public DialogRecordPage searchDate(String day1, String time1, String day2, String time2) {
        driver.findElement(By.cssSelector(".el-range-input:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".el-date-range-picker__editors-wrap:nth-child(1) > .el-date-range-picker__time-picker-wrap:nth-child(1) .el-input__inner")).click();
        driver.findElement(By.cssSelector(".el-date-range-picker__editors-wrap:nth-child(1) > .el-date-range-picker__time-picker-wrap:nth-child(1) .el-input__inner")).sendKeys(day1);
        driver.findElement(By.cssSelector(".el-date-range-picker__editors-wrap:nth-child(1) > .el-date-range-picker__time-picker-wrap:nth-child(2) .el-input__inner")).click();
        driver.findElement(By.cssSelector(".el-date-range-picker__editors-wrap:nth-child(1) > .el-date-range-picker__time-picker-wrap:nth-child(2) .el-input__inner")).sendKeys(time1);
        driver.findElement(By.cssSelector(".is-right > .el-date-range-picker__time-picker-wrap:nth-child(1) .el-input__inner")).click();
        driver.findElement(By.cssSelector(".is-right > .el-date-range-picker__time-picker-wrap:nth-child(1) .el-input__inner")).sendKeys(day2);
        driver.findElement(By.cssSelector(".is-right > .el-date-range-picker__time-picker-wrap:nth-child(2) .el-input__inner")).click();
        driver.findElement(By.cssSelector(".is-right > .el-date-range-picker__time-picker-wrap:nth-child(2) .el-input__inner")).sendKeys(time2);
        driver.findElement(By.cssSelector(".is-plain > span")).click();
        return this;
    }

    public DialogRecordPage assertTotal(String s) {
        assertThat(driver.findElement(By.cssSelector(".total > span")).getText(), is(s));
        return this;
    }

    public DialogRecordPage assertNull(String s) {
        assertThat(driver.findElement(By.cssSelector(".el-table__empty-text")).getText(), is(s));
        return this;
    }


    public DialogRecordPage clickExportOne() {
        driver.findElement(By.cssSelector(".el-table__row:nth-child(1) .el-button:nth-child(2)")).click();
        return this;
    }

    public DialogRecordPage clickExportMany() {
        driver.findElement(By.cssSelector(".el-table__row:nth-child(2) .el-checkbox__inner")).click();
        driver.findElement(By.cssSelector(".el-table__row:nth-child(3) .el-checkbox__inner")).click();
        driver.findElement(By.cssSelector(".el-table__row:nth-child(4) .el-checkbox__inner")).click();
        driver.findElement(By.cssSelector(".customButton > span")).click();
        return this;
    }

    public DialogRecordPage clickExportAll() {
        driver.findElement(By.cssSelector(".is-leaf .el-checkbox__inner")).click();
        driver.findElement(By.cssSelector(".customButton > span")).click();
        return this;
    }

    public DialogRecordPage clickExportConfirm() {
        driver.findElement(By.cssSelector(".el-button--small:nth-child(2) > span")).click();
        return this;
    }

    public DialogRecordPage assertExportErr() {
        //assert(vars.get("css=.el-message").toString() == null);
        return this;
    }

    public DialogRecordPage assertTable(String s) {
        String totalStr = driver.findElement(By.cssSelector(".total > span")).getText();
        int total = Integer.parseInt(totalStr);
        if(total > 10) total -= 10;
        for(int i = 1; i <=  total; i++) {
            String index = String.valueOf(i);
            assertThat(driver.findElement(By.cssSelector(".el-table__row:nth-child("+index+") > .el-table_1_column_3 > .cell > div")).getText(), containsString(s));
        }
        //assertThat(driver.findElement(By.cssSelector(".el-table__row:nth-child("+"1"+") span:nth-child(2)")).getText(), containsString(s));
        return this;
    }
}
