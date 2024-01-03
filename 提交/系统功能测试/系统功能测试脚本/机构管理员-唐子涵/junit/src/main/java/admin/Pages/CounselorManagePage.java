package admin.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.Map;

import static admin.ChromeDriver.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CounselorManagePage extends BasePage{
    WebDriver driver = getChromeDriver();
    Map<String,Object> vars = getVars();

    public CounselorManagePage getCounselorManagePage() {
        driver.findElement(By.cssSelector(".el-menu-item:nth-child(5) > span")).click();
        return this;
    }

    public CounselorManagePage clickNewCounselor() {
        driver.findElement(By.cssSelector(".addBtn")).click();
        return this;
    }

    public CounselorManagePage clickModifyCounselor() {
        driver.findElement(By.cssSelector(".el-table__row:nth-child(1) .el-button:nth-child(1) > span")).click();
        return this;
    }

    public CounselorManagePage searchCounselor(String text) {
        driver.findElement(By.cssSelector(".el-input:nth-child(2) > .el-input__inner")).click();
        driver.findElement(By.cssSelector(".el-input:nth-child(2) > .el-input__inner")).sendKeys(text);
        driver.findElement(By.cssSelector(".el-input:nth-child(2) > .el-input__inner")).sendKeys(Keys.ENTER);
        return this;
    }

    public CounselorManagePage clickBanCounselor(String s) {
        //assertThat(driver.findElement(By.cssSelector(".el-table__row:nth-child(1) .el-button:nth-child(3)")).getText(), is(s));
        assertBanCounselor(s);
        driver.findElement(By.cssSelector(".el-table__row:nth-child(1) .el-button:nth-child(3)")).click();
        return this;
    }

    public CounselorManagePage assertBanCounselor(String s) {
        assertThat(driver.findElement(By.cssSelector(".el-table__row:nth-child(1) .el-button:nth-child(3)")).getText(), is(s));
        return this;
    }

    public CounselorManagePage clickBanConfirm() {
        driver.findElement(By.cssSelector(".el-button--small:nth-child(2) > span")).click();
        return this;
    }

    public CounselorManagePage clickBanCancel() {
        driver.findElement(By.cssSelector(".el-button--small:nth-child(1) > span")).click();
        return this;
    }

    public CounselorManagePage assertTotal(String s) {
        assertThat(driver.findElement(By.cssSelector(".total > span")).getText(), is(s));
        return this;
    }

    public CounselorManagePage assertFirst(String s) {
        assertThat(driver.findElement(By.cssSelector(".tableAvatar > span:nth-child(2)")).getText(), is(s));
        return this;
    }

    public CounselorManagePage assertNull(String s) {
        assertThat(driver.findElement(By.cssSelector(".el-table__empty-text")).getText(), is(s));
        return this;
    }

    public CounselorManagePage enterUserName(String name) {
        driver.findElement(By.cssSelector(".el-col-24 > .is-required .el-input__inner")).sendKeys(Keys.CONTROL,"a");
        driver.findElement(By.cssSelector(".el-col-24 > .is-required .el-input__inner")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.cssSelector(".el-col-24 > .is-required .el-input__inner")).sendKeys(name);
        return this;
    }

    public CounselorManagePage enterUserPassword(String pswd) {
        driver.findElement(By.cssSelector(".el-row:nth-child(6) .el-input__inner")).sendKeys(pswd);
        return this;
    }

    public CounselorManagePage enterName(String name) {
        driver.findElement(By.cssSelector(".el-row:nth-child(1) > .el-col:nth-child(1) > .el-form-item .el-input__inner")).sendKeys(Keys.CONTROL,"a");
        driver.findElement(By.cssSelector(".el-row:nth-child(1) > .el-col:nth-child(1) > .el-form-item .el-input__inner")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.cssSelector(".el-row:nth-child(1) > .el-col:nth-child(1) > .el-form-item .el-input__inner")).sendKeys(name);
        return this;
    }

    public CounselorManagePage enterPhone(String string) {
        driver.findElement(By.cssSelector(".el-row:nth-child(1) > .el-col:nth-child(2) > .el-form-item .el-input__inner")).sendKeys(Keys.CONTROL,"a");
        driver.findElement(By.cssSelector(".el-row:nth-child(1) > .el-col:nth-child(2) > .el-form-item .el-input__inner")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.cssSelector(".el-row:nth-child(1) > .el-col:nth-child(2) > .el-form-item .el-input__inner")).sendKeys(string);
        return this;
    }

    public CounselorManagePage enterID(String string) {
        driver.findElement(By.cssSelector(".el-row:nth-child(2) .el-input__inner")).sendKeys(Keys.CONTROL,"a");
        driver.findElement(By.cssSelector(".el-row:nth-child(2) .el-input__inner")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.cssSelector(".el-row:nth-child(2) .el-input__inner")).sendKeys(string);
        return this;
    }

    public CounselorManagePage enterMail(String string) {
        driver.findElement(By.cssSelector(".el-row:nth-child(3) .changeInput > .el-input__inner")).sendKeys(Keys.CONTROL,"a");
        driver.findElement(By.cssSelector(".el-row:nth-child(3) .changeInput > .el-input__inner")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.cssSelector(".el-row:nth-child(3) .changeInput > .el-input__inner")).sendKeys(string);
        return this;
    }

    public CounselorManagePage enterDepartment(String string) {
        driver.findElement(By.cssSelector(".el-row:nth-child(4) > .el-col:nth-child(1) .el-input__inner")).sendKeys(Keys.CONTROL,"a");
        driver.findElement(By.cssSelector(".el-row:nth-child(4) > .el-col:nth-child(1) .el-input__inner")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.cssSelector(".el-row:nth-child(4) > .el-col:nth-child(1) .el-input__inner")).sendKeys(string);
        return this;
    }

    public CounselorManagePage enterCounTitle(String string) {
        driver.findElement(By.cssSelector(".el-row:nth-child(4) > .el-col:nth-child(2) .el-input__inner")).sendKeys(Keys.CONTROL,"a");
        driver.findElement(By.cssSelector(".el-row:nth-child(4) > .el-col:nth-child(2) .el-input__inner")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.cssSelector(".el-row:nth-child(4) > .el-col:nth-child(2) .el-input__inner")).sendKeys(string);
        return this;
    }


    public CounselorManagePage deleteSup() {
        driver.findElement(By.cssSelector(".el-tag:nth-child(1) > .el-tag__close")).click();
        driver.findElement(By.cssSelector(".el-tag__close")).click();
        return this;
    }

    public CounselorManagePage addSup(int num) {
        driver.findElement(By.cssSelector(".el-select__input")).click();
        for(int i = 0; i < num; i++) {
            driver.findElement(By.cssSelector(".el-select__input")).sendKeys(Keys.DOWN);
            driver.findElement(By.cssSelector(".el-select__input")).sendKeys(Keys.ENTER);
        }
        return this;
    }

    public CounselorManagePage clickModifyConfirm() {
        driver.findElement(By.cssSelector(".el-dialog__footer:nth-child(3) .confirm")).click();
        return this;
    }

    public CounselorManagePage clickNewConfirm() {
        driver.findElement(By.cssSelector(".el-dialog__footer:nth-child(3) .confirm")).click();
        return this;
    }


    public CounselorManagePage assertMsgText(String text) {
        assertThat(driver.findElement(By.cssSelector(".el-message__content")).getText(), is(text));
        //assertThat(driver.getTitle(), is("首页"));
        return this;
    }

    public String getUserName() {
        return driver.findElement(By.cssSelector(".el-col-24 > .is-required .el-input__inner")).getAttribute("value");
    }

    public CounselorManagePage assertOriginUserName(String nameNew, String nameOri) {
        assertThat(nameNew, is(nameOri));
        return this;
    }

    public CounselorManagePage assertNameErr(String string) {
        assertThat(driver.findElement(By.cssSelector(".el-row:nth-child(1) > .el-col:nth-child(1) .el-form-item__error")).getText(), is(string));
        return this;
    }

    public CounselorManagePage assertPhoneErr(String string) {
        assertThat(driver.findElement(By.cssSelector(".el-row:nth-child(1) > .el-col:nth-child(2) .el-form-item__error")).getText(), is(string));
        return this;
    }

    public CounselorManagePage assertIDErr(String string) {
        assertThat(driver.findElement(By.cssSelector(".el-row:nth-child(2) .el-form-item__error")).getText(), is(string));
        return this;
    }

    public CounselorManagePage assertMailErr(String string) {
        assertThat(driver.findElement(By.cssSelector(".el-row:nth-child(3) > .el-col:nth-child(1) .el-form-item__error")).getText(), is(string));
        return this;
    }

    public CounselorManagePage assertSupErr(String string) {
        assertThat(driver.findElement(By.cssSelector(".el-row:nth-child(3) > .el-col:nth-child(2) .el-form-item__error")).getText(), is(string));
        return this;
    }

    public CounselorManagePage assertDepErr(String string) {
        assertThat(driver.findElement(By.cssSelector(".el-row:nth-child(4) > .el-col:nth-child(1) .el-form-item__error")).getText(), is(string));
        return this;
    }

    public CounselorManagePage assertCounTitleErr(String string) {
        assertThat(driver.findElement(By.cssSelector(".el-row:nth-child(4) > .el-col:nth-child(2) .el-form-item__error")).getText(), is(string));
        return this;
    }

    public CounselorManagePage assertUserNameErr(String string) {
        assertThat(driver.findElement(By.cssSelector(".customItem .el-form-item__error")).getText(), is(string));
        return this;
    }

    public CounselorManagePage assertPasswordErr(String string) {
        assertThat(driver.findElement(By.cssSelector(".el-form-item__error")).getText(), is(string));
        return this;
    }

    //.customItem .el-form-item__error
    public CounselorManagePage assertNewPasswordErr(String string) {
        assertThat(driver.findElement(By.cssSelector(".customItem .el-form-item__error")).getText(), is(string));
        return this;
    }

    public CounselorManagePage assertTable(String s) {
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
