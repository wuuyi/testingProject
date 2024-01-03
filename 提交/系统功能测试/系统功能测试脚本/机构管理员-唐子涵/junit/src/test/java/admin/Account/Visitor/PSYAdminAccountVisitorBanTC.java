package admin.Account.Visitor;

import admin.BaseTest;
import admin.Pages.LoginPage;
import admin.Pages.VisitorManagePage;
import org.junit.jupiter.api.Test;

public class PSYAdminAccountVisitorBanTC extends BaseTest {
    LoginPage loginPage = new LoginPage();
    VisitorManagePage visitorManagePage = new VisitorManagePage();

    @Test
    public void pSYAdminAccountVisitorSeeTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        visitorManagePage.getVisitorManagePage();
        Thread.sleep(1000);
        visitorManagePage.assertTotal("8")
                .closePage();
    }

    @Test
    public void pSYAdminAccountVisitorBanTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        visitorManagePage.getVisitorManagePage();
        Thread.sleep(1000);
        visitorManagePage.clickBanVisitor("禁用")
                .clickBanConfirm();
        Thread.sleep(1000);
        visitorManagePage.assertMsgText("禁用成功!")
                .closePage();
    }

    @Test
    public void pSYAdminAccountVisitorBanTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        visitorManagePage.getVisitorManagePage();
        Thread.sleep(1000);
        visitorManagePage.clickBanVisitor("禁用")
                .clickBanCancel();
        Thread.sleep(1000);
        visitorManagePage.assertBanVisitor("禁用")
                .closePage();
    }

    @Test
    public void pSYAdminAccountVisitorUseTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        visitorManagePage.getVisitorManagePage();
        Thread.sleep(1000);
        visitorManagePage.clickBanVisitor("启用")
                .clickBanConfirm();
        Thread.sleep(1000);
        visitorManagePage.assertMsgText("启用成功!")
                .closePage();
    }

    @Test
    public void pSYAdminAccountVisitorUseTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        visitorManagePage.getVisitorManagePage();
        Thread.sleep(1000);
        visitorManagePage.clickBanVisitor("启用")
                .clickBanCancel();
        Thread.sleep(1000);
        visitorManagePage.assertBanVisitor("启用")
                .closePage();
    }
}
