package admin.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.Map;

import static admin.ChromeDriver.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ConsultationRecordPage extends BasePage{
    WebDriver driver = getChromeDriver();
    Map<String,Object> vars = getVars();
    JavascriptExecutor js;

    public ConsultationRecordPage getConsultRecordPage() {
        driver.findElement(By.cssSelector(".el-menu-item:nth-child(2) > span")).click();
        return this;
    }

    public ConsultationRecordPage clickConsultRecordDetail() {
        driver.findElement(By.cssSelector(".el-table__row:nth-child(1) .el-button:nth-child(1) > span")).click();
        return this;
    }

    public ConsultationRecordPage clickRecordDetailExport() {
        driver.findElement(By.cssSelector(".btns > div:nth-child(1)")).click();
        return this;
    }

    public ConsultationRecordPage clickRecordDetailBack() {
        driver.findElement(By.cssSelector(".btns > div:nth-child(2)")).click();
        assertThat(driver.getTitle(), is("咨询记录列表"));
        return this;
    }

    public ConsultationRecordPage assertTitle(String s) {
        assertThat(driver.getTitle(), is(s));
        return this;
    }

    public ConsultationRecordPage clickRecordDetailConfirm() {
        driver.findElement(By.cssSelector(".el-button--default:nth-child(2)")).click();
        return this;
    }

    public ConsultationRecordPage clickRecordDetailCancel() {
        driver.findElement(By.cssSelector(".el-button--small:nth-child(1) > span")).click();
        return this;
    }

    public ConsultationRecordPage searchVisitor(String s) {
        driver.findElement(By.cssSelector(".searchItem:nth-child(1) .el-input__inner")).click();
        driver.findElement(By.cssSelector(".searchItem:nth-child(1) .el-input__inner")).sendKeys(s);
        driver.findElement(By.cssSelector(".searchItem:nth-child(1) .el-input__inner")).sendKeys(Keys.ENTER);
        return this;
    }

    public ConsultationRecordPage searchCounselor(String s) {
        driver.findElement(By.cssSelector(".searchItem:nth-child(2) .el-input__inner")).click();
        driver.findElement(By.cssSelector(".searchItem:nth-child(2) .el-input__inner")).sendKeys(s);
        driver.findElement(By.cssSelector(".searchItem:nth-child(2) .el-input__inner")).sendKeys(Keys.ENTER);
        return this;
    }

    public ConsultationRecordPage searchDate(String day1, String time1, String day2, String time2) {
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

    public ConsultationRecordPage assertTotal(String s) {
        assertThat(driver.findElement(By.cssSelector(".total > span")).getText(), is(s));
        return this;
    }

    public ConsultationRecordPage assertNull(String s) {
        assertThat(driver.findElement(By.cssSelector(".el-table__empty-text")).getText(), is(s));
        return this;
    }

    public ConsultationRecordPage assertVistor() {
        assertThat(driver.findElement(By.cssSelector(".el-table__row:nth-child(1) > .el-table_1_column_3 > .cell > div")).getText(), is("王课abc"));
        assertThat(driver.findElement(By.cssSelector(".el-table__row:nth-child(8) > .el-table_1_column_3 > .cell > div")).getText(), is("王璐一"));
        return this;
    }

    public ConsultationRecordPage assertList(String s) {
        vars.put("person", s);
        //driver.findElement(By.cssSelector(".searchItem:nth-child(2) .el-input__inner")).sendKeys(Keys.ENTER);
        vars.put("count", driver.findElement(By.cssSelector(".total > span")).getText());
//        vars.put("line", js.executeScript("return 0"));
        do {
            vars.put("line", js.executeScript("return arguments[0]+1", vars.get("line")));
            assertThat(driver.findElement(By.cssSelector(".el-table__row:nth-child(vars.get(\"line\").toString()) > .el-table_1_column_2 > .cell > div")).getText(), is("vars.get(\"person\").toString()"));
        } while ((Boolean) js.executeScript("return (arguments[0]<arguments[1])", vars.get("line"),vars.get("count")));
        assert(vars.get("line").toString().equals(vars.get("count").toString()));
        return this;
    }

    public ConsultationRecordPage clickExportOne() {
        driver.findElement(By.cssSelector(".el-table__row:nth-child(1) .el-button:nth-child(2)")).click();
        return this;
    }

    public ConsultationRecordPage clickExportMany() {
        driver.findElement(By.cssSelector(".el-table__row:nth-child(2) .el-checkbox__inner")).click();
        driver.findElement(By.cssSelector(".el-table__row:nth-child(3) .el-checkbox__inner")).click();
        driver.findElement(By.cssSelector(".el-table__row:nth-child(4) .el-checkbox__inner")).click();
        driver.findElement(By.cssSelector(".customButton > span")).click();
        return this;
    }

    public ConsultationRecordPage clickExportAll() {
        driver.findElement(By.cssSelector(".is-leaf .el-checkbox__inner")).click();
        driver.findElement(By.cssSelector(".customButton > span")).click();
        return this;
    }

    public ConsultationRecordPage clickExportConfirm() {
        driver.findElement(By.cssSelector(".el-button--small:nth-child(2) > span")).click();
        return this;
    }

    public ConsultationRecordPage assertExportErr() {
        //assert(vars.get("css=.el-message").toString() == null);
        return this;
    }

    public ConsultationRecordPage assertTableByVisitor(String s) {
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

    public ConsultationRecordPage assertTableByCoun(String s) {
        String totalStr = driver.findElement(By.cssSelector(".total > span")).getText();
        int total = Integer.parseInt(totalStr);
        if(total > 10) total -= 10;
        for(int i = 1; i <=  total; i++) {
            String index = String.valueOf(i);
            assertThat(driver.findElement(By.cssSelector(".el-table__row:nth-child("+index+") > .el-table_1_column_2 > .cell > div")).getText(), containsString(s));
        }
        //assertThat(driver.findElement(By.cssSelector(".el-table__row:nth-child("+"1"+") span:nth-child(2)")).getText(), containsString(s));
        return this;
    }
}
