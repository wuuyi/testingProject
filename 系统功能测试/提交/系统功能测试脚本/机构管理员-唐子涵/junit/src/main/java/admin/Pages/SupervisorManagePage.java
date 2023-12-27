package admin.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.Map;

import static admin.ChromeDriver.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SupervisorManagePage extends BasePage{
    WebDriver driver = getChromeDriver();
    Map<String,Object> vars = getVars();

    public SupervisorManagePage getSupervisorManagePage() {
        driver.findElement(By.cssSelector(".el-menu-item:nth-child(6) > span")).click();
        return this;
    }

    public SupervisorManagePage clickNewSupervisor() {
        driver.findElement(By.cssSelector(".addBtn")).click();
        return this;
    }

    public SupervisorManagePage clickModifySupervisor() {
        driver.findElement(By.cssSelector(".el-table__row:nth-child(1) .el-button:nth-child(1) > span")).click();
        return this;
    }


    public SupervisorManagePage searchSupervisor(String text) {
        driver.findElement(By.cssSelector(".el-input:nth-child(2) > .el-input__inner")).click();
        driver.findElement(By.cssSelector(".el-input:nth-child(2) > .el-input__inner")).sendKeys(text);
        driver.findElement(By.cssSelector(".el-input:nth-child(2) > .el-input__inner")).sendKeys(Keys.ENTER);
        return this;
    }

    public SupervisorManagePage clickBanSupervisor(String s) {
        //assertThat(driver.findElement(By.cssSelector(".el-table__row:nth-child(1) .el-button:nth-child(3)")).getText(), is(s));
        assertBanSupervisor(s);
        driver.findElement(By.cssSelector(".el-table__row:nth-child(1) .el-button:nth-child(3)")).click();
        return this;
    }

    public SupervisorManagePage assertBanSupervisor(String s) {
        assertThat(driver.findElement(By.cssSelector(".el-table__row:nth-child(1) .el-button:nth-child(3)")).getText(), is(s));
        return this;
    }

    public SupervisorManagePage clickBanConfirm() {
        driver.findElement(By.cssSelector(".el-button--small:nth-child(2) > span")).click();
        return this;
    }

    public SupervisorManagePage clickBanCancel() {
        driver.findElement(By.cssSelector(".el-button--small:nth-child(1) > span")).click();
        return this;
    }

    public SupervisorManagePage assertTotal(String s) {
        assertThat(driver.findElement(By.cssSelector(".total > span")).getText(), is(s));
        return this;
    }

    public SupervisorManagePage assertFirst(String s) {
        assertThat(driver.findElement(By.cssSelector(".tableAvatar > span:nth-child(2)")).getText(), is(s));
        return this;
    }

    public SupervisorManagePage assertNull(String s) {
        assertThat(driver.findElement(By.cssSelector(".el-table__empty-text")).getText(), is(s));
        return this;
    }

    public SupervisorManagePage enterUserName(String name) {
        driver.findElement(By.cssSelector(".el-row:nth-child(6) .el-input__inner")).sendKeys(Keys.CONTROL,"a");
        driver.findElement(By.cssSelector(".el-row:nth-child(6) .el-input__inner")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.cssSelector(".el-row:nth-child(6) .el-input__inner")).sendKeys(name);
        return this;
    }

    public SupervisorManagePage enterUserPassword(String pswd) {
        driver.findElement(By.cssSelector(".el-row:nth-child(7) .el-input__inner")).sendKeys(pswd);
        return this;
    }

    public SupervisorManagePage enterName(String name) {
        driver.findElement(By.cssSelector(".el-row:nth-child(1) > .el-col:nth-child(1) > .el-form-item .el-input__inner")).sendKeys(Keys.CONTROL,"a");
        driver.findElement(By.cssSelector(".el-row:nth-child(1) > .el-col:nth-child(1) > .el-form-item .el-input__inner")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.cssSelector(".el-row:nth-child(1) > .el-col:nth-child(1) > .el-form-item .el-input__inner")).sendKeys(name);
        return this;
    }

    public SupervisorManagePage enterPhone(String string) {
        driver.findElement(By.cssSelector(".el-row:nth-child(1) > .el-col:nth-child(2) > .el-form-item .el-input__inner")).sendKeys(Keys.CONTROL,"a");
        driver.findElement(By.cssSelector(".el-row:nth-child(1) > .el-col:nth-child(2) > .el-form-item .el-input__inner")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.cssSelector(".el-row:nth-child(1) > .el-col:nth-child(2) > .el-form-item .el-input__inner")).sendKeys(string);
        return this;
    }

    public SupervisorManagePage enterID(String string) {
        driver.findElement(By.cssSelector(".el-row:nth-child(2) .el-input__inner")).sendKeys(Keys.CONTROL,"a");
        driver.findElement(By.cssSelector(".el-row:nth-child(2) .el-input__inner")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.cssSelector(".el-row:nth-child(2) .el-input__inner")).sendKeys(string);
        return this;
    }

    public SupervisorManagePage enterMail(String string) {
        driver.findElement(By.cssSelector(".el-row:nth-child(3) > .el-col:nth-child(1) .el-input__inner")).sendKeys(Keys.CONTROL,"a");
        driver.findElement(By.cssSelector(".el-row:nth-child(3) > .el-col:nth-child(1) .el-input__inner")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.cssSelector(".el-row:nth-child(3) > .el-col:nth-child(1) .el-input__inner")).sendKeys(string);
        return this;
    }

    public SupervisorManagePage enterDepartment(String string) {
        driver.findElement(By.cssSelector(".el-row:nth-child(5) .el-input__inner")).sendKeys(Keys.CONTROL,"a");
        driver.findElement(By.cssSelector(".el-row:nth-child(5) .el-input__inner")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.cssSelector(".el-row:nth-child(5) .el-input__inner")).sendKeys(string);
        return this;
    }

    public SupervisorManagePage enterSupTitle(String string) {
        driver.findElement(By.cssSelector(".el-row:nth-child(3) > .el-col:nth-child(2) .el-input__inner")).sendKeys(Keys.CONTROL,"a");
        driver.findElement(By.cssSelector(".el-row:nth-child(3) > .el-col:nth-child(2) .el-input__inner")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.cssSelector(".el-row:nth-child(3) > .el-col:nth-child(2) .el-input__inner")).sendKeys(string);
        return this;
    }

    public SupervisorManagePage enterSupNum(String string) {
        driver.findElement(By.cssSelector(".el-row:nth-child(4) .changeInput > .el-input__inner")).sendKeys(Keys.CONTROL,"a");
        driver.findElement(By.cssSelector(".el-row:nth-child(4) .changeInput > .el-input__inner")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.cssSelector(".el-row:nth-child(4) .changeInput > .el-input__inner")).sendKeys(string);
        return this;
    }

    public SupervisorManagePage changeGrade(int num) {
        driver.findElement(By.cssSelector(".el-select:nth-child(1) .el-input__inner")).click();
        for(int i = 0; i < num; i++) {
            driver.findElement(By.cssSelector(".is-focus > .el-input__inner")).sendKeys(Keys.DOWN);
        }
        driver.findElement(By.cssSelector(".is-focus > .el-input__inner")).sendKeys(Keys.ENTER);
        return this;
    }

    public SupervisorManagePage clickModifyConfirm() {
        driver.findElement(By.cssSelector(".el-dialog__footer:nth-child(3) .confirm")).click();
        return this;
    }

    public SupervisorManagePage clickModifyCancel() {
        driver.findElement(By.cssSelector(".el-dialog__footer:nth-child(3) .cancel > span")).click();
        return this;
    }

    public SupervisorManagePage clickNewConfirm() {
        driver.findElement(By.cssSelector(".el-dialog__footer:nth-child(3) .confirm")).click();
        return this;
    }

    public SupervisorManagePage assertMsgText(String text) {
        assertThat(driver.findElement(By.cssSelector(".el-message__content")).getText(), is(text));
        //assertThat(driver.getTitle(), is("首页"));
        return this;
    }

    public String getUserName() {
        return driver.findElement(By.cssSelector(".el-row:nth-child(6) .el-input__inner")).getAttribute("value");
    }

    public SupervisorManagePage assertOriginUserName(String nameNew, String nameOri) {
        assertThat(nameNew, is(nameOri));
        return this;
    }

    public SupervisorManagePage assertNameErr(String string) {
        assertThat(driver.findElement(By.cssSelector(".el-row:nth-child(1) > .el-col:nth-child(1) .el-form-item__error")).getText(), is(string));
        return this;
    }

    public SupervisorManagePage assertPhoneErr(String string) {
        assertThat(driver.findElement(By.cssSelector(".el-row:nth-child(1) > .el-col:nth-child(2) .el-form-item__error")).getText(), is(string));
        return this;
    }

    public SupervisorManagePage assertIDErr(String string) {
        assertThat(driver.findElement(By.cssSelector(".el-row:nth-child(2) .el-form-item__error")).getText(), is(string));
        return this;
    }

    public SupervisorManagePage assertMailErr(String string) {
        assertThat(driver.findElement(By.cssSelector(".el-row:nth-child(3) > .el-col:nth-child(1) .el-form-item__error")).getText(), is(string));
        return this;
    }

    public SupervisorManagePage assertSupTitleErr(String string) {
        assertThat(driver.findElement(By.cssSelector(".el-row:nth-child(3) > .el-col:nth-child(2) .el-form-item__error")).getText(), is(string));
        return this;
    }

    public SupervisorManagePage assertSupNumErr(String string) {
        assertThat(driver.findElement(By.cssSelector(".el-row:nth-child(4) .el-form-item__error")).getText(), is(string));
        return this;
    }

    public SupervisorManagePage assertDepErr(String string) {
        assertThat(driver.findElement(By.cssSelector(".el-row:nth-child(5) .el-form-item__error")).getText(), is(string));
        return this;
    }

    public SupervisorManagePage assertSupGradeErr(String string) {
        assertThat(driver.findElement(By.cssSelector(".searchSelect .el-form-item__error")).getText(), is(string));
        return this;
    }

    public SupervisorManagePage assertUserNameErr(String string) {
        assertThat(driver.findElement(By.cssSelector(".el-row:nth-child(6) .el-form-item__error")).getText(), is(string));
        return this;
    }

    public SupervisorManagePage assertPasswordErr(String string) {
        assertThat(driver.findElement(By.cssSelector(".el-form-item__error")).getText(), is(string));
        return this;
    }

    public SupervisorManagePage assertTable(String s) {
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
